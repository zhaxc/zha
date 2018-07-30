package com.test.api;

import org.ho.yaml.Yaml;
import org.junit.Test;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Map;

/**
 * Created by zha on 2017/7/18.
 */
public class YamlTest {

    public static void main(String[] args) {
        try {
            Yaml yaml = new Yaml();
            URL url = Test.class.getClassLoader().getResource("test.yml");
            if (url != null) {
                //获取test.yaml文件中的配置数据，然后转换为obj，
                Object obj =yaml.load(new FileInputStream(url.getFile()));
                System.out.println(obj);
                //也可以将值转换为Map
                Map map =(Map)yaml.load(new FileInputStream(url.getFile()));
                Map server = (Map) map.get("server");
                Integer port = (Integer) server.get("port");
                System.out.println("port = " + port);
                System.out.println(map);
                //通过map我们取值就可以了.

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
