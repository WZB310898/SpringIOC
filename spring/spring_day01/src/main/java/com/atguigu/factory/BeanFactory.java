package com.atguigu.factory;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 创建一个Bean对象的工厂
 */
public class BeanFactory {

    private static Properties props;
    //容器
    private static Map<String,Object> beans;

    //使用静态代码块为Properties赋值
    static {
        try {
        props = new Properties();
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        props.load(in);
        beans=new HashMap<String, Object>();
        //取出配置文件中所有的key
        Enumeration keys = props.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement().toString();
            String beanPath = props.getProperty(key);
            //反射创建对象
            Object value= Class.forName(beanPath).newInstance();
            //把key  和 value 存入容器中
            beans.put(key,value);
        }
        } catch (Exception e) {
            throw  new ExceptionInInitializerError("初始化properties失败");
        }
    }

    /**
     * 根据Bean的名称,获取bean对象
     * @param beanName
     * @return
     */

/*    public static Object getBean(String beanName){
        Object bean =null;
        String beanPath =props.getProperty(beanName);
        try {
            bean=Class.forName(beanPath).newInstance();//newInstance每次创建都是一个新的对象
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  bean;
    }*/

    public static Object getBean(String beanName){
        Object obj=beans.get(beanName);
        return obj;
    }


}
