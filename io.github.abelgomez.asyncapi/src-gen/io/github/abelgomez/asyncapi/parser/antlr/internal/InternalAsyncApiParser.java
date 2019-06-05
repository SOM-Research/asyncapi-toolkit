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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'\"asyncapi\"'", "':'", "','", "'\"info\"'", "'\"servers\"'", "'['", "']'", "'\"topics\"'", "'}'", "'\"components\"'", "'\"baseTopic\"'", "'\"title\"'", "'\"version\"'", "'\"description\"'", "'\"termsOfService\"'", "'\"contact\"'", "'\"license\"'", "'\"name\"'", "'\"url\"'", "'\"email\"'", "'\"scheme\"'", "'\"variables\"'", "'\"default\"'", "'\"enum\"'", "'\"publish\"'", "'\"subscribe\"'", "'\"summary\"'", "'\"deprecated\"'", "'\"headers\"'", "'\"tags\"'", "'\"payload\"'", "'\"type\"'", "'\"format\"'", "'\"properties\"'", "'\"items\"'", "'\"required\"'", "'\"x-friendly-name\"'", "'\"schemas\"'", "'\"messages\"'", "'\"$ref\"'", "'true'", "'false'", "'\"1.0.0\"'", "'\"1.1.0\"'", "'\"1.2.0\"'", "'\"amqp\"'", "'\"amqps\"'", "'\"mqtt\"'", "'\"mqtts\"'", "'\"ws\"'", "'\"wss\"'", "'\"stomp\"'", "'\"stomps\"'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalAsyncApi.g:72:1: ruleAsyncAPI returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' ) ;
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
        Token otherlv_32=null;
        Token lv_baseTopic_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Enumerator lv_version_5_0 = null;

        EObject lv_info_9_0 = null;

        EObject lv_servers_14_0 = null;

        EObject lv_servers_16_0 = null;

        EObject lv_topics_22_0 = null;

        EObject lv_topics_24_0 = null;

        EObject lv_components_29_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:78:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' ) )
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' )
            {
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' )
            // InternalAsyncApi.g:80:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}'
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
            		
            // InternalAsyncApi.g:91:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:93:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:96:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '[' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= ']' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"topics\"' otherlv_20= ':' otherlv_21= '{' ( (lv_topics_22_0= ruleTopic ) ) (otherlv_23= ',' ( (lv_topics_24_0= ruleTopic ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=7;
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
                else if ( LA9_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5) ) {
                    alt9=6;
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
            	case 6 :
            	    // InternalAsyncApi.g:384:4: ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:384:4: ({...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:385:5: {...}? => ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:385:105: ( ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:386:6: ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:389:9: ({...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:389:10: {...}? => (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:389:19: (otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:389:20: otherlv_31= '\"baseTopic\"' otherlv_32= ':' ( (lv_baseTopic_33_0= RULE_STRING ) ) (otherlv_34= ',' )?
            	    {
            	    otherlv_31=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_31, grammarAccess.getAsyncAPIAccess().getBaseTopicKeyword_2_5_0());
            	    								
            	    otherlv_32=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_32, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:397:9: ( (lv_baseTopic_33_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:398:10: (lv_baseTopic_33_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:398:10: (lv_baseTopic_33_0= RULE_STRING )
            	    // InternalAsyncApi.g:399:11: lv_baseTopic_33_0= RULE_STRING
            	    {
            	    lv_baseTopic_33_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            	    											newLeafNode(lv_baseTopic_33_0, grammarAccess.getAsyncAPIAccess().getBaseTopicSTRINGTerminalRuleCall_2_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"baseTopic",
            	    												lv_baseTopic_33_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:415:9: (otherlv_34= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==14) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAsyncApi.g:416:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,14,FOLLOW_7); 

            	            										newLeafNode(otherlv_34, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_5_3());
            	            									

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


    // $ANTLR start "entryRuleInfo"
    // InternalAsyncApi.g:443:1: entryRuleInfo returns [EObject current=null] : iv_ruleInfo= ruleInfo EOF ;
    public final EObject entryRuleInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfo = null;


        try {
            // InternalAsyncApi.g:443:45: (iv_ruleInfo= ruleInfo EOF )
            // InternalAsyncApi.g:444:2: iv_ruleInfo= ruleInfo EOF
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
    // InternalAsyncApi.g:450:1: ruleInfo returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) ;
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
            // InternalAsyncApi.g:456:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:457:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:457:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:458:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:458:3: ()
            // InternalAsyncApi.g:459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfoAccess().getInfoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:469:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:470:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:470:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:471:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:474:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:475:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:475:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=7;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
                    alt16=4;
                }
                else if ( LA16_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
                    alt16=5;
                }
                else if ( LA16_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
                    alt16=6;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAsyncApi.g:476:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:476:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:477:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:477:101: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:478:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:481:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:481:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:481:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:481:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getInfoAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getInfoAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:489:9: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:490:10: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:490:10: (lv_title_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:491:11: lv_title_5_0= RULE_STRING
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

            	    // InternalAsyncApi.g:507:9: (otherlv_6= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==14) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAsyncApi.g:508:10: otherlv_6= ','
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
            	    // InternalAsyncApi.g:519:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:519:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:520:5: {...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:520:101: ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:521:6: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:524:9: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:524:10: {...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:524:19: (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:524:20: otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getInfoAccess().getVersionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getInfoAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:532:9: ( (lv_version_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:533:10: (lv_version_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:533:10: (lv_version_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:534:11: lv_version_9_0= RULE_STRING
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

            	    // InternalAsyncApi.g:550:9: (otherlv_10= ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==14) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAsyncApi.g:551:10: otherlv_10= ','
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
            	    // InternalAsyncApi.g:562:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:562:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:563:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:563:101: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:564:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:567:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:567:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:567:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:567:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getInfoAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getInfoAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:575:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:576:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:576:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:577:11: lv_description_13_0= RULE_STRING
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

            	    // InternalAsyncApi.g:593:9: (otherlv_14= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==14) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAsyncApi.g:594:10: otherlv_14= ','
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
            	    // InternalAsyncApi.g:605:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:605:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:606:5: {...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:606:101: ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:607:6: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:610:9: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:610:10: {...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:610:19: (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:610:20: otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= RULE_STRING ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getInfoAccess().getTermsOfServiceKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_16, grammarAccess.getInfoAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:618:9: ( (lv_termsOfService_17_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:619:10: (lv_termsOfService_17_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:619:10: (lv_termsOfService_17_0= RULE_STRING )
            	    // InternalAsyncApi.g:620:11: lv_termsOfService_17_0= RULE_STRING
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

            	    // InternalAsyncApi.g:636:9: (otherlv_18= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==14) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAsyncApi.g:637:10: otherlv_18= ','
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
            	    // InternalAsyncApi.g:648:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:648:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:649:5: {...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:649:101: ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:650:6: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:653:9: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:653:10: {...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:653:19: (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:653:20: otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,27,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getInfoAccess().getContactKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getInfoAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:661:9: ( (lv_contact_21_0= ruleContact ) )
            	    // InternalAsyncApi.g:662:10: (lv_contact_21_0= ruleContact )
            	    {
            	    // InternalAsyncApi.g:662:10: (lv_contact_21_0= ruleContact )
            	    // InternalAsyncApi.g:663:11: lv_contact_21_0= ruleContact
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

            	    // InternalAsyncApi.g:680:9: (otherlv_22= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==14) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAsyncApi.g:681:10: otherlv_22= ','
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
            	    // InternalAsyncApi.g:692:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:692:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:693:5: {...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:693:101: ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:694:6: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:697:9: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:697:10: {...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:697:19: (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:697:20: otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getInfoAccess().getLicenseKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getInfoAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:705:9: ( (lv_license_25_0= ruleLicense ) )
            	    // InternalAsyncApi.g:706:10: (lv_license_25_0= ruleLicense )
            	    {
            	    // InternalAsyncApi.g:706:10: (lv_license_25_0= ruleLicense )
            	    // InternalAsyncApi.g:707:11: lv_license_25_0= ruleLicense
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

            	    // InternalAsyncApi.g:724:9: (otherlv_26= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==14) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalAsyncApi.g:725:10: otherlv_26= ','
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalAsyncApi.g:752:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalAsyncApi.g:752:48: (iv_ruleContact= ruleContact EOF )
            // InternalAsyncApi.g:753:2: iv_ruleContact= ruleContact EOF
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
    // InternalAsyncApi.g:759:1: ruleContact returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
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
            // InternalAsyncApi.g:765:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:766:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:766:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:767:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:767:3: ()
            // InternalAsyncApi.g:768:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContactAccess().getContactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:778:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:779:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:779:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:780:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:783:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:784:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:784:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop20:
            do {
                int alt20=4;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
                    alt20=3;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAsyncApi.g:785:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:785:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:786:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:786:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:787:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:790:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:790:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:790:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:790:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getContactAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:798:9: ( (lv_name_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:799:10: (lv_name_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:799:10: (lv_name_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:800:11: lv_name_5_0= RULE_STRING
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

            	    // InternalAsyncApi.g:816:9: (otherlv_6= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==14) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAsyncApi.g:817:10: otherlv_6= ','
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
            	    // InternalAsyncApi.g:828:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:828:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:829:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:829:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:830:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:833:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:833:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:833:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:833:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getContactAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getContactAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:841:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:842:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:842:10: (lv_url_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:843:11: lv_url_9_0= RULE_STRING
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

            	    // InternalAsyncApi.g:859:9: (otherlv_10= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==14) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalAsyncApi.g:860:10: otherlv_10= ','
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
            	    // InternalAsyncApi.g:871:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:871:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:872:5: {...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:872:104: ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:873:6: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:876:9: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:876:10: {...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:876:19: (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:876:20: otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getContactAccess().getEmailKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getContactAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:884:9: ( (lv_email_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:885:10: (lv_email_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:885:10: (lv_email_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:886:11: lv_email_13_0= RULE_STRING
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

            	    // InternalAsyncApi.g:902:9: (otherlv_14= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==14) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalAsyncApi.g:903:10: otherlv_14= ','
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
            	    break loop20;
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
    // InternalAsyncApi.g:929:1: entryRuleLicense returns [EObject current=null] : iv_ruleLicense= ruleLicense EOF ;
    public final EObject entryRuleLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicense = null;


        try {
            // InternalAsyncApi.g:929:48: (iv_ruleLicense= ruleLicense EOF )
            // InternalAsyncApi.g:930:2: iv_ruleLicense= ruleLicense EOF
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
    // InternalAsyncApi.g:936:1: ruleLicense returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // InternalAsyncApi.g:942:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:943:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:943:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:944:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:944:3: ()
            // InternalAsyncApi.g:945:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLicenseAccess().getLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:955:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:956:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:956:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:957:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:960:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:961:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:961:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAsyncApi.g:962:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:962:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:963:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:963:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:964:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:967:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:967:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:967:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:967:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getLicenseAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:975:9: ( (lv_name_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:976:10: (lv_name_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:976:10: (lv_name_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:977:11: lv_name_5_0= RULE_STRING
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

            	    // InternalAsyncApi.g:993:9: (otherlv_6= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==14) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAsyncApi.g:994:10: otherlv_6= ','
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
            	    // InternalAsyncApi.g:1005:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1005:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1006:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1006:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1007:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1010:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1010:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:1010:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1010:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getLicenseAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1018:9: ( (lv_url_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1019:10: (lv_url_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1019:10: (lv_url_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:1020:11: lv_url_9_0= RULE_STRING
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

            	    // InternalAsyncApi.g:1036:9: (otherlv_10= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==14) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalAsyncApi.g:1037:10: otherlv_10= ','
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
            	    break loop23;
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
    // InternalAsyncApi.g:1063:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalAsyncApi.g:1063:47: (iv_ruleServer= ruleServer EOF )
            // InternalAsyncApi.g:1064:2: iv_ruleServer= ruleServer EOF
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
    // InternalAsyncApi.g:1070:1: ruleServer returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
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
            // InternalAsyncApi.g:1076:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' ) )
            // InternalAsyncApi.g:1077:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' )
            {
            // InternalAsyncApi.g:1077:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}' )
            // InternalAsyncApi.g:1078:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_23= '}'
            {
            // InternalAsyncApi.g:1078:3: ()
            // InternalAsyncApi.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerAccess().getServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1089:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:1090:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:1090:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:1091:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServerAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1094:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:1095:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:1095:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=5;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2) ) {
                    alt28=3;
                }
                else if ( LA28_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3) ) {
                    alt28=4;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAsyncApi.g:1096:4: ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1096:4: ({...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1097:5: {...}? => ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1097:103: ( ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1098:6: ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1101:9: ({...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1101:10: {...}? => (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1101:19: (otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1101:20: otherlv_3= '\"url\"' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getServerAccess().getUrlKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getServerAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1109:9: ( (lv_url_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1110:10: (lv_url_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1110:10: (lv_url_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:1111:11: lv_url_5_0= RULE_STRING
            	    {
            	    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    											newLeafNode(lv_url_5_0, grammarAccess.getServerAccess().getUrlSTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getServerRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"url",
            	    												lv_url_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1127:9: (otherlv_6= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==14) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalAsyncApi.g:1128:10: otherlv_6= ','
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
            	    // InternalAsyncApi.g:1139:4: ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1139:4: ({...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1140:5: {...}? => ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1140:103: ( ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1141:6: ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1144:9: ({...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1144:10: {...}? => (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1144:19: (otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1144:20: otherlv_7= '\"scheme\"' otherlv_8= ':' ( (lv_scheme_9_0= ruleScheme ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getServerAccess().getSchemeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_23); 

            	    									newLeafNode(otherlv_8, grammarAccess.getServerAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1152:9: ( (lv_scheme_9_0= ruleScheme ) )
            	    // InternalAsyncApi.g:1153:10: (lv_scheme_9_0= ruleScheme )
            	    {
            	    // InternalAsyncApi.g:1153:10: (lv_scheme_9_0= ruleScheme )
            	    // InternalAsyncApi.g:1154:11: lv_scheme_9_0= ruleScheme
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

            	    // InternalAsyncApi.g:1171:9: (otherlv_10= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==14) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalAsyncApi.g:1172:10: otherlv_10= ','
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
            	    // InternalAsyncApi.g:1183:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1183:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) ) )
            	    // InternalAsyncApi.g:1184:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:1184:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) )
            	    // InternalAsyncApi.g:1185:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:1188:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' ) )
            	    // InternalAsyncApi.g:1188:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1188:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ',' )
            	    // InternalAsyncApi.g:1188:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ','
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getServerAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getServerAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:1196:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1197:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1197:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:1198:11: lv_description_13_0= RULE_STRING
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
            	    // InternalAsyncApi.g:1224:4: ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1224:4: ({...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1225:5: {...}? => ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:1225:103: ( ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:1226:6: ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:1229:9: ({...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:1229:10: {...}? => (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1229:19: (otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:1229:20: otherlv_15= '\"variables\"' otherlv_16= ':' otherlv_17= '{' ( (lv_variables_18_0= ruleVariable ) ) (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )* otherlv_21= '}' (otherlv_22= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getServerAccess().getVariablesKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServerAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_17=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_17, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:1241:9: ( (lv_variables_18_0= ruleVariable ) )
            	    // InternalAsyncApi.g:1242:10: (lv_variables_18_0= ruleVariable )
            	    {
            	    // InternalAsyncApi.g:1242:10: (lv_variables_18_0= ruleVariable )
            	    // InternalAsyncApi.g:1243:11: lv_variables_18_0= ruleVariable
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

            	    // InternalAsyncApi.g:1260:9: (otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==14) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1261:10: otherlv_19= ',' ( (lv_variables_20_0= ruleVariable ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getServerAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1265:10: ( (lv_variables_20_0= ruleVariable ) )
            	    	    // InternalAsyncApi.g:1266:11: (lv_variables_20_0= ruleVariable )
            	    	    {
            	    	    // InternalAsyncApi.g:1266:11: (lv_variables_20_0= ruleVariable )
            	    	    // InternalAsyncApi.g:1267:12: lv_variables_20_0= ruleVariable
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
            	    	    break loop26;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,20,FOLLOW_21); 

            	    									newLeafNode(otherlv_21, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:1289:9: (otherlv_22= ',' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==14) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalAsyncApi.g:1290:10: otherlv_22= ','
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalAsyncApi.g:1317:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAsyncApi.g:1317:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAsyncApi.g:1318:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalAsyncApi.g:1324:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // InternalAsyncApi.g:1330:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalAsyncApi.g:1331:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalAsyncApi.g:1331:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalAsyncApi.g:1332:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalAsyncApi.g:1332:3: ()
            // InternalAsyncApi.g:1333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1339:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:1340:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:1340:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:1341:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalAsyncApi.g:1365:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1366:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1366:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1367:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1370:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1371:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1371:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAsyncApi.g:1372:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1372:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1373:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1373:105: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1374:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1377:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1377:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1377:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1377:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1385:9: ( (lv_description_7_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1386:10: (lv_description_7_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1386:10: (lv_description_7_0= RULE_STRING )
            	    // InternalAsyncApi.g:1387:11: lv_description_7_0= RULE_STRING
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

            	    // InternalAsyncApi.g:1403:9: (otherlv_8= ',' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==14) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalAsyncApi.g:1404:10: otherlv_8= ','
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
            	    // InternalAsyncApi.g:1415:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1415:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1416:5: {...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1416:105: ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1417:6: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1420:9: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1420:10: {...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1420:19: (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1420:20: otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= RULE_STRING ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getDefaultKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1428:9: ( (lv_default_11_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1429:10: (lv_default_11_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1429:10: (lv_default_11_0= RULE_STRING )
            	    // InternalAsyncApi.g:1430:11: lv_default_11_0= RULE_STRING
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

            	    // InternalAsyncApi.g:1446:9: (otherlv_12= ',' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==14) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalAsyncApi.g:1447:10: otherlv_12= ','
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
            	    // InternalAsyncApi.g:1458:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1458:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1459:5: {...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1459:105: ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:1460:6: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1463:9: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:1463:10: {...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1463:19: (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:1463:20: otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= RULE_STRING ) ) (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )* otherlv_19= ']' (otherlv_20= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getEnumKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getColonKeyword_4_2_1());
            	    								
            	    otherlv_15=(Token)match(input,17,FOLLOW_11); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_4_2_2());
            	    								
            	    // InternalAsyncApi.g:1475:9: ( (lv_enum_16_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1476:10: (lv_enum_16_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1476:10: (lv_enum_16_0= RULE_STRING )
            	    // InternalAsyncApi.g:1477:11: lv_enum_16_0= RULE_STRING
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

            	    // InternalAsyncApi.g:1493:9: (otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==14) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1494:10: otherlv_17= ',' ( (lv_enum_18_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getCommaKeyword_4_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1498:10: ( (lv_enum_18_0= RULE_STRING ) )
            	    	    // InternalAsyncApi.g:1499:11: (lv_enum_18_0= RULE_STRING )
            	    	    {
            	    	    // InternalAsyncApi.g:1499:11: (lv_enum_18_0= RULE_STRING )
            	    	    // InternalAsyncApi.g:1500:12: lv_enum_18_0= RULE_STRING
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
            	    	    break loop31;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,18,FOLLOW_26); 

            	    									newLeafNode(otherlv_19, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_4_2_5());
            	    								
            	    // InternalAsyncApi.g:1521:9: (otherlv_20= ',' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==14) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalAsyncApi.g:1522:10: otherlv_20= ','
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
            	    break loop33;
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
    // InternalAsyncApi.g:1548:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalAsyncApi.g:1548:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalAsyncApi.g:1549:2: iv_ruleTopic= ruleTopic EOF
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
    // InternalAsyncApi.g:1555:1: ruleTopic returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
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
            // InternalAsyncApi.g:1561:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalAsyncApi.g:1562:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalAsyncApi.g:1562:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalAsyncApi.g:1563:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // InternalAsyncApi.g:1563:3: ()
            // InternalAsyncApi.g:1564:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicAccess().getTopicAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1570:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:1571:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:1571:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:1572:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalAsyncApi.g:1596:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1597:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1597:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1598:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTopicAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1601:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1602:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1602:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAsyncApi.g:1603:4: ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1603:4: ({...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1604:5: {...}? => ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1604:102: ( ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1605:6: ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1608:9: ({...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1608:10: {...}? => (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "true");
            	    }
            	    // InternalAsyncApi.g:1608:19: (otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1608:20: otherlv_5= '\"publish\"' otherlv_6= ':' ( (lv_publish_7_0= ruleAbstractMessage ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getTopicAccess().getPublishKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1616:9: ( (lv_publish_7_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:1617:10: (lv_publish_7_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:1617:10: (lv_publish_7_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:1618:11: lv_publish_7_0= ruleAbstractMessage
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

            	    // InternalAsyncApi.g:1635:9: (otherlv_8= ',' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==14) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAsyncApi.g:1636:10: otherlv_8= ','
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
            	    // InternalAsyncApi.g:1647:4: ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1647:4: ({...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1648:5: {...}? => ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "getUnorderedGroupHelper().canSelect(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1648:102: ( ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1649:6: ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTopicAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1652:9: ({...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1652:10: {...}? => (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTopic", "true");
            	    }
            	    // InternalAsyncApi.g:1652:19: (otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1652:20: otherlv_9= '\"subscribe\"' otherlv_10= ':' ( (lv_subscribe_11_0= ruleAbstractMessage ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTopicAccess().getSubscribeKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTopicAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1660:9: ( (lv_subscribe_11_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:1661:10: (lv_subscribe_11_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:1661:10: (lv_subscribe_11_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:1662:11: lv_subscribe_11_0= ruleAbstractMessage
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

            	    // InternalAsyncApi.g:1679:9: (otherlv_12= ',' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==14) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAsyncApi.g:1680:10: otherlv_12= ','
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
            	    break loop36;
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
    // InternalAsyncApi.g:1706:1: entryRuleAbstractMessage returns [EObject current=null] : iv_ruleAbstractMessage= ruleAbstractMessage EOF ;
    public final EObject entryRuleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessage = null;


        try {
            // InternalAsyncApi.g:1706:56: (iv_ruleAbstractMessage= ruleAbstractMessage EOF )
            // InternalAsyncApi.g:1707:2: iv_ruleAbstractMessage= ruleAbstractMessage EOF
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
    // InternalAsyncApi.g:1713:1: ruleAbstractMessage returns [EObject current=null] : (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) ;
    public final EObject ruleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1719:2: ( (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) )
            // InternalAsyncApi.g:1720:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            {
            // InternalAsyncApi.g:1720:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==11) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==20||LA37_2==25||(LA37_2>=38 && LA37_2<=42)) ) {
                    alt37=2;
                }
                else if ( (LA37_2==51) ) {
                    alt37=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalAsyncApi.g:1721:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:1730:3: this_Message_1= ruleMessage
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
    // InternalAsyncApi.g:1742:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalAsyncApi.g:1742:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalAsyncApi.g:1743:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalAsyncApi.g:1749:1: ruleMessage returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) ) ) otherlv_31= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_deprecated_13_0 = null;

        EObject lv_headers_17_0 = null;

        EObject lv_tags_22_0 = null;

        EObject lv_tags_24_0 = null;

        EObject lv_payload_29_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1755:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) ) ) otherlv_31= '}' ) )
            // InternalAsyncApi.g:1756:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) ) ) otherlv_31= '}' )
            {
            // InternalAsyncApi.g:1756:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) ) ) otherlv_31= '}' )
            // InternalAsyncApi.g:1757:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) ) ) otherlv_31= '}'
            {
            // InternalAsyncApi.g:1757:3: ()
            // InternalAsyncApi.g:1758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageAccess().getMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1768:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1769:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1769:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1770:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1773:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1774:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1774:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) ) )*
            loop45:
            do {
                int alt45=7;
                int LA45_0 = input.LA(1);

                if ( LA45_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
                    alt45=2;
                }
                else if ( LA45_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
                    alt45=3;
                }
                else if ( LA45_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
                    alt45=4;
                }
                else if ( LA45_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {
                    alt45=5;
                }
                else if ( LA45_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {
                    alt45=6;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAsyncApi.g:1775:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1775:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1776:5: {...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1776:104: ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1777:6: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1780:9: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1780:10: {...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1780:19: (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1780:20: otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getSummaryKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1788:9: ( (lv_summary_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1789:10: (lv_summary_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1789:10: (lv_summary_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:1790:11: lv_summary_5_0= RULE_STRING
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

            	    // InternalAsyncApi.g:1806:9: (otherlv_6= ',' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==14) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalAsyncApi.g:1807:10: otherlv_6= ','
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
            	    // InternalAsyncApi.g:1818:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1818:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1819:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1819:104: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1820:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1823:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1823:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1823:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1823:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1831:9: ( (lv_description_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:1832:10: (lv_description_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:1832:10: (lv_description_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:1833:11: lv_description_9_0= RULE_STRING
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

            	    // InternalAsyncApi.g:1849:9: (otherlv_10= ',' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==14) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalAsyncApi.g:1850:10: otherlv_10= ','
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
            	    // InternalAsyncApi.g:1861:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1861:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1862:5: {...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:1862:104: ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:1863:6: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:1866:9: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:1866:10: {...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1866:19: (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:1866:20: otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getDeprecatedKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_32); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:1874:9: ( (lv_deprecated_13_0= ruleBoolean ) )
            	    // InternalAsyncApi.g:1875:10: (lv_deprecated_13_0= ruleBoolean )
            	    {
            	    // InternalAsyncApi.g:1875:10: (lv_deprecated_13_0= ruleBoolean )
            	    // InternalAsyncApi.g:1876:11: lv_deprecated_13_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getDeprecatedBooleanEnumRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_deprecated_13_0=ruleBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deprecated",
            	    												lv_deprecated_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Boolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1893:9: (otherlv_14= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==14) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAsyncApi.g:1894:10: otherlv_14= ','
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
            	    // InternalAsyncApi.g:1905:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1905:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1906:5: {...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:1906:104: ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:1907:6: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:1910:9: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:1910:10: {...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1910:19: (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:1910:20: otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getHeadersKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:1918:9: ( (lv_headers_17_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:1919:10: (lv_headers_17_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:1919:10: (lv_headers_17_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:1920:11: lv_headers_17_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getHeadersAbstractSchemaParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_headers_17_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"headers",
            	    												lv_headers_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1937:9: (otherlv_18= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==14) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalAsyncApi.g:1938:10: otherlv_18= ','
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
            	case 5 :
            	    // InternalAsyncApi.g:1949:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1949:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1950:5: {...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:1950:104: ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:1951:6: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:1954:9: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:1954:10: {...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:1954:19: (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:1954:20: otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getTagsKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_21=(Token)match(input,17,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getMessageAccess().getLeftSquareBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:1966:9: ( (lv_tags_22_0= ruleTag ) )
            	    // InternalAsyncApi.g:1967:10: (lv_tags_22_0= ruleTag )
            	    {
            	    // InternalAsyncApi.g:1967:10: (lv_tags_22_0= ruleTag )
            	    // InternalAsyncApi.g:1968:11: lv_tags_22_0= ruleTag
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_tags_22_0=ruleTag();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											add(
            	    												current,
            	    												"tags",
            	    												lv_tags_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1985:9: (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==14) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1986:10: otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,14,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1990:10: ( (lv_tags_24_0= ruleTag ) )
            	    	    // InternalAsyncApi.g:1991:11: (lv_tags_24_0= ruleTag )
            	    	    {
            	    	    // InternalAsyncApi.g:1991:11: (lv_tags_24_0= ruleTag )
            	    	    // InternalAsyncApi.g:1992:12: lv_tags_24_0= ruleTag
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_tags_24_0=ruleTag();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"tags",
            	    	    													lv_tags_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,18,FOLLOW_31); 

            	    									newLeafNode(otherlv_25, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:2014:9: (otherlv_26= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==14) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalAsyncApi.g:2015:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,14,FOLLOW_30); 

            	            										newLeafNode(otherlv_26, grammarAccess.getMessageAccess().getCommaKeyword_2_4_6());
            	            									

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
            	case 6 :
            	    // InternalAsyncApi.g:2026:4: ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2026:4: ({...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2027:5: {...}? => ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:2027:104: ( ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:2028:6: ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:2031:9: ({...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:2031:10: {...}? => (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2031:19: (otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:2031:20: otherlv_27= '\"payload\"' otherlv_28= ':' ( (lv_payload_29_0= ruleAbstractSchema ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getMessageAccess().getPayloadKeyword_2_5_0());
            	    								
            	    otherlv_28=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_28, grammarAccess.getMessageAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:2039:9: ( (lv_payload_29_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2040:10: (lv_payload_29_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2040:10: (lv_payload_29_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2041:11: lv_payload_29_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getPayloadAbstractSchemaParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_payload_29_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"payload",
            	    												lv_payload_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2058:9: (otherlv_30= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==14) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalAsyncApi.g:2059:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,14,FOLLOW_30); 

            	            										newLeafNode(otherlv_30, grammarAccess.getMessageAccess().getCommaKeyword_2_5_3());
            	            									

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
            	    break loop45;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				

            }

            otherlv_31=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalAsyncApi.g:2085:1: entryRuleNamedMessage returns [EObject current=null] : iv_ruleNamedMessage= ruleNamedMessage EOF ;
    public final EObject entryRuleNamedMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessage = null;


        try {
            // InternalAsyncApi.g:2085:53: (iv_ruleNamedMessage= ruleNamedMessage EOF )
            // InternalAsyncApi.g:2086:2: iv_ruleNamedMessage= ruleNamedMessage EOF
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
    // InternalAsyncApi.g:2092:1: ruleNamedMessage returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) ;
    public final EObject ruleNamedMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2098:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) )
            // InternalAsyncApi.g:2099:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            {
            // InternalAsyncApi.g:2099:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            // InternalAsyncApi.g:2100:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) )
            {
            // InternalAsyncApi.g:2100:3: ()
            // InternalAsyncApi.g:2101:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageAccess().getNamedMessageAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2107:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:2108:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:2108:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:2109:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalAsyncApi.g:2129:3: ( (lv_message_3_0= ruleAbstractMessage ) )
            // InternalAsyncApi.g:2130:4: (lv_message_3_0= ruleAbstractMessage )
            {
            // InternalAsyncApi.g:2130:4: (lv_message_3_0= ruleAbstractMessage )
            // InternalAsyncApi.g:2131:5: lv_message_3_0= ruleAbstractMessage
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


    // $ANTLR start "entryRuleTag"
    // InternalAsyncApi.g:2152:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalAsyncApi.g:2152:44: (iv_ruleTag= ruleTag EOF )
            // InternalAsyncApi.g:2153:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalAsyncApi.g:2159:1: ruleTag returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:2165:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:2166:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:2166:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:2167:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:2167:3: ()
            // InternalAsyncApi.g:2168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2178:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2179:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2179:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2180:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTagAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2183:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2184:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2184:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
                    alt48=2;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAsyncApi.g:2185:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2185:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2186:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2186:100: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2187:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2190:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2190:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2190:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2190:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTagAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTagAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2198:9: ( (lv_name_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2199:10: (lv_name_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2199:10: (lv_name_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:2200:11: lv_name_5_0= RULE_STRING
            	    {
            	    lv_name_5_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_name_5_0, grammarAccess.getTagAccess().getNameSTRINGTerminalRuleCall_2_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTagRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2216:9: (otherlv_6= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==14) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalAsyncApi.g:2217:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_6, grammarAccess.getTagAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTagAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2228:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2228:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2229:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2229:100: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2230:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2233:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2233:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2233:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2233:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTagAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTagAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2241:9: ( (lv_description_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2242:10: (lv_description_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2242:10: (lv_description_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:2243:11: lv_description_9_0= RULE_STRING
            	    {
            	    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_description_9_0, grammarAccess.getTagAccess().getDescriptionSTRINGTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTagRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2259:9: (otherlv_10= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==14) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalAsyncApi.g:2260:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_33); 

            	            										newLeafNode(otherlv_10, grammarAccess.getTagAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTagAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTagAccess().getUnorderedGroup_2());
            				

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTagAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleAbstractSchema"
    // InternalAsyncApi.g:2286:1: entryRuleAbstractSchema returns [EObject current=null] : iv_ruleAbstractSchema= ruleAbstractSchema EOF ;
    public final EObject entryRuleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSchema = null;


        try {
            // InternalAsyncApi.g:2286:55: (iv_ruleAbstractSchema= ruleAbstractSchema EOF )
            // InternalAsyncApi.g:2287:2: iv_ruleAbstractSchema= ruleAbstractSchema EOF
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
    // InternalAsyncApi.g:2293:1: ruleAbstractSchema returns [EObject current=null] : (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) ;
    public final EObject ruleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Schema_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2299:2: ( (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) )
            // InternalAsyncApi.g:2300:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            {
            // InternalAsyncApi.g:2300:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            else if ( (LA49_0==11) ) {
                int LA49_2 = input.LA(2);

                if ( (LA49_2==20||LA49_2==23||LA49_2==25||(LA49_2>=34 && LA49_2<=35)||(LA49_2>=42 && LA49_2<=48)) ) {
                    alt49=2;
                }
                else if ( (LA49_2==51) ) {
                    alt49=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalAsyncApi.g:2301:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:2310:3: this_Schema_1= ruleSchema
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
    // InternalAsyncApi.g:2322:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalAsyncApi.g:2322:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalAsyncApi.g:2323:2: iv_ruleSchema= ruleSchema EOF
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
    // InternalAsyncApi.g:2329:1: ruleSchema returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' ) ;
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
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token lv_required_50_0=null;
        Token otherlv_51=null;
        Token lv_required_52_0=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token lv_friendlyName_57_0=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        AntlrDatatypeRuleToken lv_default_21_0 = null;

        EObject lv_payload_25_0 = null;

        EObject lv_properties_30_0 = null;

        EObject lv_properties_32_0 = null;

        AntlrDatatypeRuleToken lv_enum_38_0 = null;

        AntlrDatatypeRuleToken lv_enum_40_0 = null;

        EObject lv_items_45_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2335:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' ) )
            // InternalAsyncApi.g:2336:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' )
            {
            // InternalAsyncApi.g:2336:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' )
            // InternalAsyncApi.g:2337:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}'
            {
            // InternalAsyncApi.g:2337:3: ()
            // InternalAsyncApi.g:2338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2348:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2349:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2349:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2350:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2353:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2354:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2354:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )*
            loop64:
            do {
                int alt64=12;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // InternalAsyncApi.g:2355:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2355:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2356:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2356:103: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2357:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2360:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2360:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2360:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2360:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2368:9: ( (lv_title_5_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2369:10: (lv_title_5_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2369:10: (lv_title_5_0= RULE_STRING )
            	    // InternalAsyncApi.g:2370:11: lv_title_5_0= RULE_STRING
            	    {
            	    lv_title_5_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            	    // InternalAsyncApi.g:2386:9: (otherlv_6= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==14) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalAsyncApi.g:2387:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:2398:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2398:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2399:5: {...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2399:103: ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2400:6: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2403:9: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2403:10: {...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2403:19: (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2403:20: otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getTypeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2411:9: ( (lv_type_9_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2412:10: (lv_type_9_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2412:10: (lv_type_9_0= RULE_STRING )
            	    // InternalAsyncApi.g:2413:11: lv_type_9_0= RULE_STRING
            	    {
            	    lv_type_9_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            	    // InternalAsyncApi.g:2429:9: (otherlv_10= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==14) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalAsyncApi.g:2430:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:2441:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2441:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2442:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:2442:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:2443:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:2446:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:2446:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2446:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:2446:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getSchemaAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2454:9: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2455:10: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2455:10: (lv_description_13_0= RULE_STRING )
            	    // InternalAsyncApi.g:2456:11: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            	    // InternalAsyncApi.g:2472:9: (otherlv_14= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==14) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalAsyncApi.g:2473:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,14,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:2484:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2484:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2485:5: {...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2485:103: ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2486:6: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2489:9: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2489:10: {...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2489:19: (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2489:20: otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getSchemaAccess().getFormatKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_16, grammarAccess.getSchemaAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2497:9: ( (lv_format_17_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2498:10: (lv_format_17_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2498:10: (lv_format_17_0= RULE_STRING )
            	    // InternalAsyncApi.g:2499:11: lv_format_17_0= RULE_STRING
            	    {
            	    lv_format_17_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            	    // InternalAsyncApi.g:2515:9: (otherlv_18= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==14) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalAsyncApi.g:2516:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:2527:4: ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2527:4: ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2528:5: {...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2528:103: ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:2529:6: ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2532:9: ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:2532:10: {...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2532:19: (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:2532:20: otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getSchemaAccess().getDefaultKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,13,FOLLOW_37); 

            	    									newLeafNode(otherlv_20, grammarAccess.getSchemaAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:2540:9: ( (lv_default_21_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:2541:10: (lv_default_21_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:2541:10: (lv_default_21_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:2542:11: lv_default_21_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDefaultPrimitiveValueParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_default_21_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2559:9: (otherlv_22= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==14) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalAsyncApi.g:2560:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,14,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:2571:4: ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2571:4: ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2572:5: {...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:2572:103: ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2573:6: ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:2576:9: ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2576:10: {...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2576:19: (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2576:20: otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getSchemaAccess().getPayloadKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_24, grammarAccess.getSchemaAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:2584:9: ( (lv_payload_25_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2585:10: (lv_payload_25_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2585:10: (lv_payload_25_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2586:11: lv_payload_25_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPayloadAbstractSchemaParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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

            	    // InternalAsyncApi.g:2603:9: (otherlv_26= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==14) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalAsyncApi.g:2604:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,14,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:2615:4: ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2615:4: ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2616:5: {...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:2616:103: ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:2617:6: ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:2620:9: ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:2620:10: {...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2620:19: (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:2620:20: otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,45,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSchemaAccess().getPropertiesKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_28, grammarAccess.getSchemaAccess().getColonKeyword_2_6_1());
            	    								
            	    otherlv_29=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_29, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_6_2());
            	    								
            	    // InternalAsyncApi.g:2632:9: ( (lv_properties_30_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:2633:10: (lv_properties_30_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:2633:10: (lv_properties_30_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:2634:11: lv_properties_30_0= ruleNamedSchema
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

            	    // InternalAsyncApi.g:2651:9: (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==14) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2652:10: otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getSchemaAccess().getCommaKeyword_2_6_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2656:10: ( (lv_properties_32_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:2657:11: (lv_properties_32_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:2657:11: (lv_properties_32_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:2658:12: lv_properties_32_0= ruleNamedSchema
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
            	    	    break loop56;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,20,FOLLOW_36); 

            	    									newLeafNode(otherlv_33, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_6_5());
            	    								
            	    // InternalAsyncApi.g:2680:9: (otherlv_34= ',' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==14) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalAsyncApi.g:2681:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,14,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:2692:4: ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2692:4: ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2693:5: {...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:2693:103: ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) )
            	    // InternalAsyncApi.g:2694:6: ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:2697:9: ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) )
            	    // InternalAsyncApi.g:2697:10: {...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2697:19: (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? )
            	    // InternalAsyncApi.g:2697:20: otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getSchemaAccess().getEnumKeyword_2_7_0());
            	    								
            	    otherlv_36=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_36, grammarAccess.getSchemaAccess().getColonKeyword_2_7_1());
            	    								
            	    otherlv_37=(Token)match(input,17,FOLLOW_37); 

            	    									newLeafNode(otherlv_37, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_7_2());
            	    								
            	    // InternalAsyncApi.g:2709:9: ( (lv_enum_38_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:2710:10: (lv_enum_38_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:2710:10: (lv_enum_38_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:2711:11: lv_enum_38_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_7_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_enum_38_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enum",
            	    												lv_enum_38_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2728:9: (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==14) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2729:10: otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,14,FOLLOW_37); 

            	    	    										newLeafNode(otherlv_39, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2733:10: ( (lv_enum_40_0= rulePrimitiveValue ) )
            	    	    // InternalAsyncApi.g:2734:11: (lv_enum_40_0= rulePrimitiveValue )
            	    	    {
            	    	    // InternalAsyncApi.g:2734:11: (lv_enum_40_0= rulePrimitiveValue )
            	    	    // InternalAsyncApi.g:2735:12: lv_enum_40_0= rulePrimitiveValue
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_7_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_enum_40_0=rulePrimitiveValue();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_40_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);

            	    otherlv_41=(Token)match(input,18,FOLLOW_36); 

            	    									newLeafNode(otherlv_41, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_7_5());
            	    								
            	    // InternalAsyncApi.g:2757:9: (otherlv_42= ',' )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==14) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalAsyncApi.g:2758:10: otherlv_42= ','
            	            {
            	            otherlv_42=(Token)match(input,14,FOLLOW_35); 

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
            	case 9 :
            	    // InternalAsyncApi.g:2769:4: ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2769:4: ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2770:5: {...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalAsyncApi.g:2770:103: ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) )
            	    // InternalAsyncApi.g:2771:6: ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalAsyncApi.g:2774:9: ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) )
            	    // InternalAsyncApi.g:2774:10: {...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2774:19: (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? )
            	    // InternalAsyncApi.g:2774:20: otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )?
            	    {
            	    otherlv_43=(Token)match(input,46,FOLLOW_4); 

            	    									newLeafNode(otherlv_43, grammarAccess.getSchemaAccess().getItemsKeyword_2_8_0());
            	    								
            	    otherlv_44=(Token)match(input,13,FOLLOW_28); 

            	    									newLeafNode(otherlv_44, grammarAccess.getSchemaAccess().getColonKeyword_2_8_1());
            	    								
            	    // InternalAsyncApi.g:2782:9: ( (lv_items_45_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2783:10: (lv_items_45_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2783:10: (lv_items_45_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2784:11: lv_items_45_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getItemsAbstractSchemaParserRuleCall_2_8_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_items_45_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"items",
            	    												lv_items_45_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2801:9: (otherlv_46= ',' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==14) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalAsyncApi.g:2802:10: otherlv_46= ','
            	            {
            	            otherlv_46=(Token)match(input,14,FOLLOW_35); 

            	            										newLeafNode(otherlv_46, grammarAccess.getSchemaAccess().getCommaKeyword_2_8_3());
            	            									

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
            	case 10 :
            	    // InternalAsyncApi.g:2813:4: ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2813:4: ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2814:5: {...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalAsyncApi.g:2814:103: ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) )
            	    // InternalAsyncApi.g:2815:6: ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalAsyncApi.g:2818:9: ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) )
            	    // InternalAsyncApi.g:2818:10: {...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2818:19: (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? )
            	    // InternalAsyncApi.g:2818:20: otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )?
            	    {
            	    otherlv_47=(Token)match(input,47,FOLLOW_4); 

            	    									newLeafNode(otherlv_47, grammarAccess.getSchemaAccess().getRequiredKeyword_2_9_0());
            	    								
            	    otherlv_48=(Token)match(input,13,FOLLOW_9); 

            	    									newLeafNode(otherlv_48, grammarAccess.getSchemaAccess().getColonKeyword_2_9_1());
            	    								
            	    otherlv_49=(Token)match(input,17,FOLLOW_11); 

            	    									newLeafNode(otherlv_49, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_9_2());
            	    								
            	    // InternalAsyncApi.g:2830:9: ( (lv_required_50_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2831:10: (lv_required_50_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2831:10: (lv_required_50_0= RULE_STRING )
            	    // InternalAsyncApi.g:2832:11: lv_required_50_0= RULE_STRING
            	    {
            	    lv_required_50_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_required_50_0, grammarAccess.getSchemaAccess().getRequiredSTRINGTerminalRuleCall_2_9_3_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											addWithLastConsumed(
            	    												current,
            	    												"required",
            	    												lv_required_50_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2848:9: (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==14) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2849:10: otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_51, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2853:10: ( (lv_required_52_0= RULE_STRING ) )
            	    	    // InternalAsyncApi.g:2854:11: (lv_required_52_0= RULE_STRING )
            	    	    {
            	    	    // InternalAsyncApi.g:2854:11: (lv_required_52_0= RULE_STRING )
            	    	    // InternalAsyncApi.g:2855:12: lv_required_52_0= RULE_STRING
            	    	    {
            	    	    lv_required_52_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    	    												newLeafNode(lv_required_52_0, grammarAccess.getSchemaAccess().getRequiredSTRINGTerminalRuleCall_2_9_4_1_0());
            	    	    											

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												addWithLastConsumed(
            	    	    													current,
            	    	    													"required",
            	    	    													lv_required_52_0,
            	    	    													"org.eclipse.xtext.common.Terminals.STRING");
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop61;
            	        }
            	    } while (true);

            	    otherlv_53=(Token)match(input,18,FOLLOW_36); 

            	    									newLeafNode(otherlv_53, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_9_5());
            	    								
            	    // InternalAsyncApi.g:2876:9: (otherlv_54= ',' )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==14) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalAsyncApi.g:2877:10: otherlv_54= ','
            	            {
            	            otherlv_54=(Token)match(input,14,FOLLOW_35); 

            	            										newLeafNode(otherlv_54, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_6());
            	            									

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
            	case 11 :
            	    // InternalAsyncApi.g:2888:4: ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2888:4: ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2889:5: {...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalAsyncApi.g:2889:104: ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) )
            	    // InternalAsyncApi.g:2890:6: ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalAsyncApi.g:2893:9: ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) )
            	    // InternalAsyncApi.g:2893:10: {...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2893:19: (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? )
            	    // InternalAsyncApi.g:2893:20: otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )?
            	    {
            	    otherlv_55=(Token)match(input,48,FOLLOW_4); 

            	    									newLeafNode(otherlv_55, grammarAccess.getSchemaAccess().getXFriendlyNameKeyword_2_10_0());
            	    								
            	    otherlv_56=(Token)match(input,13,FOLLOW_11); 

            	    									newLeafNode(otherlv_56, grammarAccess.getSchemaAccess().getColonKeyword_2_10_1());
            	    								
            	    // InternalAsyncApi.g:2901:9: ( (lv_friendlyName_57_0= RULE_STRING ) )
            	    // InternalAsyncApi.g:2902:10: (lv_friendlyName_57_0= RULE_STRING )
            	    {
            	    // InternalAsyncApi.g:2902:10: (lv_friendlyName_57_0= RULE_STRING )
            	    // InternalAsyncApi.g:2903:11: lv_friendlyName_57_0= RULE_STRING
            	    {
            	    lv_friendlyName_57_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            	    											newLeafNode(lv_friendlyName_57_0, grammarAccess.getSchemaAccess().getFriendlyNameSTRINGTerminalRuleCall_2_10_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"friendlyName",
            	    												lv_friendlyName_57_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2919:9: (otherlv_58= ',' )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==14) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalAsyncApi.g:2920:10: otherlv_58= ','
            	            {
            	            otherlv_58=(Token)match(input,14,FOLLOW_35); 

            	            										newLeafNode(otherlv_58, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_3());
            	            									

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
            	    break loop64;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				

            }

            otherlv_59=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_59, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalAsyncApi.g:2946:1: entryRuleNamedSchema returns [EObject current=null] : iv_ruleNamedSchema= ruleNamedSchema EOF ;
    public final EObject entryRuleNamedSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedSchema = null;


        try {
            // InternalAsyncApi.g:2946:52: (iv_ruleNamedSchema= ruleNamedSchema EOF )
            // InternalAsyncApi.g:2947:2: iv_ruleNamedSchema= ruleNamedSchema EOF
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
    // InternalAsyncApi.g:2953:1: ruleNamedSchema returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleNamedSchema() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_schema_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2959:2: ( ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) )
            // InternalAsyncApi.g:2960:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            {
            // InternalAsyncApi.g:2960:2: ( () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            // InternalAsyncApi.g:2961:3: () ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) )
            {
            // InternalAsyncApi.g:2961:3: ()
            // InternalAsyncApi.g:2962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedSchemaAccess().getNamedSchemaAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2968:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAsyncApi.g:2969:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAsyncApi.g:2969:4: (lv_name_1_0= RULE_STRING )
            // InternalAsyncApi.g:2970:5: lv_name_1_0= RULE_STRING
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
            		
            // InternalAsyncApi.g:2990:3: ( (lv_schema_3_0= ruleAbstractSchema ) )
            // InternalAsyncApi.g:2991:4: (lv_schema_3_0= ruleAbstractSchema )
            {
            // InternalAsyncApi.g:2991:4: (lv_schema_3_0= ruleAbstractSchema )
            // InternalAsyncApi.g:2992:5: lv_schema_3_0= ruleAbstractSchema
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
    // InternalAsyncApi.g:3013:1: entryRuleComponents returns [EObject current=null] : iv_ruleComponents= ruleComponents EOF ;
    public final EObject entryRuleComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponents = null;


        try {
            // InternalAsyncApi.g:3013:51: (iv_ruleComponents= ruleComponents EOF )
            // InternalAsyncApi.g:3014:2: iv_ruleComponents= ruleComponents EOF
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
    // InternalAsyncApi.g:3020:1: ruleComponents returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' ) ;
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
            // InternalAsyncApi.g:3026:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' ) )
            // InternalAsyncApi.g:3027:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' )
            {
            // InternalAsyncApi.g:3027:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}' )
            // InternalAsyncApi.g:3028:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) ) otherlv_19= '}'
            {
            // InternalAsyncApi.g:3028:3: ()
            // InternalAsyncApi.g:3029:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentsAccess().getComponentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:3039:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:3040:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:3040:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:3041:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:3044:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:3045:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:3045:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) )*
            loop69:
            do {
                int alt69=3;
                int LA69_0 = input.LA(1);

                if ( LA69_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
                    alt69=1;
                }
                else if ( LA69_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
                    alt69=2;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalAsyncApi.g:3046:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3046:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3047:5: {...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:3047:107: ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:3048:6: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:3051:9: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:3051:10: {...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:3051:19: (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:3051:20: otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentsAccess().getSchemasKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentsAccess().getColonKeyword_2_0_1());
            	    								
            	    otherlv_5=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_5, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_0_2());
            	    								
            	    // InternalAsyncApi.g:3063:9: ( (lv_schemas_6_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:3064:10: (lv_schemas_6_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:3064:10: (lv_schemas_6_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:3065:11: lv_schemas_6_0= ruleNamedSchema
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

            	    // InternalAsyncApi.g:3082:9: (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==14) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3083:10: otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getComponentsAccess().getCommaKeyword_2_0_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3087:10: ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:3088:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:3088:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:3089:12: lv_schemas_8_0= ruleNamedSchema
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
            	    	    break loop65;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,20,FOLLOW_39); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_0_5());
            	    								
            	    // InternalAsyncApi.g:3111:9: (otherlv_10= ',' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==14) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalAsyncApi.g:3112:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,14,FOLLOW_38); 

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
            	    // InternalAsyncApi.g:3123:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3123:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3124:5: {...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:3124:107: ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:3125:6: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:3128:9: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:3128:10: {...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:3128:19: (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:3128:20: otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentsAccess().getMessagesKeyword_2_1_0());
            	    								
            	    otherlv_12=(Token)match(input,13,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentsAccess().getColonKeyword_2_1_1());
            	    								
            	    otherlv_13=(Token)match(input,11,FOLLOW_11); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_1_2());
            	    								
            	    // InternalAsyncApi.g:3140:9: ( (lv_messages_14_0= ruleNamedMessage ) )
            	    // InternalAsyncApi.g:3141:10: (lv_messages_14_0= ruleNamedMessage )
            	    {
            	    // InternalAsyncApi.g:3141:10: (lv_messages_14_0= ruleNamedMessage )
            	    // InternalAsyncApi.g:3142:11: lv_messages_14_0= ruleNamedMessage
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

            	    // InternalAsyncApi.g:3159:9: (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )*
            	    loop67:
            	    do {
            	        int alt67=2;
            	        int LA67_0 = input.LA(1);

            	        if ( (LA67_0==14) ) {
            	            alt67=1;
            	        }


            	        switch (alt67) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3160:10: otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,14,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getComponentsAccess().getCommaKeyword_2_1_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3164:10: ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    // InternalAsyncApi.g:3165:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    {
            	    	    // InternalAsyncApi.g:3165:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    // InternalAsyncApi.g:3166:12: lv_messages_16_0= ruleNamedMessage
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
            	    	    break loop67;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,20,FOLLOW_39); 

            	    									newLeafNode(otherlv_17, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_1_5());
            	    								
            	    // InternalAsyncApi.g:3188:9: (otherlv_18= ',' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==14) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalAsyncApi.g:3189:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,14,FOLLOW_38); 

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
            	    break loop69;
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
    // InternalAsyncApi.g:3215:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAsyncApi.g:3215:50: (iv_ruleReference= ruleReference EOF )
            // InternalAsyncApi.g:3216:2: iv_ruleReference= ruleReference EOF
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
    // InternalAsyncApi.g:3222:1: ruleReference returns [EObject current=null] : ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalAsyncApi.g:3228:2: ( ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalAsyncApi.g:3229:2: ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalAsyncApi.g:3229:2: ( () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalAsyncApi.g:3230:3: () ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )? otherlv_3= '{' otherlv_4= '\"$ref\"' otherlv_5= ':' ( (lv_uri_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            // InternalAsyncApi.g:3230:3: ()
            // InternalAsyncApi.g:3231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:3237:3: ( ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_STRING) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAsyncApi.g:3238:4: ( (lv_refname_1_0= RULE_STRING ) ) otherlv_2= ':'
                    {
                    // InternalAsyncApi.g:3238:4: ( (lv_refname_1_0= RULE_STRING ) )
                    // InternalAsyncApi.g:3239:5: (lv_refname_1_0= RULE_STRING )
                    {
                    // InternalAsyncApi.g:3239:5: (lv_refname_1_0= RULE_STRING )
                    // InternalAsyncApi.g:3240:6: lv_refname_1_0= RULE_STRING
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

            otherlv_3=(Token)match(input,11,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_4=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getRefKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getColonKeyword_4());
            		
            // InternalAsyncApi.g:3273:3: ( (lv_uri_6_0= RULE_STRING ) )
            // InternalAsyncApi.g:3274:4: (lv_uri_6_0= RULE_STRING )
            {
            // InternalAsyncApi.g:3274:4: (lv_uri_6_0= RULE_STRING )
            // InternalAsyncApi.g:3275:5: lv_uri_6_0= RULE_STRING
            {
            lv_uri_6_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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


    // $ANTLR start "entryRulePrimitiveValue"
    // InternalAsyncApi.g:3299:1: entryRulePrimitiveValue returns [String current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final String entryRulePrimitiveValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveValue = null;


        try {
            // InternalAsyncApi.g:3299:54: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // InternalAsyncApi.g:3300:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveValue=rulePrimitiveValue();

            state._fsp--;

             current =iv_rulePrimitiveValue.getText(); 
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
    // $ANTLR end "entryRulePrimitiveValue"


    // $ANTLR start "rulePrimitiveValue"
    // InternalAsyncApi.g:3306:1: rulePrimitiveValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:3312:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' ) )
            // InternalAsyncApi.g:3313:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' )
            {
            // InternalAsyncApi.g:3313:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' )
            int alt71=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt71=1;
                }
                break;
            case RULE_INT:
                {
                alt71=2;
                }
                break;
            case 52:
                {
                alt71=3;
                }
                break;
            case 53:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalAsyncApi.g:3314:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getPrimitiveValueAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3322:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getPrimitiveValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:3330:3: kw= 'true'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getTrueKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:3336:3: kw= 'false'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getFalseKeyword_3());
                    		

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
    // $ANTLR end "rulePrimitiveValue"


    // $ANTLR start "ruleBoolean"
    // InternalAsyncApi.g:3345:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:3351:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalAsyncApi.g:3352:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalAsyncApi.g:3352:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==52) ) {
                alt72=1;
            }
            else if ( (LA72_0==53) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalAsyncApi.g:3353:3: (enumLiteral_0= 'true' )
                    {
                    // InternalAsyncApi.g:3353:3: (enumLiteral_0= 'true' )
                    // InternalAsyncApi.g:3354:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().get_trueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().get_trueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3361:3: (enumLiteral_1= 'false' )
                    {
                    // InternalAsyncApi.g:3361:3: (enumLiteral_1= 'false' )
                    // InternalAsyncApi.g:3362:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleVersionNumber"
    // InternalAsyncApi.g:3372:1: ruleVersionNumber returns [Enumerator current=null] : ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) ) ;
    public final Enumerator ruleVersionNumber() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:3378:2: ( ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) ) )
            // InternalAsyncApi.g:3379:2: ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) )
            {
            // InternalAsyncApi.g:3379:2: ( (enumLiteral_0= '\"1.0.0\"' ) | (enumLiteral_1= '\"1.1.0\"' ) | (enumLiteral_2= '\"1.2.0\"' ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt73=1;
                }
                break;
            case 55:
                {
                alt73=2;
                }
                break;
            case 56:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalAsyncApi.g:3380:3: (enumLiteral_0= '\"1.0.0\"' )
                    {
                    // InternalAsyncApi.g:3380:3: (enumLiteral_0= '\"1.0.0\"' )
                    // InternalAsyncApi.g:3381:4: enumLiteral_0= '\"1.0.0\"'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getVersionNumberAccess().get_100EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVersionNumberAccess().get_100EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3388:3: (enumLiteral_1= '\"1.1.0\"' )
                    {
                    // InternalAsyncApi.g:3388:3: (enumLiteral_1= '\"1.1.0\"' )
                    // InternalAsyncApi.g:3389:4: enumLiteral_1= '\"1.1.0\"'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getVersionNumberAccess().get_110EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVersionNumberAccess().get_110EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:3396:3: (enumLiteral_2= '\"1.2.0\"' )
                    {
                    // InternalAsyncApi.g:3396:3: (enumLiteral_2= '\"1.2.0\"' )
                    // InternalAsyncApi.g:3397:4: enumLiteral_2= '\"1.2.0\"'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

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
    // InternalAsyncApi.g:3407:1: ruleScheme returns [Enumerator current=null] : ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) ;
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
            // InternalAsyncApi.g:3413:2: ( ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) )
            // InternalAsyncApi.g:3414:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            {
            // InternalAsyncApi.g:3414:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            int alt74=8;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt74=1;
                }
                break;
            case 58:
                {
                alt74=2;
                }
                break;
            case 59:
                {
                alt74=3;
                }
                break;
            case 60:
                {
                alt74=4;
                }
                break;
            case 61:
                {
                alt74=5;
                }
                break;
            case 62:
                {
                alt74=6;
                }
                break;
            case 63:
                {
                alt74=7;
                }
                break;
            case 64:
                {
                alt74=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalAsyncApi.g:3415:3: (enumLiteral_0= '\"amqp\"' )
                    {
                    // InternalAsyncApi.g:3415:3: (enumLiteral_0= '\"amqp\"' )
                    // InternalAsyncApi.g:3416:4: enumLiteral_0= '\"amqp\"'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getAmqpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchemeAccess().getAmqpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3423:3: (enumLiteral_1= '\"amqps\"' )
                    {
                    // InternalAsyncApi.g:3423:3: (enumLiteral_1= '\"amqps\"' )
                    // InternalAsyncApi.g:3424:4: enumLiteral_1= '\"amqps\"'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getAmqpsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchemeAccess().getAmqpsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:3431:3: (enumLiteral_2= '\"mqtt\"' )
                    {
                    // InternalAsyncApi.g:3431:3: (enumLiteral_2= '\"mqtt\"' )
                    // InternalAsyncApi.g:3432:4: enumLiteral_2= '\"mqtt\"'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getMqttEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSchemeAccess().getMqttEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:3439:3: (enumLiteral_3= '\"mqtts\"' )
                    {
                    // InternalAsyncApi.g:3439:3: (enumLiteral_3= '\"mqtts\"' )
                    // InternalAsyncApi.g:3440:4: enumLiteral_3= '\"mqtts\"'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getMqttsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSchemeAccess().getMqttsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:3447:3: (enumLiteral_4= '\"ws\"' )
                    {
                    // InternalAsyncApi.g:3447:3: (enumLiteral_4= '\"ws\"' )
                    // InternalAsyncApi.g:3448:4: enumLiteral_4= '\"ws\"'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getWsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSchemeAccess().getWsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:3455:3: (enumLiteral_5= '\"wss\"' )
                    {
                    // InternalAsyncApi.g:3455:3: (enumLiteral_5= '\"wss\"' )
                    // InternalAsyncApi.g:3456:4: enumLiteral_5= '\"wss\"'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getWssEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSchemeAccess().getWssEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:3463:3: (enumLiteral_6= '\"stomp\"' )
                    {
                    // InternalAsyncApi.g:3463:3: (enumLiteral_6= '\"stomp\"' )
                    // InternalAsyncApi.g:3464:4: enumLiteral_6= '\"stomp\"'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSchemeAccess().getStompEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSchemeAccess().getStompEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:3471:3: (enumLiteral_7= '\"stomps\"' )
                    {
                    // InternalAsyncApi.g:3471:3: (enumLiteral_7= '\"stomps\"' )
                    // InternalAsyncApi.g:3472:4: enumLiteral_7= '\"stomps\"'
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_2); 

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


    protected DFA64 dfa64 = new DFA64(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\24\14\uffff";
    static final String dfa_3s = "\1\60\14\uffff";
    static final String dfa_4s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\1\uffff\1\4\10\uffff\1\6\1\11\6\uffff\1\7\1\3\1\5\1\10\1\12\1\13\1\14",
            "",
            "",
            "",
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

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2354:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= RULE_STRING ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= RULE_STRING ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= RULE_STRING ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= RULE_STRING ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"default\"' otherlv_20= ':' ( (lv_default_21_0= rulePrimitiveValue ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"payload\"' otherlv_24= ':' ( (lv_payload_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"properties\"' otherlv_28= ':' otherlv_29= '{' ( (lv_properties_30_0= ruleNamedSchema ) ) (otherlv_31= ',' ( (lv_properties_32_0= ruleNamedSchema ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"enum\"' otherlv_36= ':' otherlv_37= '[' ( (lv_enum_38_0= rulePrimitiveValue ) ) (otherlv_39= ',' ( (lv_enum_40_0= rulePrimitiveValue ) ) )* otherlv_41= ']' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"items\"' otherlv_44= ':' ( (lv_items_45_0= ruleAbstractSchema ) ) (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"required\"' otherlv_48= ':' otherlv_49= '[' ( (lv_required_50_0= RULE_STRING ) ) (otherlv_51= ',' ( (lv_required_52_0= RULE_STRING ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"x-friendly-name\"' otherlv_56= ':' ( (lv_friendlyName_57_0= RULE_STRING ) ) (otherlv_58= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==20) ) {s = 1;}

                        else if ( LA64_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA64_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA64_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA64_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA64_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA64_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA64_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA64_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA64_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA64_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA64_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000699000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000079D000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000799000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001F904000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001F900000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000E0100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000E0104000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000060100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060104000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000342000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000342104000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000342100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xFE00000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000C02100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C02104000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000104000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000007C002100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000007C002104000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000022100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000022104000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001FC0C02900000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001FC0C02904000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0030000000000030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0006000000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0006000000104000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000100000L});

}
