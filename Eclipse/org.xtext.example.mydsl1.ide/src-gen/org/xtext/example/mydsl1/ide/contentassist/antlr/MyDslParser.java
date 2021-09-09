/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl1.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl1.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getCustomerStatusAccess().getAlternatives(), "rule__CustomerStatus__Alternatives");
			builder.put(grammarAccess.getRouteStatusAccess().getAlternatives(), "rule__RouteStatus__Alternatives");
			builder.put(grammarAccess.getRiderStatusAccess().getAlternatives(), "rule__RiderStatus__Alternatives");
			builder.put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_9(), "rule__Customer__Group_9__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_14(), "rule__Customer__Group_14__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_14_3(), "rule__Customer__Group_14_3__0");
			builder.put(grammarAccess.getRouteAccess().getGroup(), "rule__Route__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getRiderAccess().getGroup(), "rule__Rider__Group__0");
			builder.put(grammarAccess.getRiderAccess().getGroup_11(), "rule__Rider__Group_11__0");
			builder.put(grammarAccess.getRiderAccess().getGroup_11_3(), "rule__Rider__Group_11_3__0");
			builder.put(grammarAccess.getRiderAccess().getGroup_12(), "rule__Rider__Group_12__0");
			builder.put(grammarAccess.getGeolocationAccess().getGroup(), "rule__Geolocation__Group__0");
			builder.put(grammarAccess.getCustomerAccess().getIdAssignment_1(), "rule__Customer__IdAssignment_1");
			builder.put(grammarAccess.getCustomerAccess().getNameAssignment_4(), "rule__Customer__NameAssignment_4");
			builder.put(grammarAccess.getCustomerAccess().getSurnameAssignment_6(), "rule__Customer__SurnameAssignment_6");
			builder.put(grammarAccess.getCustomerAccess().getEmailAssignment_8(), "rule__Customer__EmailAssignment_8");
			builder.put(grammarAccess.getCustomerAccess().getSubscriptionDateAssignment_9_1(), "rule__Customer__SubscriptionDateAssignment_9_1");
			builder.put(grammarAccess.getCustomerAccess().getExpirationDateAssignment_11(), "rule__Customer__ExpirationDateAssignment_11");
			builder.put(grammarAccess.getCustomerAccess().getStatusAssignment_13(), "rule__Customer__StatusAssignment_13");
			builder.put(grammarAccess.getCustomerAccess().getRoutesAssignment_14_2(), "rule__Customer__RoutesAssignment_14_2");
			builder.put(grammarAccess.getCustomerAccess().getRoutesAssignment_14_3_1(), "rule__Customer__RoutesAssignment_14_3_1");
			builder.put(grammarAccess.getRouteAccess().getIdAssignment_1(), "rule__Route__IdAssignment_1");
			builder.put(grammarAccess.getRouteAccess().getPriceAssignment_4(), "rule__Route__PriceAssignment_4");
			builder.put(grammarAccess.getRouteAccess().getDateAssignment_6(), "rule__Route__DateAssignment_6");
			builder.put(grammarAccess.getRouteAccess().getStartAddressAssignment_8(), "rule__Route__StartAddressAssignment_8");
			builder.put(grammarAccess.getRouteAccess().getEndAddressAssignment_10(), "rule__Route__EndAddressAssignment_10");
			builder.put(grammarAccess.getRouteAccess().getFeedbackAssignment_12(), "rule__Route__FeedbackAssignment_12");
			builder.put(grammarAccess.getRouteAccess().getStatusAssignment_14(), "rule__Route__StatusAssignment_14");
			builder.put(grammarAccess.getRouteAccess().getSeatsAssignment_16(), "rule__Route__SeatsAssignment_16");
			builder.put(grammarAccess.getRouteAccess().getCustomerAssignment_18(), "rule__Route__CustomerAssignment_18");
			builder.put(grammarAccess.getRouteAccess().getRiderAssignment_20(), "rule__Route__RiderAssignment_20");
			builder.put(grammarAccess.getRiderAccess().getIdAssignment_1(), "rule__Rider__IdAssignment_1");
			builder.put(grammarAccess.getRiderAccess().getNameAssignment_4(), "rule__Rider__NameAssignment_4");
			builder.put(grammarAccess.getRiderAccess().getSurnameAssignment_6(), "rule__Rider__SurnameAssignment_6");
			builder.put(grammarAccess.getRiderAccess().getEmailAssignment_8(), "rule__Rider__EmailAssignment_8");
			builder.put(grammarAccess.getRiderAccess().getStatusAssignment_10(), "rule__Rider__StatusAssignment_10");
			builder.put(grammarAccess.getRiderAccess().getRoutesAssignment_11_2(), "rule__Rider__RoutesAssignment_11_2");
			builder.put(grammarAccess.getRiderAccess().getRoutesAssignment_11_3_1(), "rule__Rider__RoutesAssignment_11_3_1");
			builder.put(grammarAccess.getRiderAccess().getLocationAssignment_12_1(), "rule__Rider__LocationAssignment_12_1");
			builder.put(grammarAccess.getGeolocationAccess().getLatAssignment_3(), "rule__Geolocation__LatAssignment_3");
			builder.put(grammarAccess.getGeolocationAccess().getLngAssignment_5(), "rule__Geolocation__LngAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
