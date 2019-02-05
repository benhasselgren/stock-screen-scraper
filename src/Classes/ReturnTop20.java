package Classes;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReturnTop20 {
	
	public static ArrayList<Stock> returnTop20(String url) throws IOException{
		//Connect to London Stock exchange webpage
		Document doc = Jsoup.connect(url).get();
		Element table = doc.select("table.table_dati").get(0);
		Elements records = table.select("tr");
		boolean firstRow = true;

		//Declare list for stocks
		ArrayList<Stock> top20Stocks = new ArrayList<Stock>();

		//Declare variables (Stock)
		String stock_code = "";
		String stock_name = "";
		String stock_currency = "";
		Double stock_price = null;
		Double stock_price_change = null;
		Double stock_percentage_change = null;

		//Iterate through all records
		for (Element record : records) {
			//Skip the header row of the table
			if (firstRow) {
				firstRow = false;
				continue;
			}

			//Create list of fields in record
			Elements options = record.children();

			//Reset counter
			int count = 0;
			//iterate through all fields
			for(Element e : options){
				if(count == 0){
					stock_code = e.text();
				}
				else if (count == 1){
					stock_name = e.text();
				}
				else if (count == 2){
					stock_currency = e.text();
				}
				else if (count == 3){
					stock_price = Double.parseDouble(e.text().replaceAll(",", ""));
				}
				else if (count == 4){
					stock_price_change = Double.parseDouble(e.text());
				}
				else if (count == 5){
					stock_percentage_change = Double.parseDouble(e.text());
				}
				else{
					break;
				}
				count ++;
			}

			//Create instance of stock and assign all values from record into stock.
			Stock stock = new Stock(stock_code, stock_name, stock_currency, 
					stock_price, stock_price_change, stock_percentage_change);

			//Add stock to list
			top20Stocks.add(stock);
		}
		return top20Stocks;
	}
}
