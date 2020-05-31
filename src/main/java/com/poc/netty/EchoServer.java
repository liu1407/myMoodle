package com.poc.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.bytes.ByteArrayEncoder;
import io.netty.handler.codec.string.StringEncoder;

import java.nio.charset.Charset;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EchoServer implements Runnable {
    private  int port = 54321;
    private Thread nServer;
    
    @Autowired
    NettyServerInitializer nettyServerInitializer ;

//    public EchoServer(int port) {
//        this.port = port;
//    }
    @PostConstruct
	public void init() {
    	nServer = new Thread(this);
    	nServer.start();
	}
    
    public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

    public void start() throws Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // 用来接收进来的连接
        EventLoopGroup group = new NioEventLoopGroup();  // 用来处理已经被接收的连接
        try {
            ServerBootstrap sb = new ServerBootstrap();
            sb.option(ChannelOption.SO_BACKLOG, 1024);
            sb.group(bossGroup, group) // 绑定线程池
                    .channel(NioServerSocketChannel.class) // 指定使用的channel
                    .localAddress(this.port)// 绑定监听端口
                    .childHandler(nettyServerInitializer);
            ChannelFuture cf = sb.bind().sync(); // 服务器异步创建绑定
            System.out.println(EchoServer.class + " 启动正在监听： " + cf.channel().localAddress());
            cf.channel().closeFuture().sync(); // 关闭服务器通道
        } finally {
            group.shutdownGracefully().sync(); // 释放线程池资源
            bossGroup.shutdownGracefully().sync();
        }
    }

    @Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}