/*
 * generated by Xtext 2.25.0
 */
package it.disim.mde.loreand.xtext.formatting2

import com.google.inject.Inject
import it.disim.mde.loreand.uber.Customer
import it.disim.mde.loreand.uber.Uber
import it.disim.mde.loreand.xtext.services.UberDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class UberDslFormatter extends AbstractFormatter2 {
	
	@Inject extension UberDslGrammarAccess

	def dispatch void format(Uber uber, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (customer : uber.customers) {
			customer.format
		}
		for (rider : uber.riders) {
			rider.format
		}
		for (route : uber.routes) {
			route.format
		}
		for (supervisor : uber.supervisors) {
			supervisor.format
		}
	}

	def dispatch void format(Customer customer, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		customer.cardID.format
	}
	
	// TODO: implement for Rider
}
