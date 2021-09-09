package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'{'", "'manager'", "'address'", "'customers'", "','", "'}'", "'riders'", "'routes'", "'Customer'", "'name'", "'surname'", "'email'", "'subscriptionDate'", "'expirationDate'", "'status'", "'('", "')'", "'Rider'", "'livePosition'", "'Route'", "'price'", "'date'", "'startAddress'", "'endAddress'", "'feedback'", "'seat'", "'customer'", "'rider'", "'Geolocation'", "'lat'", "'lng'", "'-'", "'.'", "'E'", "'e'", "'PENDING'", "'ACTIVED'", "'BANNED'", "'AVAILABLE'", "'BUSY'", "'UNAVAILABLE'", "'DONE'", "'DOING'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Company";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompany"
    // InternalMyDsl.g:65:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalMyDsl.g:65:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalMyDsl.g:66:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalMyDsl.g:72:1: ruleCompany returns [EObject current=null] : ( () otherlv_1= 'Company' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_manager_5_0 = null;

        AntlrDatatypeRuleToken lv_address_7_0 = null;

        EObject lv_customers_10_0 = null;

        EObject lv_customers_12_0 = null;

        EObject lv_riders_16_0 = null;

        EObject lv_riders_18_0 = null;

        EObject lv_routes_22_0 = null;

        EObject lv_routes_24_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Company' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Company' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Company' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Company' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompanyAccess().getCompanyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompanyAccess().getCompanyKeyword_1());
            		
            // InternalMyDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompanyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompanyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:114:3: (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:115:4: otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompanyAccess().getManagerKeyword_4_0());
                    			
                    // InternalMyDsl.g:119:4: ( (lv_manager_5_0= ruleEString ) )
                    // InternalMyDsl.g:120:5: (lv_manager_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:120:5: (lv_manager_5_0= ruleEString )
                    // InternalMyDsl.g:121:6: lv_manager_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getManagerEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_manager_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						set(
                    							current,
                    							"manager",
                    							lv_manager_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:139:3: (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:140:4: otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCompanyAccess().getAddressKeyword_5_0());
                    			
                    // InternalMyDsl.g:144:4: ( (lv_address_7_0= ruleEString ) )
                    // InternalMyDsl.g:145:5: (lv_address_7_0= ruleEString )
                    {
                    // InternalMyDsl.g:145:5: (lv_address_7_0= ruleEString )
                    // InternalMyDsl.g:146:6: lv_address_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getAddressEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_address_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:164:3: (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:165:4: otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getCompanyAccess().getCustomersKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:173:4: ( (lv_customers_10_0= ruleCustomer ) )
                    // InternalMyDsl.g:174:5: (lv_customers_10_0= ruleCustomer )
                    {
                    // InternalMyDsl.g:174:5: (lv_customers_10_0= ruleCustomer )
                    // InternalMyDsl.g:175:6: lv_customers_10_0= ruleCustomer
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getCustomersCustomerParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_customers_10_0=ruleCustomer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						add(
                    							current,
                    							"customers",
                    							lv_customers_10_0,
                    							"org.xtext.example.mydsl.MyDsl.Customer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:192:4: (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:193:5: otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCompanyAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:197:5: ( (lv_customers_12_0= ruleCustomer ) )
                    	    // InternalMyDsl.g:198:6: (lv_customers_12_0= ruleCustomer )
                    	    {
                    	    // InternalMyDsl.g:198:6: (lv_customers_12_0= ruleCustomer )
                    	    // InternalMyDsl.g:199:7: lv_customers_12_0= ruleCustomer
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompanyAccess().getCustomersCustomerParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_customers_12_0=ruleCustomer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompanyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"customers",
                    	    								lv_customers_12_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Customer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:222:3: (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:223:4: otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getCompanyAccess().getRidersKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:231:4: ( (lv_riders_16_0= ruleRider ) )
                    // InternalMyDsl.g:232:5: (lv_riders_16_0= ruleRider )
                    {
                    // InternalMyDsl.g:232:5: (lv_riders_16_0= ruleRider )
                    // InternalMyDsl.g:233:6: lv_riders_16_0= ruleRider
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getRidersRiderParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_riders_16_0=ruleRider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						add(
                    							current,
                    							"riders",
                    							lv_riders_16_0,
                    							"org.xtext.example.mydsl.MyDsl.Rider");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:250:4: (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:251:5: otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getCompanyAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:255:5: ( (lv_riders_18_0= ruleRider ) )
                    	    // InternalMyDsl.g:256:6: (lv_riders_18_0= ruleRider )
                    	    {
                    	    // InternalMyDsl.g:256:6: (lv_riders_18_0= ruleRider )
                    	    // InternalMyDsl.g:257:7: lv_riders_18_0= ruleRider
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompanyAccess().getRidersRiderParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_riders_18_0=ruleRider();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompanyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"riders",
                    	    								lv_riders_18_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Rider");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:280:3: (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:281:4: otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getCompanyAccess().getRoutesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyDsl.g:289:4: ( (lv_routes_22_0= ruleRoute ) )
                    // InternalMyDsl.g:290:5: (lv_routes_22_0= ruleRoute )
                    {
                    // InternalMyDsl.g:290:5: (lv_routes_22_0= ruleRoute )
                    // InternalMyDsl.g:291:6: lv_routes_22_0= ruleRoute
                    {

                    						newCompositeNode(grammarAccess.getCompanyAccess().getRoutesRouteParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_routes_22_0=ruleRoute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompanyRule());
                    						}
                    						add(
                    							current,
                    							"routes",
                    							lv_routes_22_0,
                    							"org.xtext.example.mydsl.MyDsl.Route");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:308:4: (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:309:5: otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getCompanyAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:313:5: ( (lv_routes_24_0= ruleRoute ) )
                    	    // InternalMyDsl.g:314:6: (lv_routes_24_0= ruleRoute )
                    	    {
                    	    // InternalMyDsl.g:314:6: (lv_routes_24_0= ruleRoute )
                    	    // InternalMyDsl.g:315:7: lv_routes_24_0= ruleRoute
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompanyAccess().getRoutesRouteParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_routes_24_0=ruleRoute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompanyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"routes",
                    	    								lv_routes_24_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Route");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_25, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:346:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:346:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:347:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:353:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:359:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:360:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:360:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:361:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:369:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCustomer"
    // InternalMyDsl.g:380:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalMyDsl.g:380:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalMyDsl.g:381:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalMyDsl.g:387:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_surname_6_0 = null;

        AntlrDatatypeRuleToken lv_email_8_0 = null;

        AntlrDatatypeRuleToken lv_subscriptionDate_10_0 = null;

        AntlrDatatypeRuleToken lv_expirationDate_12_0 = null;

        Enumerator lv_status_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:393:2: ( (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) )
            // InternalMyDsl.g:394:2: (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            {
            // InternalMyDsl.g:394:2: (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            // InternalMyDsl.g:395:3: otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalMyDsl.g:399:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:400:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:400:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:401:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getNameKeyword_3());
            		
            // InternalMyDsl.g:426:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:427:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:427:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:428:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomerAccess().getSurnameKeyword_5());
            		
            // InternalMyDsl.g:449:3: ( (lv_surname_6_0= ruleEString ) )
            // InternalMyDsl.g:450:4: (lv_surname_6_0= ruleEString )
            {
            // InternalMyDsl.g:450:4: (lv_surname_6_0= ruleEString )
            // InternalMyDsl.g:451:5: lv_surname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getSurnameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_surname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"surname",
            						lv_surname_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomerAccess().getEmailKeyword_7());
            		
            // InternalMyDsl.g:472:3: ( (lv_email_8_0= ruleEString ) )
            // InternalMyDsl.g:473:4: (lv_email_8_0= ruleEString )
            {
            // InternalMyDsl.g:473:4: (lv_email_8_0= ruleEString )
            // InternalMyDsl.g:474:5: lv_email_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getEmailEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_email_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_8_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:491:3: (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:492:4: otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCustomerAccess().getSubscriptionDateKeyword_9_0());
                    			
                    // InternalMyDsl.g:496:4: ( (lv_subscriptionDate_10_0= ruleEString ) )
                    // InternalMyDsl.g:497:5: (lv_subscriptionDate_10_0= ruleEString )
                    {
                    // InternalMyDsl.g:497:5: (lv_subscriptionDate_10_0= ruleEString )
                    // InternalMyDsl.g:498:6: lv_subscriptionDate_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getSubscriptionDateEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_subscriptionDate_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"subscriptionDate",
                    							lv_subscriptionDate_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getCustomerAccess().getExpirationDateKeyword_10());
            		
            // InternalMyDsl.g:520:3: ( (lv_expirationDate_12_0= ruleEString ) )
            // InternalMyDsl.g:521:4: (lv_expirationDate_12_0= ruleEString )
            {
            // InternalMyDsl.g:521:4: (lv_expirationDate_12_0= ruleEString )
            // InternalMyDsl.g:522:5: lv_expirationDate_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getExpirationDateEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_20);
            lv_expirationDate_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"expirationDate",
            						lv_expirationDate_12_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_13, grammarAccess.getCustomerAccess().getStatusKeyword_12());
            		
            // InternalMyDsl.g:543:3: ( (lv_status_14_0= ruleCustomerStatus ) )
            // InternalMyDsl.g:544:4: (lv_status_14_0= ruleCustomerStatus )
            {
            // InternalMyDsl.g:544:4: (lv_status_14_0= ruleCustomerStatus )
            // InternalMyDsl.g:545:5: lv_status_14_0= ruleCustomerStatus
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getStatusCustomerStatusEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_12);
            lv_status_14_0=ruleCustomerStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_14_0,
            						"org.xtext.example.mydsl.MyDsl.CustomerStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:562:3: (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:563:4: otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getCustomerAccess().getRoutesKeyword_14_0());
                    			
                    otherlv_16=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_14_1());
                    			
                    // InternalMyDsl.g:571:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:572:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:572:5: ( ruleEString )
                    // InternalMyDsl.g:573:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:587:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:588:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCustomerAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalMyDsl.g:592:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:593:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:593:6: ( ruleEString )
                    	    // InternalMyDsl.g:594:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCustomerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_20, grammarAccess.getCustomerAccess().getRightParenthesisKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleRider"
    // InternalMyDsl.g:622:1: entryRuleRider returns [EObject current=null] : iv_ruleRider= ruleRider EOF ;
    public final EObject entryRuleRider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRider = null;


        try {
            // InternalMyDsl.g:622:46: (iv_ruleRider= ruleRider EOF )
            // InternalMyDsl.g:623:2: iv_ruleRider= ruleRider EOF
            {
             newCompositeNode(grammarAccess.getRiderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRider=ruleRider();

            state._fsp--;

             current =iv_ruleRider; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRider"


    // $ANTLR start "ruleRider"
    // InternalMyDsl.g:629:1: ruleRider returns [EObject current=null] : (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'livePosition' ( (lv_livePosition_18_0= ruleGeolocation ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleRider() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_surname_6_0 = null;

        AntlrDatatypeRuleToken lv_email_8_0 = null;

        Enumerator lv_status_10_0 = null;

        EObject lv_livePosition_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:635:2: ( (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'livePosition' ( (lv_livePosition_18_0= ruleGeolocation ) ) )? otherlv_19= '}' ) )
            // InternalMyDsl.g:636:2: (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'livePosition' ( (lv_livePosition_18_0= ruleGeolocation ) ) )? otherlv_19= '}' )
            {
            // InternalMyDsl.g:636:2: (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'livePosition' ( (lv_livePosition_18_0= ruleGeolocation ) ) )? otherlv_19= '}' )
            // InternalMyDsl.g:637:3: otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'livePosition' ( (lv_livePosition_18_0= ruleGeolocation ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRiderAccess().getRiderKeyword_0());
            		
            // InternalMyDsl.g:641:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:642:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:642:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:643:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRiderAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRiderAccess().getNameKeyword_3());
            		
            // InternalMyDsl.g:668:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:669:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:669:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:670:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRiderAccess().getSurnameKeyword_5());
            		
            // InternalMyDsl.g:691:3: ( (lv_surname_6_0= ruleEString ) )
            // InternalMyDsl.g:692:4: (lv_surname_6_0= ruleEString )
            {
            // InternalMyDsl.g:692:4: (lv_surname_6_0= ruleEString )
            // InternalMyDsl.g:693:5: lv_surname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getSurnameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_surname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"surname",
            						lv_surname_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRiderAccess().getEmailKeyword_7());
            		
            // InternalMyDsl.g:714:3: ( (lv_email_8_0= ruleEString ) )
            // InternalMyDsl.g:715:4: (lv_email_8_0= ruleEString )
            {
            // InternalMyDsl.g:715:4: (lv_email_8_0= ruleEString )
            // InternalMyDsl.g:716:5: lv_email_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getEmailEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_email_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_8_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getRiderAccess().getStatusKeyword_9());
            		
            // InternalMyDsl.g:737:3: ( (lv_status_10_0= ruleRiderStatus ) )
            // InternalMyDsl.g:738:4: (lv_status_10_0= ruleRiderStatus )
            {
            // InternalMyDsl.g:738:4: (lv_status_10_0= ruleRiderStatus )
            // InternalMyDsl.g:739:5: lv_status_10_0= ruleRiderStatus
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getStatusRiderStatusEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_25);
            lv_status_10_0=ruleRiderStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_10_0,
            						"org.xtext.example.mydsl.MyDsl.RiderStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:756:3: (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:757:4: otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getRiderAccess().getRoutesKeyword_11_0());
                    			
                    otherlv_12=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRiderAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalMyDsl.g:765:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:766:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:766:5: ( ruleEString )
                    // InternalMyDsl.g:767:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRiderRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRiderAccess().getRoutesRouteCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:781:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:782:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRiderAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalMyDsl.g:786:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:787:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:787:6: ( ruleEString )
                    	    // InternalMyDsl.g:788:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRiderRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRiderAccess().getRoutesRouteCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getRiderAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:808:3: (otherlv_17= 'livePosition' ( (lv_livePosition_18_0= ruleGeolocation ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:809:4: otherlv_17= 'livePosition' ( (lv_livePosition_18_0= ruleGeolocation ) )
                    {
                    otherlv_17=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getRiderAccess().getLivePositionKeyword_12_0());
                    			
                    // InternalMyDsl.g:813:4: ( (lv_livePosition_18_0= ruleGeolocation ) )
                    // InternalMyDsl.g:814:5: (lv_livePosition_18_0= ruleGeolocation )
                    {
                    // InternalMyDsl.g:814:5: (lv_livePosition_18_0= ruleGeolocation )
                    // InternalMyDsl.g:815:6: lv_livePosition_18_0= ruleGeolocation
                    {

                    						newCompositeNode(grammarAccess.getRiderAccess().getLivePositionGeolocationParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_livePosition_18_0=ruleGeolocation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRiderRule());
                    						}
                    						set(
                    							current,
                    							"livePosition",
                    							lv_livePosition_18_0,
                    							"org.xtext.example.mydsl.MyDsl.Geolocation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getRiderAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRider"


    // $ANTLR start "entryRuleRoute"
    // InternalMyDsl.g:841:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalMyDsl.g:841:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalMyDsl.g:842:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalMyDsl.g:848:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seat' ( (lv_seat_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        AntlrDatatypeRuleToken lv_date_6_0 = null;

        AntlrDatatypeRuleToken lv_startAddress_8_0 = null;

        AntlrDatatypeRuleToken lv_endAddress_10_0 = null;

        AntlrDatatypeRuleToken lv_feedback_12_0 = null;

        Enumerator lv_status_14_0 = null;

        AntlrDatatypeRuleToken lv_seat_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:854:2: ( (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seat' ( (lv_seat_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' ) )
            // InternalMyDsl.g:855:2: (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seat' ( (lv_seat_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' )
            {
            // InternalMyDsl.g:855:2: (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seat' ( (lv_seat_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' )
            // InternalMyDsl.g:856:3: otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seat' ( (lv_seat_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            // InternalMyDsl.g:860:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:861:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:861:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:862:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getRouteAccess().getPriceKeyword_3());
            		
            // InternalMyDsl.g:887:3: ( (lv_price_4_0= ruleEDouble ) )
            // InternalMyDsl.g:888:4: (lv_price_4_0= ruleEDouble )
            {
            // InternalMyDsl.g:888:4: (lv_price_4_0= ruleEDouble )
            // InternalMyDsl.g:889:5: lv_price_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getPriceEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_price_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_4_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRouteAccess().getDateKeyword_5());
            		
            // InternalMyDsl.g:910:3: ( (lv_date_6_0= ruleEString ) )
            // InternalMyDsl.g:911:4: (lv_date_6_0= ruleEString )
            {
            // InternalMyDsl.g:911:4: (lv_date_6_0= ruleEString )
            // InternalMyDsl.g:912:5: lv_date_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getDateEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
            lv_date_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRouteAccess().getStartAddressKeyword_7());
            		
            // InternalMyDsl.g:933:3: ( (lv_startAddress_8_0= ruleEString ) )
            // InternalMyDsl.g:934:4: (lv_startAddress_8_0= ruleEString )
            {
            // InternalMyDsl.g:934:4: (lv_startAddress_8_0= ruleEString )
            // InternalMyDsl.g:935:5: lv_startAddress_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getStartAddressEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_32);
            lv_startAddress_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"startAddress",
            						lv_startAddress_8_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRouteAccess().getEndAddressKeyword_9());
            		
            // InternalMyDsl.g:956:3: ( (lv_endAddress_10_0= ruleEString ) )
            // InternalMyDsl.g:957:4: (lv_endAddress_10_0= ruleEString )
            {
            // InternalMyDsl.g:957:4: (lv_endAddress_10_0= ruleEString )
            // InternalMyDsl.g:958:5: lv_endAddress_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getEndAddressEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_33);
            lv_endAddress_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"endAddress",
            						lv_endAddress_10_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,36,FOLLOW_34); 

            			newLeafNode(otherlv_11, grammarAccess.getRouteAccess().getFeedbackKeyword_11());
            		
            // InternalMyDsl.g:979:3: ( (lv_feedback_12_0= ruleEInt ) )
            // InternalMyDsl.g:980:4: (lv_feedback_12_0= ruleEInt )
            {
            // InternalMyDsl.g:980:4: (lv_feedback_12_0= ruleEInt )
            // InternalMyDsl.g:981:5: lv_feedback_12_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getFeedbackEIntParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_20);
            lv_feedback_12_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"feedback",
            						lv_feedback_12_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,26,FOLLOW_35); 

            			newLeafNode(otherlv_13, grammarAccess.getRouteAccess().getStatusKeyword_13());
            		
            // InternalMyDsl.g:1002:3: ( (lv_status_14_0= ruleRouteStatus ) )
            // InternalMyDsl.g:1003:4: (lv_status_14_0= ruleRouteStatus )
            {
            // InternalMyDsl.g:1003:4: (lv_status_14_0= ruleRouteStatus )
            // InternalMyDsl.g:1004:5: lv_status_14_0= ruleRouteStatus
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getStatusRouteStatusEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_36);
            lv_status_14_0=ruleRouteStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_14_0,
            						"org.xtext.example.mydsl.MyDsl.RouteStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_15, grammarAccess.getRouteAccess().getSeatKeyword_15());
            		
            // InternalMyDsl.g:1025:3: ( (lv_seat_16_0= ruleEInt ) )
            // InternalMyDsl.g:1026:4: (lv_seat_16_0= ruleEInt )
            {
            // InternalMyDsl.g:1026:4: (lv_seat_16_0= ruleEInt )
            // InternalMyDsl.g:1027:5: lv_seat_16_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getSeatEIntParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_37);
            lv_seat_16_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"seat",
            						lv_seat_16_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getRouteAccess().getCustomerKeyword_17());
            		
            // InternalMyDsl.g:1048:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1049:4: ( ruleEString )
            {
            // InternalMyDsl.g:1049:4: ( ruleEString )
            // InternalMyDsl.g:1050:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRouteAccess().getCustomerCustomerCrossReference_18_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getRouteAccess().getRiderKeyword_19());
            		
            // InternalMyDsl.g:1068:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1069:4: ( ruleEString )
            {
            // InternalMyDsl.g:1069:4: ( ruleEString )
            // InternalMyDsl.g:1070:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRouteAccess().getRiderRiderCrossReference_20_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRouteAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleGeolocation"
    // InternalMyDsl.g:1092:1: entryRuleGeolocation returns [EObject current=null] : iv_ruleGeolocation= ruleGeolocation EOF ;
    public final EObject entryRuleGeolocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeolocation = null;


        try {
            // InternalMyDsl.g:1092:52: (iv_ruleGeolocation= ruleGeolocation EOF )
            // InternalMyDsl.g:1093:2: iv_ruleGeolocation= ruleGeolocation EOF
            {
             newCompositeNode(grammarAccess.getGeolocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeolocation=ruleGeolocation();

            state._fsp--;

             current =iv_ruleGeolocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeolocation"


    // $ANTLR start "ruleGeolocation"
    // InternalMyDsl.g:1099:1: ruleGeolocation returns [EObject current=null] : (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) (otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleGeolocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_lat_3_0 = null;

        AntlrDatatypeRuleToken lv_lng_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1105:2: ( (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) (otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:1106:2: (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) (otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:1106:2: (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) (otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:1107:3: otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) (otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeolocationAccess().getGeolocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getGeolocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getGeolocationAccess().getLatKeyword_2());
            		
            // InternalMyDsl.g:1119:3: ( (lv_lat_3_0= ruleEDouble ) )
            // InternalMyDsl.g:1120:4: (lv_lat_3_0= ruleEDouble )
            {
            // InternalMyDsl.g:1120:4: (lv_lat_3_0= ruleEDouble )
            // InternalMyDsl.g:1121:5: lv_lat_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getGeolocationAccess().getLatEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_lat_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeolocationRule());
            					}
            					set(
            						current,
            						"lat",
            						lv_lat_3_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1138:3: (otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1139:4: otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getGeolocationAccess().getLngKeyword_4_0());
                    			
                    // InternalMyDsl.g:1143:4: ( (lv_lng_5_0= ruleEDouble ) )
                    // InternalMyDsl.g:1144:5: (lv_lng_5_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:1144:5: (lv_lng_5_0= ruleEDouble )
                    // InternalMyDsl.g:1145:6: lv_lng_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getGeolocationAccess().getLngEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_lng_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGeolocationRule());
                    						}
                    						set(
                    							current,
                    							"lng",
                    							lv_lng_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGeolocationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeolocation"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:1171:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:1171:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:1172:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:1178:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1184:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:1185:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:1185:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:1186:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:1186:3: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1187:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1193:3: (this_INT_1= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1194:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_42); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,44,FOLLOW_43); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_44); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1214:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=45 && LA21_0<=46)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1215:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:1215:4: (kw= 'E' | kw= 'e' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==45) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==46) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:1216:5: kw= 'E'
                            {
                            kw=(Token)match(input,45,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1222:5: kw= 'e'
                            {
                            kw=(Token)match(input,46,FOLLOW_34); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:1228:4: (kw= '-' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==43) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMyDsl.g:1229:5: kw= '-'
                            {
                            kw=(Token)match(input,43,FOLLOW_43); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1247:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1247:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1248:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1254:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1260:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1261:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1261:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1262:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1262:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1263:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleCustomerStatus"
    // InternalMyDsl.g:1280:1: ruleCustomerStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) ) ;
    public final Enumerator ruleCustomerStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1286:2: ( ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) ) )
            // InternalMyDsl.g:1287:2: ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) )
            {
            // InternalMyDsl.g:1287:2: ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt23=1;
                }
                break;
            case 48:
                {
                alt23=2;
                }
                break;
            case 49:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1288:3: (enumLiteral_0= 'PENDING' )
                    {
                    // InternalMyDsl.g:1288:3: (enumLiteral_0= 'PENDING' )
                    // InternalMyDsl.g:1289:4: enumLiteral_0= 'PENDING'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1296:3: (enumLiteral_1= 'ACTIVED' )
                    {
                    // InternalMyDsl.g:1296:3: (enumLiteral_1= 'ACTIVED' )
                    // InternalMyDsl.g:1297:4: enumLiteral_1= 'ACTIVED'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1304:3: (enumLiteral_2= 'BANNED' )
                    {
                    // InternalMyDsl.g:1304:3: (enumLiteral_2= 'BANNED' )
                    // InternalMyDsl.g:1305:4: enumLiteral_2= 'BANNED'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCustomerStatusAccess().getBANNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCustomerStatusAccess().getBANNEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomerStatus"


    // $ANTLR start "ruleRiderStatus"
    // InternalMyDsl.g:1315:1: ruleRiderStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) ) ;
    public final Enumerator ruleRiderStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1321:2: ( ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) ) )
            // InternalMyDsl.g:1322:2: ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) )
            {
            // InternalMyDsl.g:1322:2: ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt24=1;
                }
                break;
            case 51:
                {
                alt24=2;
                }
                break;
            case 52:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1323:3: (enumLiteral_0= 'AVAILABLE' )
                    {
                    // InternalMyDsl.g:1323:3: (enumLiteral_0= 'AVAILABLE' )
                    // InternalMyDsl.g:1324:4: enumLiteral_0= 'AVAILABLE'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1331:3: (enumLiteral_1= 'BUSY' )
                    {
                    // InternalMyDsl.g:1331:3: (enumLiteral_1= 'BUSY' )
                    // InternalMyDsl.g:1332:4: enumLiteral_1= 'BUSY'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1339:3: (enumLiteral_2= 'UNAVAILABLE' )
                    {
                    // InternalMyDsl.g:1339:3: (enumLiteral_2= 'UNAVAILABLE' )
                    // InternalMyDsl.g:1340:4: enumLiteral_2= 'UNAVAILABLE'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getRiderStatusAccess().getUNAVAILABLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRiderStatusAccess().getUNAVAILABLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRiderStatus"


    // $ANTLR start "ruleRouteStatus"
    // InternalMyDsl.g:1350:1: ruleRouteStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) ) ;
    public final Enumerator ruleRouteStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1356:2: ( ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) ) )
            // InternalMyDsl.g:1357:2: ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) )
            {
            // InternalMyDsl.g:1357:2: ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt25=1;
                }
                break;
            case 54:
                {
                alt25=2;
                }
                break;
            case 47:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1358:3: (enumLiteral_0= 'DONE' )
                    {
                    // InternalMyDsl.g:1358:3: (enumLiteral_0= 'DONE' )
                    // InternalMyDsl.g:1359:4: enumLiteral_0= 'DONE'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1366:3: (enumLiteral_1= 'DOING' )
                    {
                    // InternalMyDsl.g:1366:3: (enumLiteral_1= 'DOING' )
                    // InternalMyDsl.g:1367:4: enumLiteral_1= 'DOING'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1374:3: (enumLiteral_2= 'PENDING' )
                    {
                    // InternalMyDsl.g:1374:3: (enumLiteral_2= 'PENDING' )
                    // InternalMyDsl.g:1375:4: enumLiteral_2= 'PENDING'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRouteStatusAccess().getPENDINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRouteStatusAccess().getPENDINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRouteStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000EE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000EC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000400A0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000180000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0060800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000600000000002L});

}