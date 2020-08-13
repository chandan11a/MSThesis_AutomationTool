package excel
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import io.cucumber.datatable.DataTable
public class CSV {
	public static void main(String[] args) throws  IOException {
		//def data=TestDataFactory.readCSVData(null, "")
		//String x=data.getValue(0, 0)
		
		

	
		//	System.out.println(url)
		findTestData('Data Files/owldataa.csv').getAllData()

		//	Method("C:\\Users\\Admin\\Downloads\\CSVreader-master\\CSVreader-master\\employees.csv",2);
	}
	public static Map<String,String> Method(String path,int index) {

		File file = new File(path);
		// Create a File and append if it already exists.
		Writer writer = new FileWriter(file, true);
		Reader reader = new FileReader(file);
		//Copy List of Map Object into CSV format at specified File location.
		//Read CSV format from specified File location and print on console..
		// csvReader(reader);

		Map<String,String> map=csvReader(reader).get(index);

		//Here Goes Your Test Case - With Different Datasets-

		System.out.println("Test Case = SendKeys "+map.get("Name"));

		System.out.println("Test Case = SendKeys "+map.get("Points"));
		return map;

	}
	public static List<Map<String,String>> csvReader(Reader reader) throws IOException {
		List< Map<String,String>> smap=new ArrayList<Map<String,String>>();
		Iterator<Map<String, String>> iterator = new CsvMapper()
				.readerFor(Map.class)
				.with(CsvSchema.emptySchema().withHeader())
				.readValues(reader);
		while (iterator.hasNext()) {
			Map<String, String> keyVals = iterator.next();
			System.out.println(keyVals); smap.add(keyVals);
		}
		return smap;
	}
}




