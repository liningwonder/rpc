package com.lining.rpc.demo;

import java.net.InetSocketAddress;

/**
 * description:
 * date 2018-04-20
 *
 * @author lining1
 * @version 1.0.0
 */
public class RpcTest {

    public static void main(String[] args) throws Exception {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    RpcExporter.exporter("localhost", 8088);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
        EchoService echo = importer.importer(EchoServiceImpl.class, new InetSocketAddress("localhost", 8088));
        System.out.println(echo.echo("Hello"));
    }
}
