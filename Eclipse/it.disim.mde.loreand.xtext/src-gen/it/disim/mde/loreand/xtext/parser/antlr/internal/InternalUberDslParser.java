package it.disim.mde.loreand.xtext.parser.antlr.internal;

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
import it.disim.mde.loreand.xtext.services.UberDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUberDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Uber'", "'{'", "'manager'", "'address'", "'customers'", "','", "'}'", "'riders'", "'routes'", "'supervisors'", "'Customer'", "'name'", "'surname'", "'email'", "'subscriptionDate'", "'expirationDate'", "'status'", "'('", "')'", "'cardID'", "'Rider'", "'location'", "'car'", "'Route'", "'price'", "'date'", "'startAddress'", "'endAddress'", "'feedback'", "'seats'", "'customer'", "'rider'", "'Supervisor'", "'role'", "'CardID'", "'path'", "'releaseDate'", "'institution'", "'approved'", "'Geolocation'", "'lat'", "'lng'", "'Car'", "'licencePlate'", "'model'", "'color'", "'-'", "'.'", "'E'", "'e'", "'PENDING'", "'ACTIVED'", "'BANNED'", "'AVAILABLE'", "'BUSY'", "'UNAVAILABLE'", "'DONE'", "'DOING'", "'MANAGER'", "'ACCOUNTANT'", "'STORE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
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


        public InternalUberDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUberDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUberDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUberDsl.g"; }



     	private UberDslGrammarAccess grammarAccess;

        public InternalUberDslParser(TokenStream input, UberDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Uber";
       	}

       	@Override
       	protected UberDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUber"
    // InternalUberDsl.g:65:1: entryRuleUber returns [EObject current=null] : iv_ruleUber= ruleUber EOF ;
    public final EObject entryRuleUber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUber = null;


        try {
            // InternalUberDsl.g:65:45: (iv_ruleUber= ruleUber EOF )
            // InternalUberDsl.g:66:2: iv_ruleUber= ruleUber EOF
            {
             newCompositeNode(grammarAccess.getUberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUber=ruleUber();

            state._fsp--;

             current =iv_ruleUber; 
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
    // $ANTLR end "entryRuleUber"


    // $ANTLR start "ruleUber"
    // InternalUberDsl.g:72:1: ruleUber returns [EObject current=null] : ( () otherlv_1= 'Uber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? (otherlv_26= 'supervisors' otherlv_27= '{' ( (lv_supervisors_28_0= ruleSupervisor ) ) (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) ;
    public final EObject ruleUber() throws RecognitionException {
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
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_manager_5_0 = null;

        AntlrDatatypeRuleToken lv_address_7_0 = null;

        EObject lv_customers_10_0 = null;

        EObject lv_customers_12_0 = null;

        EObject lv_riders_16_0 = null;

        EObject lv_riders_18_0 = null;

        EObject lv_routes_22_0 = null;

        EObject lv_routes_24_0 = null;

        EObject lv_supervisors_28_0 = null;

        EObject lv_supervisors_30_0 = null;



        	enterRule();

        try {
            // InternalUberDsl.g:78:2: ( ( () otherlv_1= 'Uber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? (otherlv_26= 'supervisors' otherlv_27= '{' ( (lv_supervisors_28_0= ruleSupervisor ) ) (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) )
            // InternalUberDsl.g:79:2: ( () otherlv_1= 'Uber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? (otherlv_26= 'supervisors' otherlv_27= '{' ( (lv_supervisors_28_0= ruleSupervisor ) ) (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            {
            // InternalUberDsl.g:79:2: ( () otherlv_1= 'Uber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? (otherlv_26= 'supervisors' otherlv_27= '{' ( (lv_supervisors_28_0= ruleSupervisor ) ) (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            // InternalUberDsl.g:80:3: () otherlv_1= 'Uber' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )? (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )? (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )? (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )? (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )? (otherlv_26= 'supervisors' otherlv_27= '{' ( (lv_supervisors_28_0= ruleSupervisor ) ) (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )* otherlv_31= '}' )? otherlv_32= '}'
            {
            // InternalUberDsl.g:80:3: ()
            // InternalUberDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUberAccess().getUberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUberAccess().getUberKeyword_1());
            		
            // InternalUberDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUberDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalUberDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalUberDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUberAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getUberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUberDsl.g:114:3: (otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUberDsl.g:115:4: otherlv_4= 'manager' ( (lv_manager_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getUberAccess().getManagerKeyword_4_0());
                    			
                    // InternalUberDsl.g:119:4: ( (lv_manager_5_0= ruleEString ) )
                    // InternalUberDsl.g:120:5: (lv_manager_5_0= ruleEString )
                    {
                    // InternalUberDsl.g:120:5: (lv_manager_5_0= ruleEString )
                    // InternalUberDsl.g:121:6: lv_manager_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUberAccess().getManagerEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_manager_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUberRule());
                    						}
                    						set(
                    							current,
                    							"manager",
                    							lv_manager_5_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUberDsl.g:139:3: (otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUberDsl.g:140:4: otherlv_6= 'address' ( (lv_address_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getUberAccess().getAddressKeyword_5_0());
                    			
                    // InternalUberDsl.g:144:4: ( (lv_address_7_0= ruleEString ) )
                    // InternalUberDsl.g:145:5: (lv_address_7_0= ruleEString )
                    {
                    // InternalUberDsl.g:145:5: (lv_address_7_0= ruleEString )
                    // InternalUberDsl.g:146:6: lv_address_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getUberAccess().getAddressEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_address_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUberRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_7_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUberDsl.g:164:3: (otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUberDsl.g:165:4: otherlv_8= 'customers' otherlv_9= '{' ( (lv_customers_10_0= ruleCustomer ) ) (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getUberAccess().getCustomersKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getUberAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUberDsl.g:173:4: ( (lv_customers_10_0= ruleCustomer ) )
                    // InternalUberDsl.g:174:5: (lv_customers_10_0= ruleCustomer )
                    {
                    // InternalUberDsl.g:174:5: (lv_customers_10_0= ruleCustomer )
                    // InternalUberDsl.g:175:6: lv_customers_10_0= ruleCustomer
                    {

                    						newCompositeNode(grammarAccess.getUberAccess().getCustomersCustomerParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_customers_10_0=ruleCustomer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUberRule());
                    						}
                    						add(
                    							current,
                    							"customers",
                    							lv_customers_10_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.Customer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUberDsl.g:192:4: (otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUberDsl.g:193:5: otherlv_11= ',' ( (lv_customers_12_0= ruleCustomer ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getUberAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUberDsl.g:197:5: ( (lv_customers_12_0= ruleCustomer ) )
                    	    // InternalUberDsl.g:198:6: (lv_customers_12_0= ruleCustomer )
                    	    {
                    	    // InternalUberDsl.g:198:6: (lv_customers_12_0= ruleCustomer )
                    	    // InternalUberDsl.g:199:7: lv_customers_12_0= ruleCustomer
                    	    {

                    	    							newCompositeNode(grammarAccess.getUberAccess().getCustomersCustomerParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_customers_12_0=ruleCustomer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUberRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"customers",
                    	    								lv_customers_12_0,
                    	    								"it.disim.mde.loreand.xtext.UberDsl.Customer");
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

                    				newLeafNode(otherlv_13, grammarAccess.getUberAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalUberDsl.g:222:3: (otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUberDsl.g:223:4: otherlv_14= 'riders' otherlv_15= '{' ( (lv_riders_16_0= ruleRider ) ) (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getUberAccess().getRidersKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_15, grammarAccess.getUberAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUberDsl.g:231:4: ( (lv_riders_16_0= ruleRider ) )
                    // InternalUberDsl.g:232:5: (lv_riders_16_0= ruleRider )
                    {
                    // InternalUberDsl.g:232:5: (lv_riders_16_0= ruleRider )
                    // InternalUberDsl.g:233:6: lv_riders_16_0= ruleRider
                    {

                    						newCompositeNode(grammarAccess.getUberAccess().getRidersRiderParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_riders_16_0=ruleRider();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUberRule());
                    						}
                    						add(
                    							current,
                    							"riders",
                    							lv_riders_16_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.Rider");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUberDsl.g:250:4: (otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUberDsl.g:251:5: otherlv_17= ',' ( (lv_riders_18_0= ruleRider ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getUberAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUberDsl.g:255:5: ( (lv_riders_18_0= ruleRider ) )
                    	    // InternalUberDsl.g:256:6: (lv_riders_18_0= ruleRider )
                    	    {
                    	    // InternalUberDsl.g:256:6: (lv_riders_18_0= ruleRider )
                    	    // InternalUberDsl.g:257:7: lv_riders_18_0= ruleRider
                    	    {

                    	    							newCompositeNode(grammarAccess.getUberAccess().getRidersRiderParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_riders_18_0=ruleRider();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUberRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"riders",
                    	    								lv_riders_18_0,
                    	    								"it.disim.mde.loreand.xtext.UberDsl.Rider");
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

                    				newLeafNode(otherlv_19, grammarAccess.getUberAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalUberDsl.g:280:3: (otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUberDsl.g:281:4: otherlv_20= 'routes' otherlv_21= '{' ( (lv_routes_22_0= ruleRoute ) ) (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getUberAccess().getRoutesKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getUberAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalUberDsl.g:289:4: ( (lv_routes_22_0= ruleRoute ) )
                    // InternalUberDsl.g:290:5: (lv_routes_22_0= ruleRoute )
                    {
                    // InternalUberDsl.g:290:5: (lv_routes_22_0= ruleRoute )
                    // InternalUberDsl.g:291:6: lv_routes_22_0= ruleRoute
                    {

                    						newCompositeNode(grammarAccess.getUberAccess().getRoutesRouteParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_routes_22_0=ruleRoute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUberRule());
                    						}
                    						add(
                    							current,
                    							"routes",
                    							lv_routes_22_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.Route");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUberDsl.g:308:4: (otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUberDsl.g:309:5: otherlv_23= ',' ( (lv_routes_24_0= ruleRoute ) )
                    	    {
                    	    otherlv_23=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getUberAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalUberDsl.g:313:5: ( (lv_routes_24_0= ruleRoute ) )
                    	    // InternalUberDsl.g:314:6: (lv_routes_24_0= ruleRoute )
                    	    {
                    	    // InternalUberDsl.g:314:6: (lv_routes_24_0= ruleRoute )
                    	    // InternalUberDsl.g:315:7: lv_routes_24_0= ruleRoute
                    	    {

                    	    							newCompositeNode(grammarAccess.getUberAccess().getRoutesRouteParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_routes_24_0=ruleRoute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUberRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"routes",
                    	    								lv_routes_24_0,
                    	    								"it.disim.mde.loreand.xtext.UberDsl.Route");
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

                    				newLeafNode(otherlv_25, grammarAccess.getUberAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalUberDsl.g:338:3: (otherlv_26= 'supervisors' otherlv_27= '{' ( (lv_supervisors_28_0= ruleSupervisor ) ) (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )* otherlv_31= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUberDsl.g:339:4: otherlv_26= 'supervisors' otherlv_27= '{' ( (lv_supervisors_28_0= ruleSupervisor ) ) (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_26, grammarAccess.getUberAccess().getSupervisorsKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_27, grammarAccess.getUberAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalUberDsl.g:347:4: ( (lv_supervisors_28_0= ruleSupervisor ) )
                    // InternalUberDsl.g:348:5: (lv_supervisors_28_0= ruleSupervisor )
                    {
                    // InternalUberDsl.g:348:5: (lv_supervisors_28_0= ruleSupervisor )
                    // InternalUberDsl.g:349:6: lv_supervisors_28_0= ruleSupervisor
                    {

                    						newCompositeNode(grammarAccess.getUberAccess().getSupervisorsSupervisorParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_supervisors_28_0=ruleSupervisor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUberRule());
                    						}
                    						add(
                    							current,
                    							"supervisors",
                    							lv_supervisors_28_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.Supervisor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUberDsl.g:366:4: (otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalUberDsl.g:367:5: otherlv_29= ',' ( (lv_supervisors_30_0= ruleSupervisor ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getUberAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalUberDsl.g:371:5: ( (lv_supervisors_30_0= ruleSupervisor ) )
                    	    // InternalUberDsl.g:372:6: (lv_supervisors_30_0= ruleSupervisor )
                    	    {
                    	    // InternalUberDsl.g:372:6: (lv_supervisors_30_0= ruleSupervisor )
                    	    // InternalUberDsl.g:373:7: lv_supervisors_30_0= ruleSupervisor
                    	    {

                    	    							newCompositeNode(grammarAccess.getUberAccess().getSupervisorsSupervisorParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_supervisors_30_0=ruleSupervisor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUberRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"supervisors",
                    	    								lv_supervisors_30_0,
                    	    								"it.disim.mde.loreand.xtext.UberDsl.Supervisor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_31, grammarAccess.getUberAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_32, grammarAccess.getUberAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleUber"


    // $ANTLR start "entryRuleEString"
    // InternalUberDsl.g:404:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUberDsl.g:404:47: (iv_ruleEString= ruleEString EOF )
            // InternalUberDsl.g:405:2: iv_ruleEString= ruleEString EOF
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
    // InternalUberDsl.g:411:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUberDsl.g:417:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUberDsl.g:418:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUberDsl.g:418:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUberDsl.g:419:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUberDsl.g:427:3: this_ID_1= RULE_ID
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
    // InternalUberDsl.g:438:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalUberDsl.g:438:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalUberDsl.g:439:2: iv_ruleCustomer= ruleCustomer EOF
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
    // InternalUberDsl.g:445:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'cardID' ( (lv_cardID_22_0= ruleCardID ) ) )? otherlv_23= '}' ) ;
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
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_surname_6_0 = null;

        AntlrDatatypeRuleToken lv_email_8_0 = null;

        AntlrDatatypeRuleToken lv_subscriptionDate_10_0 = null;

        AntlrDatatypeRuleToken lv_expirationDate_12_0 = null;

        Enumerator lv_status_14_0 = null;

        EObject lv_cardID_22_0 = null;



        	enterRule();

        try {
            // InternalUberDsl.g:451:2: ( (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'cardID' ( (lv_cardID_22_0= ruleCardID ) ) )? otherlv_23= '}' ) )
            // InternalUberDsl.g:452:2: (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'cardID' ( (lv_cardID_22_0= ruleCardID ) ) )? otherlv_23= '}' )
            {
            // InternalUberDsl.g:452:2: (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'cardID' ( (lv_cardID_22_0= ruleCardID ) ) )? otherlv_23= '}' )
            // InternalUberDsl.g:453:3: otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEString ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'cardID' ( (lv_cardID_22_0= ruleCardID ) ) )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalUberDsl.g:457:3: ( (lv_id_1_0= ruleEString ) )
            // InternalUberDsl.g:458:4: (lv_id_1_0= ruleEString )
            {
            // InternalUberDsl.g:458:4: (lv_id_1_0= ruleEString )
            // InternalUberDsl.g:459:5: lv_id_1_0= ruleEString
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
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getNameKeyword_3());
            		
            // InternalUberDsl.g:484:3: ( (lv_name_4_0= ruleEString ) )
            // InternalUberDsl.g:485:4: (lv_name_4_0= ruleEString )
            {
            // InternalUberDsl.g:485:4: (lv_name_4_0= ruleEString )
            // InternalUberDsl.g:486:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomerAccess().getSurnameKeyword_5());
            		
            // InternalUberDsl.g:507:3: ( (lv_surname_6_0= ruleEString ) )
            // InternalUberDsl.g:508:4: (lv_surname_6_0= ruleEString )
            {
            // InternalUberDsl.g:508:4: (lv_surname_6_0= ruleEString )
            // InternalUberDsl.g:509:5: lv_surname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getSurnameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_surname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"surname",
            						lv_surname_6_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomerAccess().getEmailKeyword_7());
            		
            // InternalUberDsl.g:530:3: ( (lv_email_8_0= ruleEString ) )
            // InternalUberDsl.g:531:4: (lv_email_8_0= ruleEString )
            {
            // InternalUberDsl.g:531:4: (lv_email_8_0= ruleEString )
            // InternalUberDsl.g:532:5: lv_email_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getEmailEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_email_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_8_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUberDsl.g:549:3: (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUberDsl.g:550:4: otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCustomerAccess().getSubscriptionDateKeyword_9_0());
                    			
                    // InternalUberDsl.g:554:4: ( (lv_subscriptionDate_10_0= ruleEString ) )
                    // InternalUberDsl.g:555:5: (lv_subscriptionDate_10_0= ruleEString )
                    {
                    // InternalUberDsl.g:555:5: (lv_subscriptionDate_10_0= ruleEString )
                    // InternalUberDsl.g:556:6: lv_subscriptionDate_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getSubscriptionDateEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_subscriptionDate_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"subscriptionDate",
                    							lv_subscriptionDate_10_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getCustomerAccess().getExpirationDateKeyword_10());
            		
            // InternalUberDsl.g:578:3: ( (lv_expirationDate_12_0= ruleEString ) )
            // InternalUberDsl.g:579:4: (lv_expirationDate_12_0= ruleEString )
            {
            // InternalUberDsl.g:579:4: (lv_expirationDate_12_0= ruleEString )
            // InternalUberDsl.g:580:5: lv_expirationDate_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getExpirationDateEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_22);
            lv_expirationDate_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"expirationDate",
            						lv_expirationDate_12_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_13, grammarAccess.getCustomerAccess().getStatusKeyword_12());
            		
            // InternalUberDsl.g:601:3: ( (lv_status_14_0= ruleCustomerStatus ) )
            // InternalUberDsl.g:602:4: (lv_status_14_0= ruleCustomerStatus )
            {
            // InternalUberDsl.g:602:4: (lv_status_14_0= ruleCustomerStatus )
            // InternalUberDsl.g:603:5: lv_status_14_0= ruleCustomerStatus
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getStatusCustomerStatusEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_24);
            lv_status_14_0=ruleCustomerStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_14_0,
            						"it.disim.mde.loreand.xtext.UberDsl.CustomerStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUberDsl.g:620:3: (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUberDsl.g:621:4: otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getCustomerAccess().getRoutesKeyword_14_0());
                    			
                    otherlv_16=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_14_1());
                    			
                    // InternalUberDsl.g:629:4: ( ( ruleEString ) )
                    // InternalUberDsl.g:630:5: ( ruleEString )
                    {
                    // InternalUberDsl.g:630:5: ( ruleEString )
                    // InternalUberDsl.g:631:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUberDsl.g:645:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUberDsl.g:646:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCustomerAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalUberDsl.g:650:5: ( ( ruleEString ) )
                    	    // InternalUberDsl.g:651:6: ( ruleEString )
                    	    {
                    	    // InternalUberDsl.g:651:6: ( ruleEString )
                    	    // InternalUberDsl.g:652:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCustomerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
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

                    otherlv_20=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getCustomerAccess().getRightParenthesisKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalUberDsl.g:672:3: (otherlv_21= 'cardID' ( (lv_cardID_22_0= ruleCardID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUberDsl.g:673:4: otherlv_21= 'cardID' ( (lv_cardID_22_0= ruleCardID ) )
                    {
                    otherlv_21=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_21, grammarAccess.getCustomerAccess().getCardIDKeyword_15_0());
                    			
                    // InternalUberDsl.g:677:4: ( (lv_cardID_22_0= ruleCardID ) )
                    // InternalUberDsl.g:678:5: (lv_cardID_22_0= ruleCardID )
                    {
                    // InternalUberDsl.g:678:5: (lv_cardID_22_0= ruleCardID )
                    // InternalUberDsl.g:679:6: lv_cardID_22_0= ruleCardID
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getCardIDCardIDParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_cardID_22_0=ruleCardID();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"cardID",
                    							lv_cardID_22_0,
                    							"it.disim.mde.loreand.xtext.UberDsl.CardID");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalUberDsl.g:705:1: entryRuleRider returns [EObject current=null] : iv_ruleRider= ruleRider EOF ;
    public final EObject entryRuleRider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRider = null;


        try {
            // InternalUberDsl.g:705:46: (iv_ruleRider= ruleRider EOF )
            // InternalUberDsl.g:706:2: iv_ruleRider= ruleRider EOF
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
    // InternalUberDsl.g:712:1: ruleRider returns [EObject current=null] : (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'location' ( (lv_location_18_0= ruleGeolocation ) ) otherlv_19= 'car' ( (lv_car_20_0= ruleCar ) ) otherlv_21= '}' ) ;
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
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_surname_6_0 = null;

        AntlrDatatypeRuleToken lv_email_8_0 = null;

        Enumerator lv_status_10_0 = null;

        EObject lv_location_18_0 = null;

        EObject lv_car_20_0 = null;



        	enterRule();

        try {
            // InternalUberDsl.g:718:2: ( (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'location' ( (lv_location_18_0= ruleGeolocation ) ) otherlv_19= 'car' ( (lv_car_20_0= ruleCar ) ) otherlv_21= '}' ) )
            // InternalUberDsl.g:719:2: (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'location' ( (lv_location_18_0= ruleGeolocation ) ) otherlv_19= 'car' ( (lv_car_20_0= ruleCar ) ) otherlv_21= '}' )
            {
            // InternalUberDsl.g:719:2: (otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'location' ( (lv_location_18_0= ruleGeolocation ) ) otherlv_19= 'car' ( (lv_car_20_0= ruleCar ) ) otherlv_21= '}' )
            // InternalUberDsl.g:720:3: otherlv_0= 'Rider' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'status' ( (lv_status_10_0= ruleRiderStatus ) ) (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= 'location' ( (lv_location_18_0= ruleGeolocation ) ) otherlv_19= 'car' ( (lv_car_20_0= ruleCar ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRiderAccess().getRiderKeyword_0());
            		
            // InternalUberDsl.g:724:3: ( (lv_id_1_0= ruleEString ) )
            // InternalUberDsl.g:725:4: (lv_id_1_0= ruleEString )
            {
            // InternalUberDsl.g:725:4: (lv_id_1_0= ruleEString )
            // InternalUberDsl.g:726:5: lv_id_1_0= ruleEString
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
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRiderAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRiderAccess().getNameKeyword_3());
            		
            // InternalUberDsl.g:751:3: ( (lv_name_4_0= ruleEString ) )
            // InternalUberDsl.g:752:4: (lv_name_4_0= ruleEString )
            {
            // InternalUberDsl.g:752:4: (lv_name_4_0= ruleEString )
            // InternalUberDsl.g:753:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRiderAccess().getSurnameKeyword_5());
            		
            // InternalUberDsl.g:774:3: ( (lv_surname_6_0= ruleEString ) )
            // InternalUberDsl.g:775:4: (lv_surname_6_0= ruleEString )
            {
            // InternalUberDsl.g:775:4: (lv_surname_6_0= ruleEString )
            // InternalUberDsl.g:776:5: lv_surname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getSurnameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_surname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"surname",
            						lv_surname_6_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRiderAccess().getEmailKeyword_7());
            		
            // InternalUberDsl.g:797:3: ( (lv_email_8_0= ruleEString ) )
            // InternalUberDsl.g:798:4: (lv_email_8_0= ruleEString )
            {
            // InternalUberDsl.g:798:4: (lv_email_8_0= ruleEString )
            // InternalUberDsl.g:799:5: lv_email_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getEmailEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_22);
            lv_email_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_8_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_29); 

            			newLeafNode(otherlv_9, grammarAccess.getRiderAccess().getStatusKeyword_9());
            		
            // InternalUberDsl.g:820:3: ( (lv_status_10_0= ruleRiderStatus ) )
            // InternalUberDsl.g:821:4: (lv_status_10_0= ruleRiderStatus )
            {
            // InternalUberDsl.g:821:4: (lv_status_10_0= ruleRiderStatus )
            // InternalUberDsl.g:822:5: lv_status_10_0= ruleRiderStatus
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getStatusRiderStatusEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_30);
            lv_status_10_0=ruleRiderStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_10_0,
            						"it.disim.mde.loreand.xtext.UberDsl.RiderStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUberDsl.g:839:3: (otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUberDsl.g:840:4: otherlv_11= 'routes' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getRiderAccess().getRoutesKeyword_11_0());
                    			
                    otherlv_12=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRiderAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalUberDsl.g:848:4: ( ( ruleEString ) )
                    // InternalUberDsl.g:849:5: ( ruleEString )
                    {
                    // InternalUberDsl.g:849:5: ( ruleEString )
                    // InternalUberDsl.g:850:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRiderRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRiderAccess().getRoutesRouteCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUberDsl.g:864:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalUberDsl.g:865:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRiderAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalUberDsl.g:869:5: ( ( ruleEString ) )
                    	    // InternalUberDsl.g:870:6: ( ruleEString )
                    	    {
                    	    // InternalUberDsl.g:870:6: ( ruleEString )
                    	    // InternalUberDsl.g:871:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRiderRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRiderAccess().getRoutesRouteCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,29,FOLLOW_31); 

                    				newLeafNode(otherlv_16, grammarAccess.getRiderAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_17, grammarAccess.getRiderAccess().getLocationKeyword_12());
            		
            // InternalUberDsl.g:895:3: ( (lv_location_18_0= ruleGeolocation ) )
            // InternalUberDsl.g:896:4: (lv_location_18_0= ruleGeolocation )
            {
            // InternalUberDsl.g:896:4: (lv_location_18_0= ruleGeolocation )
            // InternalUberDsl.g:897:5: lv_location_18_0= ruleGeolocation
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getLocationGeolocationParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_33);
            lv_location_18_0=ruleGeolocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_18_0,
            						"it.disim.mde.loreand.xtext.UberDsl.Geolocation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,33,FOLLOW_34); 

            			newLeafNode(otherlv_19, grammarAccess.getRiderAccess().getCarKeyword_14());
            		
            // InternalUberDsl.g:918:3: ( (lv_car_20_0= ruleCar ) )
            // InternalUberDsl.g:919:4: (lv_car_20_0= ruleCar )
            {
            // InternalUberDsl.g:919:4: (lv_car_20_0= ruleCar )
            // InternalUberDsl.g:920:5: lv_car_20_0= ruleCar
            {

            					newCompositeNode(grammarAccess.getRiderAccess().getCarCarParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_16);
            lv_car_20_0=ruleCar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRiderRule());
            					}
            					set(
            						current,
            						"car",
            						lv_car_20_0,
            						"it.disim.mde.loreand.xtext.UberDsl.Car");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRiderAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalUberDsl.g:945:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalUberDsl.g:945:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalUberDsl.g:946:2: iv_ruleRoute= ruleRoute EOF
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
    // InternalUberDsl.g:952:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seats' ( (lv_seats_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' ) ;
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

        AntlrDatatypeRuleToken lv_seats_16_0 = null;



        	enterRule();

        try {
            // InternalUberDsl.g:958:2: ( (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seats' ( (lv_seats_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' ) )
            // InternalUberDsl.g:959:2: (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seats' ( (lv_seats_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' )
            {
            // InternalUberDsl.g:959:2: (otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seats' ( (lv_seats_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}' )
            // InternalUberDsl.g:960:3: otherlv_0= 'Route' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'price' ( (lv_price_4_0= ruleEDouble ) ) otherlv_5= 'date' ( (lv_date_6_0= ruleEString ) ) otherlv_7= 'startAddress' ( (lv_startAddress_8_0= ruleEString ) ) otherlv_9= 'endAddress' ( (lv_endAddress_10_0= ruleEString ) ) otherlv_11= 'feedback' ( (lv_feedback_12_0= ruleEInt ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleRouteStatus ) ) otherlv_15= 'seats' ( (lv_seats_16_0= ruleEInt ) ) otherlv_17= 'customer' ( ( ruleEString ) ) otherlv_19= 'rider' ( ( ruleEString ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
            		
            // InternalUberDsl.g:964:3: ( (lv_id_1_0= ruleEString ) )
            // InternalUberDsl.g:965:4: (lv_id_1_0= ruleEString )
            {
            // InternalUberDsl.g:965:4: (lv_id_1_0= ruleEString )
            // InternalUberDsl.g:966:5: lv_id_1_0= ruleEString
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
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getRouteAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getRouteAccess().getPriceKeyword_3());
            		
            // InternalUberDsl.g:991:3: ( (lv_price_4_0= ruleEDouble ) )
            // InternalUberDsl.g:992:4: (lv_price_4_0= ruleEDouble )
            {
            // InternalUberDsl.g:992:4: (lv_price_4_0= ruleEDouble )
            // InternalUberDsl.g:993:5: lv_price_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getPriceEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_price_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_4_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRouteAccess().getDateKeyword_5());
            		
            // InternalUberDsl.g:1014:3: ( (lv_date_6_0= ruleEString ) )
            // InternalUberDsl.g:1015:4: (lv_date_6_0= ruleEString )
            {
            // InternalUberDsl.g:1015:4: (lv_date_6_0= ruleEString )
            // InternalUberDsl.g:1016:5: lv_date_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getDateEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_38);
            lv_date_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_6_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRouteAccess().getStartAddressKeyword_7());
            		
            // InternalUberDsl.g:1037:3: ( (lv_startAddress_8_0= ruleEString ) )
            // InternalUberDsl.g:1038:4: (lv_startAddress_8_0= ruleEString )
            {
            // InternalUberDsl.g:1038:4: (lv_startAddress_8_0= ruleEString )
            // InternalUberDsl.g:1039:5: lv_startAddress_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getStartAddressEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_39);
            lv_startAddress_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"startAddress",
            						lv_startAddress_8_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRouteAccess().getEndAddressKeyword_9());
            		
            // InternalUberDsl.g:1060:3: ( (lv_endAddress_10_0= ruleEString ) )
            // InternalUberDsl.g:1061:4: (lv_endAddress_10_0= ruleEString )
            {
            // InternalUberDsl.g:1061:4: (lv_endAddress_10_0= ruleEString )
            // InternalUberDsl.g:1062:5: lv_endAddress_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getEndAddressEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_40);
            lv_endAddress_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"endAddress",
            						lv_endAddress_10_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_11, grammarAccess.getRouteAccess().getFeedbackKeyword_11());
            		
            // InternalUberDsl.g:1083:3: ( (lv_feedback_12_0= ruleEInt ) )
            // InternalUberDsl.g:1084:4: (lv_feedback_12_0= ruleEInt )
            {
            // InternalUberDsl.g:1084:4: (lv_feedback_12_0= ruleEInt )
            // InternalUberDsl.g:1085:5: lv_feedback_12_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getFeedbackEIntParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_22);
            lv_feedback_12_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"feedback",
            						lv_feedback_12_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,27,FOLLOW_42); 

            			newLeafNode(otherlv_13, grammarAccess.getRouteAccess().getStatusKeyword_13());
            		
            // InternalUberDsl.g:1106:3: ( (lv_status_14_0= ruleRouteStatus ) )
            // InternalUberDsl.g:1107:4: (lv_status_14_0= ruleRouteStatus )
            {
            // InternalUberDsl.g:1107:4: (lv_status_14_0= ruleRouteStatus )
            // InternalUberDsl.g:1108:5: lv_status_14_0= ruleRouteStatus
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getStatusRouteStatusEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_43);
            lv_status_14_0=ruleRouteStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_14_0,
            						"it.disim.mde.loreand.xtext.UberDsl.RouteStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,40,FOLLOW_41); 

            			newLeafNode(otherlv_15, grammarAccess.getRouteAccess().getSeatsKeyword_15());
            		
            // InternalUberDsl.g:1129:3: ( (lv_seats_16_0= ruleEInt ) )
            // InternalUberDsl.g:1130:4: (lv_seats_16_0= ruleEInt )
            {
            // InternalUberDsl.g:1130:4: (lv_seats_16_0= ruleEInt )
            // InternalUberDsl.g:1131:5: lv_seats_16_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getSeatsEIntParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_44);
            lv_seats_16_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"seats",
            						lv_seats_16_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getRouteAccess().getCustomerKeyword_17());
            		
            // InternalUberDsl.g:1152:3: ( ( ruleEString ) )
            // InternalUberDsl.g:1153:4: ( ruleEString )
            {
            // InternalUberDsl.g:1153:4: ( ruleEString )
            // InternalUberDsl.g:1154:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRouteAccess().getCustomerCustomerCrossReference_18_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getRouteAccess().getRiderKeyword_19());
            		
            // InternalUberDsl.g:1172:3: ( ( ruleEString ) )
            // InternalUberDsl.g:1173:4: ( ruleEString )
            {
            // InternalUberDsl.g:1173:4: ( ruleEString )
            // InternalUberDsl.g:1174:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRouteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRouteAccess().getRiderRiderCrossReference_20_0());
            				
            pushFollow(FOLLOW_16);
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


    // $ANTLR start "entryRuleSupervisor"
    // InternalUberDsl.g:1196:1: entryRuleSupervisor returns [EObject current=null] : iv_ruleSupervisor= ruleSupervisor EOF ;
    public final EObject entryRuleSupervisor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupervisor = null;


        try {
            // InternalUberDsl.g:1196:51: (iv_ruleSupervisor= ruleSupervisor EOF )
            // InternalUberDsl.g:1197:2: iv_ruleSupervisor= ruleSupervisor EOF
            {
             newCompositeNode(grammarAccess.getSupervisorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSupervisor=ruleSupervisor();

            state._fsp--;

             current =iv_ruleSupervisor; 
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
    // $ANTLR end "entryRuleSupervisor"


    // $ANTLR start "ruleSupervisor"
    // InternalUberDsl.g:1203:1: ruleSupervisor returns [EObject current=null] : (otherlv_0= 'Supervisor' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'role' ( (lv_role_10_0= ruleRoleSupervisor ) ) otherlv_11= '}' ) ;
    public final EObject ruleSupervisor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_surname_6_0 = null;

        AntlrDatatypeRuleToken lv_email_8_0 = null;

        Enumerator lv_role_10_0 = null;



        	enterRule();

        try {
            // InternalUberDsl.g:1209:2: ( (otherlv_0= 'Supervisor' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'role' ( (lv_role_10_0= ruleRoleSupervisor ) ) otherlv_11= '}' ) )
            // InternalUberDsl.g:1210:2: (otherlv_0= 'Supervisor' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'role' ( (lv_role_10_0= ruleRoleSupervisor ) ) otherlv_11= '}' )
            {
            // InternalUberDsl.g:1210:2: (otherlv_0= 'Supervisor' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'role' ( (lv_role_10_0= ruleRoleSupervisor ) ) otherlv_11= '}' )
            // InternalUberDsl.g:1211:3: otherlv_0= 'Supervisor' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) otherlv_9= 'role' ( (lv_role_10_0= ruleRoleSupervisor ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSupervisorAccess().getSupervisorKeyword_0());
            		
            // InternalUberDsl.g:1215:3: ( (lv_id_1_0= ruleEString ) )
            // InternalUberDsl.g:1216:4: (lv_id_1_0= ruleEString )
            {
            // InternalUberDsl.g:1216:4: (lv_id_1_0= ruleEString )
            // InternalUberDsl.g:1217:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupervisorAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisorRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSupervisorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSupervisorAccess().getNameKeyword_3());
            		
            // InternalUberDsl.g:1242:3: ( (lv_name_4_0= ruleEString ) )
            // InternalUberDsl.g:1243:4: (lv_name_4_0= ruleEString )
            {
            // InternalUberDsl.g:1243:4: (lv_name_4_0= ruleEString )
            // InternalUberDsl.g:1244:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupervisorAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSupervisorAccess().getSurnameKeyword_5());
            		
            // InternalUberDsl.g:1265:3: ( (lv_surname_6_0= ruleEString ) )
            // InternalUberDsl.g:1266:4: (lv_surname_6_0= ruleEString )
            {
            // InternalUberDsl.g:1266:4: (lv_surname_6_0= ruleEString )
            // InternalUberDsl.g:1267:5: lv_surname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupervisorAccess().getSurnameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_surname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisorRule());
            					}
            					set(
            						current,
            						"surname",
            						lv_surname_6_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSupervisorAccess().getEmailKeyword_7());
            		
            // InternalUberDsl.g:1288:3: ( (lv_email_8_0= ruleEString ) )
            // InternalUberDsl.g:1289:4: (lv_email_8_0= ruleEString )
            {
            // InternalUberDsl.g:1289:4: (lv_email_8_0= ruleEString )
            // InternalUberDsl.g:1290:5: lv_email_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSupervisorAccess().getEmailEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_46);
            lv_email_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisorRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_8_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,44,FOLLOW_47); 

            			newLeafNode(otherlv_9, grammarAccess.getSupervisorAccess().getRoleKeyword_9());
            		
            // InternalUberDsl.g:1311:3: ( (lv_role_10_0= ruleRoleSupervisor ) )
            // InternalUberDsl.g:1312:4: (lv_role_10_0= ruleRoleSupervisor )
            {
            // InternalUberDsl.g:1312:4: (lv_role_10_0= ruleRoleSupervisor )
            // InternalUberDsl.g:1313:5: lv_role_10_0= ruleRoleSupervisor
            {

            					newCompositeNode(grammarAccess.getSupervisorAccess().getRoleRoleSupervisorEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_16);
            lv_role_10_0=ruleRoleSupervisor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSupervisorRule());
            					}
            					set(
            						current,
            						"role",
            						lv_role_10_0,
            						"it.disim.mde.loreand.xtext.UberDsl.RoleSupervisor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSupervisorAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleSupervisor"


    // $ANTLR start "entryRuleCardID"
    // InternalUberDsl.g:1338:1: entryRuleCardID returns [EObject current=null] : iv_ruleCardID= ruleCardID EOF ;
    public final EObject entryRuleCardID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardID = null;


        try {
            // InternalUberDsl.g:1338:47: (iv_ruleCardID= ruleCardID EOF )
            // InternalUberDsl.g:1339:2: iv_ruleCardID= ruleCardID EOF
            {
             newCompositeNode(grammarAccess.getCardIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardID=ruleCardID();

            state._fsp--;

             current =iv_ruleCardID; 
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
    // $ANTLR end "entryRuleCardID"


    // $ANTLR start "ruleCardID"
    // InternalUberDsl.g:1345:1: ruleCardID returns [EObject current=null] : (otherlv_0= 'CardID' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) otherlv_5= 'releaseDate' ( (lv_releaseDate_6_0= ruleEString ) ) otherlv_7= 'institution' ( (lv_institution_8_0= ruleEString ) ) (otherlv_9= 'approved' ( ( ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleCardID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        AntlrDatatypeRuleToken lv_releaseDate_6_0 = null;

        AntlrDatatypeRuleToken lv_institution_8_0 = null;



        	enterRule();

        try {
            // InternalUberDsl.g:1351:2: ( (otherlv_0= 'CardID' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) otherlv_5= 'releaseDate' ( (lv_releaseDate_6_0= ruleEString ) ) otherlv_7= 'institution' ( (lv_institution_8_0= ruleEString ) ) (otherlv_9= 'approved' ( ( ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalUberDsl.g:1352:2: (otherlv_0= 'CardID' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) otherlv_5= 'releaseDate' ( (lv_releaseDate_6_0= ruleEString ) ) otherlv_7= 'institution' ( (lv_institution_8_0= ruleEString ) ) (otherlv_9= 'approved' ( ( ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalUberDsl.g:1352:2: (otherlv_0= 'CardID' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) otherlv_5= 'releaseDate' ( (lv_releaseDate_6_0= ruleEString ) ) otherlv_7= 'institution' ( (lv_institution_8_0= ruleEString ) ) (otherlv_9= 'approved' ( ( ruleEString ) ) )? otherlv_11= '}' )
            // InternalUberDsl.g:1353:3: otherlv_0= 'CardID' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) otherlv_5= 'releaseDate' ( (lv_releaseDate_6_0= ruleEString ) ) otherlv_7= 'institution' ( (lv_institution_8_0= ruleEString ) ) (otherlv_9= 'approved' ( ( ruleEString ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardIDAccess().getCardIDKeyword_0());
            		
            // InternalUberDsl.g:1357:3: ( (lv_id_1_0= ruleEString ) )
            // InternalUberDsl.g:1358:4: (lv_id_1_0= ruleEString )
            {
            // InternalUberDsl.g:1358:4: (lv_id_1_0= ruleEString )
            // InternalUberDsl.g:1359:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardIDAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardIDRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getCardIDAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCardIDAccess().getPathKeyword_3());
            		
            // InternalUberDsl.g:1384:3: ( (lv_path_4_0= ruleEString ) )
            // InternalUberDsl.g:1385:4: (lv_path_4_0= ruleEString )
            {
            // InternalUberDsl.g:1385:4: (lv_path_4_0= ruleEString )
            // InternalUberDsl.g:1386:5: lv_path_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardIDAccess().getPathEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_49);
            lv_path_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardIDRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_4_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCardIDAccess().getReleaseDateKeyword_5());
            		
            // InternalUberDsl.g:1407:3: ( (lv_releaseDate_6_0= ruleEString ) )
            // InternalUberDsl.g:1408:4: (lv_releaseDate_6_0= ruleEString )
            {
            // InternalUberDsl.g:1408:4: (lv_releaseDate_6_0= ruleEString )
            // InternalUberDsl.g:1409:5: lv_releaseDate_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardIDAccess().getReleaseDateEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_50);
            lv_releaseDate_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardIDRule());
            					}
            					set(
            						current,
            						"releaseDate",
            						lv_releaseDate_6_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCardIDAccess().getInstitutionKeyword_7());
            		
            // InternalUberDsl.g:1430:3: ( (lv_institution_8_0= ruleEString ) )
            // InternalUberDsl.g:1431:4: (lv_institution_8_0= ruleEString )
            {
            // InternalUberDsl.g:1431:4: (lv_institution_8_0= ruleEString )
            // InternalUberDsl.g:1432:5: lv_institution_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardIDAccess().getInstitutionEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_51);
            lv_institution_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardIDRule());
            					}
            					set(
            						current,
            						"institution",
            						lv_institution_8_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUberDsl.g:1449:3: (otherlv_9= 'approved' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUberDsl.g:1450:4: otherlv_9= 'approved' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getCardIDAccess().getApprovedKeyword_9_0());
                    			
                    // InternalUberDsl.g:1454:4: ( ( ruleEString ) )
                    // InternalUberDsl.g:1455:5: ( ruleEString )
                    {
                    // InternalUberDsl.g:1455:5: ( ruleEString )
                    // InternalUberDsl.g:1456:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCardIDRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCardIDAccess().getApprovedSupervisorCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCardIDAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCardID"


    // $ANTLR start "entryRuleGeolocation"
    // InternalUberDsl.g:1479:1: entryRuleGeolocation returns [EObject current=null] : iv_ruleGeolocation= ruleGeolocation EOF ;
    public final EObject entryRuleGeolocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeolocation = null;


        try {
            // InternalUberDsl.g:1479:52: (iv_ruleGeolocation= ruleGeolocation EOF )
            // InternalUberDsl.g:1480:2: iv_ruleGeolocation= ruleGeolocation EOF
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
    // InternalUberDsl.g:1486:1: ruleGeolocation returns [EObject current=null] : (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' ) ;
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
            // InternalUberDsl.g:1492:2: ( (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' ) )
            // InternalUberDsl.g:1493:2: (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' )
            {
            // InternalUberDsl.g:1493:2: (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' )
            // InternalUberDsl.g:1494:3: otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeolocationAccess().getGeolocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getGeolocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getGeolocationAccess().getLatKeyword_2());
            		
            // InternalUberDsl.g:1506:3: ( (lv_lat_3_0= ruleEDouble ) )
            // InternalUberDsl.g:1507:4: (lv_lat_3_0= ruleEDouble )
            {
            // InternalUberDsl.g:1507:4: (lv_lat_3_0= ruleEDouble )
            // InternalUberDsl.g:1508:5: lv_lat_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getGeolocationAccess().getLatEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_53);
            lv_lat_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeolocationRule());
            					}
            					set(
            						current,
            						"lat",
            						lv_lat_3_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,52,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getGeolocationAccess().getLngKeyword_4());
            		
            // InternalUberDsl.g:1529:3: ( (lv_lng_5_0= ruleEDouble ) )
            // InternalUberDsl.g:1530:4: (lv_lng_5_0= ruleEDouble )
            {
            // InternalUberDsl.g:1530:4: (lv_lng_5_0= ruleEDouble )
            // InternalUberDsl.g:1531:5: lv_lng_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getGeolocationAccess().getLngEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_lng_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeolocationRule());
            					}
            					set(
            						current,
            						"lng",
            						lv_lng_5_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGeolocationAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleCar"
    // InternalUberDsl.g:1556:1: entryRuleCar returns [EObject current=null] : iv_ruleCar= ruleCar EOF ;
    public final EObject entryRuleCar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCar = null;


        try {
            // InternalUberDsl.g:1556:44: (iv_ruleCar= ruleCar EOF )
            // InternalUberDsl.g:1557:2: iv_ruleCar= ruleCar EOF
            {
             newCompositeNode(grammarAccess.getCarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCar=ruleCar();

            state._fsp--;

             current =iv_ruleCar; 
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
    // $ANTLR end "entryRuleCar"


    // $ANTLR start "ruleCar"
    // InternalUberDsl.g:1563:1: ruleCar returns [EObject current=null] : (otherlv_0= 'Car' otherlv_1= '{' otherlv_2= 'licencePlate' ( (lv_licencePlate_3_0= ruleEString ) ) otherlv_4= 'model' ( (lv_model_5_0= ruleEString ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleCar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_licencePlate_3_0 = null;

        AntlrDatatypeRuleToken lv_model_5_0 = null;

        AntlrDatatypeRuleToken lv_color_7_0 = null;



        	enterRule();

        try {
            // InternalUberDsl.g:1569:2: ( (otherlv_0= 'Car' otherlv_1= '{' otherlv_2= 'licencePlate' ( (lv_licencePlate_3_0= ruleEString ) ) otherlv_4= 'model' ( (lv_model_5_0= ruleEString ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= '}' ) )
            // InternalUberDsl.g:1570:2: (otherlv_0= 'Car' otherlv_1= '{' otherlv_2= 'licencePlate' ( (lv_licencePlate_3_0= ruleEString ) ) otherlv_4= 'model' ( (lv_model_5_0= ruleEString ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= '}' )
            {
            // InternalUberDsl.g:1570:2: (otherlv_0= 'Car' otherlv_1= '{' otherlv_2= 'licencePlate' ( (lv_licencePlate_3_0= ruleEString ) ) otherlv_4= 'model' ( (lv_model_5_0= ruleEString ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= '}' )
            // InternalUberDsl.g:1571:3: otherlv_0= 'Car' otherlv_1= '{' otherlv_2= 'licencePlate' ( (lv_licencePlate_3_0= ruleEString ) ) otherlv_4= 'model' ( (lv_model_5_0= ruleEString ) ) otherlv_6= 'color' ( (lv_color_7_0= ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCarAccess().getCarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCarAccess().getLicencePlateKeyword_2());
            		
            // InternalUberDsl.g:1583:3: ( (lv_licencePlate_3_0= ruleEString ) )
            // InternalUberDsl.g:1584:4: (lv_licencePlate_3_0= ruleEString )
            {
            // InternalUberDsl.g:1584:4: (lv_licencePlate_3_0= ruleEString )
            // InternalUberDsl.g:1585:5: lv_licencePlate_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCarAccess().getLicencePlateEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_55);
            lv_licencePlate_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					set(
            						current,
            						"licencePlate",
            						lv_licencePlate_3_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCarAccess().getModelKeyword_4());
            		
            // InternalUberDsl.g:1606:3: ( (lv_model_5_0= ruleEString ) )
            // InternalUberDsl.g:1607:4: (lv_model_5_0= ruleEString )
            {
            // InternalUberDsl.g:1607:4: (lv_model_5_0= ruleEString )
            // InternalUberDsl.g:1608:5: lv_model_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCarAccess().getModelEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_56);
            lv_model_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					set(
            						current,
            						"model",
            						lv_model_5_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCarAccess().getColorKeyword_6());
            		
            // InternalUberDsl.g:1629:3: ( (lv_color_7_0= ruleEString ) )
            // InternalUberDsl.g:1630:4: (lv_color_7_0= ruleEString )
            {
            // InternalUberDsl.g:1630:4: (lv_color_7_0= ruleEString )
            // InternalUberDsl.g:1631:5: lv_color_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCarAccess().getColorEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_16);
            lv_color_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCarRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_7_0,
            						"it.disim.mde.loreand.xtext.UberDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCarAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCar"


    // $ANTLR start "entryRuleEDouble"
    // InternalUberDsl.g:1656:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalUberDsl.g:1656:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalUberDsl.g:1657:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalUberDsl.g:1663:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalUberDsl.g:1669:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalUberDsl.g:1670:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalUberDsl.g:1670:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalUberDsl.g:1671:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalUberDsl.g:1671:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==57) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUberDsl.g:1672:4: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_57); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalUberDsl.g:1678:3: (this_INT_1= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUberDsl.g:1679:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_58); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,58,FOLLOW_59); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_60); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalUberDsl.g:1699:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=59 && LA23_0<=60)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUberDsl.g:1700:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalUberDsl.g:1700:4: (kw= 'E' | kw= 'e' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==59) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==60) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalUberDsl.g:1701:5: kw= 'E'
                            {
                            kw=(Token)match(input,59,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUberDsl.g:1707:5: kw= 'e'
                            {
                            kw=(Token)match(input,60,FOLLOW_41); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUberDsl.g:1713:4: (kw= '-' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==57) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalUberDsl.g:1714:5: kw= '-'
                            {
                            kw=(Token)match(input,57,FOLLOW_59); 

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
    // InternalUberDsl.g:1732:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUberDsl.g:1732:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUberDsl.g:1733:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalUberDsl.g:1739:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUberDsl.g:1745:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUberDsl.g:1746:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUberDsl.g:1746:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUberDsl.g:1747:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUberDsl.g:1747:3: (kw= '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUberDsl.g:1748:4: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_59); 

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
    // InternalUberDsl.g:1765:1: ruleCustomerStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) ) ;
    public final Enumerator ruleCustomerStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUberDsl.g:1771:2: ( ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) ) )
            // InternalUberDsl.g:1772:2: ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) )
            {
            // InternalUberDsl.g:1772:2: ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt25=1;
                }
                break;
            case 62:
                {
                alt25=2;
                }
                break;
            case 63:
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
                    // InternalUberDsl.g:1773:3: (enumLiteral_0= 'PENDING' )
                    {
                    // InternalUberDsl.g:1773:3: (enumLiteral_0= 'PENDING' )
                    // InternalUberDsl.g:1774:4: enumLiteral_0= 'PENDING'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUberDsl.g:1781:3: (enumLiteral_1= 'ACTIVED' )
                    {
                    // InternalUberDsl.g:1781:3: (enumLiteral_1= 'ACTIVED' )
                    // InternalUberDsl.g:1782:4: enumLiteral_1= 'ACTIVED'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUberDsl.g:1789:3: (enumLiteral_2= 'BANNED' )
                    {
                    // InternalUberDsl.g:1789:3: (enumLiteral_2= 'BANNED' )
                    // InternalUberDsl.g:1790:4: enumLiteral_2= 'BANNED'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

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
    // InternalUberDsl.g:1800:1: ruleRiderStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) ) ;
    public final Enumerator ruleRiderStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUberDsl.g:1806:2: ( ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) ) )
            // InternalUberDsl.g:1807:2: ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) )
            {
            // InternalUberDsl.g:1807:2: ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt26=1;
                }
                break;
            case 65:
                {
                alt26=2;
                }
                break;
            case 66:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalUberDsl.g:1808:3: (enumLiteral_0= 'AVAILABLE' )
                    {
                    // InternalUberDsl.g:1808:3: (enumLiteral_0= 'AVAILABLE' )
                    // InternalUberDsl.g:1809:4: enumLiteral_0= 'AVAILABLE'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUberDsl.g:1816:3: (enumLiteral_1= 'BUSY' )
                    {
                    // InternalUberDsl.g:1816:3: (enumLiteral_1= 'BUSY' )
                    // InternalUberDsl.g:1817:4: enumLiteral_1= 'BUSY'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUberDsl.g:1824:3: (enumLiteral_2= 'UNAVAILABLE' )
                    {
                    // InternalUberDsl.g:1824:3: (enumLiteral_2= 'UNAVAILABLE' )
                    // InternalUberDsl.g:1825:4: enumLiteral_2= 'UNAVAILABLE'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

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
    // InternalUberDsl.g:1835:1: ruleRouteStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) ) ;
    public final Enumerator ruleRouteStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUberDsl.g:1841:2: ( ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) ) )
            // InternalUberDsl.g:1842:2: ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) )
            {
            // InternalUberDsl.g:1842:2: ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt27=1;
                }
                break;
            case 68:
                {
                alt27=2;
                }
                break;
            case 61:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalUberDsl.g:1843:3: (enumLiteral_0= 'DONE' )
                    {
                    // InternalUberDsl.g:1843:3: (enumLiteral_0= 'DONE' )
                    // InternalUberDsl.g:1844:4: enumLiteral_0= 'DONE'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUberDsl.g:1851:3: (enumLiteral_1= 'DOING' )
                    {
                    // InternalUberDsl.g:1851:3: (enumLiteral_1= 'DOING' )
                    // InternalUberDsl.g:1852:4: enumLiteral_1= 'DOING'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUberDsl.g:1859:3: (enumLiteral_2= 'PENDING' )
                    {
                    // InternalUberDsl.g:1859:3: (enumLiteral_2= 'PENDING' )
                    // InternalUberDsl.g:1860:4: enumLiteral_2= 'PENDING'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

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


    // $ANTLR start "ruleRoleSupervisor"
    // InternalUberDsl.g:1870:1: ruleRoleSupervisor returns [Enumerator current=null] : ( (enumLiteral_0= 'MANAGER' ) | (enumLiteral_1= 'ACCOUNTANT' ) | (enumLiteral_2= 'STORE' ) ) ;
    public final Enumerator ruleRoleSupervisor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUberDsl.g:1876:2: ( ( (enumLiteral_0= 'MANAGER' ) | (enumLiteral_1= 'ACCOUNTANT' ) | (enumLiteral_2= 'STORE' ) ) )
            // InternalUberDsl.g:1877:2: ( (enumLiteral_0= 'MANAGER' ) | (enumLiteral_1= 'ACCOUNTANT' ) | (enumLiteral_2= 'STORE' ) )
            {
            // InternalUberDsl.g:1877:2: ( (enumLiteral_0= 'MANAGER' ) | (enumLiteral_1= 'ACCOUNTANT' ) | (enumLiteral_2= 'STORE' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt28=1;
                }
                break;
            case 70:
                {
                alt28=2;
                }
                break;
            case 71:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalUberDsl.g:1878:3: (enumLiteral_0= 'MANAGER' )
                    {
                    // InternalUberDsl.g:1878:3: (enumLiteral_0= 'MANAGER' )
                    // InternalUberDsl.g:1879:4: enumLiteral_0= 'MANAGER'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getRoleSupervisorAccess().getMANAGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoleSupervisorAccess().getMANAGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUberDsl.g:1886:3: (enumLiteral_1= 'ACCOUNTANT' )
                    {
                    // InternalUberDsl.g:1886:3: (enumLiteral_1= 'ACCOUNTANT' )
                    // InternalUberDsl.g:1887:4: enumLiteral_1= 'ACCOUNTANT'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getRoleSupervisorAccess().getACCOUNTANTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoleSupervisorAccess().getACCOUNTANTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUberDsl.g:1894:3: (enumLiteral_2= 'STORE' )
                    {
                    // InternalUberDsl.g:1894:3: (enumLiteral_2= 'STORE' )
                    // InternalUberDsl.g:1895:4: enumLiteral_2= 'STORE'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getRoleSupervisorAccess().getSTOREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoleSupervisorAccess().getSTOREEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRoleSupervisor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001EE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001EC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000400A0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0600000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000020000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1800000000000002L});

}