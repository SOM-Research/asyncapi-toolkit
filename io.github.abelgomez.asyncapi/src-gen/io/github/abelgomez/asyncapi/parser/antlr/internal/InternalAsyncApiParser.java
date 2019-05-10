package io.github.abelgomez.asyncapi.parser.antlr.internal;

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
import io.github.abelgomez.asyncapi.services.AsyncApiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAsyncApiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"asyncapi\"'", "':'", "','", "'\"info\"'", "'\"servers\"'", "'['", "']'", "'\"topics\"'", "'}'", "'\"components\"'", "'\"title\"'", "'\"version\"'", "'\"description\"'", "'\"termsOfService\"'", "'\"contact\"'", "'\"license\"'", "'\"name\"'", "'\"url\"'", "'\"email\"'", "'\"scheme\"'", "'\"variables\"'", "'\"default\"'", "'\"enum\"'", "'\"publish\"'", "'\"subscribe\"'", "'\"summary\"'", "'\"headers\"'", "'\"payload\"'", "'\"type\"'", "'\"format\"'", "'\"properties\"'", "'\"schemas\"'", "'\"messages\"'", "'\"$ref\"'", "'\"1.0.0\"'", "'\"1.1.0\"'", "'\"1.2.0\"'", "'\"amqp\"'", "'\"amqps\"'", "'\"mqtt\"'", "'\"mqtts\"'", "'\"ws\"'", "'\"wss\"'", "'\"stomp\"'", "'\"stomps\"'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
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


        public InternalAsyncApiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAsyncApiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAsyncApiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAsyncApi.g"; }



     	private AsyncApiGrammarAccess grammarAccess;

        public InternalAsyncApiParser(TokenStream input, AsyncApiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AsyncAPI";
       	}

       	@Override
       	protected AsyncApiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAsyncAPI"
    // InternalAsyncApi.g:65:1: entryRuleAsyncAPI returns [EObject current=null] : iv_ruleAsyncAPI= ruleAsyncAPI EOF ;
    public final EObject entryRuleAsyncAPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsyncAPI = null;


        try {
            // InternalAsyncApi.g:65:49: (iv_ruleAsyncAPI= ruleAsyncAPI EOF )
            // InternalAsyncApi.g:66:2: iv_ruleAsyncAPI= ruleAsyncAPI EOF
            {
             newCompositeNode(grammarAccess.getAsyncAPIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsyncAPI=ruleAsyncAPI();

            state._fsp--;

             current =iv_ruleAsyncAPI; 
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
    // $ANTLR end "entryRuleAsyncAPI"


    // $ANTLR start "ruleAsyncAPI"
    // InternalAsyncApi.g:72:1: ruleAsyncAPI returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) ;
    public final EObject ruleAsyncAPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_version_5_0 = null;

        EObject lv_info_9_0 = null;

        EObject lv_servers_14_0 = null;

        EObject lv_servers_16_0 = null;

        EObject lv_topics_22_0 = null;

        EObject lv_topics_24_0 = null;

        EObject lv_components_29_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:78:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) )
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            {
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            // InternalAsyncApi.g:80:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}'
            {
            // InternalAsyncApi.g:80:3: ()
            // InternalAsyncApi.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAsyncAPIAccess().getAsyncAPIAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:91:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:93:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:96:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=6;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4) ) {
                    alt8=5;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAsyncApi.g:98:4: ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:98:4: ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:99:5: {...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:99:105: ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:100:6: ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:103:9: ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:103:10: {...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:103:19: (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:103:20: otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getAsyncAPIAccess().getAsyncapiKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_5); 

            	    									newLeafNode(otherlv_4, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:111:9: ( (lv_version_5_0= ruleVersionNumber ) )
            	    // InternalAsyncApi.g:112:10: (lv_version_5_0= ruleVersionNumber )
            	    {
            	    // InternalAsyncApi.g:112:10: (lv_version_5_0= ruleVersionNumber )
            	    // InternalAsyncApi.g:113:11: lv_version_5_0= ruleVersionNumber
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getVersionVersionNumberEnumRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_version_5_0=ruleVersionNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"version",
            	    												lv_version_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.VersionNumber");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:130:9: (otherlv_6= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==14) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalAsyncApi.g:131:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_6, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:143:5: {...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:143:105: ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:144:6: ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:147:9: ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:147:10: {...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:147:19: (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:147:20: otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAsyncAPIAccess().getInfoKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:155:9: ( (lv_info_9_0= ruleInfo ) )
            	    // InternalAsyncApi.g:156:10: (lv_info_9_0= ruleInfo )
            	    {
            	    // InternalAsyncApi.g:156:10: (lv_info_9_0= ruleInfo )
            	    // InternalAsyncApi.g:157:11: lv_info_9_0= ruleInfo
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getInfoInfoParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_info_9_0=ruleInfo();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"info",
            	    												lv_info_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Info");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:174:9: (otherlv_10= ',' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalAsyncApi.g:175:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_10, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:187:5: {...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:187:105: ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:188:6: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:191:9: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:191:10: {...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:191:19: (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:191:20: otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAsyncAPIAccess().getServersKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_2_1());
            	    								
            	    otherlv_13=(Token)match(input,17,FOLLOW_8); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAsyncAPIAccess().getLeftSquareBracketKeyword_2_2_2());
            	    								
            	    // InternalAsyncApi.g:203:9: ( (lv_servers_14_0= ruleServer ) )
            	    // InternalAsyncApi.g:204:10: (lv_servers_14_0= ruleServer )
            	    {
            	    // InternalAsyncApi.g:204:10: (lv_servers_14_0= ruleServer )
            	    // InternalAsyncApi.g:205:11: lv_servers_14_0= ruleServer
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getServersServerParserRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_servers_14_0=ruleServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"servers",
            	    												lv_servers_14_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Server");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:222:9: (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==14) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:223:10: otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:227:10: ( (lv_servers_16_0= ruleServer ) )
            	    	    // InternalAsyncApi.g:228:11: (lv_servers_16_0= ruleServer )
            	    	    {
            	    	    // InternalAsyncApi.g:228:11: (lv_servers_16_0= ruleServer )
            	    	    // InternalAsyncApi.g:229:12: lv_servers_16_0= ruleServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getServersServerParserRuleCall_2_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_servers_16_0=ruleServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"servers",
            	    	    													lv_servers_16_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Server");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,18,FOLLOW_6); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAsyncAPIAccess().getRightSquareBracketKeyword_2_2_5());
            	    								
            	    // InternalAsyncApi.g:251:9: (otherlv_18= ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalAsyncApi.g:252:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_18, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_2_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:264:5: {...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:264:105: ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:265:6: ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:268:9: ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:268:10: {...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:268:19: (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:268:20: otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getAsyncAPIAccess().getTopicsKeyword_2_3_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_21=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:280:9: ( (lv_topics_22_0= ruleTopic ) )
            	    // InternalAsyncApi.g:281:10: (lv_topics_22_0= ruleTopic )
            	    {
            	    // InternalAsyncApi.g:281:10: (lv_topics_22_0= ruleTopic )
            	    // InternalAsyncApi.g:282:11: lv_topics_22_0= ruleTopic
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getTopicsTopicParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_topics_22_0=ruleTopic();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"topics",
            	    												lv_topics_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Topic");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:299:9: (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==14) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:300:10: otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:304:10: ( (lv_topics_24_0= ruleTopic ) )
            	    	    // InternalAsyncApi.g:305:11: (lv_topics_24_0= ruleTopic )
            	    	    {
            	    	    // InternalAsyncApi.g:305:11: (lv_topics_24_0= ruleTopic )
            	    	    // InternalAsyncApi.g:306:12: lv_topics_24_0= ruleTopic
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getTopicsTopicParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_topics_24_0=ruleTopic();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"topics",
            	    	    													lv_topics_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Topic");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,20,FOLLOW_6); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:328:9: (otherlv_26= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==14) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAsyncApi.g:329:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_26, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:340:4: ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:340:4: ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:341:5: {...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:341:105: ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:342:6: ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:345:9: ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:345:10: {...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:345:19: (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:345:20: otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,21,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getAsyncAPIAccess().getComponentsKeyword_2_4_0());
            	    								
            	    otherlv_28=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_28, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:353:9: ( (lv_components_29_0= ruleComponents ) )
            	    // InternalAsyncApi.g:354:10: (lv_components_29_0= ruleComponents )
            	    {
            	    // InternalAsyncApi.g:354:10: (lv_components_29_0= ruleComponents )
            	    // InternalAsyncApi.g:355:11: lv_components_29_0= ruleComponents
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getComponentsComponentsParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_components_29_0=ruleComponents();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"components",
            	    												lv_components_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Components");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:372:9: (otherlv_30= ',' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==14) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAsyncApi.g:373:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_30, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canLeave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				

            }

            otherlv_31=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAsyncAPI"


    // $ANTLR start "entryRuleInfo"
    // InternalAsyncApi.g:400:1: entryRuleInfo returns [EObject current=null] : iv_ruleInfo= ruleInfo EOF ;
    public final EObject entryRuleInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfo = null;


        try {
            // InternalAsyncApi.g:400:45: (iv_ruleInfo= ruleInfo EOF )
            // InternalAsyncApi.g:401:2: iv_ruleInfo= ruleInfo EOF
            {
             newCompositeNode(grammarAccess.getInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfo=ruleInfo();

            state._fsp--;

             current =iv_ruleInfo; 
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
    // $ANTLR end "entryRuleInfo"


    // $ANTLR start "ruleInfo"
    // InternalAsyncApi.g:407:1: ruleInfo returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) ;
    public final EObject ruleInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_version_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_termsOfService_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_contact_21_0 = null;

        EObject lv_license_25_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:413:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:414:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:414:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:415:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:415:3: ()
            // InternalAsyncApi.g:416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfoAccess().getInfoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:426:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:427:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:427:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:428:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:431:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:432:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:432:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=7;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
                    alt15=4;
                }
                else if ( LA15_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
                    alt15=6;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAsyncApi.g:433:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:433:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:434:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:434:101: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:435:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:438:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:438:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:438:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:438:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getInfoAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getInfoAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:446:9: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:447:10: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:447:10: (lv_title_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:448:11: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_title_5_0, grammarAccess.getInfoAccess().getTitleSTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getInfoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:464:9: (otherlv_6= ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==14) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalAsyncApi.g:465:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_15); 

            	            										newLeafNode(otherlv_6, grammarAccess.getInfoAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:476:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:476:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:477:5: {...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:477:101: ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:478:6: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:481:9: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:481:10: {...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:481:19: (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:481:20: otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getInfoAccess().getVersionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getInfoAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:489:9: ( (lv_version_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:490:10: (lv_version_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:490:10: (lv_version_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:491:11: lv_version_9_0= RULE_STRING
            	    {
            	    lv_version_9_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_version_9_0, grammarAccess.getInfoAccess().getVersionSTRINGTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getInfoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"version",
            	    												lv_version_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:507:9: (otherlv_10= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==14) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAsyncApi.g:508:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_15); 

            	            										newLeafNode(otherlv_10, grammarAccess.getInfoAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:519:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:519:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:520:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:520:101: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:521:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:524:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:524:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:524:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:524:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getInfoAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getInfoAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:532:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:533:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:533:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:534:11: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_description_13_0, grammarAccess.getInfoAccess().getDescriptionSTRINGTerminalRuleCall_2_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getInfoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:550:9: (otherlv_14= ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==14) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAsyncApi.g:551:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,14,FOLLOW_15); 

            	            										newLeafNode(otherlv_14, grammarAccess.getInfoAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:562:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:562:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:563:5: {...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:563:101: ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:564:6: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:567:9: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:567:10: {...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:567:19: (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:567:20: otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getInfoAccess().getTermsOfServiceKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_16, grammarAccess.getInfoAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:575:9: ( (lv_termsOfService_17_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:576:10: (lv_termsOfService_17_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:576:10: (lv_termsOfService_17_0= RULE_STRING )
            	    // InternalAsyncApi.g:577:11: lv_termsOfService_17_0= RULE_STRING
            	    {
            	    lv_termsOfService_17_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    											newLeafNode(lv_termsOfService_17_0, grammarAccess.getInfoAccess().getTermsOfServiceSTRINGTerminalRuleCall_2_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getInfoRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"termsOfService",
            	    												lv_termsOfService_17_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:593:9: (otherlv_18= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==14) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAsyncApi.g:594:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_15); 

            	            										newLeafNode(otherlv_18, grammarAccess.getInfoAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:605:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:605:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:606:5: {...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:606:101: ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:607:6: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:610:9: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:610:10: {...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:610:19: (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:610:20: otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getInfoAccess().getContactKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getInfoAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:618:9: ( (lv_contact_21_0= ruleContact ) )
            	    // InternalAsyncApi.g:619:10: (lv_contact_21_0= ruleContact )
            	    {
            	    // InternalAsyncApi.g:619:10: (lv_contact_21_0= ruleContact )
            	    // InternalAsyncApi.g:620:11: lv_contact_21_0= ruleContact
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getContactContactParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_contact_21_0=ruleContact();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"contact",
            	    												lv_contact_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Contact");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:637:9: (otherlv_22= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==14) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAsyncApi.g:638:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,14,FOLLOW_15); 

            	            										newLeafNode(otherlv_22, grammarAccess.getInfoAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:649:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:649:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:650:5: {...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:650:101: ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:651:6: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:654:9: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:654:10: {...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:654:19: (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:654:20: otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,27,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getInfoAccess().getLicenseKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getInfoAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:662:9: ( (lv_license_25_0= ruleLicense ) )
            	    // InternalAsyncApi.g:663:10: (lv_license_25_0= ruleLicense )
            	    {
            	    // InternalAsyncApi.g:663:10: (lv_license_25_0= ruleLicense )
            	    // InternalAsyncApi.g:664:11: lv_license_25_0= ruleLicense
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getLicenseLicenseParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_license_25_0=ruleLicense();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"license",
            	    												lv_license_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.License");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:681:9: (otherlv_26= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==14) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAsyncApi.g:682:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,14,FOLLOW_15); 

            	            										newLeafNode(otherlv_26, grammarAccess.getInfoAccess().getCommaKeyword_2_5_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInfoAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canLeave(grammarAccess.getInfoAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				

            }

            otherlv_27=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getInfoAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleInfo"


    // $ANTLR start "entryRuleContact"
    // InternalAsyncApi.g:709:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalAsyncApi.g:709:48: (iv_ruleContact= ruleContact EOF )
            // InternalAsyncApi.g:710:2: iv_ruleContact= ruleContact EOF
            {
             newCompositeNode(grammarAccess.getContactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContact=ruleContact();

            state._fsp--;

             current =iv_ruleContact; 
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
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // InternalAsyncApi.g:716:1: ruleContact returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleContact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_url_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_email_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:722:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:723:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:723:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:724:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:724:3: ()
            // InternalAsyncApi.g:725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContactAccess().getContactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:735:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:736:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:736:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:737:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:740:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:741:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:741:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop19:
            do {
                int alt19=4;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
                    alt19=2;
                }
                else if ( LA19_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
                    alt19=3;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAsyncApi.g:742:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:742:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:743:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:743:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:744:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:747:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:747:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:747:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:747:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getContactAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:755:9: ( (lv_name_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:756:10: (lv_name_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:756:10: (lv_name_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:757:11: lv_name_5_0= RULE_STRING
            	    {
            	    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_name_5_0, grammarAccess.getContactAccess().getNameSTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getContactRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:773:9: (otherlv_6= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==14) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAsyncApi.g:774:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_16); 

            	            										newLeafNode(otherlv_6, grammarAccess.getContactAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContactAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:785:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:785:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:786:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:786:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:787:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:790:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:790:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:790:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:790:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getContactAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getContactAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:798:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:799:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:799:10: (lv_url_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:800:11: lv_url_9_0= RULE_STRING
            	    {
            	    lv_url_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_url_9_0, grammarAccess.getContactAccess().getUrlSTRINGTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getContactRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:816:9: (otherlv_10= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==14) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAsyncApi.g:817:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_16); 

            	            										newLeafNode(otherlv_10, grammarAccess.getContactAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContactAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:828:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:828:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:829:5: {...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:829:104: ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:830:6: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:833:9: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:833:10: {...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:833:19: (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:833:20: otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getContactAccess().getEmailKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getContactAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:841:9: ( (lv_email_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:842:10: (lv_email_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:842:10: (lv_email_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:843:11: lv_email_13_0= RULE_STRING
            	    {
            	    lv_email_13_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_email_13_0, grammarAccess.getContactAccess().getEmailSTRINGTerminalRuleCall_2_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getContactRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"email",
            	    												lv_email_13_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:859:9: (otherlv_14= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==14) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalAsyncApi.g:860:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,14,FOLLOW_16); 

            	            										newLeafNode(otherlv_14, grammarAccess.getContactAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContactAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getContactAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleLicense"
    // InternalAsyncApi.g:886:1: entryRuleLicense returns [EObject current=null] : iv_ruleLicense= ruleLicense EOF ;
    public final EObject entryRuleLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicense = null;


        try {
            // InternalAsyncApi.g:886:48: (iv_ruleLicense= ruleLicense EOF )
            // InternalAsyncApi.g:887:2: iv_ruleLicense= ruleLicense EOF
            {
             newCompositeNode(grammarAccess.getLicenseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLicense=ruleLicense();

            state._fsp--;

             current =iv_ruleLicense; 
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
    // $ANTLR end "entryRuleLicense"


    // $ANTLR start "ruleLicense"
    // InternalAsyncApi.g:893:1: ruleLicense returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_url_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:899:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:900:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:900:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:901:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:901:3: ()
            // InternalAsyncApi.g:902:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLicenseAccess().getLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:912:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:913:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:913:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:914:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:917:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:918:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:918:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAsyncApi.g:919:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:919:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:920:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:920:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:921:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:924:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:924:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:924:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:924:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getLicenseAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:932:9: ( (lv_name_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:933:10: (lv_name_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:933:10: (lv_name_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:934:11: lv_name_5_0= RULE_STRING
            	    {
            	    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    											newLeafNode(lv_name_5_0, grammarAccess.getLicenseAccess().getNameSTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getLicenseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:950:9: (otherlv_6= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==14) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalAsyncApi.g:951:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_18); 

            	            										newLeafNode(otherlv_6, grammarAccess.getLicenseAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:962:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:962:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:963:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:963:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:964:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:967:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:967:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:967:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:967:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getLicenseAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:975:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:976:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:976:10: (lv_url_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:977:11: lv_url_9_0= RULE_STRING
            	    {
            	    lv_url_9_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    											newLeafNode(lv_url_9_0, grammarAccess.getLicenseAccess().getUrlSTRINGTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getLicenseRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:993:9: (otherlv_10= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==14) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAsyncApi.g:994:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_18); 

            	            										newLeafNode(otherlv_10, grammarAccess.getLicenseAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLicenseAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLicense"


    // $ANTLR start "entryRuleServer"
    // InternalAsyncApi.g:1020:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalAsyncApi.g:1020:47: (iv_ruleServer= ruleServer EOF )
            // InternalAsyncApi.g:1021:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalAsyncApi.g:1027:1: ruleServer returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Enumerator lv_scheme_9_0 = null;

        EObject lv_variables_18_0 = null;

        EObject lv_variables_20_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1033:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' ) )
            // InternalAsyncApi.g:1034:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' )
            {
            // InternalAsyncApi.g:1034:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' )
            // InternalAsyncApi.g:1035:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}'
            {
            // InternalAsyncApi.g:1035:3: ()
            // InternalAsyncApi.g:1036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerAccess().getServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1046:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:1047:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:1047:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:1048:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServerAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1051:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:1052:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:1052:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=5;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2) ) {
                    alt27=3;
                }
                else if ( LA27_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3) ) {
                    alt27=4;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAsyncApi.g:1053:4: ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1053:4: ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1054:5: {...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1054:103: ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1055:6: ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1058:9: ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1058:10: {...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1058:19: (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1058:20: otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getServerAccess().getUrlKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getServerAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1066:9: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1067:10: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1067:10: (lv_title_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:1068:11: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    											newLeafNode(lv_title_5_0, grammarAccess.getServerAccess().getTitleSTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getServerRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1084:9: (otherlv_6= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==14) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalAsyncApi.g:1085:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_22); 

            	            										newLeafNode(otherlv_6, grammarAccess.getServerAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1096:4: ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1096:4: ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1097:5: {...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1097:103: ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1098:6: ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1101:9: ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1101:10: {...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1101:19: (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1101:20: otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getServerAccess().getSchemeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_23); 

            	    									newLeafNode(otherlv_8, grammarAccess.getServerAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1109:9: ( (lv_scheme_9_0= ruleScheme ) )
            	    // InternalAsyncApi.g:1110:10: (lv_scheme_9_0= ruleScheme )
            	    {
            	    // InternalAsyncApi.g:1110:10: (lv_scheme_9_0= ruleScheme )
            	    // InternalAsyncApi.g:1111:11: lv_scheme_9_0= ruleScheme
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getSchemeSchemeEnumRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_scheme_9_0=ruleScheme();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"scheme",
            	    												lv_scheme_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Scheme");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1128:9: (otherlv_10= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==14) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalAsyncApi.g:1129:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_22); 

            	            										newLeafNode(otherlv_10, grammarAccess.getServerAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1140:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1140:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) )
            	    // InternalAsyncApi.g:1141:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:1141:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) )
            	    // InternalAsyncApi.g:1142:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:1145:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) )
            	    // InternalAsyncApi.g:1145:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1145:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' )
            	    // InternalAsyncApi.g:1145:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ','
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getServerAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getServerAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:1153:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1154:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1154:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:1155:11: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            	    											newLeafNode(lv_description_13_0, grammarAccess.getServerAccess().getDescriptionSTRINGTerminalRuleCall_2_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getServerRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_14=(Token)match(input,14,FOLLOW_22); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServerAccess().getCommaKeyword_2_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:1181:4: ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1181:4: ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1182:5: {...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:1182:103: ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:1183:6: ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:1186:9: ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:1186:10: {...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1186:19: (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:1186:20: otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,32,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getServerAccess().getVariablesKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServerAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_17=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_17, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:1198:9: ( (lv_variables_18_0= ruleVariable ) )
            	    // InternalAsyncApi.g:1199:10: (lv_variables_18_0= ruleVariable )
            	    {
            	    // InternalAsyncApi.g:1199:10: (lv_variables_18_0= ruleVariable )
            	    // InternalAsyncApi.g:1200:11: lv_variables_18_0= ruleVariable
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getVariablesVariableParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_variables_18_0=ruleVariable();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											add(
            	    												current,
            	    												"variables",
            	    												lv_variables_18_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Variable");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1217:9: (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==14) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1218:10: otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getServerAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1222:10: ( (lv_variables_20_0= ruleVariable ) )
            	    	    // InternalAsyncApi.g:1223:11: (lv_variables_20_0= ruleVariable )
            	    	    {
            	    	    // InternalAsyncApi.g:1223:11: (lv_variables_20_0= ruleVariable )
            	    	    // InternalAsyncApi.g:1224:12: lv_variables_20_0= ruleVariable
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServerAccess().getVariablesVariableParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_variables_20_0=ruleVariable();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServerRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"variables",
            	    	    													lv_variables_20_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Variable");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,20,FOLLOW_21); 

            	    									newLeafNode(otherlv_21, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:1246:9: (otherlv_22= ',' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==14) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalAsyncApi.g:1247:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,14,FOLLOW_22); 

            	            										newLeafNode(otherlv_22, grammarAccess.getServerAccess().getCommaKeyword_2_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getServerAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canLeave(grammarAccess.getServerAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getServerAccess().getUnorderedGroup_2());
            				

            }

            otherlv_23=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleVariable"
    // InternalAsyncApi.g:1274:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAsyncApi.g:1274:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAsyncApi.g:1275:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAsyncApi.g:1281:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_default_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_enum_16_0=null;
        Token otherlv_17=null;
        Token lv_enum_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:1287:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalAsyncApi.g:1288:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalAsyncApi.g:1288:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalAsyncApi.g:1289:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalAsyncApi.g:1289:3: ()
            // InternalAsyncApi.g:1290:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1296:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:1297:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:1297:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:1298:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1322:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1323:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1323:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1324:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1327:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1328:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1328:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAsyncApi.g:1329:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1329:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1330:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1330:105: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1331:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1334:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1334:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1334:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1334:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1342:9: ( (lv_description_7_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1343:10: (lv_description_7_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1343:10: (lv_description_7_0= RULE_STRING )
            	    // InternalAsyncApi.g:1344:11: lv_description_7_0= RULE_STRING
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    											newLeafNode(lv_description_7_0, grammarAccess.getVariableAccess().getDescriptionSTRINGTerminalRuleCall_4_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVariableRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1360:9: (otherlv_8= ',' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==14) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalAsyncApi.g:1361:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_25); 

            	            										newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1372:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1372:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1373:5: {...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1373:105: ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1374:6: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1377:9: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1377:10: {...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1377:19: (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1377:20: otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getDefaultKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1385:9: ( (lv_default_11_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1386:10: (lv_default_11_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1386:10: (lv_default_11_0= RULE_STRING )
            	    // InternalAsyncApi.g:1387:11: lv_default_11_0= RULE_STRING
            	    {
            	    lv_default_11_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    											newLeafNode(lv_default_11_0, grammarAccess.getVariableAccess().getDefaultSTRINGTerminalRuleCall_4_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVariableRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"default",
            	    												lv_default_11_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1403:9: (otherlv_12= ',' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==14) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalAsyncApi.g:1404:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,14,FOLLOW_25); 

            	            										newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1415:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1415:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1416:5: {...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1416:105: ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:1417:6: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1420:9: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:1420:10: {...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1420:19: (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:1420:20: otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getEnumKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getColonKeyword_4_2_1());
            	    								
            	    otherlv_15=(Token)match(input,17,FOLLOW_11); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_4_2_2());
            	    								
            	    // InternalAsyncApi.g:1432:9: ( (lv_enum_16_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1433:10: (lv_enum_16_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1433:10: (lv_enum_16_0= RULE_STRING )
            	    // InternalAsyncApi.g:1434:11: lv_enum_16_0= RULE_STRING
            	    {
            	    lv_enum_16_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_enum_16_0, grammarAccess.getVariableAccess().getEnumSTRINGTerminalRuleCall_4_2_3_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getVariableRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"enum",
            	    												lv_enum_16_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1450:9: (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==14) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1451:10: otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getCommaKeyword_4_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1455:10: ( (lv_enum_18_0= RULE_STRING ) )
            	    	    // InternalAsyncApi.g:1456:11: (lv_enum_18_0= RULE_STRING )
            	    	    {
            	    	    // InternalAsyncApi.g:1456:11: (lv_enum_18_0= RULE_STRING )
            	    	    // InternalAsyncApi.g:1457:12: lv_enum_18_0= RULE_STRING
            	    	    {
            	    	    lv_enum_18_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    	    												newLeafNode(lv_enum_18_0, grammarAccess.getVariableAccess().getEnumSTRINGTerminalRuleCall_4_2_4_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getVariableRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_18_0,
            	    	    													"org.eclipse.xtext.common.Terminals.STRING");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,18,FOLLOW_26); 

            	    									newLeafNode(otherlv_19, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_4_2_5());
            	    								
            	    // InternalAsyncApi.g:1478:9: (otherlv_20= ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==14) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalAsyncApi.g:1479:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,14,FOLLOW_25); 

            	            										newLeafNode(otherlv_20, grammarAccess.getVariableAccess().getCommaKeyword_4_2_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				

            }

            otherlv_21=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTopic"
    // InternalAsyncApi.g:1505:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalAsyncApi.g:1505:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalAsyncApi.g:1506:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalAsyncApi.g:1512:1: ruleTopic returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_publish_7_0 = null;

        EObject lv_subscribe_11_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1518:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalAsyncApi.g:1519:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalAsyncApi.g:1519:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalAsyncApi.g:1520:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // InternalAsyncApi.g:1520:3: ()
            // InternalAsyncApi.g:1521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicAccess().getTopicAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1527:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:1528:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:1528:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:1529:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTopicAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1553:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1554:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1554:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1555:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTopicAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1558:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1559:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1559:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )*
            loop35:
            do {
                int alt35=3;
                int LA35_0 = input.LA(1);

                if ( LA35_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1) ) {
                    alt35=2;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAsyncApi.g:1560:4: ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1560:4: ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1561:5: {...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1561:102: ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1562:6: ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1565:9: ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1565:10: {...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "true");
            	    }
            	    // InternalAsyncApi.g:1565:19: (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1565:20: otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTopicAccess().getPublishKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1573:9: ( (lv_publish_7_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:1574:10: (lv_publish_7_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:1574:10: (lv_publish_7_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:1575:11: lv_publish_7_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getTopicAccess().getPublishAbstractMessageParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
            	    lv_publish_7_0=ruleAbstractMessage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTopicRule());
            	    											}
            	    											set(
            	    												current,
            	    												"publish",
            	    												lv_publish_7_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1592:9: (otherlv_8= ',' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==14) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalAsyncApi.g:1593:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_27); 

            	            										newLeafNode(otherlv_8, grammarAccess.getTopicAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTopicAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1604:4: ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1604:4: ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1605:5: {...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1605:102: ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1606:6: ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1609:9: ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1609:10: {...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "true");
            	    }
            	    // InternalAsyncApi.g:1609:19: (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1609:20: otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTopicAccess().getSubscribeKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTopicAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1617:9: ( (lv_subscribe_11_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:1618:10: (lv_subscribe_11_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:1618:10: (lv_subscribe_11_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:1619:11: lv_subscribe_11_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getTopicAccess().getSubscribeAbstractMessageParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
            	    lv_subscribe_11_0=ruleAbstractMessage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTopicRule());
            	    											}
            	    											set(
            	    												current,
            	    												"subscribe",
            	    												lv_subscribe_11_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1636:9: (otherlv_12= ',' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==14) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAsyncApi.g:1637:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,14,FOLLOW_27); 

            	            										newLeafNode(otherlv_12, grammarAccess.getTopicAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTopicAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTopicAccess().getUnorderedGroup_4());
            				

            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleAbstractMessage"
    // InternalAsyncApi.g:1663:1: entryRuleAbstractMessage returns [EObject current=null] : iv_ruleAbstractMessage= ruleAbstractMessage EOF ;
    public final EObject entryRuleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessage = null;


        try {
            // InternalAsyncApi.g:1663:56: (iv_ruleAbstractMessage= ruleAbstractMessage EOF )
            // InternalAsyncApi.g:1664:2: iv_ruleAbstractMessage= ruleAbstractMessage EOF
            {
             newCompositeNode(grammarAccess.getAbstractMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMessage=ruleAbstractMessage();

            state._fsp--;

             current =iv_ruleAbstractMessage; 
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
    // $ANTLR end "entryRuleAbstractMessage"


    // $ANTLR start "ruleAbstractMessage"
    // InternalAsyncApi.g:1670:1: ruleAbstractMessage returns [EObject current=null] : (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) ;
    public final EObject ruleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1676:2: ( (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) )
            // InternalAsyncApi.g:1677:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            {
            // InternalAsyncApi.g:1677:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==11) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==45) ) {
                    alt36=1;
                }
                else if ( (LA36_2==20||LA36_2==24||(LA36_2>=37 && LA36_2<=39)) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalAsyncApi.g:1678:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:1687:3: this_Message_1= ruleMessage
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageAccess().getMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_1=ruleMessage();

                    state._fsp--;


                    			current = this_Message_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAbstractMessage"


    // $ANTLR start "entryRuleMessage"
    // InternalAsyncApi.g:1699:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalAsyncApi.g:1699:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalAsyncApi.g:1700:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalAsyncApi.g:1706:1: ruleMessage returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_summary_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_headers_13_0 = null;

        EObject lv_payload_17_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1712:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' ) )
            // InternalAsyncApi.g:1713:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' )
            {
            // InternalAsyncApi.g:1713:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' )
            // InternalAsyncApi.g:1714:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}'
            {
            // InternalAsyncApi.g:1714:3: ()
            // InternalAsyncApi.g:1715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageAccess().getMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1725:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1726:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1726:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1727:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1730:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1731:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1731:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) )*
            loop41:
            do {
                int alt41=5;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
                    alt41=3;
                }
                else if ( LA41_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
                    alt41=4;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAsyncApi.g:1732:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1732:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1733:5: {...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1733:104: ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1734:6: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1737:9: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1737:10: {...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1737:19: (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1737:20: otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getSummaryKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1745:9: ( (lv_summary_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1746:10: (lv_summary_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1746:10: (lv_summary_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:1747:11: lv_summary_5_0= RULE_STRING
            	    {
            	    lv_summary_5_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    											newLeafNode(lv_summary_5_0, grammarAccess.getMessageAccess().getSummarySTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMessageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"summary",
            	    												lv_summary_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1763:9: (otherlv_6= ',' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==14) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalAsyncApi.g:1764:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_30); 

            	            										newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1775:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1775:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1776:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1776:104: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1777:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1780:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1780:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1780:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1780:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1788:9: ( (lv_description_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1789:10: (lv_description_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1789:10: (lv_description_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:1790:11: lv_description_9_0= RULE_STRING
            	    {
            	    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    											newLeafNode(lv_description_9_0, grammarAccess.getMessageAccess().getDescriptionSTRINGTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMessageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1806:9: (otherlv_10= ',' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==14) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalAsyncApi.g:1807:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_30); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1818:4: ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1818:4: ({...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1819:5: {...}? => ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:1819:104: ( ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:1820:6: ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:1823:9: ({...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:1823:10: {...}? => (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1823:19: (otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:1823:20: otherlv_11= '\"headers\"' otherlv_12= ':' ( (lv_headers_13_0= ruleAbstractSchema ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getHeadersKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:1831:9: ( (lv_headers_13_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:1832:10: (lv_headers_13_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:1832:10: (lv_headers_13_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:1833:11: lv_headers_13_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getHeadersAbstractSchemaParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_headers_13_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"headers",
            	    												lv_headers_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1850:9: (otherlv_14= ',' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==14) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalAsyncApi.g:1851:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,14,FOLLOW_30); 

            	            										newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:1862:4: ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1862:4: ({...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1863:5: {...}? => ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:1863:104: ( ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:1864:6: ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:1867:9: ({...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:1867:10: {...}? => (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1867:19: (otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:1867:20: otherlv_15= '\"payload\"' otherlv_16= ':' ( (lv_payload_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getPayloadKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:1875:9: ( (lv_payload_17_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:1876:10: (lv_payload_17_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:1876:10: (lv_payload_17_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:1877:11: lv_payload_17_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getPayloadAbstractSchemaParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_payload_17_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"payload",
            	    												lv_payload_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1894:9: (otherlv_18= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==14) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAsyncApi.g:1895:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_30); 

            	            										newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				

            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleNamedMessage"
    // InternalAsyncApi.g:1921:1: entryRuleNamedMessage returns [EObject current=null] : iv_ruleNamedMessage= ruleNamedMessage EOF ;
    public final EObject entryRuleNamedMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessage = null;


        try {
            // InternalAsyncApi.g:1921:53: (iv_ruleNamedMessage= ruleNamedMessage EOF )
            // InternalAsyncApi.g:1922:2: iv_ruleNamedMessage= ruleNamedMessage EOF
            {
             newCompositeNode(grammarAccess.getNamedMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedMessage=ruleNamedMessage();

            state._fsp--;

             current =iv_ruleNamedMessage; 
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
    // $ANTLR end "entryRuleNamedMessage"


    // $ANTLR start "ruleNamedMessage"
    // InternalAsyncApi.g:1928:1: ruleNamedMessage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) ;
    public final EObject ruleNamedMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1934:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) )
            // InternalAsyncApi.g:1935:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            {
            // InternalAsyncApi.g:1935:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            // InternalAsyncApi.g:1936:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) )
            {
            // InternalAsyncApi.g:1936:3: ()
            // InternalAsyncApi.g:1937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageAccess().getNamedMessageAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1943:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:1944:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:1944:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:1945:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNamedMessageAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedMessageAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:1965:3: ( (lv_message_3_0= ruleAbstractMessage ) )
            // InternalAsyncApi.g:1966:4: (lv_message_3_0= ruleAbstractMessage )
            {
            // InternalAsyncApi.g:1966:4: (lv_message_3_0= ruleAbstractMessage )
            // InternalAsyncApi.g:1967:5: lv_message_3_0= ruleAbstractMessage
            {

            					newCompositeNode(grammarAccess.getNamedMessageAccess().getMessageAbstractMessageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_message_3_0=ruleAbstractMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleNamedMessage"


    // $ANTLR start "entryRuleAbstractSchema"
    // InternalAsyncApi.g:1988:1: entryRuleAbstractSchema returns [EObject current=null] : iv_ruleAbstractSchema= ruleAbstractSchema EOF ;
    public final EObject entryRuleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSchema = null;


        try {
            // InternalAsyncApi.g:1988:55: (iv_ruleAbstractSchema= ruleAbstractSchema EOF )
            // InternalAsyncApi.g:1989:2: iv_ruleAbstractSchema= ruleAbstractSchema EOF
            {
             newCompositeNode(grammarAccess.getAbstractSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSchema=ruleAbstractSchema();

            state._fsp--;

             current =iv_ruleAbstractSchema; 
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
    // $ANTLR end "entryRuleAbstractSchema"


    // $ANTLR start "ruleAbstractSchema"
    // InternalAsyncApi.g:1995:1: ruleAbstractSchema returns [EObject current=null] : (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) ;
    public final EObject ruleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Schema_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2001:2: ( (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) )
            // InternalAsyncApi.g:2002:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            {
            // InternalAsyncApi.g:2002:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            else if ( (LA42_0==11) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==45) ) {
                    alt42=1;
                }
                else if ( (LA42_2==20||LA42_2==22||LA42_2==24||(LA42_2>=33 && LA42_2<=34)||(LA42_2>=39 && LA42_2<=42)) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAsyncApi.g:2003:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractSchemaAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:2012:3: this_Schema_1= ruleSchema
                    {

                    			newCompositeNode(grammarAccess.getAbstractSchemaAccess().getSchemaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Schema_1=ruleSchema();

                    state._fsp--;


                    			current = this_Schema_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAbstractSchema"


    // $ANTLR start "entryRuleSchema"
    // InternalAsyncApi.g:2024:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalAsyncApi.g:2024:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalAsyncApi.g:2025:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalAsyncApi.g:2031:1: ruleSchema returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_title_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_type_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_format_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_default_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token lv_enum_38_0=null;
        Token otherlv_39=null;
        Token lv_enum_40_0=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        EObject lv_payload_25_0 = null;

        EObject lv_properties_30_0 = null;

        EObject lv_properties_32_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2037:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' ) )
            // InternalAsyncApi.g:2038:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' )
            {
            // InternalAsyncApi.g:2038:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' )
            // InternalAsyncApi.g:2039:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}'
            {
            // InternalAsyncApi.g:2039:3: ()
            // InternalAsyncApi.g:2040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2050:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2051:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2051:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2052:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2055:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2056:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2056:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )*
            loop53:
            do {
                int alt53=9;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalAsyncApi.g:2057:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2057:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2058:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2058:103: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2059:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2062:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2062:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2062:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2062:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2070:9: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2071:10: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2071:10: (lv_title_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:2072:11: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    											newLeafNode(lv_title_5_0, grammarAccess.getSchemaAccess().getTitleSTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2088:9: (otherlv_6= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==14) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalAsyncApi.g:2089:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_6, grammarAccess.getSchemaAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2100:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2100:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2101:5: {...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2101:103: ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2102:6: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2105:9: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2105:10: {...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2105:19: (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2105:20: otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getTypeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2113:9: ( (lv_type_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2114:10: (lv_type_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2114:10: (lv_type_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:2115:11: lv_type_9_0= RULE_STRING
            	    {
            	    lv_type_9_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    											newLeafNode(lv_type_9_0, grammarAccess.getSchemaAccess().getTypeSTRINGTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"type",
            	    												lv_type_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2131:9: (otherlv_10= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==14) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalAsyncApi.g:2132:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_10, grammarAccess.getSchemaAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:2143:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2143:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2144:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:2144:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:2145:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:2148:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:2148:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2148:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:2148:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getSchemaAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2156:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2157:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2157:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:2158:11: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    											newLeafNode(lv_description_13_0, grammarAccess.getSchemaAccess().getDescriptionSTRINGTerminalRuleCall_2_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2174:9: (otherlv_14= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==14) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalAsyncApi.g:2175:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_14, grammarAccess.getSchemaAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:2186:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2186:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2187:5: {...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2187:103: ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2188:6: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2191:9: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2191:10: {...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2191:19: (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2191:20: otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getSchemaAccess().getFormatKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_16, grammarAccess.getSchemaAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2199:9: ( (lv_format_17_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2200:10: (lv_format_17_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2200:10: (lv_format_17_0= RULE_STRING )
            	    // InternalAsyncApi.g:2201:11: lv_format_17_0= RULE_STRING
            	    {
            	    lv_format_17_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    											newLeafNode(lv_format_17_0, grammarAccess.getSchemaAccess().getFormatSTRINGTerminalRuleCall_2_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"format",
            	    												lv_format_17_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2217:9: (otherlv_18= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==14) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalAsyncApi.g:2218:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_18, grammarAccess.getSchemaAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:2229:4: ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2229:4: ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2230:5: {...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2230:103: ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:2231:6: ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2234:9: ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:2234:10: {...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2234:19: (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:2234:20: otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getSchemaAccess().getDefaultKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_20, grammarAccess.getSchemaAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:2242:9: ( (lv_default_21_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2243:10: (lv_default_21_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2243:10: (lv_default_21_0= RULE_STRING )
            	    // InternalAsyncApi.g:2244:11: lv_default_21_0= RULE_STRING
            	    {
            	    lv_default_21_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

            	    											newLeafNode(lv_default_21_0, grammarAccess.getSchemaAccess().getDefaultSTRINGTerminalRuleCall_2_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"default",
            	    												lv_default_21_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2260:9: (otherlv_22= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==14) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalAsyncApi.g:2261:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_22, grammarAccess.getSchemaAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:2272:4: ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2272:4: ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2273:5: {...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:2273:103: ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2274:6: ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:2277:9: ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2277:10: {...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2277:19: (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2277:20: otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getSchemaAccess().getPayloadKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_24, grammarAccess.getSchemaAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:2285:9: ( (lv_payload_25_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2286:10: (lv_payload_25_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2286:10: (lv_payload_25_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2287:11: lv_payload_25_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPayloadAbstractSchemaParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
            	    lv_payload_25_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"payload",
            	    												lv_payload_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2304:9: (otherlv_26= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==14) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalAsyncApi.g:2305:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_26, grammarAccess.getSchemaAccess().getCommaKeyword_2_5_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAsyncApi.g:2316:4: ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2316:4: ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2317:5: {...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:2317:103: ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:2318:6: ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:2321:9: ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:2321:10: {...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2321:19: (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:2321:20: otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSchemaAccess().getPropertiesKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_28, grammarAccess.getSchemaAccess().getColonKeyword_2_6_1());
            	    								
            	    otherlv_29=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_29, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_6_2());
            	    								
            	    // InternalAsyncApi.g:2333:9: ( (lv_properties_30_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:2334:10: (lv_properties_30_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:2334:10: (lv_properties_30_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:2335:11: lv_properties_30_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_6_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_properties_30_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"properties",
            	    												lv_properties_30_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2352:9: (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==14) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2353:10: otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getSchemaAccess().getCommaKeyword_2_6_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2357:10: ( (lv_properties_32_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:2358:11: (lv_properties_32_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:2358:11: (lv_properties_32_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:2359:12: lv_properties_32_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_6_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_properties_32_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"properties",
            	    	    													lv_properties_32_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,20,FOLLOW_33); 

            	    									newLeafNode(otherlv_33, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_6_5());
            	    								
            	    // InternalAsyncApi.g:2381:9: (otherlv_34= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==14) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalAsyncApi.g:2382:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_34, grammarAccess.getSchemaAccess().getCommaKeyword_2_6_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAsyncApi.g:2393:4: ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2393:4: ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2394:5: {...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:2394:103: ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) )
            	    // InternalAsyncApi.g:2395:6: ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:2398:9: ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) )
            	    // InternalAsyncApi.g:2398:10: {...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2398:19: (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? )
            	    // InternalAsyncApi.g:2398:20: otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getSchemaAccess().getEnumKeyword_2_7_0());
            	    								
            	    otherlv_36=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_36, grammarAccess.getSchemaAccess().getColonKeyword_2_7_1());
            	    								
            	    otherlv_37=(Token)match(input,17,FOLLOW_11); 

            	    									newLeafNode(otherlv_37, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_7_2());
            	    								
            	    // InternalAsyncApi.g:2410:9: ( (lv_enum_38_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2411:10: (lv_enum_38_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2411:10: (lv_enum_38_0= RULE_STRING )
            	    // InternalAsyncApi.g:2412:11: lv_enum_38_0= RULE_STRING
            	    {
            	    lv_enum_38_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_enum_38_0, grammarAccess.getSchemaAccess().getEnumSTRINGTerminalRuleCall_2_7_3_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"enum",
            	    												lv_enum_38_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2428:9: (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==14) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2429:10: otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_39, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2433:10: ( (lv_enum_40_0= RULE_STRING ) )
            	    	    // InternalAsyncApi.g:2434:11: (lv_enum_40_0= RULE_STRING )
            	    	    {
            	    	    // InternalAsyncApi.g:2434:11: (lv_enum_40_0= RULE_STRING )
            	    	    // InternalAsyncApi.g:2435:12: lv_enum_40_0= RULE_STRING
            	    	    {
            	    	    lv_enum_40_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    	    												newLeafNode(lv_enum_40_0, grammarAccess.getSchemaAccess().getEnumSTRINGTerminalRuleCall_2_7_4_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_40_0,
            	    	    													"org.eclipse.xtext.common.Terminals.STRING");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    otherlv_41=(Token)match(input,18,FOLLOW_33); 

            	    									newLeafNode(otherlv_41, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_7_5());
            	    								
            	    // InternalAsyncApi.g:2456:9: (otherlv_42= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==14) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalAsyncApi.g:2457:10: otherlv_42= ','
            	            {
            	            otherlv_42=(Token)match(input,14,FOLLOW_32); 

            	            										newLeafNode(otherlv_42, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				

            }

            otherlv_43=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_43, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleNamedSchema"
    // InternalAsyncApi.g:2483:1: entryRuleNamedSchema returns [EObject current=null] : iv_ruleNamedSchema= ruleNamedSchema EOF ;
    public final EObject entryRuleNamedSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedSchema = null;


        try {
            // InternalAsyncApi.g:2483:52: (iv_ruleNamedSchema= ruleNamedSchema EOF )
            // InternalAsyncApi.g:2484:2: iv_ruleNamedSchema= ruleNamedSchema EOF
            {
             newCompositeNode(grammarAccess.getNamedSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedSchema=ruleNamedSchema();

            state._fsp--;

             current =iv_ruleNamedSchema; 
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
    // $ANTLR end "entryRuleNamedSchema"


    // $ANTLR start "ruleNamedSchema"
    // InternalAsyncApi.g:2490:1: ruleNamedSchema returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleNamedSchema() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_schema_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2496:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) )
            // InternalAsyncApi.g:2497:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            {
            // InternalAsyncApi.g:2497:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            // InternalAsyncApi.g:2498:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) )
            {
            // InternalAsyncApi.g:2498:3: ()
            // InternalAsyncApi.g:2499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedSchemaAccess().getNamedSchemaAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2505:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:2506:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:2506:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:2507:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNamedSchemaAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamedSchemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedSchemaAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:2527:3: ( (lv_schema_3_0= ruleAbstractSchema ) )
            // InternalAsyncApi.g:2528:4: (lv_schema_3_0= ruleAbstractSchema )
            {
            // InternalAsyncApi.g:2528:4: (lv_schema_3_0= ruleAbstractSchema )
            // InternalAsyncApi.g:2529:5: lv_schema_3_0= ruleAbstractSchema
            {

            					newCompositeNode(grammarAccess.getNamedSchemaAccess().getSchemaAbstractSchemaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_schema_3_0=ruleAbstractSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedSchemaRule());
            					}
            					set(
            						current,
            						"schema",
            						lv_schema_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleNamedSchema"


    // $ANTLR start "entryRuleComponents"
    // InternalAsyncApi.g:2550:1: entryRuleComponents returns [EObject current=null] : iv_ruleComponents= ruleComponents EOF ;
    public final EObject entryRuleComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponents = null;


        try {
            // InternalAsyncApi.g:2550:51: (iv_ruleComponents= ruleComponents EOF )
            // InternalAsyncApi.g:2551:2: iv_ruleComponents= ruleComponents EOF
            {
             newCompositeNode(grammarAccess.getComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponents=ruleComponents();

            state._fsp--;

             current =iv_ruleComponents; 
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
    // $ANTLR end "entryRuleComponents"


    // $ANTLR start "ruleComponents"
    // InternalAsyncApi.g:2557:1: ruleComponents returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' ) ;
    public final EObject ruleComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_schemas_6_0 = null;

        EObject lv_schemas_8_0 = null;

        EObject lv_messages_14_0 = null;

        EObject lv_messages_16_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2563:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' ) )
            // InternalAsyncApi.g:2564:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' )
            {
            // InternalAsyncApi.g:2564:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' )
            // InternalAsyncApi.g:2565:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}'
            {
            // InternalAsyncApi.g:2565:3: ()
            // InternalAsyncApi.g:2566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentsAccess().getComponentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2576:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2577:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2577:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2578:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2581:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2582:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2582:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )*
            loop58:
            do {
                int alt58=3;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
                    alt58=2;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAsyncApi.g:2583:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2583:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2584:5: {...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2584:107: ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2585:6: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2588:9: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2588:10: {...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:2588:19: (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2588:20: otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentsAccess().getSchemasKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentsAccess().getColonKeyword_2_0_1());
            	    								
            	    otherlv_5=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_5, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_0_2());
            	    								
            	    // InternalAsyncApi.g:2600:9: ( (lv_schemas_6_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:2601:10: (lv_schemas_6_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:2601:10: (lv_schemas_6_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:2602:11: lv_schemas_6_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getSchemasNamedSchemaParserRuleCall_2_0_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_schemas_6_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"schemas",
            	    												lv_schemas_6_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2619:9: (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==14) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2620:10: otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getComponentsAccess().getCommaKeyword_2_0_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2624:10: ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:2625:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:2625:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:2626:12: lv_schemas_8_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getSchemasNamedSchemaParserRuleCall_2_0_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_schemas_8_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"schemas",
            	    	    													lv_schemas_8_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,20,FOLLOW_35); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_0_5());
            	    								
            	    // InternalAsyncApi.g:2648:9: (otherlv_10= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==14) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalAsyncApi.g:2649:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_34); 

            	            										newLeafNode(otherlv_10, grammarAccess.getComponentsAccess().getCommaKeyword_2_0_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2660:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2660:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2661:5: {...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2661:107: ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2662:6: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2665:9: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2665:10: {...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:2665:19: (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2665:20: otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentsAccess().getMessagesKeyword_2_1_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentsAccess().getColonKeyword_2_1_1());
            	    								
            	    otherlv_13=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_1_2());
            	    								
            	    // InternalAsyncApi.g:2677:9: ( (lv_messages_14_0= ruleNamedMessage ) )
            	    // InternalAsyncApi.g:2678:10: (lv_messages_14_0= ruleNamedMessage )
            	    {
            	    // InternalAsyncApi.g:2678:10: (lv_messages_14_0= ruleNamedMessage )
            	    // InternalAsyncApi.g:2679:11: lv_messages_14_0= ruleNamedMessage
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getMessagesNamedMessageParserRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_messages_14_0=ruleNamedMessage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"messages",
            	    												lv_messages_14_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedMessage");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2696:9: (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==14) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2697:10: otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getComponentsAccess().getCommaKeyword_2_1_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2701:10: ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    // InternalAsyncApi.g:2702:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    {
            	    	    // InternalAsyncApi.g:2702:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    // InternalAsyncApi.g:2703:12: lv_messages_16_0= ruleNamedMessage
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getMessagesNamedMessageParserRuleCall_2_1_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_messages_16_0=ruleNamedMessage();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"messages",
            	    	    													lv_messages_16_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedMessage");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop56;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,20,FOLLOW_35); 

            	    									newLeafNode(otherlv_17, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_1_5());
            	    								
            	    // InternalAsyncApi.g:2725:9: (otherlv_18= ',' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==14) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalAsyncApi.g:2726:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_34); 

            	            										newLeafNode(otherlv_18, grammarAccess.getComponentsAccess().getCommaKeyword_2_1_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleComponents"


    // $ANTLR start "entryRuleReference"
    // InternalAsyncApi.g:2752:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAsyncApi.g:2752:50: (iv_ruleReference= ruleReference EOF )
            // InternalAsyncApi.g:2753:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalAsyncApi.g:2759:1: ruleReference returns [EObject current=null] : ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_refname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_uri_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:2765:2: ( ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalAsyncApi.g:2766:2: ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalAsyncApi.g:2766:2: ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalAsyncApi.g:2767:3: () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            // InternalAsyncApi.g:2767:3: ()
            // InternalAsyncApi.g:2768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2774:3: ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAsyncApi.g:2775:4: ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':'
                    {
                    // InternalAsyncApi.g:2775:4: ( (lv_refname_1_0= RULE_STRING ) )
                    // InternalAsyncApi.g:2776:5: (lv_refname_1_0= RULE_STRING )
                    {
                    // InternalAsyncApi.g:2776:5: (lv_refname_1_0= RULE_STRING )
                    // InternalAsyncApi.g:2777:6: lv_refname_1_0= RULE_STRING
                    {
                    lv_refname_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_refname_1_0, grammarAccess.getReferenceAccess().getRefnameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"refname",
                    							lv_refname_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_4=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getRefKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getColonKeyword_4());
            		
            // InternalAsyncApi.g:2810:3: ( (lv_uri_6_0= RULE_STRING ) )
            // InternalAsyncApi.g:2811:4: (lv_uri_6_0= RULE_STRING )
            {
            // InternalAsyncApi.g:2811:4: (lv_uri_6_0= RULE_STRING )
            // InternalAsyncApi.g:2812:5: lv_uri_6_0= RULE_STRING
            {
            lv_uri_6_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_uri_6_0, grammarAccess.getReferenceAccess().getUriSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"uri",
            						lv_uri_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "ruleVersionNumber"
    // InternalAsyncApi.g:2836:1: ruleVersionNumber returns [Enumerator current=null] : ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) ) ;
    public final Enumerator ruleVersionNumber() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:2842:2: ( ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) ) )
            // InternalAsyncApi.g:2843:2: ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) )
            {
            // InternalAsyncApi.g:2843:2: ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt60=1;
                }
                break;
            case 47:
                {
                alt60=2;
                }
                break;
            case 48:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalAsyncApi.g:2844:3: (enumLiteral_0= '\"1.0.0\"' )
                    {
                    // InternalAsyncApi.g:2844:3: (enumLiteral_0= '\"1.0.0\"' )
                    // InternalAsyncApi.g:2845:4: enumLiteral_0= '\"1.0.0\"'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVersionNumberAccess().get_100EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVersionNumberAccess().get_100EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:2852:3: (enumLiteral_1= '\"1.1.0\"' )
                    {
                    // InternalAsyncApi.g:2852:3: (enumLiteral_1= '\"1.1.0\"' )
                    // InternalAsyncApi.g:2853:4: enumLiteral_1= '\"1.1.0\"'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVersionNumberAccess().get_110EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVersionNumberAccess().get_110EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:2860:3: (enumLiteral_2= '\"1.2.0\"' )
                    {
                    // InternalAsyncApi.g:2860:3: (enumLiteral_2= '\"1.2.0\"' )
                    // InternalAsyncApi.g:2861:4: enumLiteral_2= '\"1.2.0\"'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVersionNumberAccess().get_120EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVersionNumberAccess().get_120EnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleVersionNumber"


    // $ANTLR start "ruleScheme"
    // InternalAsyncApi.g:2871:1: ruleScheme returns [Enumerator current=null] : ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) ;
    public final Enumerator ruleScheme() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:2877:2: ( ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) )
            // InternalAsyncApi.g:2878:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            {
            // InternalAsyncApi.g:2878:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            int alt61=8;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt61=1;
                }
                break;
            case 50:
                {
                alt61=2;
                }
                break;
            case 51:
                {
                alt61=3;
                }
                break;
            case 52:
                {
                alt61=4;
                }
                break;
            case 53:
                {
                alt61=5;
                }
                break;
            case 54:
                {
                alt61=6;
                }
                break;
            case 55:
                {
                alt61=7;
                }
                break;
            case 56:
                {
                alt61=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalAsyncApi.g:2879:3: (enumLiteral_0= '\"amqp\"' )
                    {
                    // InternalAsyncApi.g:2879:3: (enumLiteral_0= '\"amqp\"' )
                    // InternalAsyncApi.g:2880:4: enumLiteral_0= '\"amqp\"'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getAmqpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchemeAccess().getAmqpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:2887:3: (enumLiteral_1= '\"amqps\"' )
                    {
                    // InternalAsyncApi.g:2887:3: (enumLiteral_1= '\"amqps\"' )
                    // InternalAsyncApi.g:2888:4: enumLiteral_1= '\"amqps\"'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getAmqpsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchemeAccess().getAmqpsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:2895:3: (enumLiteral_2= '\"mqtt\"' )
                    {
                    // InternalAsyncApi.g:2895:3: (enumLiteral_2= '\"mqtt\"' )
                    // InternalAsyncApi.g:2896:4: enumLiteral_2= '\"mqtt\"'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getMqttEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSchemeAccess().getMqttEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:2903:3: (enumLiteral_3= '\"mqtts\"' )
                    {
                    // InternalAsyncApi.g:2903:3: (enumLiteral_3= '\"mqtts\"' )
                    // InternalAsyncApi.g:2904:4: enumLiteral_3= '\"mqtts\"'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getMqttsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSchemeAccess().getMqttsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:2911:3: (enumLiteral_4= '\"ws\"' )
                    {
                    // InternalAsyncApi.g:2911:3: (enumLiteral_4= '\"ws\"' )
                    // InternalAsyncApi.g:2912:4: enumLiteral_4= '\"ws\"'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getWsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSchemeAccess().getWsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:2919:3: (enumLiteral_5= '\"wss\"' )
                    {
                    // InternalAsyncApi.g:2919:3: (enumLiteral_5= '\"wss\"' )
                    // InternalAsyncApi.g:2920:4: enumLiteral_5= '\"wss\"'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getWssEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSchemeAccess().getWssEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:2927:3: (enumLiteral_6= '\"stomp\"' )
                    {
                    // InternalAsyncApi.g:2927:3: (enumLiteral_6= '\"stomp\"' )
                    // InternalAsyncApi.g:2928:4: enumLiteral_6= '\"stomp\"'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getStompEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSchemeAccess().getStompEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:2935:3: (enumLiteral_7= '\"stomps\"' )
                    {
                    // InternalAsyncApi.g:2935:3: (enumLiteral_7= '\"stomps\"' )
                    // InternalAsyncApi.g:2936:4: enumLiteral_7= '\"stomps\"'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getStompsEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSchemeAccess().getStompsEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleScheme"

    // Delegated rules


    protected DFA53 dfa53 = new DFA53(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\24\11\uffff";
    static final String dfa_3s = "\1\52\11\uffff";
    static final String dfa_4s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\1\4\10\uffff\1\6\1\11\4\uffff\1\7\1\3\1\5\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2056:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= RULE_STRING ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= RULE_STRING ) ) (otherlv_39= ',' ( (lv_enum_40_0= RULE_STRING ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==20) ) {s = 1;}

                        else if ( LA53_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA53_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA53_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA53_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA53_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA53_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA53_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA53_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000299000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000039D000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000399000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000FD04000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000FD00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000070100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000070104000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030104000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001A1000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001A1104000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001A1100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01FE000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000601100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000601104000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001800100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800104000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000E001100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000E001104000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000078601500000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000078601504000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000180000100000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000180000104000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000100000L});

}
