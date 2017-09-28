package com.baidu.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreemarkerTest {
	public static void main(String[] args) throws IOException, TemplateException {
		Configuration configuration = new Configuration(Configuration.getVersion());
		// 第二步：设置模板文件所在的路径。
		configuration.setDirectoryForTemplateLoading(
				new File("/users/smile_mylife/Desktop/freemarker"));
		// 第三步：设置模板文件使用的字符集。一般就是utf-8.
		configuration.setDefaultEncoding("utf-8");
		// 第四步：加载一个模板，创建一个模板对象。
		Template template = configuration.getTemplate("hello.ftl");
		// 第五步：创建一个模板使用的数据集，可以是pojo也可以是map。一般是Map。
		Map dataModel = new HashMap<Object, Object>();
		// 向数据集中添加数据
		dataModel.put("hello", "this is my first freemarker test.");
		// 第六步：创建一个Writer对象，一般创建一FileWriter对象，指定生成的文件名。
		Writer out = new FileWriter(new File("/users/smile_mylife/Desktop/hello.html"));
		// 第七步：调用模板对象的process方法输出文件。
		template.process(dataModel, out);
		// 第八步：关闭流。
		out.close();
	}
}