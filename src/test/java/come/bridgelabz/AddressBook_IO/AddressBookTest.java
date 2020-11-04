package come.bridgelabz.AddressBook_IO;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {
	
	@Test
	public void givenContactInDB_shouldMatchContactCount() {
		AddressBook book = new AddressBook();
		List<Contact> data = book.readContact();
		Assert.assertEquals(3, data.size());
	}
	
	@Test
	public void givenNewLastname_WhenUpdated_shouldMatch() {
		AddressBook book = new AddressBook();
		List<Contact> data = book.readContact();
		book.updateLastname("Pranee", "ch");
		boolean result = book.checkContactInSyncWithDB("Pranee");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenCity_shouldReturnContacts() {
		AddressBook book = new AddressBook();
		List<Contact> data = book.readContactByCity("vizag");
		Assert.assertEquals(2, data.size());
		
	}
	
	@Test
	public void givenState_shouldReturnContacts() {
		AddressBook book = new AddressBook();
		List<Contact> data = book.readContactByState("ap");
		Assert.assertEquals(3, data.size());
		
	}
	
	@Test
	public void givenNewContact_WhenAdded_shouldMatch() {
		AddressBook book = new AddressBook();
		List<Contact> data = book.readContact();
		book.add("Vihari", "ch","22","eluru","ap","530017","9001516348","cv","friends");
		boolean result = book.checkContactInSyncWithDB("Vihari");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenNewContact_WhenAdded_shouldMatch1() {
		AddressBook book = new AddressBook();
		List<Contact> data = book.readContact();
		book.add("sita", "sagi","222","vizag","ap","530017","9963711178","ss","family");
		boolean result = book.checkContactInSyncWithDB("sita");
		Assert.assertTrue(result);
	}


}
