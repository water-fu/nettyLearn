package com.ljn.util;

import java.nio.charset.Charset;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

/**
 * @author lijinnan
 * @date:2013-11-28 下午3:33:08  
 */
public class Helper {

    public static final Charset CHARSET_UTF8 = Charset.forName("UTF-8");
    public static void main(String[] args) {
        int i = 1;
        ChannelBuffer buff = ChannelBuffers.buffer(4);
        buff.writeInt(i);
        int j = buff.readInt();
        System.out.println(j);
        System.out.println(buff.readableBytes());
    }
    
    public static String toString(ChannelBuffer buff) {
        return buff.toString(CHARSET_UTF8);
    }
    
    public static void printAsBytesWithoutChange(ChannelBuffer buff) {
        for (int i = 0, len = buff.capacity(); i < len; i++) {
            System.out.print((char) buff.getByte(i));
        }
        System.out.println();
    }
}