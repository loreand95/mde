package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'E'", "'e'", "'PENDING'", "'ACTIVED'", "'BANNED'", "'DONE'", "'DOING'", "'AVAILABLE'", "'BUSY'", "'UNAVAILABLE'", "'Customer'", "'{'", "'name'", "'surname'", "'email'", "'expirationDate'", "'status'", "'}'", "'subscriptionDate'", "'routes'", "'('", "')'", "','", "'-'", "'.'", "'Geolocation'", "'lat'", "'lng'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCustomer"
    // InternalMyDsl.g:53:1: entryRuleCustomer : ruleCustomer EOF ;
    public final void entryRuleCustomer() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleCustomer EOF )
            // InternalMyDsl.g:55:1: ruleCustomer EOF
            {
             before(grammarAccess.getCustomerRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomer();

            state._fsp--;

             after(grammarAccess.getCustomerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // InternalMyDsl.g:62:1: ruleCustomer : ( ( rule__Customer__Group__0 ) ) ;
    public final void ruleCustomer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Customer__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Customer__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Customer__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Customer__Group__0 )
            {
             before(grammarAccess.getCustomerAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Customer__Group__0 )
            // InternalMyDsl.g:69:4: rule__Customer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalMyDsl.g:103:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEDate EOF )
            // InternalMyDsl.g:105:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMyDsl.g:112:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( 'EDate' ) )
            // InternalMyDsl.g:117:2: ( 'EDate' )
            {
            // InternalMyDsl.g:117:2: ( 'EDate' )
            // InternalMyDsl.g:118:3: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:128:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEDouble EOF )
            // InternalMyDsl.g:130:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:137:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EDouble__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__EDouble__Group__0 )
            // InternalMyDsl.g:144:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEInt EOF )
            // InternalMyDsl.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleGeolocation"
    // InternalMyDsl.g:178:1: entryRuleGeolocation : ruleGeolocation EOF ;
    public final void entryRuleGeolocation() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleGeolocation EOF )
            // InternalMyDsl.g:180:1: ruleGeolocation EOF
            {
             before(grammarAccess.getGeolocationRule()); 
            pushFollow(FOLLOW_1);
            ruleGeolocation();

            state._fsp--;

             after(grammarAccess.getGeolocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeolocation"


    // $ANTLR start "ruleGeolocation"
    // InternalMyDsl.g:187:1: ruleGeolocation : ( ( rule__Geolocation__Group__0 ) ) ;
    public final void ruleGeolocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Geolocation__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Geolocation__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Geolocation__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Geolocation__Group__0 )
            {
             before(grammarAccess.getGeolocationAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Geolocation__Group__0 )
            // InternalMyDsl.g:194:4: rule__Geolocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeolocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeolocation"


    // $ANTLR start "ruleCustomerStatus"
    // InternalMyDsl.g:203:1: ruleCustomerStatus : ( ( rule__CustomerStatus__Alternatives ) ) ;
    public final void ruleCustomerStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:207:1: ( ( ( rule__CustomerStatus__Alternatives ) ) )
            // InternalMyDsl.g:208:2: ( ( rule__CustomerStatus__Alternatives ) )
            {
            // InternalMyDsl.g:208:2: ( ( rule__CustomerStatus__Alternatives ) )
            // InternalMyDsl.g:209:3: ( rule__CustomerStatus__Alternatives )
            {
             before(grammarAccess.getCustomerStatusAccess().getAlternatives()); 
            // InternalMyDsl.g:210:3: ( rule__CustomerStatus__Alternatives )
            // InternalMyDsl.g:210:4: rule__CustomerStatus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CustomerStatus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCustomerStatusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomerStatus"


    // $ANTLR start "ruleRouteStatus"
    // InternalMyDsl.g:219:1: ruleRouteStatus : ( ( rule__RouteStatus__Alternatives ) ) ;
    public final void ruleRouteStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:1: ( ( ( rule__RouteStatus__Alternatives ) ) )
            // InternalMyDsl.g:224:2: ( ( rule__RouteStatus__Alternatives ) )
            {
            // InternalMyDsl.g:224:2: ( ( rule__RouteStatus__Alternatives ) )
            // InternalMyDsl.g:225:3: ( rule__RouteStatus__Alternatives )
            {
             before(grammarAccess.getRouteStatusAccess().getAlternatives()); 
            // InternalMyDsl.g:226:3: ( rule__RouteStatus__Alternatives )
            // InternalMyDsl.g:226:4: rule__RouteStatus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RouteStatus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRouteStatusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRouteStatus"


    // $ANTLR start "ruleRiderStatus"
    // InternalMyDsl.g:235:1: ruleRiderStatus : ( ( rule__RiderStatus__Alternatives ) ) ;
    public final void ruleRiderStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:239:1: ( ( ( rule__RiderStatus__Alternatives ) ) )
            // InternalMyDsl.g:240:2: ( ( rule__RiderStatus__Alternatives ) )
            {
            // InternalMyDsl.g:240:2: ( ( rule__RiderStatus__Alternatives ) )
            // InternalMyDsl.g:241:3: ( rule__RiderStatus__Alternatives )
            {
             before(grammarAccess.getRiderStatusAccess().getAlternatives()); 
            // InternalMyDsl.g:242:3: ( rule__RiderStatus__Alternatives )
            // InternalMyDsl.g:242:4: rule__RiderStatus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RiderStatus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRiderStatusAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRiderStatus"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:250:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:254:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:255:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:255:2: ( RULE_STRING )
                    // InternalMyDsl.g:256:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:261:2: ( RULE_ID )
                    // InternalMyDsl.g:262:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalMyDsl.g:271:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:275:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:276:2: ( 'E' )
                    {
                    // InternalMyDsl.g:276:2: ( 'E' )
                    // InternalMyDsl.g:277:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:282:2: ( 'e' )
                    {
                    // InternalMyDsl.g:282:2: ( 'e' )
                    // InternalMyDsl.g:283:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__CustomerStatus__Alternatives"
    // InternalMyDsl.g:292:1: rule__CustomerStatus__Alternatives : ( ( ( 'PENDING' ) ) | ( ( 'ACTIVED' ) ) | ( ( 'BANNED' ) ) );
    public final void rule__CustomerStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:296:1: ( ( ( 'PENDING' ) ) | ( ( 'ACTIVED' ) ) | ( ( 'BANNED' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:297:2: ( ( 'PENDING' ) )
                    {
                    // InternalMyDsl.g:297:2: ( ( 'PENDING' ) )
                    // InternalMyDsl.g:298:3: ( 'PENDING' )
                    {
                     before(grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:299:3: ( 'PENDING' )
                    // InternalMyDsl.g:299:4: 'PENDING'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCustomerStatusAccess().getPENDINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:303:2: ( ( 'ACTIVED' ) )
                    {
                    // InternalMyDsl.g:303:2: ( ( 'ACTIVED' ) )
                    // InternalMyDsl.g:304:3: ( 'ACTIVED' )
                    {
                     before(grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:305:3: ( 'ACTIVED' )
                    // InternalMyDsl.g:305:4: 'ACTIVED'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCustomerStatusAccess().getACTIVEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:309:2: ( ( 'BANNED' ) )
                    {
                    // InternalMyDsl.g:309:2: ( ( 'BANNED' ) )
                    // InternalMyDsl.g:310:3: ( 'BANNED' )
                    {
                     before(grammarAccess.getCustomerStatusAccess().getBANNEDEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:311:3: ( 'BANNED' )
                    // InternalMyDsl.g:311:4: 'BANNED'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCustomerStatusAccess().getBANNEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomerStatus__Alternatives"


    // $ANTLR start "rule__RouteStatus__Alternatives"
    // InternalMyDsl.g:319:1: rule__RouteStatus__Alternatives : ( ( ( 'DONE' ) ) | ( ( 'DOING' ) ) | ( ( 'PENDING' ) ) );
    public final void rule__RouteStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( ( 'DONE' ) ) | ( ( 'DOING' ) ) | ( ( 'PENDING' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:324:2: ( ( 'DONE' ) )
                    {
                    // InternalMyDsl.g:324:2: ( ( 'DONE' ) )
                    // InternalMyDsl.g:325:3: ( 'DONE' )
                    {
                     before(grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:326:3: ( 'DONE' )
                    // InternalMyDsl.g:326:4: 'DONE'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getRouteStatusAccess().getDONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:330:2: ( ( 'DOING' ) )
                    {
                    // InternalMyDsl.g:330:2: ( ( 'DOING' ) )
                    // InternalMyDsl.g:331:3: ( 'DOING' )
                    {
                     before(grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:332:3: ( 'DOING' )
                    // InternalMyDsl.g:332:4: 'DOING'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getRouteStatusAccess().getDOINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:336:2: ( ( 'PENDING' ) )
                    {
                    // InternalMyDsl.g:336:2: ( ( 'PENDING' ) )
                    // InternalMyDsl.g:337:3: ( 'PENDING' )
                    {
                     before(grammarAccess.getRouteStatusAccess().getPENDINGEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:338:3: ( 'PENDING' )
                    // InternalMyDsl.g:338:4: 'PENDING'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRouteStatusAccess().getPENDINGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RouteStatus__Alternatives"


    // $ANTLR start "rule__RiderStatus__Alternatives"
    // InternalMyDsl.g:346:1: rule__RiderStatus__Alternatives : ( ( ( 'AVAILABLE' ) ) | ( ( 'BUSY' ) ) | ( ( 'UNAVAILABLE' ) ) );
    public final void rule__RiderStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:350:1: ( ( ( 'AVAILABLE' ) ) | ( ( 'BUSY' ) ) | ( ( 'UNAVAILABLE' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:351:2: ( ( 'AVAILABLE' ) )
                    {
                    // InternalMyDsl.g:351:2: ( ( 'AVAILABLE' ) )
                    // InternalMyDsl.g:352:3: ( 'AVAILABLE' )
                    {
                     before(grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:353:3: ( 'AVAILABLE' )
                    // InternalMyDsl.g:353:4: 'AVAILABLE'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getRiderStatusAccess().getAVAILABLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:357:2: ( ( 'BUSY' ) )
                    {
                    // InternalMyDsl.g:357:2: ( ( 'BUSY' ) )
                    // InternalMyDsl.g:358:3: ( 'BUSY' )
                    {
                     before(grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:359:3: ( 'BUSY' )
                    // InternalMyDsl.g:359:4: 'BUSY'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getRiderStatusAccess().getBUSYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:363:2: ( ( 'UNAVAILABLE' ) )
                    {
                    // InternalMyDsl.g:363:2: ( ( 'UNAVAILABLE' ) )
                    // InternalMyDsl.g:364:3: ( 'UNAVAILABLE' )
                    {
                     before(grammarAccess.getRiderStatusAccess().getUNAVAILABLEEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:365:3: ( 'UNAVAILABLE' )
                    // InternalMyDsl.g:365:4: 'UNAVAILABLE'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getRiderStatusAccess().getUNAVAILABLEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RiderStatus__Alternatives"


    // $ANTLR start "rule__Customer__Group__0"
    // InternalMyDsl.g:373:1: rule__Customer__Group__0 : rule__Customer__Group__0__Impl rule__Customer__Group__1 ;
    public final void rule__Customer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( rule__Customer__Group__0__Impl rule__Customer__Group__1 )
            // InternalMyDsl.g:378:2: rule__Customer__Group__0__Impl rule__Customer__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0"


    // $ANTLR start "rule__Customer__Group__0__Impl"
    // InternalMyDsl.g:385:1: rule__Customer__Group__0__Impl : ( 'Customer' ) ;
    public final void rule__Customer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( 'Customer' ) )
            // InternalMyDsl.g:390:1: ( 'Customer' )
            {
            // InternalMyDsl.g:390:1: ( 'Customer' )
            // InternalMyDsl.g:391:2: 'Customer'
            {
             before(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCustomerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__0__Impl"


    // $ANTLR start "rule__Customer__Group__1"
    // InternalMyDsl.g:400:1: rule__Customer__Group__1 : rule__Customer__Group__1__Impl rule__Customer__Group__2 ;
    public final void rule__Customer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:404:1: ( rule__Customer__Group__1__Impl rule__Customer__Group__2 )
            // InternalMyDsl.g:405:2: rule__Customer__Group__1__Impl rule__Customer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Customer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1"


    // $ANTLR start "rule__Customer__Group__1__Impl"
    // InternalMyDsl.g:412:1: rule__Customer__Group__1__Impl : ( ( rule__Customer__IdAssignment_1 ) ) ;
    public final void rule__Customer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( ( ( rule__Customer__IdAssignment_1 ) ) )
            // InternalMyDsl.g:417:1: ( ( rule__Customer__IdAssignment_1 ) )
            {
            // InternalMyDsl.g:417:1: ( ( rule__Customer__IdAssignment_1 ) )
            // InternalMyDsl.g:418:2: ( rule__Customer__IdAssignment_1 )
            {
             before(grammarAccess.getCustomerAccess().getIdAssignment_1()); 
            // InternalMyDsl.g:419:2: ( rule__Customer__IdAssignment_1 )
            // InternalMyDsl.g:419:3: rule__Customer__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__1__Impl"


    // $ANTLR start "rule__Customer__Group__2"
    // InternalMyDsl.g:427:1: rule__Customer__Group__2 : rule__Customer__Group__2__Impl rule__Customer__Group__3 ;
    public final void rule__Customer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( rule__Customer__Group__2__Impl rule__Customer__Group__3 )
            // InternalMyDsl.g:432:2: rule__Customer__Group__2__Impl rule__Customer__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Customer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2"


    // $ANTLR start "rule__Customer__Group__2__Impl"
    // InternalMyDsl.g:439:1: rule__Customer__Group__2__Impl : ( '{' ) ;
    public final void rule__Customer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( '{' ) )
            // InternalMyDsl.g:444:1: ( '{' )
            {
            // InternalMyDsl.g:444:1: ( '{' )
            // InternalMyDsl.g:445:2: '{'
            {
             before(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__2__Impl"


    // $ANTLR start "rule__Customer__Group__3"
    // InternalMyDsl.g:454:1: rule__Customer__Group__3 : rule__Customer__Group__3__Impl rule__Customer__Group__4 ;
    public final void rule__Customer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( rule__Customer__Group__3__Impl rule__Customer__Group__4 )
            // InternalMyDsl.g:459:2: rule__Customer__Group__3__Impl rule__Customer__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3"


    // $ANTLR start "rule__Customer__Group__3__Impl"
    // InternalMyDsl.g:466:1: rule__Customer__Group__3__Impl : ( 'name' ) ;
    public final void rule__Customer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( ( 'name' ) )
            // InternalMyDsl.g:471:1: ( 'name' )
            {
            // InternalMyDsl.g:471:1: ( 'name' )
            // InternalMyDsl.g:472:2: 'name'
            {
             before(grammarAccess.getCustomerAccess().getNameKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__3__Impl"


    // $ANTLR start "rule__Customer__Group__4"
    // InternalMyDsl.g:481:1: rule__Customer__Group__4 : rule__Customer__Group__4__Impl rule__Customer__Group__5 ;
    public final void rule__Customer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( rule__Customer__Group__4__Impl rule__Customer__Group__5 )
            // InternalMyDsl.g:486:2: rule__Customer__Group__4__Impl rule__Customer__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Customer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4"


    // $ANTLR start "rule__Customer__Group__4__Impl"
    // InternalMyDsl.g:493:1: rule__Customer__Group__4__Impl : ( ( rule__Customer__NameAssignment_4 ) ) ;
    public final void rule__Customer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( ( ( rule__Customer__NameAssignment_4 ) ) )
            // InternalMyDsl.g:498:1: ( ( rule__Customer__NameAssignment_4 ) )
            {
            // InternalMyDsl.g:498:1: ( ( rule__Customer__NameAssignment_4 ) )
            // InternalMyDsl.g:499:2: ( rule__Customer__NameAssignment_4 )
            {
             before(grammarAccess.getCustomerAccess().getNameAssignment_4()); 
            // InternalMyDsl.g:500:2: ( rule__Customer__NameAssignment_4 )
            // InternalMyDsl.g:500:3: rule__Customer__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Customer__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__4__Impl"


    // $ANTLR start "rule__Customer__Group__5"
    // InternalMyDsl.g:508:1: rule__Customer__Group__5 : rule__Customer__Group__5__Impl rule__Customer__Group__6 ;
    public final void rule__Customer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( rule__Customer__Group__5__Impl rule__Customer__Group__6 )
            // InternalMyDsl.g:513:2: rule__Customer__Group__5__Impl rule__Customer__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5"


    // $ANTLR start "rule__Customer__Group__5__Impl"
    // InternalMyDsl.g:520:1: rule__Customer__Group__5__Impl : ( 'surname' ) ;
    public final void rule__Customer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( ( 'surname' ) )
            // InternalMyDsl.g:525:1: ( 'surname' )
            {
            // InternalMyDsl.g:525:1: ( 'surname' )
            // InternalMyDsl.g:526:2: 'surname'
            {
             before(grammarAccess.getCustomerAccess().getSurnameKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getSurnameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__5__Impl"


    // $ANTLR start "rule__Customer__Group__6"
    // InternalMyDsl.g:535:1: rule__Customer__Group__6 : rule__Customer__Group__6__Impl rule__Customer__Group__7 ;
    public final void rule__Customer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( rule__Customer__Group__6__Impl rule__Customer__Group__7 )
            // InternalMyDsl.g:540:2: rule__Customer__Group__6__Impl rule__Customer__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Customer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6"


    // $ANTLR start "rule__Customer__Group__6__Impl"
    // InternalMyDsl.g:547:1: rule__Customer__Group__6__Impl : ( ( rule__Customer__SurnameAssignment_6 ) ) ;
    public final void rule__Customer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( ( ( rule__Customer__SurnameAssignment_6 ) ) )
            // InternalMyDsl.g:552:1: ( ( rule__Customer__SurnameAssignment_6 ) )
            {
            // InternalMyDsl.g:552:1: ( ( rule__Customer__SurnameAssignment_6 ) )
            // InternalMyDsl.g:553:2: ( rule__Customer__SurnameAssignment_6 )
            {
             before(grammarAccess.getCustomerAccess().getSurnameAssignment_6()); 
            // InternalMyDsl.g:554:2: ( rule__Customer__SurnameAssignment_6 )
            // InternalMyDsl.g:554:3: rule__Customer__SurnameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Customer__SurnameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getSurnameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__6__Impl"


    // $ANTLR start "rule__Customer__Group__7"
    // InternalMyDsl.g:562:1: rule__Customer__Group__7 : rule__Customer__Group__7__Impl rule__Customer__Group__8 ;
    public final void rule__Customer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( rule__Customer__Group__7__Impl rule__Customer__Group__8 )
            // InternalMyDsl.g:567:2: rule__Customer__Group__7__Impl rule__Customer__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__7"


    // $ANTLR start "rule__Customer__Group__7__Impl"
    // InternalMyDsl.g:574:1: rule__Customer__Group__7__Impl : ( 'email' ) ;
    public final void rule__Customer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( ( 'email' ) )
            // InternalMyDsl.g:579:1: ( 'email' )
            {
            // InternalMyDsl.g:579:1: ( 'email' )
            // InternalMyDsl.g:580:2: 'email'
            {
             before(grammarAccess.getCustomerAccess().getEmailKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getEmailKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__7__Impl"


    // $ANTLR start "rule__Customer__Group__8"
    // InternalMyDsl.g:589:1: rule__Customer__Group__8 : rule__Customer__Group__8__Impl rule__Customer__Group__9 ;
    public final void rule__Customer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( rule__Customer__Group__8__Impl rule__Customer__Group__9 )
            // InternalMyDsl.g:594:2: rule__Customer__Group__8__Impl rule__Customer__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Customer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__8"


    // $ANTLR start "rule__Customer__Group__8__Impl"
    // InternalMyDsl.g:601:1: rule__Customer__Group__8__Impl : ( ( rule__Customer__EmailAssignment_8 ) ) ;
    public final void rule__Customer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ( rule__Customer__EmailAssignment_8 ) ) )
            // InternalMyDsl.g:606:1: ( ( rule__Customer__EmailAssignment_8 ) )
            {
            // InternalMyDsl.g:606:1: ( ( rule__Customer__EmailAssignment_8 ) )
            // InternalMyDsl.g:607:2: ( rule__Customer__EmailAssignment_8 )
            {
             before(grammarAccess.getCustomerAccess().getEmailAssignment_8()); 
            // InternalMyDsl.g:608:2: ( rule__Customer__EmailAssignment_8 )
            // InternalMyDsl.g:608:3: rule__Customer__EmailAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Customer__EmailAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getEmailAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__8__Impl"


    // $ANTLR start "rule__Customer__Group__9"
    // InternalMyDsl.g:616:1: rule__Customer__Group__9 : rule__Customer__Group__9__Impl rule__Customer__Group__10 ;
    public final void rule__Customer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( rule__Customer__Group__9__Impl rule__Customer__Group__10 )
            // InternalMyDsl.g:621:2: rule__Customer__Group__9__Impl rule__Customer__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Customer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__9"


    // $ANTLR start "rule__Customer__Group__9__Impl"
    // InternalMyDsl.g:628:1: rule__Customer__Group__9__Impl : ( ( rule__Customer__Group_9__0 )? ) ;
    public final void rule__Customer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( ( rule__Customer__Group_9__0 )? ) )
            // InternalMyDsl.g:633:1: ( ( rule__Customer__Group_9__0 )? )
            {
            // InternalMyDsl.g:633:1: ( ( rule__Customer__Group_9__0 )? )
            // InternalMyDsl.g:634:2: ( rule__Customer__Group_9__0 )?
            {
             before(grammarAccess.getCustomerAccess().getGroup_9()); 
            // InternalMyDsl.g:635:2: ( rule__Customer__Group_9__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:635:3: rule__Customer__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__9__Impl"


    // $ANTLR start "rule__Customer__Group__10"
    // InternalMyDsl.g:643:1: rule__Customer__Group__10 : rule__Customer__Group__10__Impl rule__Customer__Group__11 ;
    public final void rule__Customer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( rule__Customer__Group__10__Impl rule__Customer__Group__11 )
            // InternalMyDsl.g:648:2: rule__Customer__Group__10__Impl rule__Customer__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Customer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__10"


    // $ANTLR start "rule__Customer__Group__10__Impl"
    // InternalMyDsl.g:655:1: rule__Customer__Group__10__Impl : ( 'expirationDate' ) ;
    public final void rule__Customer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( ( 'expirationDate' ) )
            // InternalMyDsl.g:660:1: ( 'expirationDate' )
            {
            // InternalMyDsl.g:660:1: ( 'expirationDate' )
            // InternalMyDsl.g:661:2: 'expirationDate'
            {
             before(grammarAccess.getCustomerAccess().getExpirationDateKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getExpirationDateKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__10__Impl"


    // $ANTLR start "rule__Customer__Group__11"
    // InternalMyDsl.g:670:1: rule__Customer__Group__11 : rule__Customer__Group__11__Impl rule__Customer__Group__12 ;
    public final void rule__Customer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( rule__Customer__Group__11__Impl rule__Customer__Group__12 )
            // InternalMyDsl.g:675:2: rule__Customer__Group__11__Impl rule__Customer__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Customer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__11"


    // $ANTLR start "rule__Customer__Group__11__Impl"
    // InternalMyDsl.g:682:1: rule__Customer__Group__11__Impl : ( ( rule__Customer__ExpirationDateAssignment_11 ) ) ;
    public final void rule__Customer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( ( rule__Customer__ExpirationDateAssignment_11 ) ) )
            // InternalMyDsl.g:687:1: ( ( rule__Customer__ExpirationDateAssignment_11 ) )
            {
            // InternalMyDsl.g:687:1: ( ( rule__Customer__ExpirationDateAssignment_11 ) )
            // InternalMyDsl.g:688:2: ( rule__Customer__ExpirationDateAssignment_11 )
            {
             before(grammarAccess.getCustomerAccess().getExpirationDateAssignment_11()); 
            // InternalMyDsl.g:689:2: ( rule__Customer__ExpirationDateAssignment_11 )
            // InternalMyDsl.g:689:3: rule__Customer__ExpirationDateAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Customer__ExpirationDateAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getExpirationDateAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__11__Impl"


    // $ANTLR start "rule__Customer__Group__12"
    // InternalMyDsl.g:697:1: rule__Customer__Group__12 : rule__Customer__Group__12__Impl rule__Customer__Group__13 ;
    public final void rule__Customer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( rule__Customer__Group__12__Impl rule__Customer__Group__13 )
            // InternalMyDsl.g:702:2: rule__Customer__Group__12__Impl rule__Customer__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Customer__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__12"


    // $ANTLR start "rule__Customer__Group__12__Impl"
    // InternalMyDsl.g:709:1: rule__Customer__Group__12__Impl : ( 'status' ) ;
    public final void rule__Customer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( 'status' ) )
            // InternalMyDsl.g:714:1: ( 'status' )
            {
            // InternalMyDsl.g:714:1: ( 'status' )
            // InternalMyDsl.g:715:2: 'status'
            {
             before(grammarAccess.getCustomerAccess().getStatusKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getStatusKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__12__Impl"


    // $ANTLR start "rule__Customer__Group__13"
    // InternalMyDsl.g:724:1: rule__Customer__Group__13 : rule__Customer__Group__13__Impl rule__Customer__Group__14 ;
    public final void rule__Customer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( rule__Customer__Group__13__Impl rule__Customer__Group__14 )
            // InternalMyDsl.g:729:2: rule__Customer__Group__13__Impl rule__Customer__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Customer__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__13"


    // $ANTLR start "rule__Customer__Group__13__Impl"
    // InternalMyDsl.g:736:1: rule__Customer__Group__13__Impl : ( ( rule__Customer__StatusAssignment_13 ) ) ;
    public final void rule__Customer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ( rule__Customer__StatusAssignment_13 ) ) )
            // InternalMyDsl.g:741:1: ( ( rule__Customer__StatusAssignment_13 ) )
            {
            // InternalMyDsl.g:741:1: ( ( rule__Customer__StatusAssignment_13 ) )
            // InternalMyDsl.g:742:2: ( rule__Customer__StatusAssignment_13 )
            {
             before(grammarAccess.getCustomerAccess().getStatusAssignment_13()); 
            // InternalMyDsl.g:743:2: ( rule__Customer__StatusAssignment_13 )
            // InternalMyDsl.g:743:3: rule__Customer__StatusAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Customer__StatusAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getStatusAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__13__Impl"


    // $ANTLR start "rule__Customer__Group__14"
    // InternalMyDsl.g:751:1: rule__Customer__Group__14 : rule__Customer__Group__14__Impl rule__Customer__Group__15 ;
    public final void rule__Customer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( rule__Customer__Group__14__Impl rule__Customer__Group__15 )
            // InternalMyDsl.g:756:2: rule__Customer__Group__14__Impl rule__Customer__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Customer__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__14"


    // $ANTLR start "rule__Customer__Group__14__Impl"
    // InternalMyDsl.g:763:1: rule__Customer__Group__14__Impl : ( ( rule__Customer__Group_14__0 )? ) ;
    public final void rule__Customer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( ( rule__Customer__Group_14__0 )? ) )
            // InternalMyDsl.g:768:1: ( ( rule__Customer__Group_14__0 )? )
            {
            // InternalMyDsl.g:768:1: ( ( rule__Customer__Group_14__0 )? )
            // InternalMyDsl.g:769:2: ( rule__Customer__Group_14__0 )?
            {
             before(grammarAccess.getCustomerAccess().getGroup_14()); 
            // InternalMyDsl.g:770:2: ( rule__Customer__Group_14__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:770:3: rule__Customer__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Customer__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomerAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__14__Impl"


    // $ANTLR start "rule__Customer__Group__15"
    // InternalMyDsl.g:778:1: rule__Customer__Group__15 : rule__Customer__Group__15__Impl ;
    public final void rule__Customer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( rule__Customer__Group__15__Impl )
            // InternalMyDsl.g:783:2: rule__Customer__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__15"


    // $ANTLR start "rule__Customer__Group__15__Impl"
    // InternalMyDsl.g:789:1: rule__Customer__Group__15__Impl : ( '}' ) ;
    public final void rule__Customer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( '}' ) )
            // InternalMyDsl.g:794:1: ( '}' )
            {
            // InternalMyDsl.g:794:1: ( '}' )
            // InternalMyDsl.g:795:2: '}'
            {
             before(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group__15__Impl"


    // $ANTLR start "rule__Customer__Group_9__0"
    // InternalMyDsl.g:805:1: rule__Customer__Group_9__0 : rule__Customer__Group_9__0__Impl rule__Customer__Group_9__1 ;
    public final void rule__Customer__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( rule__Customer__Group_9__0__Impl rule__Customer__Group_9__1 )
            // InternalMyDsl.g:810:2: rule__Customer__Group_9__0__Impl rule__Customer__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__Customer__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_9__0"


    // $ANTLR start "rule__Customer__Group_9__0__Impl"
    // InternalMyDsl.g:817:1: rule__Customer__Group_9__0__Impl : ( 'subscriptionDate' ) ;
    public final void rule__Customer__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( 'subscriptionDate' ) )
            // InternalMyDsl.g:822:1: ( 'subscriptionDate' )
            {
            // InternalMyDsl.g:822:1: ( 'subscriptionDate' )
            // InternalMyDsl.g:823:2: 'subscriptionDate'
            {
             before(grammarAccess.getCustomerAccess().getSubscriptionDateKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getSubscriptionDateKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_9__0__Impl"


    // $ANTLR start "rule__Customer__Group_9__1"
    // InternalMyDsl.g:832:1: rule__Customer__Group_9__1 : rule__Customer__Group_9__1__Impl ;
    public final void rule__Customer__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__Customer__Group_9__1__Impl )
            // InternalMyDsl.g:837:2: rule__Customer__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_9__1"


    // $ANTLR start "rule__Customer__Group_9__1__Impl"
    // InternalMyDsl.g:843:1: rule__Customer__Group_9__1__Impl : ( ( rule__Customer__SubscriptionDateAssignment_9_1 ) ) ;
    public final void rule__Customer__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( ( rule__Customer__SubscriptionDateAssignment_9_1 ) ) )
            // InternalMyDsl.g:848:1: ( ( rule__Customer__SubscriptionDateAssignment_9_1 ) )
            {
            // InternalMyDsl.g:848:1: ( ( rule__Customer__SubscriptionDateAssignment_9_1 ) )
            // InternalMyDsl.g:849:2: ( rule__Customer__SubscriptionDateAssignment_9_1 )
            {
             before(grammarAccess.getCustomerAccess().getSubscriptionDateAssignment_9_1()); 
            // InternalMyDsl.g:850:2: ( rule__Customer__SubscriptionDateAssignment_9_1 )
            // InternalMyDsl.g:850:3: rule__Customer__SubscriptionDateAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__SubscriptionDateAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getSubscriptionDateAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_9__1__Impl"


    // $ANTLR start "rule__Customer__Group_14__0"
    // InternalMyDsl.g:859:1: rule__Customer__Group_14__0 : rule__Customer__Group_14__0__Impl rule__Customer__Group_14__1 ;
    public final void rule__Customer__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__Customer__Group_14__0__Impl rule__Customer__Group_14__1 )
            // InternalMyDsl.g:864:2: rule__Customer__Group_14__0__Impl rule__Customer__Group_14__1
            {
            pushFollow(FOLLOW_13);
            rule__Customer__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__0"


    // $ANTLR start "rule__Customer__Group_14__0__Impl"
    // InternalMyDsl.g:871:1: rule__Customer__Group_14__0__Impl : ( 'routes' ) ;
    public final void rule__Customer__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( 'routes' ) )
            // InternalMyDsl.g:876:1: ( 'routes' )
            {
            // InternalMyDsl.g:876:1: ( 'routes' )
            // InternalMyDsl.g:877:2: 'routes'
            {
             before(grammarAccess.getCustomerAccess().getRoutesKeyword_14_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRoutesKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__0__Impl"


    // $ANTLR start "rule__Customer__Group_14__1"
    // InternalMyDsl.g:886:1: rule__Customer__Group_14__1 : rule__Customer__Group_14__1__Impl rule__Customer__Group_14__2 ;
    public final void rule__Customer__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__Customer__Group_14__1__Impl rule__Customer__Group_14__2 )
            // InternalMyDsl.g:891:2: rule__Customer__Group_14__1__Impl rule__Customer__Group_14__2
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__1"


    // $ANTLR start "rule__Customer__Group_14__1__Impl"
    // InternalMyDsl.g:898:1: rule__Customer__Group_14__1__Impl : ( '(' ) ;
    public final void rule__Customer__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( '(' ) )
            // InternalMyDsl.g:903:1: ( '(' )
            {
            // InternalMyDsl.g:903:1: ( '(' )
            // InternalMyDsl.g:904:2: '('
            {
             before(grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getLeftParenthesisKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__1__Impl"


    // $ANTLR start "rule__Customer__Group_14__2"
    // InternalMyDsl.g:913:1: rule__Customer__Group_14__2 : rule__Customer__Group_14__2__Impl rule__Customer__Group_14__3 ;
    public final void rule__Customer__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__Customer__Group_14__2__Impl rule__Customer__Group_14__3 )
            // InternalMyDsl.g:918:2: rule__Customer__Group_14__2__Impl rule__Customer__Group_14__3
            {
            pushFollow(FOLLOW_14);
            rule__Customer__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__2"


    // $ANTLR start "rule__Customer__Group_14__2__Impl"
    // InternalMyDsl.g:925:1: rule__Customer__Group_14__2__Impl : ( ( rule__Customer__RoutesAssignment_14_2 ) ) ;
    public final void rule__Customer__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ( rule__Customer__RoutesAssignment_14_2 ) ) )
            // InternalMyDsl.g:930:1: ( ( rule__Customer__RoutesAssignment_14_2 ) )
            {
            // InternalMyDsl.g:930:1: ( ( rule__Customer__RoutesAssignment_14_2 ) )
            // InternalMyDsl.g:931:2: ( rule__Customer__RoutesAssignment_14_2 )
            {
             before(grammarAccess.getCustomerAccess().getRoutesAssignment_14_2()); 
            // InternalMyDsl.g:932:2: ( rule__Customer__RoutesAssignment_14_2 )
            // InternalMyDsl.g:932:3: rule__Customer__RoutesAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Customer__RoutesAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getRoutesAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__2__Impl"


    // $ANTLR start "rule__Customer__Group_14__3"
    // InternalMyDsl.g:940:1: rule__Customer__Group_14__3 : rule__Customer__Group_14__3__Impl rule__Customer__Group_14__4 ;
    public final void rule__Customer__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__Customer__Group_14__3__Impl rule__Customer__Group_14__4 )
            // InternalMyDsl.g:945:2: rule__Customer__Group_14__3__Impl rule__Customer__Group_14__4
            {
            pushFollow(FOLLOW_14);
            rule__Customer__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__3"


    // $ANTLR start "rule__Customer__Group_14__3__Impl"
    // InternalMyDsl.g:952:1: rule__Customer__Group_14__3__Impl : ( ( rule__Customer__Group_14_3__0 )* ) ;
    public final void rule__Customer__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( ( rule__Customer__Group_14_3__0 )* ) )
            // InternalMyDsl.g:957:1: ( ( rule__Customer__Group_14_3__0 )* )
            {
            // InternalMyDsl.g:957:1: ( ( rule__Customer__Group_14_3__0 )* )
            // InternalMyDsl.g:958:2: ( rule__Customer__Group_14_3__0 )*
            {
             before(grammarAccess.getCustomerAccess().getGroup_14_3()); 
            // InternalMyDsl.g:959:2: ( rule__Customer__Group_14_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:959:3: rule__Customer__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Customer__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCustomerAccess().getGroup_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__3__Impl"


    // $ANTLR start "rule__Customer__Group_14__4"
    // InternalMyDsl.g:967:1: rule__Customer__Group_14__4 : rule__Customer__Group_14__4__Impl ;
    public final void rule__Customer__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__Customer__Group_14__4__Impl )
            // InternalMyDsl.g:972:2: rule__Customer__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__4"


    // $ANTLR start "rule__Customer__Group_14__4__Impl"
    // InternalMyDsl.g:978:1: rule__Customer__Group_14__4__Impl : ( ')' ) ;
    public final void rule__Customer__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( ( ')' ) )
            // InternalMyDsl.g:983:1: ( ')' )
            {
            // InternalMyDsl.g:983:1: ( ')' )
            // InternalMyDsl.g:984:2: ')'
            {
             before(grammarAccess.getCustomerAccess().getRightParenthesisKeyword_14_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getRightParenthesisKeyword_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14__4__Impl"


    // $ANTLR start "rule__Customer__Group_14_3__0"
    // InternalMyDsl.g:994:1: rule__Customer__Group_14_3__0 : rule__Customer__Group_14_3__0__Impl rule__Customer__Group_14_3__1 ;
    public final void rule__Customer__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__Customer__Group_14_3__0__Impl rule__Customer__Group_14_3__1 )
            // InternalMyDsl.g:999:2: rule__Customer__Group_14_3__0__Impl rule__Customer__Group_14_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Customer__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Customer__Group_14_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14_3__0"


    // $ANTLR start "rule__Customer__Group_14_3__0__Impl"
    // InternalMyDsl.g:1006:1: rule__Customer__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__Customer__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( ( ',' ) )
            // InternalMyDsl.g:1011:1: ( ',' )
            {
            // InternalMyDsl.g:1011:1: ( ',' )
            // InternalMyDsl.g:1012:2: ','
            {
             before(grammarAccess.getCustomerAccess().getCommaKeyword_14_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCustomerAccess().getCommaKeyword_14_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14_3__0__Impl"


    // $ANTLR start "rule__Customer__Group_14_3__1"
    // InternalMyDsl.g:1021:1: rule__Customer__Group_14_3__1 : rule__Customer__Group_14_3__1__Impl ;
    public final void rule__Customer__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__Customer__Group_14_3__1__Impl )
            // InternalMyDsl.g:1026:2: rule__Customer__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Customer__Group_14_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14_3__1"


    // $ANTLR start "rule__Customer__Group_14_3__1__Impl"
    // InternalMyDsl.g:1032:1: rule__Customer__Group_14_3__1__Impl : ( ( rule__Customer__RoutesAssignment_14_3_1 ) ) ;
    public final void rule__Customer__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( rule__Customer__RoutesAssignment_14_3_1 ) ) )
            // InternalMyDsl.g:1037:1: ( ( rule__Customer__RoutesAssignment_14_3_1 ) )
            {
            // InternalMyDsl.g:1037:1: ( ( rule__Customer__RoutesAssignment_14_3_1 ) )
            // InternalMyDsl.g:1038:2: ( rule__Customer__RoutesAssignment_14_3_1 )
            {
             before(grammarAccess.getCustomerAccess().getRoutesAssignment_14_3_1()); 
            // InternalMyDsl.g:1039:2: ( rule__Customer__RoutesAssignment_14_3_1 )
            // InternalMyDsl.g:1039:3: rule__Customer__RoutesAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Customer__RoutesAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomerAccess().getRoutesAssignment_14_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__Group_14_3__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalMyDsl.g:1048:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalMyDsl.g:1053:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalMyDsl.g:1060:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1065:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1065:1: ( ( '-' )? )
            // InternalMyDsl.g:1066:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1067:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1067:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalMyDsl.g:1075:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalMyDsl.g:1080:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalMyDsl.g:1087:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:1092:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:1092:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:1093:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:1094:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1094:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalMyDsl.g:1102:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalMyDsl.g:1107:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalMyDsl.g:1114:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( ( '.' ) )
            // InternalMyDsl.g:1119:1: ( '.' )
            {
            // InternalMyDsl.g:1119:1: ( '.' )
            // InternalMyDsl.g:1120:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalMyDsl.g:1129:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalMyDsl.g:1134:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalMyDsl.g:1141:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1146:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1146:1: ( RULE_INT )
            // InternalMyDsl.g:1147:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalMyDsl.g:1156:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( rule__EDouble__Group__4__Impl )
            // InternalMyDsl.g:1161:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalMyDsl.g:1167:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalMyDsl.g:1172:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalMyDsl.g:1172:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalMyDsl.g:1173:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalMyDsl.g:1174:2: ( rule__EDouble__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=13)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1174:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalMyDsl.g:1183:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalMyDsl.g:1188:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalMyDsl.g:1195:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:1200:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:1200:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalMyDsl.g:1201:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:1202:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalMyDsl.g:1202:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalMyDsl.g:1210:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalMyDsl.g:1215:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalMyDsl.g:1222:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1227:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1227:1: ( ( '-' )? )
            // InternalMyDsl.g:1228:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:1229:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1229:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalMyDsl.g:1237:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalMyDsl.g:1242:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalMyDsl.g:1248:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1253:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1253:1: ( RULE_INT )
            // InternalMyDsl.g:1254:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1264:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1269:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:1276:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1281:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1281:1: ( ( '-' )? )
            // InternalMyDsl.g:1282:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1283:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1283:3: '-'
                    {
                    match(input,35,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:1291:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1296:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:1302:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1307:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1307:1: ( RULE_INT )
            // InternalMyDsl.g:1308:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Geolocation__Group__0"
    // InternalMyDsl.g:1318:1: rule__Geolocation__Group__0 : rule__Geolocation__Group__0__Impl rule__Geolocation__Group__1 ;
    public final void rule__Geolocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1322:1: ( rule__Geolocation__Group__0__Impl rule__Geolocation__Group__1 )
            // InternalMyDsl.g:1323:2: rule__Geolocation__Group__0__Impl rule__Geolocation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Geolocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__0"


    // $ANTLR start "rule__Geolocation__Group__0__Impl"
    // InternalMyDsl.g:1330:1: rule__Geolocation__Group__0__Impl : ( 'Geolocation' ) ;
    public final void rule__Geolocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( ( 'Geolocation' ) )
            // InternalMyDsl.g:1335:1: ( 'Geolocation' )
            {
            // InternalMyDsl.g:1335:1: ( 'Geolocation' )
            // InternalMyDsl.g:1336:2: 'Geolocation'
            {
             before(grammarAccess.getGeolocationAccess().getGeolocationKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGeolocationAccess().getGeolocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__0__Impl"


    // $ANTLR start "rule__Geolocation__Group__1"
    // InternalMyDsl.g:1345:1: rule__Geolocation__Group__1 : rule__Geolocation__Group__1__Impl rule__Geolocation__Group__2 ;
    public final void rule__Geolocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1349:1: ( rule__Geolocation__Group__1__Impl rule__Geolocation__Group__2 )
            // InternalMyDsl.g:1350:2: rule__Geolocation__Group__1__Impl rule__Geolocation__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Geolocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__1"


    // $ANTLR start "rule__Geolocation__Group__1__Impl"
    // InternalMyDsl.g:1357:1: rule__Geolocation__Group__1__Impl : ( '{' ) ;
    public final void rule__Geolocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( ( '{' ) )
            // InternalMyDsl.g:1362:1: ( '{' )
            {
            // InternalMyDsl.g:1362:1: ( '{' )
            // InternalMyDsl.g:1363:2: '{'
            {
             before(grammarAccess.getGeolocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGeolocationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__1__Impl"


    // $ANTLR start "rule__Geolocation__Group__2"
    // InternalMyDsl.g:1372:1: rule__Geolocation__Group__2 : rule__Geolocation__Group__2__Impl rule__Geolocation__Group__3 ;
    public final void rule__Geolocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1376:1: ( rule__Geolocation__Group__2__Impl rule__Geolocation__Group__3 )
            // InternalMyDsl.g:1377:2: rule__Geolocation__Group__2__Impl rule__Geolocation__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Geolocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__2"


    // $ANTLR start "rule__Geolocation__Group__2__Impl"
    // InternalMyDsl.g:1384:1: rule__Geolocation__Group__2__Impl : ( 'lat' ) ;
    public final void rule__Geolocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( ( 'lat' ) )
            // InternalMyDsl.g:1389:1: ( 'lat' )
            {
            // InternalMyDsl.g:1389:1: ( 'lat' )
            // InternalMyDsl.g:1390:2: 'lat'
            {
             before(grammarAccess.getGeolocationAccess().getLatKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGeolocationAccess().getLatKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__2__Impl"


    // $ANTLR start "rule__Geolocation__Group__3"
    // InternalMyDsl.g:1399:1: rule__Geolocation__Group__3 : rule__Geolocation__Group__3__Impl rule__Geolocation__Group__4 ;
    public final void rule__Geolocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( rule__Geolocation__Group__3__Impl rule__Geolocation__Group__4 )
            // InternalMyDsl.g:1404:2: rule__Geolocation__Group__3__Impl rule__Geolocation__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Geolocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__3"


    // $ANTLR start "rule__Geolocation__Group__3__Impl"
    // InternalMyDsl.g:1411:1: rule__Geolocation__Group__3__Impl : ( ( rule__Geolocation__LatAssignment_3 ) ) ;
    public final void rule__Geolocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( ( ( rule__Geolocation__LatAssignment_3 ) ) )
            // InternalMyDsl.g:1416:1: ( ( rule__Geolocation__LatAssignment_3 ) )
            {
            // InternalMyDsl.g:1416:1: ( ( rule__Geolocation__LatAssignment_3 ) )
            // InternalMyDsl.g:1417:2: ( rule__Geolocation__LatAssignment_3 )
            {
             before(grammarAccess.getGeolocationAccess().getLatAssignment_3()); 
            // InternalMyDsl.g:1418:2: ( rule__Geolocation__LatAssignment_3 )
            // InternalMyDsl.g:1418:3: rule__Geolocation__LatAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Geolocation__LatAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGeolocationAccess().getLatAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__3__Impl"


    // $ANTLR start "rule__Geolocation__Group__4"
    // InternalMyDsl.g:1426:1: rule__Geolocation__Group__4 : rule__Geolocation__Group__4__Impl rule__Geolocation__Group__5 ;
    public final void rule__Geolocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( rule__Geolocation__Group__4__Impl rule__Geolocation__Group__5 )
            // InternalMyDsl.g:1431:2: rule__Geolocation__Group__4__Impl rule__Geolocation__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Geolocation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__4"


    // $ANTLR start "rule__Geolocation__Group__4__Impl"
    // InternalMyDsl.g:1438:1: rule__Geolocation__Group__4__Impl : ( 'lng' ) ;
    public final void rule__Geolocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1442:1: ( ( 'lng' ) )
            // InternalMyDsl.g:1443:1: ( 'lng' )
            {
            // InternalMyDsl.g:1443:1: ( 'lng' )
            // InternalMyDsl.g:1444:2: 'lng'
            {
             before(grammarAccess.getGeolocationAccess().getLngKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGeolocationAccess().getLngKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__4__Impl"


    // $ANTLR start "rule__Geolocation__Group__5"
    // InternalMyDsl.g:1453:1: rule__Geolocation__Group__5 : rule__Geolocation__Group__5__Impl rule__Geolocation__Group__6 ;
    public final void rule__Geolocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1457:1: ( rule__Geolocation__Group__5__Impl rule__Geolocation__Group__6 )
            // InternalMyDsl.g:1458:2: rule__Geolocation__Group__5__Impl rule__Geolocation__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Geolocation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__5"


    // $ANTLR start "rule__Geolocation__Group__5__Impl"
    // InternalMyDsl.g:1465:1: rule__Geolocation__Group__5__Impl : ( ( rule__Geolocation__LngAssignment_5 ) ) ;
    public final void rule__Geolocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1469:1: ( ( ( rule__Geolocation__LngAssignment_5 ) ) )
            // InternalMyDsl.g:1470:1: ( ( rule__Geolocation__LngAssignment_5 ) )
            {
            // InternalMyDsl.g:1470:1: ( ( rule__Geolocation__LngAssignment_5 ) )
            // InternalMyDsl.g:1471:2: ( rule__Geolocation__LngAssignment_5 )
            {
             before(grammarAccess.getGeolocationAccess().getLngAssignment_5()); 
            // InternalMyDsl.g:1472:2: ( rule__Geolocation__LngAssignment_5 )
            // InternalMyDsl.g:1472:3: rule__Geolocation__LngAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Geolocation__LngAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGeolocationAccess().getLngAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__5__Impl"


    // $ANTLR start "rule__Geolocation__Group__6"
    // InternalMyDsl.g:1480:1: rule__Geolocation__Group__6 : rule__Geolocation__Group__6__Impl ;
    public final void rule__Geolocation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1484:1: ( rule__Geolocation__Group__6__Impl )
            // InternalMyDsl.g:1485:2: rule__Geolocation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Geolocation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__6"


    // $ANTLR start "rule__Geolocation__Group__6__Impl"
    // InternalMyDsl.g:1491:1: rule__Geolocation__Group__6__Impl : ( '}' ) ;
    public final void rule__Geolocation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( '}' ) )
            // InternalMyDsl.g:1496:1: ( '}' )
            {
            // InternalMyDsl.g:1496:1: ( '}' )
            // InternalMyDsl.g:1497:2: '}'
            {
             before(grammarAccess.getGeolocationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGeolocationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__Group__6__Impl"


    // $ANTLR start "rule__Customer__IdAssignment_1"
    // InternalMyDsl.g:1507:1: rule__Customer__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__Customer__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1511:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1512:2: ( ruleEString )
            {
            // InternalMyDsl.g:1512:2: ( ruleEString )
            // InternalMyDsl.g:1513:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getIdEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__IdAssignment_1"


    // $ANTLR start "rule__Customer__NameAssignment_4"
    // InternalMyDsl.g:1522:1: rule__Customer__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Customer__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1526:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1527:2: ( ruleEString )
            {
            // InternalMyDsl.g:1527:2: ( ruleEString )
            // InternalMyDsl.g:1528:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__NameAssignment_4"


    // $ANTLR start "rule__Customer__SurnameAssignment_6"
    // InternalMyDsl.g:1537:1: rule__Customer__SurnameAssignment_6 : ( ruleEString ) ;
    public final void rule__Customer__SurnameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1542:2: ( ruleEString )
            {
            // InternalMyDsl.g:1542:2: ( ruleEString )
            // InternalMyDsl.g:1543:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getSurnameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getSurnameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__SurnameAssignment_6"


    // $ANTLR start "rule__Customer__EmailAssignment_8"
    // InternalMyDsl.g:1552:1: rule__Customer__EmailAssignment_8 : ( ruleEString ) ;
    public final void rule__Customer__EmailAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1557:2: ( ruleEString )
            {
            // InternalMyDsl.g:1557:2: ( ruleEString )
            // InternalMyDsl.g:1558:3: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getEmailEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getEmailEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__EmailAssignment_8"


    // $ANTLR start "rule__Customer__SubscriptionDateAssignment_9_1"
    // InternalMyDsl.g:1567:1: rule__Customer__SubscriptionDateAssignment_9_1 : ( ruleEDate ) ;
    public final void rule__Customer__SubscriptionDateAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( ( ruleEDate ) )
            // InternalMyDsl.g:1572:2: ( ruleEDate )
            {
            // InternalMyDsl.g:1572:2: ( ruleEDate )
            // InternalMyDsl.g:1573:3: ruleEDate
            {
             before(grammarAccess.getCustomerAccess().getSubscriptionDateEDateParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getSubscriptionDateEDateParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__SubscriptionDateAssignment_9_1"


    // $ANTLR start "rule__Customer__ExpirationDateAssignment_11"
    // InternalMyDsl.g:1582:1: rule__Customer__ExpirationDateAssignment_11 : ( ruleEDate ) ;
    public final void rule__Customer__ExpirationDateAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1586:1: ( ( ruleEDate ) )
            // InternalMyDsl.g:1587:2: ( ruleEDate )
            {
            // InternalMyDsl.g:1587:2: ( ruleEDate )
            // InternalMyDsl.g:1588:3: ruleEDate
            {
             before(grammarAccess.getCustomerAccess().getExpirationDateEDateParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getExpirationDateEDateParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__ExpirationDateAssignment_11"


    // $ANTLR start "rule__Customer__StatusAssignment_13"
    // InternalMyDsl.g:1597:1: rule__Customer__StatusAssignment_13 : ( ruleCustomerStatus ) ;
    public final void rule__Customer__StatusAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( ruleCustomerStatus ) )
            // InternalMyDsl.g:1602:2: ( ruleCustomerStatus )
            {
            // InternalMyDsl.g:1602:2: ( ruleCustomerStatus )
            // InternalMyDsl.g:1603:3: ruleCustomerStatus
            {
             before(grammarAccess.getCustomerAccess().getStatusCustomerStatusEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleCustomerStatus();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getStatusCustomerStatusEnumRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__StatusAssignment_13"


    // $ANTLR start "rule__Customer__RoutesAssignment_14_2"
    // InternalMyDsl.g:1612:1: rule__Customer__RoutesAssignment_14_2 : ( ( ruleEString ) ) ;
    public final void rule__Customer__RoutesAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1617:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1617:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1618:3: ( ruleEString )
            {
             before(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_2_0()); 
            // InternalMyDsl.g:1619:3: ( ruleEString )
            // InternalMyDsl.g:1620:4: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getRoutesRouteEStringParserRuleCall_14_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getRoutesRouteEStringParserRuleCall_14_2_0_1()); 

            }

             after(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__RoutesAssignment_14_2"


    // $ANTLR start "rule__Customer__RoutesAssignment_14_3_1"
    // InternalMyDsl.g:1631:1: rule__Customer__RoutesAssignment_14_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Customer__RoutesAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1636:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1636:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1637:3: ( ruleEString )
            {
             before(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_3_1_0()); 
            // InternalMyDsl.g:1638:3: ( ruleEString )
            // InternalMyDsl.g:1639:4: ruleEString
            {
             before(grammarAccess.getCustomerAccess().getRoutesRouteEStringParserRuleCall_14_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCustomerAccess().getRoutesRouteEStringParserRuleCall_14_3_1_0_1()); 

            }

             after(grammarAccess.getCustomerAccess().getRoutesRouteCrossReference_14_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Customer__RoutesAssignment_14_3_1"


    // $ANTLR start "rule__Geolocation__LatAssignment_3"
    // InternalMyDsl.g:1650:1: rule__Geolocation__LatAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Geolocation__LatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:1655:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:1655:2: ( ruleEDouble )
            // InternalMyDsl.g:1656:3: ruleEDouble
            {
             before(grammarAccess.getGeolocationAccess().getLatEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getGeolocationAccess().getLatEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__LatAssignment_3"


    // $ANTLR start "rule__Geolocation__LngAssignment_5"
    // InternalMyDsl.g:1665:1: rule__Geolocation__LngAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Geolocation__LngAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1669:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:1670:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:1670:2: ( ruleEDouble )
            // InternalMyDsl.g:1671:3: ruleEDouble
            {
             before(grammarAccess.getGeolocationAccess().getLngEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getGeolocationAccess().getLngEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geolocation__LngAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});

}