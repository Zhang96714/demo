package com.example.demo.plugin;

import com.example.demo.plugin.impl.InvokeCostPlugin;
import com.example.demo.plugin.impl.ParamPrintPlugin;
import com.example.demo.service.ITestService;

import java.util.ArrayList;
import java.util.List;

/**
 * 插件链
 *
 * @author: zhangguofen
 * @date: 2022/8/30 16:15
 */
public class PluginChain {

    private static final List<MyPlugin> plugins = new ArrayList<>();

    /**
     * 创建代理对象
     *
     * @param target 原始对象
     * @return 代理
     */
    public Object pluginAll(Object target) {
        for (MyPlugin p : plugins
        ) {
            target = p.plugin(target);
        }
        return target;
    }

    /**
     * 保存插件
     *
     * @param myPlugin 自定义的新插件
     */
    public void addPlu(MyPlugin myPlugin){
        plugins.add(myPlugin);
    }

    public static void main(String[] args) {
        PluginChain pluginChain = new PluginChain();
        pluginChain.addPlu(new ParamPrintPlugin());
        pluginChain.addPlu(new InvokeCostPlugin());

        ITestService testInterface = new ITestService() {
            @Override
            public void test(String arg) {
                System.out.println("这里是测试方法");
            }

            @Override
            public void close() {
                System.out.println("执行结束 in close method");
            }
        };

        try (ITestService proxy = (ITestService) pluginChain.pluginAll(testInterface)) {
            proxy.test("hello");
        }
    }
}
