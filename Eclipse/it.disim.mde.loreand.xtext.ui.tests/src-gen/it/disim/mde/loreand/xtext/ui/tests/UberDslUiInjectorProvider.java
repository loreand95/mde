/*
 * generated by Xtext 2.25.0
 */
package it.disim.mde.loreand.xtext.ui.tests;

import com.google.inject.Injector;
import it.disim.mde.loreand.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class UberDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("it.disim.mde.loreand.xtext.UberDsl");
	}

}
