package Classes;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stock {
	//---------------------------------------------------Instance Variables
	private String stock_code;
	private String stock_name;
	private String stock_currency;
	private Double stock_price;
	private Double stock_price_change;
	private Double stock_percentage_change;

	//---------------------------------------------------Constructor
	public Stock(String stock_code, String stock_name, String stock_currency,
			Double stock_price, Double stock_price_change,
			Double stock_percentage_change) {
		this.stock_code = stock_code;
		this.stock_name = stock_name;
		this.stock_currency = stock_currency;
		this.stock_price = stock_price;
		this.stock_price_change = stock_price_change;
		this.stock_percentage_change = stock_percentage_change;
	}

	//---------------------------------------------------Setters
	public void setStock_code(String stock_code) {
		this.stock_code = stock_code;
	}

	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public void setStock_currency(String stock_currency) {
		this.stock_currency = stock_currency;
	}
	public void setStock_price(Double stock_price) {
		this.stock_price = stock_price;
	}
	public void setStock_price_change(Double stock_price_change) {
		this.stock_price_change = stock_price_change;
	}
	public void setStock_percentage_change(Double stock_percentage_change) {
		this.stock_percentage_change = stock_percentage_change;
	}

	//---------------------------------------------------To string
	@Override
	public String toString() {
		return "Stock [stock_code=" + stock_code + ", stock_name=" + stock_name
				+ ", stock_currency=" + stock_currency + ", stock_price="
				+ stock_price + ", stock_price_change=" + stock_price_change
				+ ", stock_percentage_change=" + stock_percentage_change + "]";
	}

	//---------------------------------------------------Commands


}
