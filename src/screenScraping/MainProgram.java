package screenScraping;

import java.io.IOException;
import java.util.ArrayList;

import Classes.ReturnTop20;
import Classes.Stock;

public class MainProgram {
	public static void main(String[] args) throws IOException {
		ReturnTop20 top20Stocks = new ReturnTop20();
		ArrayList<Stock> top20 = new ArrayList<Stock>();
		
		top20 = top20Stocks.returnTop20("https://www.londonstockexchange.com/exchange/prices-and-markets/stocks/prices-search/stock-prices-search.html");
		
		for(Stock stock : top20){
			System.out.print(stock.toString() + "\n");
		}
	}
}
