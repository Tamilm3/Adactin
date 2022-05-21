package org.Step;

import java.io.IOException;

import org.baseclass.Baseclass;
import org.openqa.selenium.support.ui.Select;
import org.pojo.Pojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends Baseclass {

	Pojo t=new Pojo();
	
	@When("User have to enter the valid username and valid password")
	public void user_have_to_enter_the_valid_username_and_valid_password() throws IOException {
		fill(t.getUser(), "tamilmani3");
		fill(t.getPass(), "tamilmani");
		toTakesScreenshot("login");		
	}

	@When("User have to click the login button to get the search hotel page")
	public void user_have_to_click_the_login_button_to_get_the_search_hotel_page() {
		btnClick(t.getLogin());
	}

	@When("In search hotel page user have to select the locaton in the location dropdown box")
	public void in_search_hotel_page_user_have_to_select_the_locaton_in_the_location_dropdown_box() {
		Select s=new Select(t.getLocation());
		s.selectByIndex(1);
	}

	@When("User have to select a hotel in the hotels dropdown box")
	public void user_have_to_select_a_hotel_in_the_hotels_dropdown_box() {
		Select s1=new Select(t.getHotel());
		s1.selectByIndex(1);
	}

	@When("User have to select a room types in the room types dropdown box")
	public void user_have_to_select_a_room_types_in_the_room_types_dropdown_box() {
		Select s2=new Select(t.getRoom());
		s2.selectByIndex(1);
	}

	@When("User have to select a number of rooms in the number of rooms dropdown box")
	public void user_have_to_select_a_number_of_rooms_in_the_number_of_rooms_dropdown_box() {
		Select s3=new Select(t.getNos());
		s3.selectByIndex(1);
	}

	@When("User have to enter the check in date")
	public void user_have_to_enter_the_check_in_date() {
		fill(t.getDatein(), "25/03/22");
	}

	@When("User have to enter the check out date")
	public void user_have_to_enter_the_check_out_date() {
		fill(t.getDateout(), "26/03/22");
	}

	@When("User have to select a number of adult in the adult per room dropdown box")
	public void user_have_to_select_a_number_of_adult_in_the_adult_per_room_dropdown_box() {
		Select s4=new Select(t.getAdult());
		s4.selectByIndex(1);
	}

	@When("User have to select a number of children in the children per room dropdown box")
	public void user_have_to_select_a_number_of_children_in_the_children_per_room_dropdown_box() {
		Select s5=new Select(t.getChild());
		s5.selectByIndex(1);
	}

	@When("User have to click the search box to get the select hotel page")
	public void user_have_to_click_the_search_box_to_get_the_select_hotel_page() {
		btnClick(t.getSearch());
	}

	@When("User have to click the filtered hotel radio button")
	public void user_have_to_click_the_filtered_hotel_radio_button() {
		btnClick(t.getRadio());
	}

	@When("User have to click the countinue button to get the book a hotel page")
	public void user_have_to_click_the_countinue_button_to_get_the_book_a_hotel_page() {
		btnClick(t.getConti());
	}

	@When("User have to enter the firstname, lastname, billing address, credit card number should be in {int} digit")
	public void user_have_to_enter_the_firstname_lastname_billing_address_credit_card_number_should_be_in_digit(Integer int1) {
		fill(t.getName(), "tamil");
		fill(t.getLastname(), "mani");
		fill(t.getAdd(), "vedaranyam");
		fill(t.getCardno(), "1234567890123456");
	}

	@When("User have to select a credit card type in the credit card type dropdown box")
	public void user_have_to_select_a_credit_card_type_in_the_credit_card_type_dropdown_box() {
		Select s6=new Select(t.getType());
		s6.selectByIndex(1);
	}

	@When("User have to select a expiry date in the month and year dropdown box")
	public void user_have_to_select_a_expiry_date_in_the_month_and_year_dropdown_box() {
		Select s7=new Select(t.getMonth());
		s7.selectByIndex(12);
		Select s8=new Select(t.getYear());
		s8.selectByIndex(12);
	}

	@When("User have to enter the CVV number")
	public void user_have_to_enter_the_CVV_number() {
		fill(t.getCvv(), "678");
	}

	@When("User have to click the book now button")
	public void user_have_to_click_the_book_now_button() {
		btnClick(t.getBook());
	}

	@Then("User should get the Booking confirmation page")
	public void user_should_get_the_Booking_confirmation_page() throws IOException {
		toTakesScreenshot("finished");
	}

}
