package com.lining.rpc.demo;

/**
 * description:
 * date 2018-04-20
 *
 * @author lining1
 * @version 1.0.0
 */
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String ping) {
        return ping !=null ? ping : "I am ok.";
    }
}
