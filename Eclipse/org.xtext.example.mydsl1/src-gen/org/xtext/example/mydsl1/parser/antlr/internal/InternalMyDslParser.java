package org.xtext.example.mydsl1.parser.antlr.internal;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Customer'", "'{'", "'name'", "'surname'", "'email'", "'subscriptionDate'", "'expirationDate'", "'status'", "'routes'", "'('", "','", "')'", "'}'", "'EDate'", "'-'", "'.'", "'E'", "'e'", "'Geolocation'", "'lat'", "'lng'", "'PENDING'", "'ACTIVED'", "'BANNED'", "'DONE'", "'DOING'", "'AVAILABLE'", "'BUSY'", "'UNAVAILABLE'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
        	return "Customer";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCustomer"
    // InternalMyDsl.g:65:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // InternalMyDsl.g:65:49: (iv_ruleCustomer= ruleCustomer EOF )
            // InternalMyDsl.g:66:2: iv_ruleCustomer= ruleCustomer EOF
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
    // InternalMyDsl.g:72:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEDate ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEDate ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) ;
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
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEDate ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEDate ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEDate ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEDate ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEDate ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEDate ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'Customer' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) otherlv_5= 'surname' ( (lv_surname_6_0= ruleEString ) ) otherlv_7= 'email' ( (lv_email_8_0= ruleEString ) ) (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEDate ) ) )? otherlv_11= 'expirationDate' ( (lv_expirationDate_12_0= ruleEDate ) ) otherlv_13= 'status' ( (lv_status_14_0= ruleCustomerStatus ) ) (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_id_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_id_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_id_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_id_1_0= ruleEString
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
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getNameKeyword_3());
            		
            // InternalMyDsl.g:111:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:112:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:112:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:113:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCustomerAccess().getSurnameKeyword_5());
            		
            // InternalMyDsl.g:134:3: ( (lv_surname_6_0= ruleEString ) )
            // InternalMyDsl.g:135:4: (lv_surname_6_0= ruleEString )
            {
            // InternalMyDsl.g:135:4: (lv_surname_6_0= ruleEString )
            // InternalMyDsl.g:136:5: lv_surname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getSurnameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_surname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"surname",
            						lv_surname_6_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getCustomerAccess().getEmailKeyword_7());
            		
            // InternalMyDsl.g:157:3: ( (lv_email_8_0= ruleEString ) )
            // InternalMyDsl.g:158:4: (lv_email_8_0= ruleEString )
            {
            // InternalMyDsl.g:158:4: (lv_email_8_0= ruleEString )
            // InternalMyDsl.g:159:5: lv_email_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getEmailEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_email_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"email",
            						lv_email_8_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:176:3: (otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEDate ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:177:4: otherlv_9= 'subscriptionDate' ( (lv_subscriptionDate_10_0= ruleEDate ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getCustomerAccess().getSubscriptionDateKeyword_9_0());
                    			
                    // InternalMyDsl.g:181:4: ( (lv_subscriptionDate_10_0= ruleEDate ) )
                    // InternalMyDsl.g:182:5: (lv_subscriptionDate_10_0= ruleEDate )
                    {
                    // InternalMyDsl.g:182:5: (lv_subscriptionDate_10_0= ruleEDate )
                    // InternalMyDsl.g:183:6: lv_subscriptionDate_10_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getCustomerAccess().getSubscriptionDateEDateParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subscriptionDate_10_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCustomerRule());
                    						}
                    						set(
                    							current,
                    							"subscriptionDate",
                    							lv_subscriptionDate_10_0,
                    							"org.xtext.example.mydsl1.MyDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getCustomerAccess().getExpirationDateKeyword_10());
            		
            // InternalMyDsl.g:205:3: ( (lv_expirationDate_12_0= ruleEDate ) )
            // InternalMyDsl.g:206:4: (lv_expirationDate_12_0= ruleEDate )
            {
            // InternalMyDsl.g:206:4: (lv_expirationDate_12_0= ruleEDate )
            // InternalMyDsl.g:207:5: lv_expirationDate_12_0= ruleEDate
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getExpirationDateEDateParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_expirationDate_12_0=ruleEDate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"expirationDate",
            						lv_expirationDate_12_0,
            						"org.xtext.example.mydsl1.MyDsl.EDate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getCustomerAccess().getStatusKeyword_12());
            		
            // InternalMyDsl.g:228:3: ( (lv_status_14_0= ruleCustomerStatus ) )
            // InternalMyDsl.g:229:4: (lv_status_14_0= ruleCustomerStatus )
            {
            // InternalMyDsl.g:229:4: (lv_status_14_0= ruleCustomerStatus )
            // InternalMyDsl.g:230:5: lv_status_14_0= ruleCustomerStatus
            {

            					newCompositeNode(grammarAccess.getCustomerAccess().getStatusCustomerStatusEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_13);
            lv_status_14_0=ruleCustomerStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCustomerRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_14_0,
            						"org.xtext.example.mydsl1.MyDsl.CustomerStatus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:247:3: (otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:248:4: otherlv_15= 'routes' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getCustomerAccess().getRoutesKeyword_14_0());
                    			
                    otherlv_16=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_14_1());
                    			
                    // InternalMyDsl.g:256:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:257:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:257:5: ( ruleEString )
                    // InternalMyDsl.g:258:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:272:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:273:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getCustomerAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalMyDsl.g:277:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:278:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:278:6: ( ruleEString )
                    	    // InternalMyDsl.g:279:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCustomerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getCustomerAccess().getRightParenthesisKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:307:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:307:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:308:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:314:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:320:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:321:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:321:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:322:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:330:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEDate"
    // InternalMyDsl.g:341:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalMyDsl.g:341:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalMyDsl.g:342:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMyDsl.g:348:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:354:2: (kw= 'EDate' )
            // InternalMyDsl.g:355:2: kw= 'EDate'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:363:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:363:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:364:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalMyDsl.g:370:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:376:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:377:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:377:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:378:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:378:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:379:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:385:3: (this_INT_1= RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:386:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_18); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,26,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:406:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:407:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:407:4: (kw= 'E' | kw= 'e' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==27) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==28) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:408:5: kw= 'E'
                            {
                            kw=(Token)match(input,27,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:414:5: kw= 'e'
                            {
                            kw=(Token)match(input,28,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:420:4: (kw= '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==25) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyDsl.g:421:5: kw= '-'
                            {
                            kw=(Token)match(input,25,FOLLOW_19); 

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
    // InternalMyDsl.g:439:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:439:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:440:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:446:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:452:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:453:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:453:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:454:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:454:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:455:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_19); 

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


    // $ANTLR start "entryRuleGeolocation"
    // InternalMyDsl.g:472:1: entryRuleGeolocation returns [EObject current=null] : iv_ruleGeolocation= ruleGeolocation EOF ;
    public final EObject entryRuleGeolocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeolocation = null;


        try {
            // InternalMyDsl.g:472:52: (iv_ruleGeolocation= ruleGeolocation EOF )
            // InternalMyDsl.g:473:2: iv_ruleGeolocation= ruleGeolocation EOF
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
    // InternalMyDsl.g:479:1: ruleGeolocation returns [EObject current=null] : (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' ) ;
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
            // InternalMyDsl.g:485:2: ( (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:486:2: (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:486:2: (otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}' )
            // InternalMyDsl.g:487:3: otherlv_0= 'Geolocation' otherlv_1= '{' otherlv_2= 'lat' ( (lv_lat_3_0= ruleEDouble ) ) otherlv_4= 'lng' ( (lv_lng_5_0= ruleEDouble ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeolocationAccess().getGeolocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getGeolocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getGeolocationAccess().getLatKeyword_2());
            		
            // InternalMyDsl.g:499:3: ( (lv_lat_3_0= ruleEDouble ) )
            // InternalMyDsl.g:500:4: (lv_lat_3_0= ruleEDouble )
            {
            // InternalMyDsl.g:500:4: (lv_lat_3_0= ruleEDouble )
            // InternalMyDsl.g:501:5: lv_lat_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getGeolocationAccess().getLatEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_lat_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeolocationRule());
            					}
            					set(
            						current,
            						"lat",
            						lv_lat_3_0,
            						"org.xtext.example.mydsl1.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getGeolocationAccess().getLngKeyword_4());
            		
            // InternalMyDsl.g:522:3: ( (lv_lng_5_0= ruleEDouble ) )
            // InternalMyDsl.g:523:4: (lv_lng_5_0= ruleEDouble )
            {
            // InternalMyDsl.g:523:4: (lv_lng_5_0= ruleEDouble )
            // InternalMyDsl.g:524:5: lv_lng_5_0= ruleEDouble
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
            						"org.xtext.example.mydsl1.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "ruleCustomerStatus"
    // InternalMyDsl.g:549:1: ruleCustomerStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) ) ;
    public final Enumerator ruleCustomerStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:555:2: ( ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) ) )
            // InternalMyDsl.g:556:2: ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) )
            {
            // InternalMyDsl.g:556:2: ( (enumLiteral_0= 'PENDING' ) | (enumLiteral_1= 'ACTIVED' ) | (enumLiteral_2= 'BANNED' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:557:3: (enumLiteral_0= 'PENDING' )
                    {
                    // InternalMyDsl.g:557:3: (enumLiteral_0= 'PENDING' )
                    // InternalMyDsl.g:558:4: enumLiteral_0= 'PENDING'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:565:3: (enumLiteral_1= 'ACTIVED' )
                    {
                    // InternalMyDsl.g:565:3: (enumLiteral_1= 'ACTIVED' )
                    // InternalMyDsl.g:566:4: enumLiteral_1= 'ACTIVED'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:573:3: (enumLiteral_2= 'BANNED' )
                    {
                    // InternalMyDsl.g:573:3: (enumLiteral_2= 'BANNED' )
                    // InternalMyDsl.g:574:4: enumLiteral_2= 'BANNED'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "ruleRouteStatus"
    // InternalMyDsl.g:584:1: ruleRouteStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) ) ;
    public final Enumerator ruleRouteStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:590:2: ( ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) ) )
            // InternalMyDsl.g:591:2: ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) )
            {
            // InternalMyDsl.g:591:2: ( (enumLiteral_0= 'DONE' ) | (enumLiteral_1= 'DOING' ) | (enumLiteral_2= 'PENDING' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:592:3: (enumLiteral_0= 'DONE' )
                    {
                    // InternalMyDsl.g:592:3: (enumLiteral_0= 'DONE' )
                    // InternalMyDsl.g:593:4: enumLiteral_0= 'DONE'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:600:3: (enumLiteral_1= 'DOING' )
                    {
                    // InternalMyDsl.g:600:3: (enumLiteral_1= 'DOING' )
                    // InternalMyDsl.g:601:4: enumLiteral_1= 'DOING'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:608:3: (enumLiteral_2= 'PENDING' )
                    {
                    // InternalMyDsl.g:608:3: (enumLiteral_2= 'PENDING' )
                    // InternalMyDsl.g:609:4: enumLiteral_2= 'PENDING'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "ruleRiderStatus"
    // InternalMyDsl.g:619:1: ruleRiderStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) ) ;
    public final Enumerator ruleRiderStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:625:2: ( ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) ) )
            // InternalMyDsl.g:626:2: ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) )
            {
            // InternalMyDsl.g:626:2: ( (enumLiteral_0= 'AVAILABLE' ) | (enumLiteral_1= 'BUSY' ) | (enumLiteral_2= 'UNAVAILABLE' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:627:3: (enumLiteral_0= 'AVAILABLE' )
                    {
                    // InternalMyDsl.g:627:3: (enumLiteral_0= 'AVAILABLE' )
                    // InternalMyDsl.g:628:4: enumLiteral_0= 'AVAILABLE'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:635:3: (enumLiteral_1= 'BUSY' )
                    {
                    // InternalMyDsl.g:635:3: (enumLiteral_1= 'BUSY' )
                    // InternalMyDsl.g:636:4: enumLiteral_1= 'BUSY'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:643:3: (enumLiteral_2= 'UNAVAILABLE' )
                    {
                    // InternalMyDsl.g:643:3: (enumLiteral_2= 'UNAVAILABLE' )
                    // InternalMyDsl.g:644:4: enumLiteral_2= 'UNAVAILABLE'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});

}