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
    // InternalAsyncApi.g:72:1: ruleAsyncAPI returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' ) ;
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
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Enumerator lv_version_5_0 = null;

        EObject lv_info_9_0 = null;

        EObject lv_servers_14_0 = null;

        EObject lv_servers_16_0 = null;

        EObject lv_topics_22_0 = null;

        EObject lv_topics_24_0 = null;

        EObject lv_components_30_0 = null;

        EObject lv_components_32_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:78:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' ) )
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' )
            {
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' )
            // InternalAsyncApi.g:80:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}'
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
            		
            // InternalAsyncApi.g:91:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:93:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:96:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=6;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
                    alt9=4;
                }
                else if ( LA9_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4) ) {
                    alt9=5;
                }


                switch (alt9) {
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
            	    // InternalAsyncApi.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:143:5: {...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:143:105: ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:144:6: ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:147:9: ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:147:10: {...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:147:19: (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:147:20: otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleAbstractInfo ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAsyncAPIAccess().getInfoKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:155:9: ( (lv_info_9_0= ruleAbstractInfo ) )
            	    // InternalAsyncApi.g:156:10: (lv_info_9_0= ruleAbstractInfo )
            	    {
            	    // InternalAsyncApi.g:156:10: (lv_info_9_0= ruleAbstractInfo )
            	    // InternalAsyncApi.g:157:11: lv_info_9_0= ruleAbstractInfo
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getInfoAbstractInfoParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_info_9_0=ruleAbstractInfo();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"info",
            	    												lv_info_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractInfo");
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
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:187:5: {...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:187:105: ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:188:6: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:191:9: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:191:10: {...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:191:19: (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:191:20: otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleAbstractServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAsyncAPIAccess().getServersKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_2_1());
            	    								
            	    otherlv_13=(Token)match(input,17,FOLLOW_8); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAsyncAPIAccess().getLeftSquareBracketKeyword_2_2_2());
            	    								
            	    // InternalAsyncApi.g:203:9: ( (lv_servers_14_0= ruleAbstractServer ) )
            	    // InternalAsyncApi.g:204:10: (lv_servers_14_0= ruleAbstractServer )
            	    {
            	    // InternalAsyncApi.g:204:10: (lv_servers_14_0= ruleAbstractServer )
            	    // InternalAsyncApi.g:205:11: lv_servers_14_0= ruleAbstractServer
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getServersAbstractServerParserRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_servers_14_0=ruleAbstractServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"servers",
            	    												lv_servers_14_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:222:9: (otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==14) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:223:10: otherlv_15= ',' ( (lv_servers_16_0= ruleAbstractServer ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:227:10: ( (lv_servers_16_0= ruleAbstractServer ) )
            	    	    // InternalAsyncApi.g:228:11: (lv_servers_16_0= ruleAbstractServer )
            	    	    {
            	    	    // InternalAsyncApi.g:228:11: (lv_servers_16_0= ruleAbstractServer )
            	    	    // InternalAsyncApi.g:229:12: lv_servers_16_0= ruleAbstractServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getServersAbstractServerParserRuleCall_2_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_servers_16_0=ruleAbstractServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"servers",
            	    	    													lv_servers_16_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractServer");
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
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:264:5: {...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:264:105: ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:265:6: ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:268:9: ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:268:10: {...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:268:19: (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:268:20: otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleAbstractTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getAsyncAPIAccess().getTopicsKeyword_2_3_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_20, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_21=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:280:9: ( (lv_topics_22_0= ruleAbstractTopic ) )
            	    // InternalAsyncApi.g:281:10: (lv_topics_22_0= ruleAbstractTopic )
            	    {
            	    // InternalAsyncApi.g:281:10: (lv_topics_22_0= ruleAbstractTopic )
            	    // InternalAsyncApi.g:282:11: lv_topics_22_0= ruleAbstractTopic
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getTopicsAbstractTopicParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_topics_22_0=ruleAbstractTopic();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"topics",
            	    												lv_topics_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractTopic");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:299:9: (otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==14) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:300:10: otherlv_23= ',' ( (lv_topics_24_0= ruleAbstractTopic ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:304:10: ( (lv_topics_24_0= ruleAbstractTopic ) )
            	    	    // InternalAsyncApi.g:305:11: (lv_topics_24_0= ruleAbstractTopic )
            	    	    {
            	    	    // InternalAsyncApi.g:305:11: (lv_topics_24_0= ruleAbstractTopic )
            	    	    // InternalAsyncApi.g:306:12: lv_topics_24_0= ruleAbstractTopic
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getTopicsAbstractTopicParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_topics_24_0=ruleAbstractTopic();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"topics",
            	    	    													lv_topics_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractTopic");
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
            	    // InternalAsyncApi.g:340:4: ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:340:4: ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:341:5: {...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:341:105: ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:342:6: ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:345:9: ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:345:10: {...}? => (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:345:19: (otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:345:20: otherlv_27= '\"components\"' otherlv_28= ':' otherlv_29= '{' ( (lv_components_30_0= ruleAbstractComponent ) ) (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )* otherlv_33= '}' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,21,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getAsyncAPIAccess().getComponentsKeyword_2_4_0());
            	    								
            	    otherlv_28=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_28, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_29=(Token)match(input,11,FOLLOW_13); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:357:9: ( (lv_components_30_0= ruleAbstractComponent ) )
            	    // InternalAsyncApi.g:358:10: (lv_components_30_0= ruleAbstractComponent )
            	    {
            	    // InternalAsyncApi.g:358:10: (lv_components_30_0= ruleAbstractComponent )
            	    // InternalAsyncApi.g:359:11: lv_components_30_0= ruleAbstractComponent
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getComponentsAbstractComponentParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_components_30_0=ruleAbstractComponent();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"components",
            	    												lv_components_30_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractComponent");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:376:9: (otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==14) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:377:10: otherlv_31= ',' ( (lv_components_32_0= ruleAbstractComponent ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,14,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:381:10: ( (lv_components_32_0= ruleAbstractComponent ) )
            	    	    // InternalAsyncApi.g:382:11: (lv_components_32_0= ruleAbstractComponent )
            	    	    {
            	    	    // InternalAsyncApi.g:382:11: (lv_components_32_0= ruleAbstractComponent )
            	    	    // InternalAsyncApi.g:383:12: lv_components_32_0= ruleAbstractComponent
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getComponentsAbstractComponentParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_components_32_0=ruleAbstractComponent();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"components",
            	    	    													lv_components_32_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractComponent");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,20,FOLLOW_6); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:405:9: (otherlv_34= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==14) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAsyncApi.g:406:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_34, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_4_6());
            	            									

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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canLeave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				

            }

            otherlv_35=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleAbstractInfo"
    // InternalAsyncApi.g:433:1: entryRuleAbstractInfo returns [EObject current=null] : iv_ruleAbstractInfo= ruleAbstractInfo EOF ;
    public final EObject entryRuleAbstractInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractInfo = null;


        try {
            // InternalAsyncApi.g:433:53: (iv_ruleAbstractInfo= ruleAbstractInfo EOF )
            // InternalAsyncApi.g:434:2: iv_ruleAbstractInfo= ruleAbstractInfo EOF
            {
             newCompositeNode(grammarAccess.getAbstractInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractInfo=ruleAbstractInfo();

            state._fsp--;

             current =iv_ruleAbstractInfo; 
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
    // $ANTLR end "entryRuleAbstractInfo"


    // $ANTLR start "ruleAbstractInfo"
    // InternalAsyncApi.g:440:1: ruleAbstractInfo returns [EObject current=null] : (this_Reference_0= ruleReference | this_Info_1= ruleInfo ) ;
    public final EObject ruleAbstractInfo() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Info_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:446:2: ( (this_Reference_0= ruleReference | this_Info_1= ruleInfo ) )
            // InternalAsyncApi.g:447:2: (this_Reference_0= ruleReference | this_Info_1= ruleInfo )
            {
            // InternalAsyncApi.g:447:2: (this_Reference_0= ruleReference | this_Info_1= ruleInfo )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==11) ) {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=22 && LA10_2<=27)) ) {
                    alt10=2;
                }
                else if ( (LA10_2==45) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAsyncApi.g:448:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractInfoAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:457:3: this_Info_1= ruleInfo
                    {

                    			newCompositeNode(grammarAccess.getAbstractInfoAccess().getInfoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Info_1=ruleInfo();

                    state._fsp--;


                    			current = this_Info_1;
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
    // $ANTLR end "ruleAbstractInfo"


    // $ANTLR start "entryRuleInfo"
    // InternalAsyncApi.g:469:1: entryRuleInfo returns [EObject current=null] : iv_ruleInfo= ruleInfo EOF ;
    public final EObject entryRuleInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfo = null;


        try {
            // InternalAsyncApi.g:469:45: (iv_ruleInfo= ruleInfo EOF )
            // InternalAsyncApi.g:470:2: iv_ruleInfo= ruleInfo EOF
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
    // InternalAsyncApi.g:476:1: ruleInfo returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) ;
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
            // InternalAsyncApi.g:482:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:483:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:483:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:484:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:484:3: ()
            // InternalAsyncApi.g:485:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfoAccess().getInfoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:495:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:496:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:496:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:497:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:500:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:501:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:501:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=7;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
                    alt17=4;
                }
                else if ( LA17_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
                    alt17=5;
                }
                else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
                    alt17=6;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAsyncApi.g:502:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:502:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:503:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:503:101: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:504:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:507:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:507:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:507:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:507:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getInfoAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getInfoAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:515:9: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:516:10: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:516:10: (lv_title_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:517:11: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            	    // InternalAsyncApi.g:533:9: (otherlv_6= ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==14) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAsyncApi.g:534:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_17); 

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
            	    // InternalAsyncApi.g:545:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:545:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:546:5: {...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:546:101: ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:547:6: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:550:9: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:550:10: {...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:550:19: (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:550:20: otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getInfoAccess().getVersionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_8, grammarAccess.getInfoAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:558:9: ( (lv_version_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:559:10: (lv_version_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:559:10: (lv_version_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:560:11: lv_version_9_0= RULE_STRING
            	    {
            	    lv_version_9_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            	    // InternalAsyncApi.g:576:9: (otherlv_10= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==14) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAsyncApi.g:577:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_17); 

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
            	    // InternalAsyncApi.g:588:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:588:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:589:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:589:101: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:590:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:593:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:593:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:593:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:593:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getInfoAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_12, grammarAccess.getInfoAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:601:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:602:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:602:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:603:11: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            	    // InternalAsyncApi.g:619:9: (otherlv_14= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==14) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAsyncApi.g:620:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,14,FOLLOW_17); 

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
            	    // InternalAsyncApi.g:631:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:631:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:632:5: {...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:632:101: ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:633:6: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:636:9: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:636:10: {...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:636:19: (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:636:20: otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getInfoAccess().getTermsOfServiceKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_16, grammarAccess.getInfoAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:644:9: ( (lv_termsOfService_17_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:645:10: (lv_termsOfService_17_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:645:10: (lv_termsOfService_17_0= RULE_STRING )
            	    // InternalAsyncApi.g:646:11: lv_termsOfService_17_0= RULE_STRING
            	    {
            	    lv_termsOfService_17_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            	    // InternalAsyncApi.g:662:9: (otherlv_18= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==14) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAsyncApi.g:663:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_17); 

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
            	    // InternalAsyncApi.g:674:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:674:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:675:5: {...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:675:101: ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:676:6: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:679:9: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:679:10: {...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:679:19: (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:679:20: otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleAbstractContact ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getInfoAccess().getContactKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getInfoAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:687:9: ( (lv_contact_21_0= ruleAbstractContact ) )
            	    // InternalAsyncApi.g:688:10: (lv_contact_21_0= ruleAbstractContact )
            	    {
            	    // InternalAsyncApi.g:688:10: (lv_contact_21_0= ruleAbstractContact )
            	    // InternalAsyncApi.g:689:11: lv_contact_21_0= ruleAbstractContact
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getContactAbstractContactParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
            	    lv_contact_21_0=ruleAbstractContact();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"contact",
            	    												lv_contact_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractContact");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:706:9: (otherlv_22= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==14) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalAsyncApi.g:707:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,14,FOLLOW_17); 

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
            	    // InternalAsyncApi.g:718:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:718:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:719:5: {...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:719:101: ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:720:6: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:723:9: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:723:10: {...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:723:19: (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:723:20: otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleAbstractLicense ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,27,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getInfoAccess().getLicenseKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getInfoAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:731:9: ( (lv_license_25_0= ruleAbstractLicense ) )
            	    // InternalAsyncApi.g:732:10: (lv_license_25_0= ruleAbstractLicense )
            	    {
            	    // InternalAsyncApi.g:732:10: (lv_license_25_0= ruleAbstractLicense )
            	    // InternalAsyncApi.g:733:11: lv_license_25_0= ruleAbstractLicense
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getLicenseAbstractLicenseParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
            	    lv_license_25_0=ruleAbstractLicense();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"license",
            	    												lv_license_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractLicense");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:750:9: (otherlv_26= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==14) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAsyncApi.g:751:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,14,FOLLOW_17); 

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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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


    // $ANTLR start "entryRuleAbstractContact"
    // InternalAsyncApi.g:778:1: entryRuleAbstractContact returns [EObject current=null] : iv_ruleAbstractContact= ruleAbstractContact EOF ;
    public final EObject entryRuleAbstractContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractContact = null;


        try {
            // InternalAsyncApi.g:778:56: (iv_ruleAbstractContact= ruleAbstractContact EOF )
            // InternalAsyncApi.g:779:2: iv_ruleAbstractContact= ruleAbstractContact EOF
            {
             newCompositeNode(grammarAccess.getAbstractContactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractContact=ruleAbstractContact();

            state._fsp--;

             current =iv_ruleAbstractContact; 
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
    // $ANTLR end "entryRuleAbstractContact"


    // $ANTLR start "ruleAbstractContact"
    // InternalAsyncApi.g:785:1: ruleAbstractContact returns [EObject current=null] : (this_Reference_0= ruleReference | this_Contact_1= ruleContact ) ;
    public final EObject ruleAbstractContact() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Contact_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:791:2: ( (this_Reference_0= ruleReference | this_Contact_1= ruleContact ) )
            // InternalAsyncApi.g:792:2: (this_Reference_0= ruleReference | this_Contact_1= ruleContact )
            {
            // InternalAsyncApi.g:792:2: (this_Reference_0= ruleReference | this_Contact_1= ruleContact )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==11) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==20||(LA18_2>=28 && LA18_2<=30)) ) {
                    alt18=2;
                }
                else if ( (LA18_2==45) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAsyncApi.g:793:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractContactAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:802:3: this_Contact_1= ruleContact
                    {

                    			newCompositeNode(grammarAccess.getAbstractContactAccess().getContactParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contact_1=ruleContact();

                    state._fsp--;


                    			current = this_Contact_1;
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
    // $ANTLR end "ruleAbstractContact"


    // $ANTLR start "entryRuleContact"
    // InternalAsyncApi.g:814:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalAsyncApi.g:814:48: (iv_ruleContact= ruleContact EOF )
            // InternalAsyncApi.g:815:2: iv_ruleContact= ruleContact EOF
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
    // InternalAsyncApi.g:821:1: ruleContact returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
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
            // InternalAsyncApi.g:827:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:828:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:828:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:829:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:829:3: ()
            // InternalAsyncApi.g:830:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContactAccess().getContactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:840:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:841:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:841:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:842:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:845:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:846:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:846:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop22:
            do {
                int alt22=4;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
                    alt22=3;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAsyncApi.g:847:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:847:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:848:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:848:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:849:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:852:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:852:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:852:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:852:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getContactAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:860:9: ( (lv_name_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:861:10: (lv_name_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:861:10: (lv_name_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:862:11: lv_name_5_0= RULE_STRING
            	    {
            	    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            	    // InternalAsyncApi.g:878:9: (otherlv_6= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==14) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalAsyncApi.g:879:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_18); 

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
            	    // InternalAsyncApi.g:890:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:890:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:891:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:891:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:892:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:895:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:895:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:895:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:895:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getContactAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_8, grammarAccess.getContactAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:903:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:904:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:904:10: (lv_url_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:905:11: lv_url_9_0= RULE_STRING
            	    {
            	    lv_url_9_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            	    // InternalAsyncApi.g:921:9: (otherlv_10= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==14) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalAsyncApi.g:922:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_18); 

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
            	    // InternalAsyncApi.g:933:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:933:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:934:5: {...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:934:104: ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:935:6: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:938:9: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:938:10: {...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:938:19: (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:938:20: otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getContactAccess().getEmailKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_12, grammarAccess.getContactAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:946:9: ( (lv_email_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:947:10: (lv_email_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:947:10: (lv_email_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:948:11: lv_email_13_0= RULE_STRING
            	    {
            	    lv_email_13_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            	    // InternalAsyncApi.g:964:9: (otherlv_14= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==14) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAsyncApi.g:965:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,14,FOLLOW_18); 

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
            	    break loop22;
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


    // $ANTLR start "entryRuleAbstractLicense"
    // InternalAsyncApi.g:991:1: entryRuleAbstractLicense returns [EObject current=null] : iv_ruleAbstractLicense= ruleAbstractLicense EOF ;
    public final EObject entryRuleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractLicense = null;


        try {
            // InternalAsyncApi.g:991:56: (iv_ruleAbstractLicense= ruleAbstractLicense EOF )
            // InternalAsyncApi.g:992:2: iv_ruleAbstractLicense= ruleAbstractLicense EOF
            {
             newCompositeNode(grammarAccess.getAbstractLicenseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractLicense=ruleAbstractLicense();

            state._fsp--;

             current =iv_ruleAbstractLicense; 
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
    // $ANTLR end "entryRuleAbstractLicense"


    // $ANTLR start "ruleAbstractLicense"
    // InternalAsyncApi.g:998:1: ruleAbstractLicense returns [EObject current=null] : (this_Reference_0= ruleReference | this_License_1= ruleLicense ) ;
    public final EObject ruleAbstractLicense() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_License_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1004:2: ( (this_Reference_0= ruleReference | this_License_1= ruleLicense ) )
            // InternalAsyncApi.g:1005:2: (this_Reference_0= ruleReference | this_License_1= ruleLicense )
            {
            // InternalAsyncApi.g:1005:2: (this_Reference_0= ruleReference | this_License_1= ruleLicense )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==11) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==20||(LA23_2>=28 && LA23_2<=29)) ) {
                    alt23=2;
                }
                else if ( (LA23_2==45) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAsyncApi.g:1006:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:1015:3: this_License_1= ruleLicense
                    {

                    			newCompositeNode(grammarAccess.getAbstractLicenseAccess().getLicenseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_License_1=ruleLicense();

                    state._fsp--;


                    			current = this_License_1;
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
    // $ANTLR end "ruleAbstractLicense"


    // $ANTLR start "entryRuleLicense"
    // InternalAsyncApi.g:1027:1: entryRuleLicense returns [EObject current=null] : iv_ruleLicense= ruleLicense EOF ;
    public final EObject entryRuleLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicense = null;


        try {
            // InternalAsyncApi.g:1027:48: (iv_ruleLicense= ruleLicense EOF )
            // InternalAsyncApi.g:1028:2: iv_ruleLicense= ruleLicense EOF
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
    // InternalAsyncApi.g:1034:1: ruleLicense returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // InternalAsyncApi.g:1040:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:1041:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:1041:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:1042:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:1042:3: ()
            // InternalAsyncApi.g:1043:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLicenseAccess().getLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1053:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1054:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1054:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1055:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1058:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1059:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1059:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAsyncApi.g:1060:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1060:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1061:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1061:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1062:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1065:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1065:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:1065:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1065:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getLicenseAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1073:9: ( (lv_name_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1074:10: (lv_name_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1074:10: (lv_name_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:1075:11: lv_name_5_0= RULE_STRING
            	    {
            	    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            	    // InternalAsyncApi.g:1091:9: (otherlv_6= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==14) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalAsyncApi.g:1092:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_20); 

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
            	    // InternalAsyncApi.g:1103:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1103:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1104:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1104:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1105:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1108:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1108:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:1108:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1108:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_8, grammarAccess.getLicenseAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1116:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1117:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1117:10: (lv_url_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:1118:11: lv_url_9_0= RULE_STRING
            	    {
            	    lv_url_9_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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

            	    // InternalAsyncApi.g:1134:9: (otherlv_10= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==14) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalAsyncApi.g:1135:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_20); 

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
            	    break loop26;
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


    // $ANTLR start "entryRuleAbstractServer"
    // InternalAsyncApi.g:1161:1: entryRuleAbstractServer returns [EObject current=null] : iv_ruleAbstractServer= ruleAbstractServer EOF ;
    public final EObject entryRuleAbstractServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractServer = null;


        try {
            // InternalAsyncApi.g:1161:55: (iv_ruleAbstractServer= ruleAbstractServer EOF )
            // InternalAsyncApi.g:1162:2: iv_ruleAbstractServer= ruleAbstractServer EOF
            {
             newCompositeNode(grammarAccess.getAbstractServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractServer=ruleAbstractServer();

            state._fsp--;

             current =iv_ruleAbstractServer; 
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
    // $ANTLR end "entryRuleAbstractServer"


    // $ANTLR start "ruleAbstractServer"
    // InternalAsyncApi.g:1168:1: ruleAbstractServer returns [EObject current=null] : (this_Reference_0= ruleReference | this_Server_1= ruleServer ) ;
    public final EObject ruleAbstractServer() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Server_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1174:2: ( (this_Reference_0= ruleReference | this_Server_1= ruleServer ) )
            // InternalAsyncApi.g:1175:2: (this_Reference_0= ruleReference | this_Server_1= ruleServer )
            {
            // InternalAsyncApi.g:1175:2: (this_Reference_0= ruleReference | this_Server_1= ruleServer )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==11) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==45) ) {
                    alt27=1;
                }
                else if ( (LA27_2==24||LA27_2==29||(LA27_2>=31 && LA27_2<=32)) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAsyncApi.g:1176:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractServerAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:1185:3: this_Server_1= ruleServer
                    {

                    			newCompositeNode(grammarAccess.getAbstractServerAccess().getServerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Server_1=ruleServer();

                    state._fsp--;


                    			current = this_Server_1;
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
    // $ANTLR end "ruleAbstractServer"


    // $ANTLR start "entryRuleServer"
    // InternalAsyncApi.g:1197:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalAsyncApi.g:1197:47: (iv_ruleServer= ruleServer EOF )
            // InternalAsyncApi.g:1198:2: iv_ruleServer= ruleServer EOF
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
    // InternalAsyncApi.g:1204:1: ruleServer returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' ) ;
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
            // InternalAsyncApi.g:1210:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' ) )
            // InternalAsyncApi.g:1211:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' )
            {
            // InternalAsyncApi.g:1211:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' )
            // InternalAsyncApi.g:1212:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}'
            {
            // InternalAsyncApi.g:1212:3: ()
            // InternalAsyncApi.g:1213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerAccess().getServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1223:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:1224:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:1224:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:1225:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServerAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1228:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:1229:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:1229:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=5;
                int LA32_0 = input.LA(1);

                if ( LA32_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2) ) {
                    alt32=3;
                }
                else if ( LA32_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3) ) {
                    alt32=4;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAsyncApi.g:1230:4: ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1230:4: ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1231:5: {...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1231:103: ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1232:6: ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1235:9: ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1235:10: {...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1235:19: (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1235:20: otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getServerAccess().getUrlKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getServerAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1243:9: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1244:10: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1244:10: (lv_title_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:1245:11: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            	    // InternalAsyncApi.g:1261:9: (otherlv_6= ',' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==14) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalAsyncApi.g:1262:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_24); 

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
            	    // InternalAsyncApi.g:1273:4: ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1273:4: ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1274:5: {...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1274:103: ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1275:6: ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1278:9: ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1278:10: {...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1278:19: (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1278:20: otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getServerAccess().getSchemeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_25); 

            	    									newLeafNode(otherlv_8, grammarAccess.getServerAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1286:9: ( (lv_scheme_9_0= ruleScheme ) )
            	    // InternalAsyncApi.g:1287:10: (lv_scheme_9_0= ruleScheme )
            	    {
            	    // InternalAsyncApi.g:1287:10: (lv_scheme_9_0= ruleScheme )
            	    // InternalAsyncApi.g:1288:11: lv_scheme_9_0= ruleScheme
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getSchemeSchemeEnumRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
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

            	    // InternalAsyncApi.g:1305:9: (otherlv_10= ',' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==14) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalAsyncApi.g:1306:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_24); 

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
            	    // InternalAsyncApi.g:1317:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1317:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) )
            	    // InternalAsyncApi.g:1318:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:1318:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) )
            	    // InternalAsyncApi.g:1319:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:1322:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) )
            	    // InternalAsyncApi.g:1322:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1322:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' )
            	    // InternalAsyncApi.g:1322:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ','
            	    {
            	    otherlv_11=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getServerAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_12, grammarAccess.getServerAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:1330:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1331:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1331:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:1332:11: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            	    otherlv_14=(Token)match(input,14,FOLLOW_24); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServerAccess().getCommaKeyword_2_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:1358:4: ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1358:4: ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1359:5: {...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:1359:103: ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:1360:6: ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:1363:9: ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:1363:10: {...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1363:19: (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:1363:20: otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleAbstractVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,32,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getServerAccess().getVariablesKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServerAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_17=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_17, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:1375:9: ( (lv_variables_18_0= ruleAbstractVariable ) )
            	    // InternalAsyncApi.g:1376:10: (lv_variables_18_0= ruleAbstractVariable )
            	    {
            	    // InternalAsyncApi.g:1376:10: (lv_variables_18_0= ruleAbstractVariable )
            	    // InternalAsyncApi.g:1377:11: lv_variables_18_0= ruleAbstractVariable
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getVariablesAbstractVariableParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_variables_18_0=ruleAbstractVariable();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											add(
            	    												current,
            	    												"variables",
            	    												lv_variables_18_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractVariable");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1394:9: (otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==14) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1395:10: otherlv_19= ',' ( (lv_variables_20_0= ruleAbstractVariable ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getServerAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1399:10: ( (lv_variables_20_0= ruleAbstractVariable ) )
            	    	    // InternalAsyncApi.g:1400:11: (lv_variables_20_0= ruleAbstractVariable )
            	    	    {
            	    	    // InternalAsyncApi.g:1400:11: (lv_variables_20_0= ruleAbstractVariable )
            	    	    // InternalAsyncApi.g:1401:12: lv_variables_20_0= ruleAbstractVariable
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServerAccess().getVariablesAbstractVariableParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_variables_20_0=ruleAbstractVariable();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServerRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"variables",
            	    	    													lv_variables_20_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractVariable");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,20,FOLLOW_23); 

            	    									newLeafNode(otherlv_21, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:1423:9: (otherlv_22= ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==14) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalAsyncApi.g:1424:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,14,FOLLOW_24); 

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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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


    // $ANTLR start "entryRuleAbstractVariable"
    // InternalAsyncApi.g:1451:1: entryRuleAbstractVariable returns [EObject current=null] : iv_ruleAbstractVariable= ruleAbstractVariable EOF ;
    public final EObject entryRuleAbstractVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractVariable = null;


        try {
            // InternalAsyncApi.g:1451:57: (iv_ruleAbstractVariable= ruleAbstractVariable EOF )
            // InternalAsyncApi.g:1452:2: iv_ruleAbstractVariable= ruleAbstractVariable EOF
            {
             newCompositeNode(grammarAccess.getAbstractVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractVariable=ruleAbstractVariable();

            state._fsp--;

             current =iv_ruleAbstractVariable; 
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
    // $ANTLR end "entryRuleAbstractVariable"


    // $ANTLR start "ruleAbstractVariable"
    // InternalAsyncApi.g:1458:1: ruleAbstractVariable returns [EObject current=null] : (this_Reference_0= ruleReference | this_Variable_1= ruleVariable ) ;
    public final EObject ruleAbstractVariable() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Variable_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1464:2: ( (this_Reference_0= ruleReference | this_Variable_1= ruleVariable ) )
            // InternalAsyncApi.g:1465:2: (this_Reference_0= ruleReference | this_Variable_1= ruleVariable )
            {
            // InternalAsyncApi.g:1465:2: (this_Reference_0= ruleReference | this_Variable_1= ruleVariable )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==13) ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3==11) ) {
                        int LA33_4 = input.LA(4);

                        if ( (LA33_4==20||LA33_4==24||(LA33_4>=33 && LA33_4<=34)) ) {
                            alt33=2;
                        }
                        else if ( (LA33_4==45) ) {
                            alt33=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 33, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0==11) ) {
                alt33=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalAsyncApi.g:1466:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractVariableAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:1475:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getAbstractVariableAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
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
    // $ANTLR end "ruleAbstractVariable"


    // $ANTLR start "entryRuleVariable"
    // InternalAsyncApi.g:1487:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAsyncApi.g:1487:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAsyncApi.g:1488:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalAsyncApi.g:1494:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // InternalAsyncApi.g:1500:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalAsyncApi.g:1501:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalAsyncApi.g:1501:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalAsyncApi.g:1502:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalAsyncApi.g:1502:3: ()
            // InternalAsyncApi.g:1503:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1509:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:1510:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:1510:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:1511:5: lv_name_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1535:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1536:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1536:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1537:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1540:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1541:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1541:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
                    alt38=3;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAsyncApi.g:1542:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1542:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1543:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1543:105: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1544:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1547:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1547:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1547:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1547:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1555:9: ( (lv_description_7_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1556:10: (lv_description_7_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1556:10: (lv_description_7_0= RULE_STRING )
            	    // InternalAsyncApi.g:1557:11: lv_description_7_0= RULE_STRING
            	    {
            	    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            	    // InternalAsyncApi.g:1573:9: (otherlv_8= ',' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==14) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAsyncApi.g:1574:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_27); 

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
            	    // InternalAsyncApi.g:1585:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1585:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1586:5: {...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1586:105: ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1587:6: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1590:9: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1590:10: {...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1590:19: (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1590:20: otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getDefaultKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1598:9: ( (lv_default_11_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1599:10: (lv_default_11_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1599:10: (lv_default_11_0= RULE_STRING )
            	    // InternalAsyncApi.g:1600:11: lv_default_11_0= RULE_STRING
            	    {
            	    lv_default_11_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            	    // InternalAsyncApi.g:1616:9: (otherlv_12= ',' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==14) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAsyncApi.g:1617:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,14,FOLLOW_27); 

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
            	    // InternalAsyncApi.g:1628:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1628:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1629:5: {...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1629:105: ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:1630:6: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1633:9: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:1633:10: {...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1633:19: (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:1633:20: otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getEnumKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getColonKeyword_4_2_1());
            	    								
            	    otherlv_15=(Token)match(input,17,FOLLOW_15); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_4_2_2());
            	    								
            	    // InternalAsyncApi.g:1645:9: ( (lv_enum_16_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1646:10: (lv_enum_16_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1646:10: (lv_enum_16_0= RULE_STRING )
            	    // InternalAsyncApi.g:1647:11: lv_enum_16_0= RULE_STRING
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

            	    // InternalAsyncApi.g:1663:9: (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==14) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1664:10: otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,14,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getCommaKeyword_4_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1668:10: ( (lv_enum_18_0= RULE_STRING ) )
            	    	    // InternalAsyncApi.g:1669:11: (lv_enum_18_0= RULE_STRING )
            	    	    {
            	    	    // InternalAsyncApi.g:1669:11: (lv_enum_18_0= RULE_STRING )
            	    	    // InternalAsyncApi.g:1670:12: lv_enum_18_0= RULE_STRING
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
            	    	    break loop36;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,18,FOLLOW_28); 

            	    									newLeafNode(otherlv_19, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_4_2_5());
            	    								
            	    // InternalAsyncApi.g:1691:9: (otherlv_20= ',' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==14) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalAsyncApi.g:1692:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,14,FOLLOW_27); 

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
            	    break loop38;
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


    // $ANTLR start "entryRuleAbstractTopic"
    // InternalAsyncApi.g:1718:1: entryRuleAbstractTopic returns [EObject current=null] : iv_ruleAbstractTopic= ruleAbstractTopic EOF ;
    public final EObject entryRuleAbstractTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTopic = null;


        try {
            // InternalAsyncApi.g:1718:54: (iv_ruleAbstractTopic= ruleAbstractTopic EOF )
            // InternalAsyncApi.g:1719:2: iv_ruleAbstractTopic= ruleAbstractTopic EOF
            {
             newCompositeNode(grammarAccess.getAbstractTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractTopic=ruleAbstractTopic();

            state._fsp--;

             current =iv_ruleAbstractTopic; 
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
    // $ANTLR end "entryRuleAbstractTopic"


    // $ANTLR start "ruleAbstractTopic"
    // InternalAsyncApi.g:1725:1: ruleAbstractTopic returns [EObject current=null] : (this_Reference_0= ruleReference | this_Topic_1= ruleTopic ) ;
    public final EObject ruleAbstractTopic() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Topic_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1731:2: ( (this_Reference_0= ruleReference | this_Topic_1= ruleTopic ) )
            // InternalAsyncApi.g:1732:2: (this_Reference_0= ruleReference | this_Topic_1= ruleTopic )
            {
            // InternalAsyncApi.g:1732:2: (this_Reference_0= ruleReference | this_Topic_1= ruleTopic )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==13) ) {
                    int LA39_3 = input.LA(3);

                    if ( (LA39_3==11) ) {
                        int LA39_4 = input.LA(4);

                        if ( (LA39_4==45) ) {
                            alt39=1;
                        }
                        else if ( (LA39_4==20||(LA39_4>=35 && LA39_4<=36)) ) {
                            alt39=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 39, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==11) ) {
                alt39=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalAsyncApi.g:1733:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractTopicAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:1742:3: this_Topic_1= ruleTopic
                    {

                    			newCompositeNode(grammarAccess.getAbstractTopicAccess().getTopicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Topic_1=ruleTopic();

                    state._fsp--;


                    			current = this_Topic_1;
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
    // $ANTLR end "ruleAbstractTopic"


    // $ANTLR start "entryRuleTopic"
    // InternalAsyncApi.g:1754:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalAsyncApi.g:1754:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalAsyncApi.g:1755:2: iv_ruleTopic= ruleTopic EOF
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
    // InternalAsyncApi.g:1761:1: ruleTopic returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
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
            // InternalAsyncApi.g:1767:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalAsyncApi.g:1768:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalAsyncApi.g:1768:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalAsyncApi.g:1769:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // InternalAsyncApi.g:1769:3: ()
            // InternalAsyncApi.g:1770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicAccess().getTopicAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1776:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:1777:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:1777:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:1778:5: lv_name_1_0= RULE_STRING
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

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1802:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1803:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1803:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1804:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTopicAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1807:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1808:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1808:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAsyncApi.g:1809:4: ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1809:4: ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1810:5: {...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1810:102: ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1811:6: ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1814:9: ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1814:10: {...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "true");
            	    }
            	    // InternalAsyncApi.g:1814:19: (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1814:20: otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTopicAccess().getPublishKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1822:9: ( (lv_publish_7_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:1823:10: (lv_publish_7_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:1823:10: (lv_publish_7_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:1824:11: lv_publish_7_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getTopicAccess().getPublishAbstractMessageParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
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

            	    // InternalAsyncApi.g:1841:9: (otherlv_8= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==14) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAsyncApi.g:1842:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_29); 

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
            	    // InternalAsyncApi.g:1853:4: ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1853:4: ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1854:5: {...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1854:102: ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1855:6: ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1858:9: ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1858:10: {...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "true");
            	    }
            	    // InternalAsyncApi.g:1858:19: (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1858:20: otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTopicAccess().getSubscribeKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTopicAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1866:9: ( (lv_subscribe_11_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:1867:10: (lv_subscribe_11_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:1867:10: (lv_subscribe_11_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:1868:11: lv_subscribe_11_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getTopicAccess().getSubscribeAbstractMessageParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
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

            	    // InternalAsyncApi.g:1885:9: (otherlv_12= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==14) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalAsyncApi.g:1886:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,14,FOLLOW_29); 

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
            	    break loop42;
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
    // InternalAsyncApi.g:1912:1: entryRuleAbstractMessage returns [EObject current=null] : iv_ruleAbstractMessage= ruleAbstractMessage EOF ;
    public final EObject entryRuleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessage = null;


        try {
            // InternalAsyncApi.g:1912:56: (iv_ruleAbstractMessage= ruleAbstractMessage EOF )
            // InternalAsyncApi.g:1913:2: iv_ruleAbstractMessage= ruleAbstractMessage EOF
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
    // InternalAsyncApi.g:1919:1: ruleAbstractMessage returns [EObject current=null] : (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) ;
    public final EObject ruleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1925:2: ( (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) )
            // InternalAsyncApi.g:1926:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            {
            // InternalAsyncApi.g:1926:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==13) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==11) ) {
                        int LA43_2 = input.LA(4);

                        if ( (LA43_2==20||LA43_2==24||(LA43_2>=37 && LA43_2<=39)) ) {
                            alt43=2;
                        }
                        else if ( (LA43_2==45) ) {
                            alt43=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 43, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA43_0==11) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==20||LA43_2==24||(LA43_2>=37 && LA43_2<=39)) ) {
                    alt43=2;
                }
                else if ( (LA43_2==45) ) {
                    alt43=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalAsyncApi.g:1927:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:1936:3: this_Message_1= ruleMessage
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
    // InternalAsyncApi.g:1948:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalAsyncApi.g:1948:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalAsyncApi.g:1949:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalAsyncApi.g:1955:1: ruleMessage returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_summary_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_headers_15_0 = null;

        EObject lv_payload_19_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1961:2: ( ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalAsyncApi.g:1962:2: ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalAsyncApi.g:1962:2: ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalAsyncApi.g:1963:3: () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalAsyncApi.g:1963:3: ()
            // InternalAsyncApi.g:1964:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageAccess().getMessageAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1970:3: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAsyncApi.g:1971:4: ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':'
                    {
                    // InternalAsyncApi.g:1971:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalAsyncApi.g:1972:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalAsyncApi.g:1972:5: (lv_name_1_0= RULE_STRING )
                    // InternalAsyncApi.g:1973:6: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAsyncApi.g:1998:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1999:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1999:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2000:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageAccess().getUnorderedGroup_3());
            				
            // InternalAsyncApi.g:2003:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2004:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2004:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) ) )*
            loop49:
            do {
                int alt49=5;
                int LA49_0 = input.LA(1);

                if ( LA49_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 3) ) {
                    alt49=4;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAsyncApi.g:2005:4: ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2005:4: ({...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2006:5: {...}? => ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalAsyncApi.g:2006:104: ( ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:2007:6: ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalAsyncApi.g:2010:9: ({...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:2010:10: {...}? => (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2010:19: (otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:2010:20: otherlv_5= '\"summary\"' otherlv_6= ':' ( (lv_summary_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getMessageAccess().getSummaryKeyword_3_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalAsyncApi.g:2018:9: ( (lv_summary_7_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2019:10: (lv_summary_7_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2019:10: (lv_summary_7_0= RULE_STRING )
            	    // InternalAsyncApi.g:2020:11: lv_summary_7_0= RULE_STRING
            	    {
            	    lv_summary_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	    											newLeafNode(lv_summary_7_0, grammarAccess.getMessageAccess().getSummarySTRINGTerminalRuleCall_3_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMessageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"summary",
            	    												lv_summary_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2036:9: (otherlv_8= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==14) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalAsyncApi.g:2037:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_31); 

            	            										newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getCommaKeyword_3_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2048:4: ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2048:4: ({...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2049:5: {...}? => ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalAsyncApi.g:2049:104: ( ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:2050:6: ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalAsyncApi.g:2053:9: ({...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:2053:10: {...}? => (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2053:19: (otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:2053:20: otherlv_9= '\"description\"' otherlv_10= ':' ( (lv_description_11_0= RULE_STRING ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getDescriptionKeyword_3_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalAsyncApi.g:2061:9: ( (lv_description_11_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2062:10: (lv_description_11_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2062:10: (lv_description_11_0= RULE_STRING )
            	    // InternalAsyncApi.g:2063:11: lv_description_11_0= RULE_STRING
            	    {
            	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	    											newLeafNode(lv_description_11_0, grammarAccess.getMessageAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMessageRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_11_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2079:9: (otherlv_12= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==14) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalAsyncApi.g:2080:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,14,FOLLOW_31); 

            	            										newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getCommaKeyword_3_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:2091:4: ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2091:4: ({...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2092:5: {...}? => ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalAsyncApi.g:2092:104: ( ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:2093:6: ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalAsyncApi.g:2096:9: ({...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:2096:10: {...}? => (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2096:19: (otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:2096:20: otherlv_13= '\"headers\"' otherlv_14= ':' ( (lv_headers_15_0= ruleAbstractSchema ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getHeadersKeyword_3_2_0());
            	    								
            	    otherlv_14=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalAsyncApi.g:2104:9: ( (lv_headers_15_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2105:10: (lv_headers_15_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2105:10: (lv_headers_15_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2106:11: lv_headers_15_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getHeadersAbstractSchemaParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_headers_15_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"headers",
            	    												lv_headers_15_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2123:9: (otherlv_16= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==14) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalAsyncApi.g:2124:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,14,FOLLOW_31); 

            	            										newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getCommaKeyword_3_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:2135:4: ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2135:4: ({...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2136:5: {...}? => ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalAsyncApi.g:2136:104: ( ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:2137:6: ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalAsyncApi.g:2140:9: ({...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:2140:10: {...}? => (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2140:19: (otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:2140:20: otherlv_17= '\"payload\"' otherlv_18= ':' ( (lv_payload_19_0= ruleAbstractSchema ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getPayloadKeyword_3_3_0());
            	    								
            	    otherlv_18=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalAsyncApi.g:2148:9: ( (lv_payload_19_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2149:10: (lv_payload_19_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2149:10: (lv_payload_19_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2150:11: lv_payload_19_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getPayloadAbstractSchemaParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_payload_19_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"payload",
            	    												lv_payload_19_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2167:9: (otherlv_20= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==14) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalAsyncApi.g:2168:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,14,FOLLOW_31); 

            	            										newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getCommaKeyword_3_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMessageAccess().getUnorderedGroup_3());
            				

            }

            otherlv_21=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleAbstractSchema"
    // InternalAsyncApi.g:2194:1: entryRuleAbstractSchema returns [EObject current=null] : iv_ruleAbstractSchema= ruleAbstractSchema EOF ;
    public final EObject entryRuleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSchema = null;


        try {
            // InternalAsyncApi.g:2194:55: (iv_ruleAbstractSchema= ruleAbstractSchema EOF )
            // InternalAsyncApi.g:2195:2: iv_ruleAbstractSchema= ruleAbstractSchema EOF
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
    // InternalAsyncApi.g:2201:1: ruleAbstractSchema returns [EObject current=null] : (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) ;
    public final EObject ruleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Schema_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2207:2: ( (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) )
            // InternalAsyncApi.g:2208:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            {
            // InternalAsyncApi.g:2208:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==13) ) {
                    int LA50_3 = input.LA(3);

                    if ( (LA50_3==11) ) {
                        int LA50_2 = input.LA(4);

                        if ( (LA50_2==45) ) {
                            alt50=1;
                        }
                        else if ( (LA50_2==20||LA50_2==22||LA50_2==24||(LA50_2>=33 && LA50_2<=34)||(LA50_2>=39 && LA50_2<=42)) ) {
                            alt50=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 50, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA50_0==11) ) {
                int LA50_2 = input.LA(2);

                if ( (LA50_2==45) ) {
                    alt50=1;
                }
                else if ( (LA50_2==20||LA50_2==22||LA50_2==24||(LA50_2>=33 && LA50_2<=34)||(LA50_2>=39 && LA50_2<=42)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalAsyncApi.g:2209:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:2218:3: this_Schema_1= ruleSchema
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
    // InternalAsyncApi.g:2230:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalAsyncApi.g:2230:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalAsyncApi.g:2231:2: iv_ruleSchema= ruleSchema EOF
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
    // InternalAsyncApi.g:2237:1: ruleSchema returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) ) ) otherlv_49= '}' ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_title_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_summary_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_description_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_format_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_default_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_enum_44_0=null;
        Token otherlv_45=null;
        Token lv_enum_46_0=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        EObject lv_schemas_28_0 = null;

        EObject lv_schemas_30_0 = null;

        EObject lv_payloads_36_0 = null;

        EObject lv_payloads_38_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2243:2: ( ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) ) ) otherlv_49= '}' ) )
            // InternalAsyncApi.g:2244:2: ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) ) ) otherlv_49= '}' )
            {
            // InternalAsyncApi.g:2244:2: ( () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) ) ) otherlv_49= '}' )
            // InternalAsyncApi.g:2245:3: () ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) ) ) otherlv_49= '}'
            {
            // InternalAsyncApi.g:2245:3: ()
            // InternalAsyncApi.g:2246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2252:3: ( ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAsyncApi.g:2253:4: ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':'
                    {
                    // InternalAsyncApi.g:2253:4: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalAsyncApi.g:2254:5: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalAsyncApi.g:2254:5: (lv_name_1_0= RULE_STRING )
                    // InternalAsyncApi.g:2255:6: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getSchemaAccess().getNameSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSchemaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getSchemaAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAsyncApi.g:2280:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2281:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2281:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2282:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            				
            // InternalAsyncApi.g:2285:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2286:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2286:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )*
            loop63:
            do {
                int alt63=9;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // InternalAsyncApi.g:2287:4: ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2287:4: ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2288:5: {...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalAsyncApi.g:2288:103: ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:2289:6: ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalAsyncApi.g:2292:9: ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:2292:10: {...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2292:19: (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:2292:20: otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getSchemaAccess().getTitleKeyword_3_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_6, grammarAccess.getSchemaAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalAsyncApi.g:2300:9: ( (lv_title_7_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2301:10: (lv_title_7_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2301:10: (lv_title_7_0= RULE_STRING )
            	    // InternalAsyncApi.g:2302:11: lv_title_7_0= RULE_STRING
            	    {
            	    lv_title_7_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_title_7_0, grammarAccess.getSchemaAccess().getTitleSTRINGTerminalRuleCall_3_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2318:9: (otherlv_8= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==14) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalAsyncApi.g:2319:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getCommaKeyword_3_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2330:4: ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2330:4: ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2331:5: {...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalAsyncApi.g:2331:103: ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:2332:6: ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalAsyncApi.g:2335:9: ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:2335:10: {...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2335:19: (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:2335:20: otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getSchemaAccess().getTypeKeyword_3_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_10, grammarAccess.getSchemaAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalAsyncApi.g:2343:9: ( (lv_summary_11_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2344:10: (lv_summary_11_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2344:10: (lv_summary_11_0= RULE_STRING )
            	    // InternalAsyncApi.g:2345:11: lv_summary_11_0= RULE_STRING
            	    {
            	    lv_summary_11_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_summary_11_0, grammarAccess.getSchemaAccess().getSummarySTRINGTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"summary",
            	    												lv_summary_11_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2361:9: (otherlv_12= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==14) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalAsyncApi.g:2362:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getCommaKeyword_3_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:2373:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2373:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2374:5: {...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalAsyncApi.g:2374:103: ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:2375:6: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalAsyncApi.g:2378:9: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:2378:10: {...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2378:19: (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:2378:20: otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getSchemaAccess().getDescriptionKeyword_3_2_0());
            	    								
            	    otherlv_14=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_14, grammarAccess.getSchemaAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalAsyncApi.g:2386:9: ( (lv_description_15_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2387:10: (lv_description_15_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2387:10: (lv_description_15_0= RULE_STRING )
            	    // InternalAsyncApi.g:2388:11: lv_description_15_0= RULE_STRING
            	    {
            	    lv_description_15_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_description_15_0, grammarAccess.getSchemaAccess().getDescriptionSTRINGTerminalRuleCall_3_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_15_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2404:9: (otherlv_16= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==14) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalAsyncApi.g:2405:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_16, grammarAccess.getSchemaAccess().getCommaKeyword_3_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:2416:4: ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2416:4: ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2417:5: {...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalAsyncApi.g:2417:103: ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:2418:6: ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalAsyncApi.g:2421:9: ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:2421:10: {...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2421:19: (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:2421:20: otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getSchemaAccess().getFormatKeyword_3_3_0());
            	    								
            	    otherlv_18=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_18, grammarAccess.getSchemaAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalAsyncApi.g:2429:9: ( (lv_format_19_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2430:10: (lv_format_19_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2430:10: (lv_format_19_0= RULE_STRING )
            	    // InternalAsyncApi.g:2431:11: lv_format_19_0= RULE_STRING
            	    {
            	    lv_format_19_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_format_19_0, grammarAccess.getSchemaAccess().getFormatSTRINGTerminalRuleCall_3_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"format",
            	    												lv_format_19_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2447:9: (otherlv_20= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==14) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalAsyncApi.g:2448:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_20, grammarAccess.getSchemaAccess().getCommaKeyword_3_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:2459:4: ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2459:4: ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2460:5: {...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalAsyncApi.g:2460:103: ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalAsyncApi.g:2461:6: ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalAsyncApi.g:2464:9: ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) )
            	    // InternalAsyncApi.g:2464:10: {...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2464:19: (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? )
            	    // InternalAsyncApi.g:2464:20: otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_21, grammarAccess.getSchemaAccess().getDefaultKeyword_3_4_0());
            	    								
            	    otherlv_22=(Token)match(input,13,FOLLOW_15); 

            	    									newLeafNode(otherlv_22, grammarAccess.getSchemaAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalAsyncApi.g:2472:9: ( (lv_default_23_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2473:10: (lv_default_23_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2473:10: (lv_default_23_0= RULE_STRING )
            	    // InternalAsyncApi.g:2474:11: lv_default_23_0= RULE_STRING
            	    {
            	    lv_default_23_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_default_23_0, grammarAccess.getSchemaAccess().getDefaultSTRINGTerminalRuleCall_3_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"default",
            	    												lv_default_23_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2490:9: (otherlv_24= ',' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==14) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalAsyncApi.g:2491:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_24, grammarAccess.getSchemaAccess().getCommaKeyword_3_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:2502:4: ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2502:4: ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2503:5: {...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalAsyncApi.g:2503:103: ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) )
            	    // InternalAsyncApi.g:2504:6: ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalAsyncApi.g:2507:9: ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) )
            	    // InternalAsyncApi.g:2507:10: {...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2507:19: (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? )
            	    // InternalAsyncApi.g:2507:20: otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getSchemaAccess().getPropertiesKeyword_3_5_0());
            	    								
            	    otherlv_26=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_26, grammarAccess.getSchemaAccess().getColonKeyword_3_5_1());
            	    								
            	    otherlv_27=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_3_5_2());
            	    								
            	    // InternalAsyncApi.g:2519:9: ( (lv_schemas_28_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2520:10: (lv_schemas_28_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2520:10: (lv_schemas_28_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2521:11: lv_schemas_28_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getSchemasAbstractSchemaParserRuleCall_3_5_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_schemas_28_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"schemas",
            	    												lv_schemas_28_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2538:9: (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==14) ) {
            	            alt57=1;
            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2539:10: otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_29, grammarAccess.getSchemaAccess().getCommaKeyword_3_5_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2543:10: ( (lv_schemas_30_0= ruleAbstractSchema ) )
            	    	    // InternalAsyncApi.g:2544:11: (lv_schemas_30_0= ruleAbstractSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:2544:11: (lv_schemas_30_0= ruleAbstractSchema )
            	    	    // InternalAsyncApi.g:2545:12: lv_schemas_30_0= ruleAbstractSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getSchemasAbstractSchemaParserRuleCall_3_5_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_schemas_30_0=ruleAbstractSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"schemas",
            	    	    													lv_schemas_30_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);

            	    otherlv_31=(Token)match(input,20,FOLLOW_34); 

            	    									newLeafNode(otherlv_31, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3_5_5());
            	    								
            	    // InternalAsyncApi.g:2567:9: (otherlv_32= ',' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==14) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalAsyncApi.g:2568:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_32, grammarAccess.getSchemaAccess().getCommaKeyword_3_5_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAsyncApi.g:2579:4: ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2579:4: ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2580:5: {...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalAsyncApi.g:2580:103: ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) )
            	    // InternalAsyncApi.g:2581:6: ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalAsyncApi.g:2584:9: ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) )
            	    // InternalAsyncApi.g:2584:10: {...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2584:19: (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? )
            	    // InternalAsyncApi.g:2584:20: otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_33, grammarAccess.getSchemaAccess().getPayloadKeyword_3_6_0());
            	    								
            	    otherlv_34=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_34, grammarAccess.getSchemaAccess().getColonKeyword_3_6_1());
            	    								
            	    otherlv_35=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_35, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_3_6_2());
            	    								
            	    // InternalAsyncApi.g:2596:9: ( (lv_payloads_36_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2597:10: (lv_payloads_36_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2597:10: (lv_payloads_36_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2598:11: lv_payloads_36_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPayloadsAbstractSchemaParserRuleCall_3_6_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_payloads_36_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"payloads",
            	    												lv_payloads_36_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2615:9: (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==14) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2616:10: otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_37, grammarAccess.getSchemaAccess().getCommaKeyword_3_6_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2620:10: ( (lv_payloads_38_0= ruleAbstractSchema ) )
            	    	    // InternalAsyncApi.g:2621:11: (lv_payloads_38_0= ruleAbstractSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:2621:11: (lv_payloads_38_0= ruleAbstractSchema )
            	    	    // InternalAsyncApi.g:2622:12: lv_payloads_38_0= ruleAbstractSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getPayloadsAbstractSchemaParserRuleCall_3_6_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_payloads_38_0=ruleAbstractSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"payloads",
            	    	    													lv_payloads_38_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);

            	    otherlv_39=(Token)match(input,20,FOLLOW_34); 

            	    									newLeafNode(otherlv_39, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3_6_5());
            	    								
            	    // InternalAsyncApi.g:2644:9: (otherlv_40= ',' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==14) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalAsyncApi.g:2645:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_40, grammarAccess.getSchemaAccess().getCommaKeyword_3_6_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAsyncApi.g:2656:4: ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2656:4: ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2657:5: {...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalAsyncApi.g:2657:103: ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) )
            	    // InternalAsyncApi.g:2658:6: ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalAsyncApi.g:2661:9: ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) )
            	    // InternalAsyncApi.g:2661:10: {...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2661:19: (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? )
            	    // InternalAsyncApi.g:2661:20: otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_41, grammarAccess.getSchemaAccess().getEnumKeyword_3_7_0());
            	    								
            	    otherlv_42=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_42, grammarAccess.getSchemaAccess().getColonKeyword_3_7_1());
            	    								
            	    otherlv_43=(Token)match(input,17,FOLLOW_15); 

            	    									newLeafNode(otherlv_43, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_3_7_2());
            	    								
            	    // InternalAsyncApi.g:2673:9: ( (lv_enum_44_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2674:10: (lv_enum_44_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2674:10: (lv_enum_44_0= RULE_STRING )
            	    // InternalAsyncApi.g:2675:11: lv_enum_44_0= RULE_STRING
            	    {
            	    lv_enum_44_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_enum_44_0, grammarAccess.getSchemaAccess().getEnumSTRINGTerminalRuleCall_3_7_3_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"enum",
            	    												lv_enum_44_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2691:9: (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==14) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2692:10: otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_45=(Token)match(input,14,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_45, grammarAccess.getSchemaAccess().getCommaKeyword_3_7_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2696:10: ( (lv_enum_46_0= RULE_STRING ) )
            	    	    // InternalAsyncApi.g:2697:11: (lv_enum_46_0= RULE_STRING )
            	    	    {
            	    	    // InternalAsyncApi.g:2697:11: (lv_enum_46_0= RULE_STRING )
            	    	    // InternalAsyncApi.g:2698:12: lv_enum_46_0= RULE_STRING
            	    	    {
            	    	    lv_enum_46_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    	    												newLeafNode(lv_enum_46_0, grammarAccess.getSchemaAccess().getEnumSTRINGTerminalRuleCall_3_7_4_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_46_0,
            	    	    													"org.eclipse.xtext.common.Terminals.STRING");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop61;
            	        }
            	    } while (true);

            	    otherlv_47=(Token)match(input,18,FOLLOW_34); 

            	    									newLeafNode(otherlv_47, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_3_7_5());
            	    								
            	    // InternalAsyncApi.g:2719:9: (otherlv_48= ',' )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==14) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalAsyncApi.g:2720:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_48, grammarAccess.getSchemaAccess().getCommaKeyword_3_7_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchemaAccess().getUnorderedGroup_3());
            				

            }

            otherlv_49=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_49, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleAbstractComponent"
    // InternalAsyncApi.g:2746:1: entryRuleAbstractComponent returns [EObject current=null] : iv_ruleAbstractComponent= ruleAbstractComponent EOF ;
    public final EObject entryRuleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractComponent = null;


        try {
            // InternalAsyncApi.g:2746:58: (iv_ruleAbstractComponent= ruleAbstractComponent EOF )
            // InternalAsyncApi.g:2747:2: iv_ruleAbstractComponent= ruleAbstractComponent EOF
            {
             newCompositeNode(grammarAccess.getAbstractComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractComponent=ruleAbstractComponent();

            state._fsp--;

             current =iv_ruleAbstractComponent; 
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
    // $ANTLR end "entryRuleAbstractComponent"


    // $ANTLR start "ruleAbstractComponent"
    // InternalAsyncApi.g:2753:1: ruleAbstractComponent returns [EObject current=null] : (this_Reference_0= ruleReference | this_Component_1= ruleComponent ) ;
    public final EObject ruleAbstractComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Component_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2759:2: ( (this_Reference_0= ruleReference | this_Component_1= ruleComponent ) )
            // InternalAsyncApi.g:2760:2: (this_Reference_0= ruleReference | this_Component_1= ruleComponent )
            {
            // InternalAsyncApi.g:2760:2: (this_Reference_0= ruleReference | this_Component_1= ruleComponent )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING||LA64_0==11) ) {
                alt64=1;
            }
            else if ( (LA64_0==EOF||LA64_0==14||LA64_0==20||(LA64_0>=43 && LA64_0<=44)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAsyncApi.g:2761:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:2770:3: this_Component_1= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getAbstractComponentAccess().getComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_1=ruleComponent();

                    state._fsp--;


                    			current = this_Component_1;
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
    // $ANTLR end "ruleAbstractComponent"


    // $ANTLR start "entryRuleComponent"
    // InternalAsyncApi.g:2782:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalAsyncApi.g:2782:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalAsyncApi.g:2783:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalAsyncApi.g:2789:1: ruleComponent returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_schemas_5_0 = null;

        EObject lv_schemas_7_0 = null;

        EObject lv_messages_13_0 = null;

        EObject lv_messages_15_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2795:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) ) ) ) )
            // InternalAsyncApi.g:2796:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) ) ) )
            {
            // InternalAsyncApi.g:2796:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) ) ) )
            // InternalAsyncApi.g:2797:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) ) )
            {
            // InternalAsyncApi.g:2797:3: ()
            // InternalAsyncApi.g:2798:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2804:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2805:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2805:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2806:5: ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentAccess().getUnorderedGroup_1());
            				
            // InternalAsyncApi.g:2809:5: ( ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2810:6: ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2810:6: ( ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) ) )*
            loop69:
            do {
                int alt69=3;
                int LA69_0 = input.LA(1);

                if ( LA69_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
                    alt69=1;
                }
                else if ( LA69_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) ) {
                    alt69=2;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAsyncApi.g:2811:4: ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2811:4: ({...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2812:5: {...}? => ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalAsyncApi.g:2812:106: ( ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) ) )
            	    // InternalAsyncApi.g:2813:6: ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalAsyncApi.g:2816:9: ({...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? ) )
            	    // InternalAsyncApi.g:2816:10: {...}? => (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponent", "true");
            	    }
            	    // InternalAsyncApi.g:2816:19: (otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )? )
            	    // InternalAsyncApi.g:2816:20: otherlv_2= '\"schemas\"' otherlv_3= ':' otherlv_4= '{' ( (lv_schemas_5_0= ruleAbstractSchema ) ) (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )* otherlv_8= '}' (otherlv_9= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getSchemasKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getColonKeyword_1_0_1());
            	    								
            	    otherlv_4=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_0_2());
            	    								
            	    // InternalAsyncApi.g:2828:9: ( (lv_schemas_5_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2829:10: (lv_schemas_5_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2829:10: (lv_schemas_5_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2830:11: lv_schemas_5_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getComponentAccess().getSchemasAbstractSchemaParserRuleCall_1_0_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_schemas_5_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentRule());
            	    											}
            	    											add(
            	    												current,
            	    												"schemas",
            	    												lv_schemas_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2847:9: (otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) ) )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==14) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2848:10: otherlv_6= ',' ( (lv_schemas_7_0= ruleAbstractSchema ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_1_0_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2852:10: ( (lv_schemas_7_0= ruleAbstractSchema ) )
            	    	    // InternalAsyncApi.g:2853:11: (lv_schemas_7_0= ruleAbstractSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:2853:11: (lv_schemas_7_0= ruleAbstractSchema )
            	    	    // InternalAsyncApi.g:2854:12: lv_schemas_7_0= ruleAbstractSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentAccess().getSchemasAbstractSchemaParserRuleCall_1_0_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_schemas_7_0=ruleAbstractSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"schemas",
            	    	    													lv_schemas_7_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);

            	    otherlv_8=(Token)match(input,20,FOLLOW_35); 

            	    									newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_0_5());
            	    								
            	    // InternalAsyncApi.g:2876:9: (otherlv_9= ',' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==14) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalAsyncApi.g:2877:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,14,FOLLOW_36); 

            	            										newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getCommaKeyword_1_0_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2888:4: ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2888:4: ({...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2889:5: {...}? => ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponent", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalAsyncApi.g:2889:106: ( ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) ) )
            	    // InternalAsyncApi.g:2890:6: ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalAsyncApi.g:2893:9: ({...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? ) )
            	    // InternalAsyncApi.g:2893:10: {...}? => (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponent", "true");
            	    }
            	    // InternalAsyncApi.g:2893:19: (otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )? )
            	    // InternalAsyncApi.g:2893:20: otherlv_10= '\"messages\"' otherlv_11= ':' otherlv_12= '{' ( (lv_messages_13_0= ruleAbstractMessage ) ) (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )* otherlv_16= '}' (otherlv_17= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getMessagesKeyword_1_1_0());
            	    								
            	    otherlv_11=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getColonKeyword_1_1_1());
            	    								
            	    otherlv_12=(Token)match(input,11,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1_1_2());
            	    								
            	    // InternalAsyncApi.g:2905:9: ( (lv_messages_13_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:2906:10: (lv_messages_13_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:2906:10: (lv_messages_13_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:2907:11: lv_messages_13_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getComponentAccess().getMessagesAbstractMessageParserRuleCall_1_1_3_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_messages_13_0=ruleAbstractMessage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentRule());
            	    											}
            	    											add(
            	    												current,
            	    												"messages",
            	    												lv_messages_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2924:9: (otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) ) )*
            	    loop67:
            	    do {
            	        int alt67=2;
            	        int LA67_0 = input.LA(1);

            	        if ( (LA67_0==14) ) {
            	            alt67=1;
            	        }


            	        switch (alt67) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2925:10: otherlv_14= ',' ( (lv_messages_15_0= ruleAbstractMessage ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getCommaKeyword_1_1_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2929:10: ( (lv_messages_15_0= ruleAbstractMessage ) )
            	    	    // InternalAsyncApi.g:2930:11: (lv_messages_15_0= ruleAbstractMessage )
            	    	    {
            	    	    // InternalAsyncApi.g:2930:11: (lv_messages_15_0= ruleAbstractMessage )
            	    	    // InternalAsyncApi.g:2931:12: lv_messages_15_0= ruleAbstractMessage
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentAccess().getMessagesAbstractMessageParserRuleCall_1_1_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_messages_15_0=ruleAbstractMessage();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"messages",
            	    	    													lv_messages_15_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop67;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,20,FOLLOW_35); 

            	    									newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_1_1_5());
            	    								
            	    // InternalAsyncApi.g:2953:9: (otherlv_17= ',' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==14) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalAsyncApi.g:2954:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,14,FOLLOW_36); 

            	            										newLeafNode(otherlv_17, grammarAccess.getComponentAccess().getCommaKeyword_1_1_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleReference"
    // InternalAsyncApi.g:2976:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAsyncApi.g:2976:50: (iv_ruleReference= ruleReference EOF )
            // InternalAsyncApi.g:2977:2: iv_ruleReference= ruleReference EOF
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
    // InternalAsyncApi.g:2983:1: ruleReference returns [EObject current=null] : ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalAsyncApi.g:2989:2: ( ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalAsyncApi.g:2990:2: ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalAsyncApi.g:2990:2: ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalAsyncApi.g:2991:3: () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            // InternalAsyncApi.g:2991:3: ()
            // InternalAsyncApi.g:2992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2998:3: ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAsyncApi.g:2999:4: ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':'
                    {
                    // InternalAsyncApi.g:2999:4: ( (lv_refname_1_0= RULE_STRING ) )
                    // InternalAsyncApi.g:3000:5: (lv_refname_1_0= RULE_STRING )
                    {
                    // InternalAsyncApi.g:3000:5: (lv_refname_1_0= RULE_STRING )
                    // InternalAsyncApi.g:3001:6: lv_refname_1_0= RULE_STRING
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

                    otherlv_2=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,11,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_4=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getRefKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getColonKeyword_4());
            		
            // InternalAsyncApi.g:3034:3: ( (lv_uri_6_0= RULE_STRING ) )
            // InternalAsyncApi.g:3035:4: (lv_uri_6_0= RULE_STRING )
            {
            // InternalAsyncApi.g:3035:4: (lv_uri_6_0= RULE_STRING )
            // InternalAsyncApi.g:3036:5: lv_uri_6_0= RULE_STRING
            {
            lv_uri_6_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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
    // InternalAsyncApi.g:3060:1: ruleVersionNumber returns [Enumerator current=null] : ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) ) ;
    public final Enumerator ruleVersionNumber() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:3066:2: ( ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) ) )
            // InternalAsyncApi.g:3067:2: ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) )
            {
            // InternalAsyncApi.g:3067:2: ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt71=1;
                }
                break;
            case 47:
                {
                alt71=2;
                }
                break;
            case 48:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalAsyncApi.g:3068:3: (enumLiteral_0= '\"1.0.0\"' )
                    {
                    // InternalAsyncApi.g:3068:3: (enumLiteral_0= '\"1.0.0\"' )
                    // InternalAsyncApi.g:3069:4: enumLiteral_0= '\"1.0.0\"'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVersionNumberAccess().get_100EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVersionNumberAccess().get_100EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3076:3: (enumLiteral_1= '\"1.1.0\"' )
                    {
                    // InternalAsyncApi.g:3076:3: (enumLiteral_1= '\"1.1.0\"' )
                    // InternalAsyncApi.g:3077:4: enumLiteral_1= '\"1.1.0\"'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVersionNumberAccess().get_110EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVersionNumberAccess().get_110EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:3084:3: (enumLiteral_2= '\"1.2.0\"' )
                    {
                    // InternalAsyncApi.g:3084:3: (enumLiteral_2= '\"1.2.0\"' )
                    // InternalAsyncApi.g:3085:4: enumLiteral_2= '\"1.2.0\"'
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
    // InternalAsyncApi.g:3095:1: ruleScheme returns [Enumerator current=null] : ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) ;
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
            // InternalAsyncApi.g:3101:2: ( ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) )
            // InternalAsyncApi.g:3102:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            {
            // InternalAsyncApi.g:3102:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            int alt72=8;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt72=1;
                }
                break;
            case 50:
                {
                alt72=2;
                }
                break;
            case 51:
                {
                alt72=3;
                }
                break;
            case 52:
                {
                alt72=4;
                }
                break;
            case 53:
                {
                alt72=5;
                }
                break;
            case 54:
                {
                alt72=6;
                }
                break;
            case 55:
                {
                alt72=7;
                }
                break;
            case 56:
                {
                alt72=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalAsyncApi.g:3103:3: (enumLiteral_0= '\"amqp\"' )
                    {
                    // InternalAsyncApi.g:3103:3: (enumLiteral_0= '\"amqp\"' )
                    // InternalAsyncApi.g:3104:4: enumLiteral_0= '\"amqp\"'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getAmqpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchemeAccess().getAmqpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3111:3: (enumLiteral_1= '\"amqps\"' )
                    {
                    // InternalAsyncApi.g:3111:3: (enumLiteral_1= '\"amqps\"' )
                    // InternalAsyncApi.g:3112:4: enumLiteral_1= '\"amqps\"'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getAmqpsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchemeAccess().getAmqpsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:3119:3: (enumLiteral_2= '\"mqtt\"' )
                    {
                    // InternalAsyncApi.g:3119:3: (enumLiteral_2= '\"mqtt\"' )
                    // InternalAsyncApi.g:3120:4: enumLiteral_2= '\"mqtt\"'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getMqttEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSchemeAccess().getMqttEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:3127:3: (enumLiteral_3= '\"mqtts\"' )
                    {
                    // InternalAsyncApi.g:3127:3: (enumLiteral_3= '\"mqtts\"' )
                    // InternalAsyncApi.g:3128:4: enumLiteral_3= '\"mqtts\"'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getMqttsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSchemeAccess().getMqttsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:3135:3: (enumLiteral_4= '\"ws\"' )
                    {
                    // InternalAsyncApi.g:3135:3: (enumLiteral_4= '\"ws\"' )
                    // InternalAsyncApi.g:3136:4: enumLiteral_4= '\"ws\"'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getWsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSchemeAccess().getWsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:3143:3: (enumLiteral_5= '\"wss\"' )
                    {
                    // InternalAsyncApi.g:3143:3: (enumLiteral_5= '\"wss\"' )
                    // InternalAsyncApi.g:3144:4: enumLiteral_5= '\"wss\"'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getWssEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSchemeAccess().getWssEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:3151:3: (enumLiteral_6= '\"stomp\"' )
                    {
                    // InternalAsyncApi.g:3151:3: (enumLiteral_6= '\"stomp\"' )
                    // InternalAsyncApi.g:3152:4: enumLiteral_6= '\"stomp\"'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getStompEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSchemeAccess().getStompEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:3159:3: (enumLiteral_7= '\"stomps\"' )
                    {
                    // InternalAsyncApi.g:3159:3: (enumLiteral_7= '\"stomps\"' )
                    // InternalAsyncApi.g:3160:4: enumLiteral_7= '\"stomps\"'
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


    protected DFA63 dfa63 = new DFA63(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\24\11\uffff";
    static final String dfa_3s = "\1\52\11\uffff";
    static final String dfa_4s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\1\uffff\1\4\10\uffff\1\6\1\11\4\uffff\1\10\1\3\1\5\1\7",
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

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2286:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"title\"' otherlv_6= ':' ( (lv_title_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"type\"' otherlv_10= ':' ( (lv_summary_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= RULE_STRING ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"format\"' otherlv_18= ':' ( (lv_format_19_0= RULE_STRING ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= '\"default\"' otherlv_22= ':' ( (lv_default_23_0= RULE_STRING ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"properties\"' otherlv_26= ':' otherlv_27= '{' ( (lv_schemas_28_0= ruleAbstractSchema ) ) (otherlv_29= ',' ( (lv_schemas_30_0= ruleAbstractSchema ) ) )* otherlv_31= '}' (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= '\"payload\"' otherlv_34= ':' otherlv_35= '{' ( (lv_payloads_36_0= ruleAbstractSchema ) ) (otherlv_37= ',' ( (lv_payloads_38_0= ruleAbstractSchema ) ) )* otherlv_39= '}' (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= '\"enum\"' otherlv_42= ':' otherlv_43= '[' ( (lv_enum_44_0= RULE_STRING ) ) (otherlv_45= ',' ( (lv_enum_46_0= RULE_STRING ) ) )* otherlv_47= ']' (otherlv_48= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==20) ) {s = 1;}

                        else if ( LA63_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA63_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA63_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA63_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA63_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA63_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA63_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA63_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000180000000810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000FD04000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000FD00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070104000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030104000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001A1000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001A1104000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000001A1100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x01FE000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000601100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000601104000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001800104000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000E001100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000E001104000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000078601500000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000078601504000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000180000004002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100000L});

}
