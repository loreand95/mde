/**
 * generated by Xtext 2.25.0
 */
package it.disim.mde.loreand.xtext.formatting2;

import com.google.inject.Inject;
import it.disim.mde.loreand.uber.CardID;
import it.disim.mde.loreand.uber.Customer;
import it.disim.mde.loreand.uber.Rider;
import it.disim.mde.loreand.uber.Route;
import it.disim.mde.loreand.uber.Supervisor;
import it.disim.mde.loreand.uber.Uber;
import it.disim.mde.loreand.xtext.services.UberDslGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class UberDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private UberDslGrammarAccess _uberDslGrammarAccess;
  
  protected void _format(final Uber uber, @Extension final IFormattableDocument document) {
    EList<Customer> _customers = uber.getCustomers();
    for (final Customer customer : _customers) {
      document.<Customer>format(customer);
    }
    EList<Rider> _riders = uber.getRiders();
    for (final Rider rider : _riders) {
      document.<Rider>format(rider);
    }
    EList<Route> _routes = uber.getRoutes();
    for (final Route route : _routes) {
      document.<Route>format(route);
    }
    EList<Supervisor> _supervisors = uber.getSupervisors();
    for (final Supervisor supervisor : _supervisors) {
      document.<Supervisor>format(supervisor);
    }
  }
  
  protected void _format(final Customer customer, @Extension final IFormattableDocument document) {
    document.<CardID>format(customer.getCardID());
  }
  
  public void format(final Object customer, final IFormattableDocument document) {
    if (customer instanceof Customer) {
      _format((Customer)customer, document);
      return;
    } else if (customer instanceof XtextResource) {
      _format((XtextResource)customer, document);
      return;
    } else if (customer instanceof Uber) {
      _format((Uber)customer, document);
      return;
    } else if (customer instanceof EObject) {
      _format((EObject)customer, document);
      return;
    } else if (customer == null) {
      _format((Void)null, document);
      return;
    } else if (customer != null) {
      _format(customer, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(customer, document).toString());
    }
  }
}
