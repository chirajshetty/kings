package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class JSONtoPOJO {

	/**  
	 * @param args  
	 */  
	public static void main(String[] args) {  
		String packageName="com.example.demo.data";  
		File inputJson= new File("resume.json");  
		File outputPojoDirectory=new File("."+File.separator+"convertedPojo");  
		outputPojoDirectory.mkdirs();  
		try {  
			new JSONtoPOJO().convertJsonToJavaClass(inputJson.toURI().toURL(), outputPojoDirectory, packageName, inputJson.getName().replace(".json", ""));  
		} catch (IOException e) {  
			System.out.println("Encountered issue while converting to pojo: "+e.getMessage());  
			e.printStackTrace();  
		}  
	}  
	public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName) 
			throws IOException {
		JCodeModel jcodeModel = new JCodeModel();

		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() {
				return true;
			}

			@Override
			public SourceType getSourceType() {
				return SourceType.JSON;
			}
		};

		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

		jcodeModel.build(outputJavaClassDirectory);
	}
}
