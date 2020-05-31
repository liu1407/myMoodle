package com.poc.netty;

import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.bytes.ByteArrayEncoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

@Component
public class NettyServerInitializer extends ChannelInitializer<SocketChannel> {

	@Autowired
	EchoServerHandler echoServerHandler ;
	
	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		// TODO Auto-generated method stub
		
		ChannelPipeline pipeline = ch.pipeline();

		 System.out.println("有一客户端正在连接到本服务器。。。");
        System.out.println("IP:" + ch.remoteAddress().getHostName());
        System.out.println("Port:" + ch.remoteAddress().getPort());
        
		// 以("\n")为结尾分割的 解码器
//		pipeline.addLast("framer", new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));

		// 字符串解码 和 编码
		pipeline.addLast("decoder", new StringDecoder());
		pipeline.addLast("encoder", new StringEncoder(Charset.forName("GBK")));
        pipeline.addLast(new ByteArrayEncoder());
        
		pipeline.addLast("handler", echoServerHandler);

		System.out.println(Thread.currentThread().getName() + "----位置5");
		// 自己的逻辑Handler
		

	}

}
