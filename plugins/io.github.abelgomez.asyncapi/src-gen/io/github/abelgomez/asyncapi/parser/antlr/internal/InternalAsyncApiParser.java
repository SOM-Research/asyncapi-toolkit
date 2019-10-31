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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_WS", "'{'", "'\"asyncapi\"'", "':'", "','", "'\"info\"'", "'\"servers\"'", "'}'", "'\"channels\"'", "'\"components\"'", "'\"title\"'", "'\"version\"'", "'\"description\"'", "'\"termsOfService\"'", "'\"contact\"'", "'\"license\"'", "'\"name\"'", "'\"url\"'", "'\"email\"'", "'\"protocol\"'", "'\"variables\"'", "'\"default\"'", "'\"enum\"'", "'['", "']'", "'\"publish\"'", "'\"subscribe\"'", "'\"parameters\"'", "'\"x-title\"'", "'\"operationId\"'", "'\"summary\"'", "'\"message\"'", "'\"traits\"'", "'\"deprecated\"'", "'\"headers\"'", "'\"tags\"'", "'\"payload\"'", "'\"type\"'", "'\"format\"'", "'\"minimum\"'", "'\"maximum\"'", "'\"properties\"'", "'\"items\"'", "'\"required\"'", "'\"schema\"'", "'\"location\"'", "'\"schemas\"'", "'\"messages\"'", "'\"operationTraits\"'", "'\"messageTraits\"'", "'\"$ref\"'", "'true'", "'false'", "'\"2.0.0\"'", "'\"amqp\"'", "'\"amqps\"'", "'\"any\"'", "'\"array\"'", "'\"boolean\"'", "'\"integer\"'", "'\"mqtt\"'", "'\"mqtts\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"stomp\"'", "'\"stomps\"'", "'\"string\"'", "'\"ws\"'", "'\"wss\"'"
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
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__9=9;
    public static final int T__60=60;
    public static final int T__8=8;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
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
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=7;
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
    // InternalAsyncApi.g:72:1: ruleAsyncAPI returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) ;
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

        EObject lv_channels_22_0 = null;

        EObject lv_channels_24_0 = null;

        EObject lv_components_29_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:78:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) )
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            {
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            // InternalAsyncApi.g:80:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}'
            {
            // InternalAsyncApi.g:80:3: ()
            // InternalAsyncApi.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAsyncAPIAccess().getAsyncAPIAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:91:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:93:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:96:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=6;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 9 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4) ) {
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
            	    otherlv_3=(Token)match(input,9,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getAsyncAPIAccess().getAsyncapiKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_5); 

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

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalAsyncApi.g:131:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_7); 

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
            	    otherlv_7=(Token)match(input,12,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAsyncAPIAccess().getInfoKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_8); 

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

            	    if ( (LA2_0==11) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalAsyncApi.g:175:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_7); 

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
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:187:5: {...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:187:105: ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:188:6: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:191:9: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:191:10: {...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:191:19: (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:191:20: otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,13,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAsyncAPIAccess().getServersKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_2_1());
            	    								
            	    otherlv_13=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_2_2_2());
            	    								
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

            	        if ( (LA3_0==11) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:223:10: otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,11,FOLLOW_9); 

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

            	    otherlv_17=(Token)match(input,14,FOLLOW_6); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_2_2_5());
            	    								
            	    // InternalAsyncApi.g:251:9: (otherlv_18= ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==11) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalAsyncApi.g:252:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_7); 

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
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:264:5: {...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:264:105: ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:265:6: ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:268:9: ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:268:10: {...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:268:19: (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:268:20: otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getAsyncAPIAccess().getChannelsKeyword_2_3_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_21=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:280:9: ( (lv_channels_22_0= ruleChannel ) )
            	    // InternalAsyncApi.g:281:10: (lv_channels_22_0= ruleChannel )
            	    {
            	    // InternalAsyncApi.g:281:10: (lv_channels_22_0= ruleChannel )
            	    // InternalAsyncApi.g:282:11: lv_channels_22_0= ruleChannel
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getChannelsChannelParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_channels_22_0=ruleChannel();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"channels",
            	    												lv_channels_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Channel");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:299:9: (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==11) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:300:10: otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:304:10: ( (lv_channels_24_0= ruleChannel ) )
            	    	    // InternalAsyncApi.g:305:11: (lv_channels_24_0= ruleChannel )
            	    	    {
            	    	    // InternalAsyncApi.g:305:11: (lv_channels_24_0= ruleChannel )
            	    	    // InternalAsyncApi.g:306:12: lv_channels_24_0= ruleChannel
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getChannelsChannelParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_channels_24_0=ruleChannel();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"channels",
            	    	    													lv_channels_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Channel");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,14,FOLLOW_6); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:328:9: (otherlv_26= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==11) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAsyncApi.g:329:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_7); 

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
            	    otherlv_27=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getAsyncAPIAccess().getComponentsKeyword_2_4_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_8); 

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

            	    if ( (LA7_0==11) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAsyncApi.g:373:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,11,FOLLOW_7); 

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

            otherlv_31=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAsyncApi.g:407:1: ruleInfo returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) ;
    public final EObject ruleInfo() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_version_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        AntlrDatatypeRuleToken lv_termsOfService_17_0 = null;

        EObject lv_contact_21_0 = null;

        EObject lv_license_25_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:413:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:414:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:414:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:415:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:415:3: ()
            // InternalAsyncApi.g:416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfoAccess().getInfoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:426:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:427:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:427:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:428:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:431:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:432:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:432:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=7;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
                    alt15=4;
                }
                else if ( LA15_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
                    alt15=6;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAsyncApi.g:433:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:433:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:434:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:434:101: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:435:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:438:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:438:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:438:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:438:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getInfoAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getInfoAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:446:9: ( (lv_title_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:447:10: (lv_title_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:447:10: (lv_title_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:448:11: lv_title_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getTitleAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_title_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:465:9: (otherlv_6= ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==11) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalAsyncApi.g:466:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_13); 

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
            	    // InternalAsyncApi.g:477:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:477:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:478:5: {...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:478:101: ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:479:6: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:482:9: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:482:10: {...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:482:19: (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:482:20: otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getInfoAccess().getVersionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getInfoAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:490:9: ( (lv_version_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:491:10: (lv_version_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:491:10: (lv_version_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:492:11: lv_version_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getVersionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_version_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"version",
            	    												lv_version_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:509:9: (otherlv_10= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==11) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAsyncApi.g:510:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_13); 

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
            	    // InternalAsyncApi.g:521:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:521:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:522:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:522:101: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:523:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:526:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:526:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:526:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:526:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getInfoAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getInfoAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:534:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:535:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:535:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:536:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:553:9: (otherlv_14= ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==11) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAsyncApi.g:554:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_13); 

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
            	    // InternalAsyncApi.g:565:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:565:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:566:5: {...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:566:101: ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:567:6: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:570:9: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:570:10: {...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:570:19: (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:570:20: otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getInfoAccess().getTermsOfServiceKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getInfoAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:578:9: ( (lv_termsOfService_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:579:10: (lv_termsOfService_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:579:10: (lv_termsOfService_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:580:11: lv_termsOfService_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getTermsOfServiceAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_termsOfService_17_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"termsOfService",
            	    												lv_termsOfService_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:597:9: (otherlv_18= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==11) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAsyncApi.g:598:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_13); 

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
            	    // InternalAsyncApi.g:609:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:609:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:610:5: {...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:610:101: ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:611:6: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:614:9: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:614:10: {...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:614:19: (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:614:20: otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,21,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getInfoAccess().getContactKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getInfoAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:622:9: ( (lv_contact_21_0= ruleContact ) )
            	    // InternalAsyncApi.g:623:10: (lv_contact_21_0= ruleContact )
            	    {
            	    // InternalAsyncApi.g:623:10: (lv_contact_21_0= ruleContact )
            	    // InternalAsyncApi.g:624:11: lv_contact_21_0= ruleContact
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getContactContactParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
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

            	    // InternalAsyncApi.g:641:9: (otherlv_22= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==11) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAsyncApi.g:642:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_13); 

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
            	    // InternalAsyncApi.g:653:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:653:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:654:5: {...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:654:101: ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:655:6: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:658:9: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:658:10: {...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:658:19: (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:658:20: otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getInfoAccess().getLicenseKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getInfoAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:666:9: ( (lv_license_25_0= ruleLicense ) )
            	    // InternalAsyncApi.g:667:10: (lv_license_25_0= ruleLicense )
            	    {
            	    // InternalAsyncApi.g:667:10: (lv_license_25_0= ruleLicense )
            	    // InternalAsyncApi.g:668:11: lv_license_25_0= ruleLicense
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getLicenseLicenseParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
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

            	    // InternalAsyncApi.g:685:9: (otherlv_26= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==11) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAsyncApi.g:686:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_13); 

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

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAsyncApi.g:713:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalAsyncApi.g:713:48: (iv_ruleContact= ruleContact EOF )
            // InternalAsyncApi.g:714:2: iv_ruleContact= ruleContact EOF
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
    // InternalAsyncApi.g:720:1: ruleContact returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleContact() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_url_9_0 = null;

        AntlrDatatypeRuleToken lv_email_13_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:726:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:727:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:727:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:728:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:728:3: ()
            // InternalAsyncApi.g:729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContactAccess().getContactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:739:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:740:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:740:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:741:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:744:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:745:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:745:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop19:
            do {
                int alt19=4;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
                    alt19=2;
                }
                else if ( LA19_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
                    alt19=3;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAsyncApi.g:746:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:746:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:747:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:747:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:748:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:751:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:751:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:751:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:751:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getContactAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:759:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:760:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:760:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:761:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getContactAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getContactRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:778:9: (otherlv_6= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==11) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAsyncApi.g:779:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_14); 

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
            	    // InternalAsyncApi.g:790:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:790:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:791:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:791:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:792:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:795:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:795:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:795:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:795:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getContactAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getContactAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:803:9: ( (lv_url_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:804:10: (lv_url_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:804:10: (lv_url_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:805:11: lv_url_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getContactAccess().getUrlAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_url_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getContactRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:822:9: (otherlv_10= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==11) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAsyncApi.g:823:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_14); 

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
            	    // InternalAsyncApi.g:834:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:834:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:835:5: {...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:835:104: ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:836:6: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:839:9: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:839:10: {...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:839:19: (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:839:20: otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getContactAccess().getEmailKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getContactAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:847:9: ( (lv_email_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:848:10: (lv_email_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:848:10: (lv_email_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:849:11: lv_email_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getContactAccess().getEmailAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_email_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getContactRule());
            	    											}
            	    											set(
            	    												current,
            	    												"email",
            	    												lv_email_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:866:9: (otherlv_14= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==11) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalAsyncApi.g:867:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_14); 

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

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAsyncApi.g:893:1: entryRuleLicense returns [EObject current=null] : iv_ruleLicense= ruleLicense EOF ;
    public final EObject entryRuleLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicense = null;


        try {
            // InternalAsyncApi.g:893:48: (iv_ruleLicense= ruleLicense EOF )
            // InternalAsyncApi.g:894:2: iv_ruleLicense= ruleLicense EOF
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
    // InternalAsyncApi.g:900:1: ruleLicense returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_url_9_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:906:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:907:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:907:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:908:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:908:3: ()
            // InternalAsyncApi.g:909:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLicenseAccess().getLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:919:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:920:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:920:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:921:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:924:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:925:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:925:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAsyncApi.g:926:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:926:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:927:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:927:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:928:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:931:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:931:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:931:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:931:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getLicenseAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:939:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:940:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:940:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:941:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getLicenseAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:958:9: (otherlv_6= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==11) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalAsyncApi.g:959:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_16); 

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
            	    // InternalAsyncApi.g:970:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:970:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:971:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:971:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:972:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:975:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:975:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:975:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:975:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getLicenseAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:983:9: ( (lv_url_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:984:10: (lv_url_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:984:10: (lv_url_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:985:11: lv_url_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getLicenseAccess().getUrlAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_url_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1002:9: (otherlv_10= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==11) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAsyncApi.g:1003:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_16); 

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

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAsyncApi.g:1029:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalAsyncApi.g:1029:47: (iv_ruleServer= ruleServer EOF )
            // InternalAsyncApi.g:1030:2: iv_ruleServer= ruleServer EOF
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
    // InternalAsyncApi.g:1036:1: ruleServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_7_0 = null;

        Enumerator lv_protocol_11_0 = null;

        AntlrDatatypeRuleToken lv_description_15_0 = null;

        EObject lv_variables_20_0 = null;

        EObject lv_variables_22_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1042:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' ) )
            // InternalAsyncApi.g:1043:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' )
            {
            // InternalAsyncApi.g:1043:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' )
            // InternalAsyncApi.g:1044:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}'
            {
            // InternalAsyncApi.g:1044:3: ()
            // InternalAsyncApi.g:1045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerAccess().getServerAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1051:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1052:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1052:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1053:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getServerAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServerAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,8,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1078:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:1079:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:1079:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:1080:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServerAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1083:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:1084:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:1084:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=5;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2) ) {
                    alt27=3;
                }
                else if ( LA27_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3) ) {
                    alt27=4;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAsyncApi.g:1085:4: ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1085:4: ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1086:5: {...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1086:103: ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1087:6: ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1090:9: ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1090:10: {...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1090:19: (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1090:20: otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getServerAccess().getUrlKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getServerAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1098:9: ( (lv_url_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1099:10: (lv_url_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1099:10: (lv_url_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1100:11: lv_url_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getUrlAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_url_7_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_7_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1117:9: (otherlv_8= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==11) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalAsyncApi.g:1118:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_8, grammarAccess.getServerAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1129:4: ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1129:4: ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1130:5: {...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1130:103: ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1131:6: ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1134:9: ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1134:10: {...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1134:19: (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1134:20: otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getServerAccess().getProtocolKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_21); 

            	    									newLeafNode(otherlv_10, grammarAccess.getServerAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1142:9: ( (lv_protocol_11_0= ruleProtocol ) )
            	    // InternalAsyncApi.g:1143:10: (lv_protocol_11_0= ruleProtocol )
            	    {
            	    // InternalAsyncApi.g:1143:10: (lv_protocol_11_0= ruleProtocol )
            	    // InternalAsyncApi.g:1144:11: lv_protocol_11_0= ruleProtocol
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getProtocolProtocolEnumRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_protocol_11_0=ruleProtocol();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"protocol",
            	    												lv_protocol_11_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Protocol");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1161:9: (otherlv_12= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==11) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalAsyncApi.g:1162:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_12, grammarAccess.getServerAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1173:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1173:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) ) )
            	    // InternalAsyncApi.g:1174:5: {...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1174:103: ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) ) )
            	    // InternalAsyncApi.g:1175:6: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1178:9: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' ) )
            	    // InternalAsyncApi.g:1178:10: {...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1178:19: (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ',' )
            	    // InternalAsyncApi.g:1178:20: otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) otherlv_16= ','
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getServerAccess().getDescriptionKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServerAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalAsyncApi.g:1186:9: ( (lv_description_15_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1187:10: (lv_description_15_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1187:10: (lv_description_15_0= ruleAnyString )
            	    // InternalAsyncApi.g:1188:11: lv_description_15_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getDescriptionAnyStringParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    lv_description_15_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_15_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_16=(Token)match(input,11,FOLLOW_20); 

            	    									newLeafNode(otherlv_16, grammarAccess.getServerAccess().getCommaKeyword_4_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:1215:4: ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1215:4: ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1216:5: {...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalAsyncApi.g:1216:103: ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    // InternalAsyncApi.g:1217:6: ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalAsyncApi.g:1220:9: ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    // InternalAsyncApi.g:1220:10: {...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1220:19: (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    // InternalAsyncApi.g:1220:20: otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,27,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getServerAccess().getVariablesKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_18, grammarAccess.getServerAccess().getColonKeyword_4_3_1());
            	    								
            	    otherlv_19=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4_3_2());
            	    								
            	    // InternalAsyncApi.g:1232:9: ( (lv_variables_20_0= ruleVariable ) )
            	    // InternalAsyncApi.g:1233:10: (lv_variables_20_0= ruleVariable )
            	    {
            	    // InternalAsyncApi.g:1233:10: (lv_variables_20_0= ruleVariable )
            	    // InternalAsyncApi.g:1234:11: lv_variables_20_0= ruleVariable
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getVariablesVariableParserRuleCall_4_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    // InternalAsyncApi.g:1251:9: (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==11) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1252:10: otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServerAccess().getCommaKeyword_4_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1256:10: ( (lv_variables_22_0= ruleVariable ) )
            	    	    // InternalAsyncApi.g:1257:11: (lv_variables_22_0= ruleVariable )
            	    	    {
            	    	    // InternalAsyncApi.g:1257:11: (lv_variables_22_0= ruleVariable )
            	    	    // InternalAsyncApi.g:1258:12: lv_variables_22_0= ruleVariable
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServerAccess().getVariablesVariableParserRuleCall_4_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_variables_22_0=ruleVariable();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServerRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"variables",
            	    	    													lv_variables_22_0,
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

            	    otherlv_23=(Token)match(input,14,FOLLOW_19); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_4_3_5());
            	    								
            	    // InternalAsyncApi.g:1280:9: (otherlv_24= ',' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==11) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalAsyncApi.g:1281:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_24, grammarAccess.getServerAccess().getCommaKeyword_4_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getServerAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canLeave(grammarAccess.getServerAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getServerAccess().getUnorderedGroup_4());
            				

            }

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalAsyncApi.g:1308:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAsyncApi.g:1308:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAsyncApi.g:1309:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalAsyncApi.g:1315:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_default_11_0 = null;

        AntlrDatatypeRuleToken lv_enum_16_0 = null;

        AntlrDatatypeRuleToken lv_enum_18_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1321:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalAsyncApi.g:1322:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalAsyncApi.g:1322:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalAsyncApi.g:1323:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalAsyncApi.g:1323:3: ()
            // InternalAsyncApi.g:1324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1330:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1331:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1331:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1332:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,8,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1357:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1358:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1358:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1359:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1362:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1363:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1363:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAsyncApi.g:1364:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1364:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1365:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1365:105: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1366:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1369:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1369:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1369:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1369:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1377:9: ( (lv_description_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1378:10: (lv_description_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1378:10: (lv_description_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1379:11: lv_description_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getDescriptionAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_24);
            	    lv_description_7_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVariableRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_7_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1396:9: (otherlv_8= ',' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==11) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalAsyncApi.g:1397:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_23); 

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
            	    // InternalAsyncApi.g:1408:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1408:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1409:5: {...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1409:105: ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1410:6: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1413:9: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1413:10: {...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1413:19: (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1413:20: otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getDefaultKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1421:9: ( (lv_default_11_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1422:10: (lv_default_11_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1422:10: (lv_default_11_0= ruleAnyString )
            	    // InternalAsyncApi.g:1423:11: lv_default_11_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getDefaultAnyStringParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_24);
            	    lv_default_11_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVariableRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_11_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1440:9: (otherlv_12= ',' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==11) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalAsyncApi.g:1441:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_23); 

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
            	    // InternalAsyncApi.g:1452:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1452:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1453:5: {...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1453:105: ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:1454:6: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1457:9: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:1457:10: {...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1457:19: (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:1457:20: otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getEnumKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_25); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getColonKeyword_4_2_1());
            	    								
            	    otherlv_15=(Token)match(input,30,FOLLOW_9); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_4_2_2());
            	    								
            	    // InternalAsyncApi.g:1469:9: ( (lv_enum_16_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1470:10: (lv_enum_16_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1470:10: (lv_enum_16_0= ruleAnyString )
            	    // InternalAsyncApi.g:1471:11: lv_enum_16_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getEnumAnyStringParserRuleCall_4_2_3_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_enum_16_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVariableRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enum",
            	    												lv_enum_16_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1488:9: (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==11) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1489:10: otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getCommaKeyword_4_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1493:10: ( (lv_enum_18_0= ruleAnyString ) )
            	    	    // InternalAsyncApi.g:1494:11: (lv_enum_18_0= ruleAnyString )
            	    	    {
            	    	    // InternalAsyncApi.g:1494:11: (lv_enum_18_0= ruleAnyString )
            	    	    // InternalAsyncApi.g:1495:12: lv_enum_18_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getVariableAccess().getEnumAnyStringParserRuleCall_4_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_enum_18_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_18_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,31,FOLLOW_24); 

            	    									newLeafNode(otherlv_19, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_4_2_5());
            	    								
            	    // InternalAsyncApi.g:1517:9: (otherlv_20= ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==11) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalAsyncApi.g:1518:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,11,FOLLOW_23); 

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

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleChannel"
    // InternalAsyncApi.g:1544:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalAsyncApi.g:1544:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalAsyncApi.g:1545:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalAsyncApi.g:1551:1: ruleChannel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_publish_11_0 = null;

        EObject lv_subscribe_15_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;

        AntlrDatatypeRuleToken lv_title_27_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1557:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' ) )
            // InternalAsyncApi.g:1558:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' )
            {
            // InternalAsyncApi.g:1558:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' )
            // InternalAsyncApi.g:1559:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}'
            {
            // InternalAsyncApi.g:1559:3: ()
            // InternalAsyncApi.g:1560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChannelAccess().getChannelAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1566:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1567:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1567:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1568:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getChannelAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,8,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1593:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1594:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1594:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1595:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1598:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1599:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1599:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )*
            loop39:
            do {
                int alt39=6;
                int LA39_0 = input.LA(1);

                if ( LA39_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2) ) {
                    alt39=3;
                }
                else if ( LA39_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3) ) {
                    alt39=4;
                }
                else if ( LA39_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4) ) {
                    alt39=5;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAsyncApi.g:1600:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1600:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1601:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1601:104: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1602:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1605:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1605:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1605:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1605:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getChannelAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1613:9: ( (lv_description_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1614:10: (lv_description_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1614:10: (lv_description_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1615:11: lv_description_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getDescriptionAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_description_7_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_7_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1632:9: (otherlv_8= ',' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==11) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalAsyncApi.g:1633:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_27); 

            	            										newLeafNode(otherlv_8, grammarAccess.getChannelAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1644:4: ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1644:4: ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1645:5: {...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1645:104: ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1646:6: ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1649:9: ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1649:10: {...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1649:19: (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1649:20: otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,32,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getChannelAccess().getPublishKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getChannelAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1657:9: ( (lv_publish_11_0= ruleOperation ) )
            	    // InternalAsyncApi.g:1658:10: (lv_publish_11_0= ruleOperation )
            	    {
            	    // InternalAsyncApi.g:1658:10: (lv_publish_11_0= ruleOperation )
            	    // InternalAsyncApi.g:1659:11: lv_publish_11_0= ruleOperation
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getPublishOperationParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_publish_11_0=ruleOperation();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"publish",
            	    												lv_publish_11_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Operation");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1676:9: (otherlv_12= ',' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==11) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAsyncApi.g:1677:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_27); 

            	            										newLeafNode(otherlv_12, grammarAccess.getChannelAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1688:4: ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1688:4: ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1689:5: {...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1689:104: ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:1690:6: ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1693:9: ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:1693:10: {...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1693:19: (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:1693:20: otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getChannelAccess().getSubscribeKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getChannelAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalAsyncApi.g:1701:9: ( (lv_subscribe_15_0= ruleOperation ) )
            	    // InternalAsyncApi.g:1702:10: (lv_subscribe_15_0= ruleOperation )
            	    {
            	    // InternalAsyncApi.g:1702:10: (lv_subscribe_15_0= ruleOperation )
            	    // InternalAsyncApi.g:1703:11: lv_subscribe_15_0= ruleOperation
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getSubscribeOperationParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_subscribe_15_0=ruleOperation();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"subscribe",
            	    												lv_subscribe_15_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Operation");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1720:9: (otherlv_16= ',' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==11) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAsyncApi.g:1721:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,11,FOLLOW_27); 

            	            										newLeafNode(otherlv_16, grammarAccess.getChannelAccess().getCommaKeyword_4_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:1732:4: ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1732:4: ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1733:5: {...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalAsyncApi.g:1733:104: ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    // InternalAsyncApi.g:1734:6: ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalAsyncApi.g:1737:9: ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    // InternalAsyncApi.g:1737:10: {...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1737:19: (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    // InternalAsyncApi.g:1737:20: otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getChannelAccess().getParametersKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_18, grammarAccess.getChannelAccess().getColonKeyword_4_3_1());
            	    								
            	    otherlv_19=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_4_3_2());
            	    								
            	    // InternalAsyncApi.g:1749:9: ( (lv_parameters_20_0= ruleNamedParameter ) )
            	    // InternalAsyncApi.g:1750:10: (lv_parameters_20_0= ruleNamedParameter )
            	    {
            	    // InternalAsyncApi.g:1750:10: (lv_parameters_20_0= ruleNamedParameter )
            	    // InternalAsyncApi.g:1751:11: lv_parameters_20_0= ruleNamedParameter
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getParametersNamedParameterParserRuleCall_4_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_20_0=ruleNamedParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameters",
            	    												lv_parameters_20_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1768:9: (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==11) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1769:10: otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getChannelAccess().getCommaKeyword_4_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1773:10: ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    	    // InternalAsyncApi.g:1774:11: (lv_parameters_22_0= ruleNamedParameter )
            	    	    {
            	    	    // InternalAsyncApi.g:1774:11: (lv_parameters_22_0= ruleNamedParameter )
            	    	    // InternalAsyncApi.g:1775:12: lv_parameters_22_0= ruleNamedParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getChannelAccess().getParametersNamedParameterParserRuleCall_4_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_parameters_22_0=ruleNamedParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getChannelRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameters",
            	    	    													lv_parameters_22_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop36;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,14,FOLLOW_28); 

            	    									newLeafNode(otherlv_23, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_4_3_5());
            	    								
            	    // InternalAsyncApi.g:1797:9: (otherlv_24= ',' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==11) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalAsyncApi.g:1798:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,11,FOLLOW_27); 

            	            										newLeafNode(otherlv_24, grammarAccess.getChannelAccess().getCommaKeyword_4_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:1809:4: ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1809:4: ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1810:5: {...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalAsyncApi.g:1810:104: ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalAsyncApi.g:1811:6: ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalAsyncApi.g:1814:9: ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) )
            	    // InternalAsyncApi.g:1814:10: {...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1814:19: (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? )
            	    // InternalAsyncApi.g:1814:20: otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getChannelAccess().getXTitleKeyword_4_4_0());
            	    								
            	    otherlv_26=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_26, grammarAccess.getChannelAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalAsyncApi.g:1822:9: ( (lv_title_27_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1823:10: (lv_title_27_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1823:10: (lv_title_27_0= ruleAnyString )
            	    // InternalAsyncApi.g:1824:11: lv_title_27_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getTitleAnyStringParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_title_27_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_27_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1841:9: (otherlv_28= ',' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==11) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalAsyncApi.g:1842:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,11,FOLLOW_27); 

            	            										newLeafNode(otherlv_28, grammarAccess.getChannelAccess().getCommaKeyword_4_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            				

            }

            otherlv_29=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleOperation"
    // InternalAsyncApi.g:1868:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalAsyncApi.g:1868:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalAsyncApi.g:1869:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalAsyncApi.g:1875:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_operationId_5_0 = null;

        AntlrDatatypeRuleToken lv_summary_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        EObject lv_message_17_0 = null;

        EObject lv_traits_22_0 = null;

        EObject lv_traits_24_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1881:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:1882:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:1882:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:1883:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:1883:3: ()
            // InternalAsyncApi.g:1884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1894:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1895:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1895:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1896:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1899:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1900:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1900:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            loop46:
            do {
                int alt46=6;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3) ) {
                    alt46=4;
                }
                else if ( LA46_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4) ) {
                    alt46=5;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAsyncApi.g:1901:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1901:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1902:5: {...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1902:106: ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1903:6: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1906:9: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1906:10: {...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:1906:19: (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1906:20: otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getOperationIdKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1914:9: ( (lv_operationId_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1915:10: (lv_operationId_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1915:10: (lv_operationId_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:1916:11: lv_operationId_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getOperationIdAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_operationId_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operationId",
            	    												lv_operationId_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1933:9: (otherlv_6= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==11) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAsyncApi.g:1934:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_29); 

            	            										newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1945:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1945:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1946:5: {...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1946:106: ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1947:6: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1950:9: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1950:10: {...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:1950:19: (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1950:20: otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getSummaryKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1958:9: ( (lv_summary_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1959:10: (lv_summary_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1959:10: (lv_summary_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:1960:11: lv_summary_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getSummaryAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_summary_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1977:9: (otherlv_10= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==11) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalAsyncApi.g:1978:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_29); 

            	            										newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1989:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1989:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1990:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:1990:106: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:1991:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:1994:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:1994:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:1994:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:1994:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2002:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2003:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2003:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:2004:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2021:9: (otherlv_14= ',' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==11) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalAsyncApi.g:2022:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_29); 

            	            										newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:2033:4: ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2033:4: ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2034:5: {...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2034:106: ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2035:6: ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2038:9: ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2038:10: {...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2038:19: (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2038:20: otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getMessageKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2046:9: ( (lv_message_17_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:2047:10: (lv_message_17_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:2047:10: (lv_message_17_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:2048:11: lv_message_17_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getMessageAbstractMessageParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_message_17_0=ruleAbstractMessage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"message",
            	    												lv_message_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2065:9: (otherlv_18= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==11) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalAsyncApi.g:2066:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_29); 

            	            										newLeafNode(otherlv_18, grammarAccess.getOperationAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:2077:4: ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2077:4: ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2078:5: {...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2078:106: ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2079:6: ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2082:9: ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2082:10: {...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2082:19: (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2082:20: otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getOperationAccess().getTraitsKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_25); 

            	    									newLeafNode(otherlv_20, grammarAccess.getOperationAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_21=(Token)match(input,30,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getOperationAccess().getLeftSquareBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:2094:9: ( (lv_traits_22_0= ruleAbstractOperationTrait ) )
            	    // InternalAsyncApi.g:2095:10: (lv_traits_22_0= ruleAbstractOperationTrait )
            	    {
            	    // InternalAsyncApi.g:2095:10: (lv_traits_22_0= ruleAbstractOperationTrait )
            	    // InternalAsyncApi.g:2096:11: lv_traits_22_0= ruleAbstractOperationTrait
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getTraitsAbstractOperationTraitParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_traits_22_0=ruleAbstractOperationTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											add(
            	    												current,
            	    												"traits",
            	    												lv_traits_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractOperationTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2113:9: (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==11) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2114:10: otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getOperationAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2118:10: ( (lv_traits_24_0= ruleAbstractOperationTrait ) )
            	    	    // InternalAsyncApi.g:2119:11: (lv_traits_24_0= ruleAbstractOperationTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:2119:11: (lv_traits_24_0= ruleAbstractOperationTrait )
            	    	    // InternalAsyncApi.g:2120:12: lv_traits_24_0= ruleAbstractOperationTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getOperationAccess().getTraitsAbstractOperationTraitParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_traits_24_0=ruleAbstractOperationTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getOperationRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"traits",
            	    	    													lv_traits_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractOperationTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop44;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,31,FOLLOW_30); 

            	    									newLeafNode(otherlv_25, grammarAccess.getOperationAccess().getRightSquareBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:2142:9: (otherlv_26= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==11) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalAsyncApi.g:2143:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_29); 

            	            										newLeafNode(otherlv_26, grammarAccess.getOperationAccess().getCommaKeyword_2_4_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            				

            }

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAbstractMessage"
    // InternalAsyncApi.g:2169:1: entryRuleAbstractMessage returns [EObject current=null] : iv_ruleAbstractMessage= ruleAbstractMessage EOF ;
    public final EObject entryRuleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessage = null;


        try {
            // InternalAsyncApi.g:2169:56: (iv_ruleAbstractMessage= ruleAbstractMessage EOF )
            // InternalAsyncApi.g:2170:2: iv_ruleAbstractMessage= ruleAbstractMessage EOF
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
    // InternalAsyncApi.g:2176:1: ruleAbstractMessage returns [EObject current=null] : (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) ;
    public final EObject ruleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2182:2: ( (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) )
            // InternalAsyncApi.g:2183:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            {
            // InternalAsyncApi.g:2183:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==8) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==57) ) {
                    alt47=1;
                }
                else if ( (LA47_1==14||LA47_1==17||LA47_1==19||LA47_1==23||LA47_1==37||(LA47_1>=39 && LA47_1<=43)) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalAsyncApi.g:2184:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:2193:3: this_Message_1= ruleMessage
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
    // InternalAsyncApi.g:2205:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalAsyncApi.g:2205:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalAsyncApi.g:2206:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalAsyncApi.g:2212:1: ruleMessage returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
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
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_title_9_0 = null;

        AntlrDatatypeRuleToken lv_summary_13_0 = null;

        AntlrDatatypeRuleToken lv_description_17_0 = null;

        Enumerator lv_deprecated_21_0 = null;

        EObject lv_headers_25_0 = null;

        EObject lv_tags_30_0 = null;

        EObject lv_tags_32_0 = null;

        EObject lv_payload_37_0 = null;

        EObject lv_traits_42_0 = null;

        EObject lv_traits_44_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2218:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' ) )
            // InternalAsyncApi.g:2219:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' )
            {
            // InternalAsyncApi.g:2219:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' )
            // InternalAsyncApi.g:2220:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}'
            {
            // InternalAsyncApi.g:2220:3: ()
            // InternalAsyncApi.g:2221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageAccess().getMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2231:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2232:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2232:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2233:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2236:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2237:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2237:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*
            loop59:
            do {
                int alt59=10;
                alt59 = dfa59.predict(input);
                switch (alt59) {
            	case 1 :
            	    // InternalAsyncApi.g:2238:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2238:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2239:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2239:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2240:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2243:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2243:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2243:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2243:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2251:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2252:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2252:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:2253:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2270:9: (otherlv_6= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==11) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalAsyncApi.g:2271:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_31); 

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
            	    // InternalAsyncApi.g:2282:4: ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2282:4: ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2283:5: {...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2283:104: ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2284:6: ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2287:9: ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2287:10: {...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2287:19: (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2287:20: otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getTitleKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2295:9: ( (lv_title_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2296:10: (lv_title_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2296:10: (lv_title_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2297:11: lv_title_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTitleAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_title_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2314:9: (otherlv_10= ',' )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==11) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalAsyncApi.g:2315:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_31); 

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
            	    // InternalAsyncApi.g:2326:4: ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2326:4: ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2327:5: {...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:2327:104: ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:2328:6: ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:2331:9: ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:2331:10: {...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2331:19: (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:2331:20: otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getSummaryKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2339:9: ( (lv_summary_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2340:10: (lv_summary_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2340:10: (lv_summary_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:2341:11: lv_summary_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getSummaryAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_summary_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2358:9: (otherlv_14= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==11) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalAsyncApi.g:2359:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_31); 

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
            	    // InternalAsyncApi.g:2370:4: ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2370:4: ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2371:5: {...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2371:104: ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2372:6: ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2375:9: ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2375:10: {...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2375:19: (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2375:20: otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getDescriptionKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2383:9: ( (lv_description_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2384:10: (lv_description_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2384:10: (lv_description_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:2385:11: lv_description_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getDescriptionAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_description_17_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2402:9: (otherlv_18= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==11) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalAsyncApi.g:2403:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_31); 

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
            	    // InternalAsyncApi.g:2414:4: ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2414:4: ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2415:5: {...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2415:104: ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:2416:6: ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2419:9: ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:2419:10: {...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2419:19: (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:2419:20: otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getDeprecatedKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_33); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:2427:9: ( (lv_deprecated_21_0= ruleBoolean ) )
            	    // InternalAsyncApi.g:2428:10: (lv_deprecated_21_0= ruleBoolean )
            	    {
            	    // InternalAsyncApi.g:2428:10: (lv_deprecated_21_0= ruleBoolean )
            	    // InternalAsyncApi.g:2429:11: lv_deprecated_21_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getDeprecatedBooleanEnumRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_deprecated_21_0=ruleBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deprecated",
            	    												lv_deprecated_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Boolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2446:9: (otherlv_22= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==11) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalAsyncApi.g:2447:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_31); 

            	            										newLeafNode(otherlv_22, grammarAccess.getMessageAccess().getCommaKeyword_2_4_3());
            	            									

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
            	    // InternalAsyncApi.g:2458:4: ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2458:4: ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2459:5: {...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:2459:104: ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2460:6: ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:2463:9: ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2463:10: {...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2463:19: (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2463:20: otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getHeadersKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getMessageAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:2471:9: ( (lv_headers_25_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2472:10: (lv_headers_25_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2472:10: (lv_headers_25_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2473:11: lv_headers_25_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getHeadersAbstractSchemaParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_headers_25_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"headers",
            	    												lv_headers_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2490:9: (otherlv_26= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==11) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalAsyncApi.g:2491:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_31); 

            	            										newLeafNode(otherlv_26, grammarAccess.getMessageAccess().getCommaKeyword_2_5_3());
            	            									

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
            	case 7 :
            	    // InternalAsyncApi.g:2502:4: ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2502:4: ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2503:5: {...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:2503:104: ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:2504:6: ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:2507:9: ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:2507:10: {...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2507:19: (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:2507:20: otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getMessageAccess().getTagsKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_25); 

            	    									newLeafNode(otherlv_28, grammarAccess.getMessageAccess().getColonKeyword_2_6_1());
            	    								
            	    otherlv_29=(Token)match(input,30,FOLLOW_8); 

            	    									newLeafNode(otherlv_29, grammarAccess.getMessageAccess().getLeftSquareBracketKeyword_2_6_2());
            	    								
            	    // InternalAsyncApi.g:2519:9: ( (lv_tags_30_0= ruleTag ) )
            	    // InternalAsyncApi.g:2520:10: (lv_tags_30_0= ruleTag )
            	    {
            	    // InternalAsyncApi.g:2520:10: (lv_tags_30_0= ruleTag )
            	    // InternalAsyncApi.g:2521:11: lv_tags_30_0= ruleTag
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_6_3_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_tags_30_0=ruleTag();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											add(
            	    												current,
            	    												"tags",
            	    												lv_tags_30_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2538:9: (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( (LA54_0==11) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2539:10: otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getMessageAccess().getCommaKeyword_2_6_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2543:10: ( (lv_tags_32_0= ruleTag ) )
            	    	    // InternalAsyncApi.g:2544:11: (lv_tags_32_0= ruleTag )
            	    	    {
            	    	    // InternalAsyncApi.g:2544:11: (lv_tags_32_0= ruleTag )
            	    	    // InternalAsyncApi.g:2545:12: lv_tags_32_0= ruleTag
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_6_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_tags_32_0=ruleTag();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"tags",
            	    	    													lv_tags_32_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,31,FOLLOW_32); 

            	    									newLeafNode(otherlv_33, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_2_6_5());
            	    								
            	    // InternalAsyncApi.g:2567:9: (otherlv_34= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==11) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalAsyncApi.g:2568:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_31); 

            	            										newLeafNode(otherlv_34, grammarAccess.getMessageAccess().getCommaKeyword_2_6_6());
            	            									

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
            	case 8 :
            	    // InternalAsyncApi.g:2579:4: ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2579:4: ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2580:5: {...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:2580:104: ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) )
            	    // InternalAsyncApi.g:2581:6: ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:2584:9: ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) )
            	    // InternalAsyncApi.g:2584:10: {...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2584:19: (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? )
            	    // InternalAsyncApi.g:2584:20: otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getMessageAccess().getPayloadKeyword_2_7_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_36, grammarAccess.getMessageAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalAsyncApi.g:2592:9: ( (lv_payload_37_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2593:10: (lv_payload_37_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2593:10: (lv_payload_37_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2594:11: lv_payload_37_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getPayloadAbstractSchemaParserRuleCall_2_7_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_payload_37_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"payload",
            	    												lv_payload_37_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2611:9: (otherlv_38= ',' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==11) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalAsyncApi.g:2612:10: otherlv_38= ','
            	            {
            	            otherlv_38=(Token)match(input,11,FOLLOW_31); 

            	            										newLeafNode(otherlv_38, grammarAccess.getMessageAccess().getCommaKeyword_2_7_3());
            	            									

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
            	case 9 :
            	    // InternalAsyncApi.g:2623:4: ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2623:4: ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2624:5: {...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalAsyncApi.g:2624:104: ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    // InternalAsyncApi.g:2625:6: ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalAsyncApi.g:2628:9: ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    // InternalAsyncApi.g:2628:10: {...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2628:19: (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    // InternalAsyncApi.g:2628:20: otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )?
            	    {
            	    otherlv_39=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_39, grammarAccess.getMessageAccess().getTraitsKeyword_2_8_0());
            	    								
            	    otherlv_40=(Token)match(input,10,FOLLOW_25); 

            	    									newLeafNode(otherlv_40, grammarAccess.getMessageAccess().getColonKeyword_2_8_1());
            	    								
            	    otherlv_41=(Token)match(input,30,FOLLOW_8); 

            	    									newLeafNode(otherlv_41, grammarAccess.getMessageAccess().getLeftSquareBracketKeyword_2_8_2());
            	    								
            	    // InternalAsyncApi.g:2640:9: ( (lv_traits_42_0= ruleAbstractMessageTrait ) )
            	    // InternalAsyncApi.g:2641:10: (lv_traits_42_0= ruleAbstractMessageTrait )
            	    {
            	    // InternalAsyncApi.g:2641:10: (lv_traits_42_0= ruleAbstractMessageTrait )
            	    // InternalAsyncApi.g:2642:11: lv_traits_42_0= ruleAbstractMessageTrait
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTraitsAbstractMessageTraitParserRuleCall_2_8_3_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_traits_42_0=ruleAbstractMessageTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											add(
            	    												current,
            	    												"traits",
            	    												lv_traits_42_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessageTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2659:9: (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==11) ) {
            	            alt57=1;
            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2660:10: otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getMessageAccess().getCommaKeyword_2_8_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2664:10: ( (lv_traits_44_0= ruleAbstractMessageTrait ) )
            	    	    // InternalAsyncApi.g:2665:11: (lv_traits_44_0= ruleAbstractMessageTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:2665:11: (lv_traits_44_0= ruleAbstractMessageTrait )
            	    	    // InternalAsyncApi.g:2666:12: lv_traits_44_0= ruleAbstractMessageTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageAccess().getTraitsAbstractMessageTraitParserRuleCall_2_8_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_traits_44_0=ruleAbstractMessageTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"traits",
            	    	    													lv_traits_44_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessageTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,31,FOLLOW_32); 

            	    									newLeafNode(otherlv_45, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_2_8_5());
            	    								
            	    // InternalAsyncApi.g:2688:9: (otherlv_46= ',' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==11) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalAsyncApi.g:2689:10: otherlv_46= ','
            	            {
            	            otherlv_46=(Token)match(input,11,FOLLOW_31); 

            	            										newLeafNode(otherlv_46, grammarAccess.getMessageAccess().getCommaKeyword_2_8_6());
            	            									

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
            	    break loop59;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				

            }

            otherlv_47=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_47, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalAsyncApi.g:2715:1: entryRuleNamedMessage returns [EObject current=null] : iv_ruleNamedMessage= ruleNamedMessage EOF ;
    public final EObject entryRuleNamedMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessage = null;


        try {
            // InternalAsyncApi.g:2715:53: (iv_ruleNamedMessage= ruleNamedMessage EOF )
            // InternalAsyncApi.g:2716:2: iv_ruleNamedMessage= ruleNamedMessage EOF
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
    // InternalAsyncApi.g:2722:1: ruleNamedMessage returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) ;
    public final EObject ruleNamedMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2728:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) )
            // InternalAsyncApi.g:2729:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            {
            // InternalAsyncApi.g:2729:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            // InternalAsyncApi.g:2730:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) )
            {
            // InternalAsyncApi.g:2730:3: ()
            // InternalAsyncApi.g:2731:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageAccess().getNamedMessageAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2737:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:2738:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:2738:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:2739:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedMessageAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedMessageAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:2760:3: ( (lv_message_3_0= ruleAbstractMessage ) )
            // InternalAsyncApi.g:2761:4: (lv_message_3_0= ruleAbstractMessage )
            {
            // InternalAsyncApi.g:2761:4: (lv_message_3_0= ruleAbstractMessage )
            // InternalAsyncApi.g:2762:5: lv_message_3_0= ruleAbstractMessage
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
    // InternalAsyncApi.g:2783:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalAsyncApi.g:2783:44: (iv_ruleTag= ruleTag EOF )
            // InternalAsyncApi.g:2784:2: iv_ruleTag= ruleTag EOF
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
    // InternalAsyncApi.g:2790:1: ruleTag returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2796:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:2797:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:2797:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:2798:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:2798:3: ()
            // InternalAsyncApi.g:2799:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2809:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2810:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2810:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2811:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTagAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2814:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2815:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2815:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop62:
            do {
                int alt62=3;
                int LA62_0 = input.LA(1);

                if ( LA62_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
                    alt62=1;
                }
                else if ( LA62_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
                    alt62=2;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalAsyncApi.g:2816:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2816:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2817:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2817:100: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2818:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2821:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2821:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2821:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2821:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTagAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTagAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2829:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2830:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2830:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:2831:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getTagAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTagRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2848:9: (otherlv_6= ',' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==11) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalAsyncApi.g:2849:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_34); 

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
            	    // InternalAsyncApi.g:2860:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2860:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2861:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2861:100: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2862:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2865:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2865:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2865:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2865:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTagAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTagAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2873:9: ( (lv_description_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2874:10: (lv_description_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2874:10: (lv_description_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2875:11: lv_description_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getTagAccess().getDescriptionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    lv_description_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTagRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2892:9: (otherlv_10= ',' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==11) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // InternalAsyncApi.g:2893:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_34); 

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
            	    break loop62;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTagAccess().getUnorderedGroup_2());
            				

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAsyncApi.g:2919:1: entryRuleAbstractSchema returns [EObject current=null] : iv_ruleAbstractSchema= ruleAbstractSchema EOF ;
    public final EObject entryRuleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSchema = null;


        try {
            // InternalAsyncApi.g:2919:55: (iv_ruleAbstractSchema= ruleAbstractSchema EOF )
            // InternalAsyncApi.g:2920:2: iv_ruleAbstractSchema= ruleAbstractSchema EOF
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
    // InternalAsyncApi.g:2926:1: ruleAbstractSchema returns [EObject current=null] : (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) ;
    public final EObject ruleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Schema_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2932:2: ( (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) )
            // InternalAsyncApi.g:2933:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            {
            // InternalAsyncApi.g:2933:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==8) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==57) ) {
                    alt63=1;
                }
                else if ( (LA63_1==14||LA63_1==17||LA63_1==19||(LA63_1>=28 && LA63_1<=29)||(LA63_1>=44 && LA63_1<=50)) ) {
                    alt63=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalAsyncApi.g:2934:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:2943:3: this_Schema_1= ruleSchema
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
    // InternalAsyncApi.g:2955:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalAsyncApi.g:2955:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalAsyncApi.g:2956:2: iv_ruleSchema= ruleSchema EOF
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
    // InternalAsyncApi.g:2962:1: ruleSchema returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' ) ;
    public final EObject ruleSchema() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_minimum_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_maximum_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        AntlrDatatypeRuleToken lv_format_17_0 = null;

        AntlrDatatypeRuleToken lv_default_29_0 = null;

        EObject lv_properties_34_0 = null;

        EObject lv_properties_36_0 = null;

        AntlrDatatypeRuleToken lv_enum_42_0 = null;

        AntlrDatatypeRuleToken lv_enum_44_0 = null;

        EObject lv_items_49_0 = null;

        AntlrDatatypeRuleToken lv_required_54_0 = null;

        AntlrDatatypeRuleToken lv_required_56_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2968:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' ) )
            // InternalAsyncApi.g:2969:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' )
            {
            // InternalAsyncApi.g:2969:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}' )
            // InternalAsyncApi.g:2970:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) ) ) otherlv_59= '}'
            {
            // InternalAsyncApi.g:2970:3: ()
            // InternalAsyncApi.g:2971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2981:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2982:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2982:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2983:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2986:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2987:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2987:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )*
            loop78:
            do {
                int alt78=12;
                alt78 = dfa78.predict(input);
                switch (alt78) {
            	case 1 :
            	    // InternalAsyncApi.g:2988:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2988:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2989:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2989:103: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2990:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2993:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2993:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:2993:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2993:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:3001:9: ( (lv_title_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3002:10: (lv_title_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3002:10: (lv_title_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:3003:11: lv_title_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getTitleAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_title_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3020:9: (otherlv_6= ',' )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==11) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalAsyncApi.g:3021:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_36); 

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
            	    // InternalAsyncApi.g:3032:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3032:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3033:5: {...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:3033:103: ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:3034:6: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:3037:9: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:3037:10: {...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3037:19: (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:3037:20: otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getTypeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:3045:9: ( (lv_type_9_0= ruleJsonType ) )
            	    // InternalAsyncApi.g:3046:10: (lv_type_9_0= ruleJsonType )
            	    {
            	    // InternalAsyncApi.g:3046:10: (lv_type_9_0= ruleJsonType )
            	    // InternalAsyncApi.g:3047:11: lv_type_9_0= ruleJsonType
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getTypeJsonTypeEnumRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_type_9_0=ruleJsonType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.JsonType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3064:9: (otherlv_10= ',' )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==11) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalAsyncApi.g:3065:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_36); 

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
            	    // InternalAsyncApi.g:3076:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3076:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3077:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:3077:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:3078:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:3081:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:3081:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3081:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:3081:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getSchemaAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:3089:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3090:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3090:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:3091:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3108:9: (otherlv_14= ',' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==11) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalAsyncApi.g:3109:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_36); 

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
            	    // InternalAsyncApi.g:3120:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3120:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3121:5: {...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:3121:103: ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:3122:6: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:3125:9: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:3125:10: {...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3125:19: (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:3125:20: otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,45,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getSchemaAccess().getFormatKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getSchemaAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:3133:9: ( (lv_format_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3134:10: (lv_format_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3134:10: (lv_format_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:3135:11: lv_format_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getFormatAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_format_17_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"format",
            	    												lv_format_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3152:9: (otherlv_18= ',' )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==11) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalAsyncApi.g:3153:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_36); 

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
            	    // InternalAsyncApi.g:3164:4: ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3164:4: ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3165:5: {...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:3165:103: ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:3166:6: ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:3169:9: ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:3169:10: {...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3169:19: (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:3169:20: otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,46,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getSchemaAccess().getMinimumKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_39); 

            	    									newLeafNode(otherlv_20, grammarAccess.getSchemaAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:3177:9: ( (lv_minimum_21_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3178:10: (lv_minimum_21_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3178:10: (lv_minimum_21_0= RULE_INT )
            	    // InternalAsyncApi.g:3179:11: lv_minimum_21_0= RULE_INT
            	    {
            	    lv_minimum_21_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            	    											newLeafNode(lv_minimum_21_0, grammarAccess.getSchemaAccess().getMinimumINTTerminalRuleCall_2_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"minimum",
            	    												lv_minimum_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3195:9: (otherlv_22= ',' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==11) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalAsyncApi.g:3196:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_36); 

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
            	    // InternalAsyncApi.g:3207:4: ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3207:4: ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3208:5: {...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:3208:103: ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:3209:6: ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:3212:9: ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:3212:10: {...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3212:19: (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:3212:20: otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,47,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getSchemaAccess().getMaximumKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_39); 

            	    									newLeafNode(otherlv_24, grammarAccess.getSchemaAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:3220:9: ( (lv_maximum_25_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3221:10: (lv_maximum_25_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3221:10: (lv_maximum_25_0= RULE_INT )
            	    // InternalAsyncApi.g:3222:11: lv_maximum_25_0= RULE_INT
            	    {
            	    lv_maximum_25_0=(Token)match(input,RULE_INT,FOLLOW_37); 

            	    											newLeafNode(lv_maximum_25_0, grammarAccess.getSchemaAccess().getMaximumINTTerminalRuleCall_2_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maximum",
            	    												lv_maximum_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3238:9: (otherlv_26= ',' )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==11) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalAsyncApi.g:3239:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_36); 

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
            	    // InternalAsyncApi.g:3250:4: ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3250:4: ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3251:5: {...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:3251:103: ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:3252:6: ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:3255:9: ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:3255:10: {...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3255:19: (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:3255:20: otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSchemaAccess().getDefaultKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_40); 

            	    									newLeafNode(otherlv_28, grammarAccess.getSchemaAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalAsyncApi.g:3263:9: ( (lv_default_29_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:3264:10: (lv_default_29_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:3264:10: (lv_default_29_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:3265:11: lv_default_29_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDefaultPrimitiveValueParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_default_29_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3282:9: (otherlv_30= ',' )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==11) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalAsyncApi.g:3283:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,11,FOLLOW_36); 

            	            										newLeafNode(otherlv_30, grammarAccess.getSchemaAccess().getCommaKeyword_2_6_3());
            	            									

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
            	    // InternalAsyncApi.g:3294:4: ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3294:4: ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3295:5: {...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:3295:103: ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) )
            	    // InternalAsyncApi.g:3296:6: ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:3299:9: ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) )
            	    // InternalAsyncApi.g:3299:10: {...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3299:19: (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? )
            	    // InternalAsyncApi.g:3299:20: otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )?
            	    {
            	    otherlv_31=(Token)match(input,48,FOLLOW_4); 

            	    									newLeafNode(otherlv_31, grammarAccess.getSchemaAccess().getPropertiesKeyword_2_7_0());
            	    								
            	    otherlv_32=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_32, grammarAccess.getSchemaAccess().getColonKeyword_2_7_1());
            	    								
            	    otherlv_33=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_33, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_7_2());
            	    								
            	    // InternalAsyncApi.g:3311:9: ( (lv_properties_34_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:3312:10: (lv_properties_34_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:3312:10: (lv_properties_34_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:3313:11: lv_properties_34_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_7_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_properties_34_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"properties",
            	    												lv_properties_34_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3330:9: (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==11) ) {
            	            alt71=1;
            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3331:10: otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_35, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3335:10: ( (lv_properties_36_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:3336:11: (lv_properties_36_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:3336:11: (lv_properties_36_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:3337:12: lv_properties_36_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_7_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_properties_36_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"properties",
            	    	    													lv_properties_36_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop71;
            	        }
            	    } while (true);

            	    otherlv_37=(Token)match(input,14,FOLLOW_37); 

            	    									newLeafNode(otherlv_37, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_7_5());
            	    								
            	    // InternalAsyncApi.g:3359:9: (otherlv_38= ',' )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==11) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalAsyncApi.g:3360:10: otherlv_38= ','
            	            {
            	            otherlv_38=(Token)match(input,11,FOLLOW_36); 

            	            										newLeafNode(otherlv_38, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_6());
            	            									

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
            	    // InternalAsyncApi.g:3371:4: ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3371:4: ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3372:5: {...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalAsyncApi.g:3372:103: ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    // InternalAsyncApi.g:3373:6: ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalAsyncApi.g:3376:9: ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    // InternalAsyncApi.g:3376:10: {...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3376:19: (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    // InternalAsyncApi.g:3376:20: otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )?
            	    {
            	    otherlv_39=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_39, grammarAccess.getSchemaAccess().getEnumKeyword_2_8_0());
            	    								
            	    otherlv_40=(Token)match(input,10,FOLLOW_25); 

            	    									newLeafNode(otherlv_40, grammarAccess.getSchemaAccess().getColonKeyword_2_8_1());
            	    								
            	    otherlv_41=(Token)match(input,30,FOLLOW_40); 

            	    									newLeafNode(otherlv_41, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_8_2());
            	    								
            	    // InternalAsyncApi.g:3388:9: ( (lv_enum_42_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:3389:10: (lv_enum_42_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:3389:10: (lv_enum_42_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:3390:11: lv_enum_42_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_8_3_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_enum_42_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enum",
            	    												lv_enum_42_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3407:9: (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==11) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3408:10: otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,11,FOLLOW_40); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getSchemaAccess().getCommaKeyword_2_8_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3412:10: ( (lv_enum_44_0= rulePrimitiveValue ) )
            	    	    // InternalAsyncApi.g:3413:11: (lv_enum_44_0= rulePrimitiveValue )
            	    	    {
            	    	    // InternalAsyncApi.g:3413:11: (lv_enum_44_0= rulePrimitiveValue )
            	    	    // InternalAsyncApi.g:3414:12: lv_enum_44_0= rulePrimitiveValue
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_8_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_enum_44_0=rulePrimitiveValue();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_44_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop73;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,31,FOLLOW_37); 

            	    									newLeafNode(otherlv_45, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_8_5());
            	    								
            	    // InternalAsyncApi.g:3436:9: (otherlv_46= ',' )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==11) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // InternalAsyncApi.g:3437:10: otherlv_46= ','
            	            {
            	            otherlv_46=(Token)match(input,11,FOLLOW_36); 

            	            										newLeafNode(otherlv_46, grammarAccess.getSchemaAccess().getCommaKeyword_2_8_6());
            	            									

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
            	    // InternalAsyncApi.g:3448:4: ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3448:4: ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3449:5: {...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalAsyncApi.g:3449:103: ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) )
            	    // InternalAsyncApi.g:3450:6: ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalAsyncApi.g:3453:9: ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) )
            	    // InternalAsyncApi.g:3453:10: {...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3453:19: (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? )
            	    // InternalAsyncApi.g:3453:20: otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )?
            	    {
            	    otherlv_47=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_47, grammarAccess.getSchemaAccess().getItemsKeyword_2_9_0());
            	    								
            	    otherlv_48=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_48, grammarAccess.getSchemaAccess().getColonKeyword_2_9_1());
            	    								
            	    // InternalAsyncApi.g:3461:9: ( (lv_items_49_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:3462:10: (lv_items_49_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:3462:10: (lv_items_49_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:3463:11: lv_items_49_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getItemsAbstractSchemaParserRuleCall_2_9_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_items_49_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"items",
            	    												lv_items_49_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3480:9: (otherlv_50= ',' )?
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==11) ) {
            	        alt75=1;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // InternalAsyncApi.g:3481:10: otherlv_50= ','
            	            {
            	            otherlv_50=(Token)match(input,11,FOLLOW_36); 

            	            										newLeafNode(otherlv_50, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_3());
            	            									

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
            	    // InternalAsyncApi.g:3492:4: ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3492:4: ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3493:5: {...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalAsyncApi.g:3493:104: ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) )
            	    // InternalAsyncApi.g:3494:6: ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalAsyncApi.g:3497:9: ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) )
            	    // InternalAsyncApi.g:3497:10: {...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3497:19: (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? )
            	    // InternalAsyncApi.g:3497:20: otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )?
            	    {
            	    otherlv_51=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_51, grammarAccess.getSchemaAccess().getRequiredKeyword_2_10_0());
            	    								
            	    otherlv_52=(Token)match(input,10,FOLLOW_25); 

            	    									newLeafNode(otherlv_52, grammarAccess.getSchemaAccess().getColonKeyword_2_10_1());
            	    								
            	    otherlv_53=(Token)match(input,30,FOLLOW_9); 

            	    									newLeafNode(otherlv_53, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_10_2());
            	    								
            	    // InternalAsyncApi.g:3509:9: ( (lv_required_54_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3510:10: (lv_required_54_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3510:10: (lv_required_54_0= ruleAnyString )
            	    // InternalAsyncApi.g:3511:11: lv_required_54_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getRequiredAnyStringParserRuleCall_2_10_3_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_required_54_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"required",
            	    												lv_required_54_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3528:9: (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==11) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3529:10: otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_55=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_55, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3533:10: ( (lv_required_56_0= ruleAnyString ) )
            	    	    // InternalAsyncApi.g:3534:11: (lv_required_56_0= ruleAnyString )
            	    	    {
            	    	    // InternalAsyncApi.g:3534:11: (lv_required_56_0= ruleAnyString )
            	    	    // InternalAsyncApi.g:3535:12: lv_required_56_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getRequiredAnyStringParserRuleCall_2_10_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_required_56_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"required",
            	    	    													lv_required_56_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop76;
            	        }
            	    } while (true);

            	    otherlv_57=(Token)match(input,31,FOLLOW_37); 

            	    									newLeafNode(otherlv_57, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_10_5());
            	    								
            	    // InternalAsyncApi.g:3557:9: (otherlv_58= ',' )?
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==11) ) {
            	        alt77=1;
            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // InternalAsyncApi.g:3558:10: otherlv_58= ','
            	            {
            	            otherlv_58=(Token)match(input,11,FOLLOW_36); 

            	            										newLeafNode(otherlv_58, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_6());
            	            									

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
            	    break loop78;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				

            }

            otherlv_59=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAsyncApi.g:3584:1: entryRuleNamedSchema returns [EObject current=null] : iv_ruleNamedSchema= ruleNamedSchema EOF ;
    public final EObject entryRuleNamedSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedSchema = null;


        try {
            // InternalAsyncApi.g:3584:52: (iv_ruleNamedSchema= ruleNamedSchema EOF )
            // InternalAsyncApi.g:3585:2: iv_ruleNamedSchema= ruleNamedSchema EOF
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
    // InternalAsyncApi.g:3591:1: ruleNamedSchema returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleNamedSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_schema_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3597:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) )
            // InternalAsyncApi.g:3598:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            {
            // InternalAsyncApi.g:3598:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            // InternalAsyncApi.g:3599:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) )
            {
            // InternalAsyncApi.g:3599:3: ()
            // InternalAsyncApi.g:3600:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedSchemaAccess().getNamedSchemaAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:3606:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:3607:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:3607:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:3608:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedSchemaAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedSchemaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedSchemaAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:3629:3: ( (lv_schema_3_0= ruleAbstractSchema ) )
            // InternalAsyncApi.g:3630:4: (lv_schema_3_0= ruleAbstractSchema )
            {
            // InternalAsyncApi.g:3630:4: (lv_schema_3_0= ruleAbstractSchema )
            // InternalAsyncApi.g:3631:5: lv_schema_3_0= ruleAbstractSchema
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


    // $ANTLR start "entryRuleAbstractParameter"
    // InternalAsyncApi.g:3652:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalAsyncApi.g:3652:58: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalAsyncApi.g:3653:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractParameter=ruleAbstractParameter();

            state._fsp--;

             current =iv_ruleAbstractParameter; 
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
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // InternalAsyncApi.g:3659:1: ruleAbstractParameter returns [EObject current=null] : (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Parameter_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3665:2: ( (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter ) )
            // InternalAsyncApi.g:3666:2: (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter )
            {
            // InternalAsyncApi.g:3666:2: (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==8) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==14||LA79_1==19||(LA79_1>=51 && LA79_1<=52)) ) {
                    alt79=2;
                }
                else if ( (LA79_1==57) ) {
                    alt79=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalAsyncApi.g:3667:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3676:3: this_Parameter_1= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_1=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_1;
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
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleParameter"
    // InternalAsyncApi.g:3688:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAsyncApi.g:3688:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAsyncApi.g:3689:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalAsyncApi.g:3695:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_schema_9_0 = null;

        AntlrDatatypeRuleToken lv_location_13_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3701:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:3702:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:3702:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:3703:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:3703:3: ()
            // InternalAsyncApi.g:3704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:3714:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:3715:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:3715:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:3716:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:3719:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:3720:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:3720:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop83:
            do {
                int alt83=4;
                int LA83_0 = input.LA(1);

                if ( LA83_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0) ) {
                    alt83=1;
                }
                else if ( LA83_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1) ) {
                    alt83=2;
                }
                else if ( LA83_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2) ) {
                    alt83=3;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalAsyncApi.g:3721:4: ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3721:4: ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3722:5: {...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:3722:106: ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:3723:6: ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:3726:9: ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:3726:10: {...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3726:19: (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:3726:20: otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getDescriptionKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:3734:9: ( (lv_description_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3735:10: (lv_description_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3735:10: (lv_description_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:3736:11: lv_description_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getDescriptionAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_description_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getParameterRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3753:9: (otherlv_6= ',' )?
            	    int alt80=2;
            	    int LA80_0 = input.LA(1);

            	    if ( (LA80_0==11) ) {
            	        alt80=1;
            	    }
            	    switch (alt80) {
            	        case 1 :
            	            // InternalAsyncApi.g:3754:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_41); 

            	            										newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:3765:4: ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3765:4: ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3766:5: {...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:3766:106: ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:3767:6: ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:3770:9: ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:3770:10: {...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3770:19: (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:3770:20: otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,51,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getSchemaKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:3778:9: ( (lv_schema_9_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:3779:10: (lv_schema_9_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:3779:10: (lv_schema_9_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:3780:11: lv_schema_9_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getSchemaAbstractSchemaParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_schema_9_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getParameterRule());
            	    											}
            	    											set(
            	    												current,
            	    												"schema",
            	    												lv_schema_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3797:9: (otherlv_10= ',' )?
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==11) ) {
            	        alt81=1;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // InternalAsyncApi.g:3798:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_41); 

            	            										newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:3809:4: ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3809:4: ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3810:5: {...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:3810:106: ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:3811:6: ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:3814:9: ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:3814:10: {...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3814:19: (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:3814:20: otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,52,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getLocationKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:3822:9: ( (lv_location_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3823:10: (lv_location_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3823:10: (lv_location_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:3824:11: lv_location_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getLocationAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_location_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getParameterRule());
            	    											}
            	    											set(
            	    												current,
            	    												"location",
            	    												lv_location_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3841:9: (otherlv_14= ',' )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==11) ) {
            	        alt82=1;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // InternalAsyncApi.g:3842:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_41); 

            	            										newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleNamedParameter"
    // InternalAsyncApi.g:3868:1: entryRuleNamedParameter returns [EObject current=null] : iv_ruleNamedParameter= ruleNamedParameter EOF ;
    public final EObject entryRuleNamedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedParameter = null;


        try {
            // InternalAsyncApi.g:3868:55: (iv_ruleNamedParameter= ruleNamedParameter EOF )
            // InternalAsyncApi.g:3869:2: iv_ruleNamedParameter= ruleNamedParameter EOF
            {
             newCompositeNode(grammarAccess.getNamedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedParameter=ruleNamedParameter();

            state._fsp--;

             current =iv_ruleNamedParameter; 
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
    // $ANTLR end "entryRuleNamedParameter"


    // $ANTLR start "ruleNamedParameter"
    // InternalAsyncApi.g:3875:1: ruleNamedParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) ) ;
    public final EObject ruleNamedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3881:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) ) )
            // InternalAsyncApi.g:3882:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) )
            {
            // InternalAsyncApi.g:3882:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) )
            // InternalAsyncApi.g:3883:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) )
            {
            // InternalAsyncApi.g:3883:3: ()
            // InternalAsyncApi.g:3884:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedParameterAccess().getNamedParameterAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:3890:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:3891:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:3891:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:3892:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedParameterAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedParameterAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:3913:3: ( (lv_parameter_3_0= ruleAbstractParameter ) )
            // InternalAsyncApi.g:3914:4: (lv_parameter_3_0= ruleAbstractParameter )
            {
            // InternalAsyncApi.g:3914:4: (lv_parameter_3_0= ruleAbstractParameter )
            // InternalAsyncApi.g:3915:5: lv_parameter_3_0= ruleAbstractParameter
            {

            					newCompositeNode(grammarAccess.getNamedParameterAccess().getParameterAbstractParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameter_3_0=ruleAbstractParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedParameterRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractParameter");
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
    // $ANTLR end "ruleNamedParameter"


    // $ANTLR start "entryRuleAbstractOperationTrait"
    // InternalAsyncApi.g:3936:1: entryRuleAbstractOperationTrait returns [EObject current=null] : iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF ;
    public final EObject entryRuleAbstractOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperationTrait = null;


        try {
            // InternalAsyncApi.g:3936:63: (iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF )
            // InternalAsyncApi.g:3937:2: iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF
            {
             newCompositeNode(grammarAccess.getAbstractOperationTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractOperationTrait=ruleAbstractOperationTrait();

            state._fsp--;

             current =iv_ruleAbstractOperationTrait; 
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
    // $ANTLR end "entryRuleAbstractOperationTrait"


    // $ANTLR start "ruleAbstractOperationTrait"
    // InternalAsyncApi.g:3943:1: ruleAbstractOperationTrait returns [EObject current=null] : (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait ) ;
    public final EObject ruleAbstractOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_OperationTrait_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3949:2: ( (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait ) )
            // InternalAsyncApi.g:3950:2: (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait )
            {
            // InternalAsyncApi.g:3950:2: (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==8) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==14||LA84_1==19||(LA84_1>=36 && LA84_1<=37)) ) {
                    alt84=2;
                }
                else if ( (LA84_1==57) ) {
                    alt84=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalAsyncApi.g:3951:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractOperationTraitAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3960:3: this_OperationTrait_1= ruleOperationTrait
                    {

                    			newCompositeNode(grammarAccess.getAbstractOperationTraitAccess().getOperationTraitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationTrait_1=ruleOperationTrait();

                    state._fsp--;


                    			current = this_OperationTrait_1;
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
    // $ANTLR end "ruleAbstractOperationTrait"


    // $ANTLR start "entryRuleOperationTrait"
    // InternalAsyncApi.g:3972:1: entryRuleOperationTrait returns [EObject current=null] : iv_ruleOperationTrait= ruleOperationTrait EOF ;
    public final EObject entryRuleOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationTrait = null;


        try {
            // InternalAsyncApi.g:3972:55: (iv_ruleOperationTrait= ruleOperationTrait EOF )
            // InternalAsyncApi.g:3973:2: iv_ruleOperationTrait= ruleOperationTrait EOF
            {
             newCompositeNode(grammarAccess.getOperationTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationTrait=ruleOperationTrait();

            state._fsp--;

             current =iv_ruleOperationTrait; 
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
    // $ANTLR end "entryRuleOperationTrait"


    // $ANTLR start "ruleOperationTrait"
    // InternalAsyncApi.g:3979:1: ruleOperationTrait returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleOperationTrait() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_operationId_5_0 = null;

        AntlrDatatypeRuleToken lv_summary_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3985:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:3986:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:3986:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:3987:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:3987:3: ()
            // InternalAsyncApi.g:3988:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationTraitAccess().getOperationTraitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationTraitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:3998:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:3999:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:3999:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4000:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4003:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4004:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4004:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop88:
            do {
                int alt88=4;
                int LA88_0 = input.LA(1);

                if ( LA88_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0) ) {
                    alt88=1;
                }
                else if ( LA88_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1) ) {
                    alt88=2;
                }
                else if ( LA88_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2) ) {
                    alt88=3;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalAsyncApi.g:4005:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4005:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4006:5: {...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4006:111: ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:4007:6: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4010:9: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:4010:10: {...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4010:19: (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:4010:20: otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOperationTraitAccess().getOperationIdKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOperationTraitAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:4018:9: ( (lv_operationId_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4019:10: (lv_operationId_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4019:10: (lv_operationId_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:4020:11: lv_operationId_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getOperationIdAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
            	    lv_operationId_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operationId",
            	    												lv_operationId_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4037:9: (otherlv_6= ',' )?
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==11) ) {
            	        alt85=1;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // InternalAsyncApi.g:4038:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_43); 

            	            										newLeafNode(otherlv_6, grammarAccess.getOperationTraitAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:4049:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4049:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4050:5: {...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4050:111: ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4051:6: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4054:9: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4054:10: {...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4054:19: (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4054:20: otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOperationTraitAccess().getSummaryKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperationTraitAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:4062:9: ( (lv_summary_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4063:10: (lv_summary_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4063:10: (lv_summary_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:4064:11: lv_summary_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getSummaryAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
            	    lv_summary_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4081:9: (otherlv_10= ',' )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==11) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // InternalAsyncApi.g:4082:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_43); 

            	            										newLeafNode(otherlv_10, grammarAccess.getOperationTraitAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:4093:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4093:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4094:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4094:111: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:4095:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4098:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:4098:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4098:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:4098:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getOperationTraitAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOperationTraitAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:4106:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4107:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4107:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:4108:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4125:9: (otherlv_14= ',' )?
            	    int alt87=2;
            	    int LA87_0 = input.LA(1);

            	    if ( (LA87_0==11) ) {
            	        alt87=1;
            	    }
            	    switch (alt87) {
            	        case 1 :
            	            // InternalAsyncApi.g:4126:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_43); 

            	            										newLeafNode(otherlv_14, grammarAccess.getOperationTraitAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getOperationTraitAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOperationTrait"


    // $ANTLR start "entryRuleNamedOperationTrait"
    // InternalAsyncApi.g:4152:1: entryRuleNamedOperationTrait returns [EObject current=null] : iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF ;
    public final EObject entryRuleNamedOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedOperationTrait = null;


        try {
            // InternalAsyncApi.g:4152:60: (iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF )
            // InternalAsyncApi.g:4153:2: iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF
            {
             newCompositeNode(grammarAccess.getNamedOperationTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedOperationTrait=ruleNamedOperationTrait();

            state._fsp--;

             current =iv_ruleNamedOperationTrait; 
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
    // $ANTLR end "entryRuleNamedOperationTrait"


    // $ANTLR start "ruleNamedOperationTrait"
    // InternalAsyncApi.g:4159:1: ruleNamedOperationTrait returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) ) ;
    public final EObject ruleNamedOperationTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operationTrait_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4165:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) ) )
            // InternalAsyncApi.g:4166:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) )
            {
            // InternalAsyncApi.g:4166:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) )
            // InternalAsyncApi.g:4167:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) )
            {
            // InternalAsyncApi.g:4167:3: ()
            // InternalAsyncApi.g:4168:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedOperationTraitAccess().getNamedOperationTraitAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4174:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4175:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4175:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4176:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedOperationTraitAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedOperationTraitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedOperationTraitAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:4197:3: ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) )
            // InternalAsyncApi.g:4198:4: (lv_operationTrait_3_0= ruleAbstractOperationTrait )
            {
            // InternalAsyncApi.g:4198:4: (lv_operationTrait_3_0= ruleAbstractOperationTrait )
            // InternalAsyncApi.g:4199:5: lv_operationTrait_3_0= ruleAbstractOperationTrait
            {

            					newCompositeNode(grammarAccess.getNamedOperationTraitAccess().getOperationTraitAbstractOperationTraitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_operationTrait_3_0=ruleAbstractOperationTrait();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedOperationTraitRule());
            					}
            					set(
            						current,
            						"operationTrait",
            						lv_operationTrait_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractOperationTrait");
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
    // $ANTLR end "ruleNamedOperationTrait"


    // $ANTLR start "entryRuleAbstractMessageTrait"
    // InternalAsyncApi.g:4220:1: entryRuleAbstractMessageTrait returns [EObject current=null] : iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF ;
    public final EObject entryRuleAbstractMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessageTrait = null;


        try {
            // InternalAsyncApi.g:4220:61: (iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF )
            // InternalAsyncApi.g:4221:2: iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF
            {
             newCompositeNode(grammarAccess.getAbstractMessageTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMessageTrait=ruleAbstractMessageTrait();

            state._fsp--;

             current =iv_ruleAbstractMessageTrait; 
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
    // $ANTLR end "entryRuleAbstractMessageTrait"


    // $ANTLR start "ruleAbstractMessageTrait"
    // InternalAsyncApi.g:4227:1: ruleAbstractMessageTrait returns [EObject current=null] : (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait ) ;
    public final EObject ruleAbstractMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_MessageTrait_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4233:2: ( (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait ) )
            // InternalAsyncApi.g:4234:2: (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait )
            {
            // InternalAsyncApi.g:4234:2: (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==8) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==14||LA89_1==19||LA89_1==37||(LA89_1>=40 && LA89_1<=42)) ) {
                    alt89=2;
                }
                else if ( (LA89_1==57) ) {
                    alt89=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalAsyncApi.g:4235:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageTraitAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:4244:3: this_MessageTrait_1= ruleMessageTrait
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageTraitAccess().getMessageTraitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageTrait_1=ruleMessageTrait();

                    state._fsp--;


                    			current = this_MessageTrait_1;
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
    // $ANTLR end "ruleAbstractMessageTrait"


    // $ANTLR start "entryRuleMessageTrait"
    // InternalAsyncApi.g:4256:1: entryRuleMessageTrait returns [EObject current=null] : iv_ruleMessageTrait= ruleMessageTrait EOF ;
    public final EObject entryRuleMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTrait = null;


        try {
            // InternalAsyncApi.g:4256:53: (iv_ruleMessageTrait= ruleMessageTrait EOF )
            // InternalAsyncApi.g:4257:2: iv_ruleMessageTrait= ruleMessageTrait EOF
            {
             newCompositeNode(grammarAccess.getMessageTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageTrait=ruleMessageTrait();

            state._fsp--;

             current =iv_ruleMessageTrait; 
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
    // $ANTLR end "entryRuleMessageTrait"


    // $ANTLR start "ruleMessageTrait"
    // InternalAsyncApi.g:4263:1: ruleMessageTrait returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) ;
    public final EObject ruleMessageTrait() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_summary_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        Enumerator lv_deprecated_13_0 = null;

        EObject lv_headers_17_0 = null;

        EObject lv_tags_22_0 = null;

        EObject lv_tags_24_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4269:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:4270:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:4270:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:4271:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:4271:3: ()
            // InternalAsyncApi.g:4272:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageTraitAccess().getMessageTraitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageTraitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4282:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4283:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4284:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4287:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4288:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4288:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            loop96:
            do {
                int alt96=6;
                int LA96_0 = input.LA(1);

                if ( LA96_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0) ) {
                    alt96=1;
                }
                else if ( LA96_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1) ) {
                    alt96=2;
                }
                else if ( LA96_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2) ) {
                    alt96=3;
                }
                else if ( LA96_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3) ) {
                    alt96=4;
                }
                else if ( LA96_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4) ) {
                    alt96=5;
                }


                switch (alt96) {
            	case 1 :
            	    // InternalAsyncApi.g:4289:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4289:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4290:5: {...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4290:109: ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:4291:6: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4294:9: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:4294:10: {...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4294:19: (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:4294:20: otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageTraitAccess().getSummaryKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageTraitAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:4302:9: ( (lv_summary_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4303:10: (lv_summary_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4303:10: (lv_summary_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:4304:11: lv_summary_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getSummaryAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_46);
            	    lv_summary_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4321:9: (otherlv_6= ',' )?
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==11) ) {
            	        alt90=1;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // InternalAsyncApi.g:4322:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_45); 

            	            										newLeafNode(otherlv_6, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:4333:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4333:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4334:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4334:109: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4335:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4338:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4338:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4338:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4338:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageTraitAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageTraitAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:4346:9: ( (lv_description_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4347:10: (lv_description_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4347:10: (lv_description_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:4348:11: lv_description_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getDescriptionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_46);
            	    lv_description_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4365:9: (otherlv_10= ',' )?
            	    int alt91=2;
            	    int LA91_0 = input.LA(1);

            	    if ( (LA91_0==11) ) {
            	        alt91=1;
            	    }
            	    switch (alt91) {
            	        case 1 :
            	            // InternalAsyncApi.g:4366:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_45); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:4377:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4377:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4378:5: {...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4378:109: ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:4379:6: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4382:9: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:4382:10: {...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4382:19: (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:4382:20: otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageTraitAccess().getDeprecatedKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_33); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageTraitAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:4390:9: ( (lv_deprecated_13_0= ruleBoolean ) )
            	    // InternalAsyncApi.g:4391:10: (lv_deprecated_13_0= ruleBoolean )
            	    {
            	    // InternalAsyncApi.g:4391:10: (lv_deprecated_13_0= ruleBoolean )
            	    // InternalAsyncApi.g:4392:11: lv_deprecated_13_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getDeprecatedBooleanEnumRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_46);
            	    lv_deprecated_13_0=ruleBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deprecated",
            	    												lv_deprecated_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Boolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4409:9: (otherlv_14= ',' )?
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==11) ) {
            	        alt92=1;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // InternalAsyncApi.g:4410:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_45); 

            	            										newLeafNode(otherlv_14, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:4421:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4421:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4422:5: {...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:4422:109: ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:4423:6: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:4426:9: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:4426:10: {...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4426:19: (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:4426:20: otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageTraitAccess().getHeadersKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageTraitAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:4434:9: ( (lv_headers_17_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:4435:10: (lv_headers_17_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:4435:10: (lv_headers_17_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:4436:11: lv_headers_17_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getHeadersAbstractSchemaParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_46);
            	    lv_headers_17_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"headers",
            	    												lv_headers_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4453:9: (otherlv_18= ',' )?
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==11) ) {
            	        alt93=1;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // InternalAsyncApi.g:4454:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_45); 

            	            										newLeafNode(otherlv_18, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:4465:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4465:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4466:5: {...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:4466:109: ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:4467:6: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:4470:9: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:4470:10: {...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4470:19: (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:4470:20: otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMessageTraitAccess().getTagsKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_25); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMessageTraitAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_21=(Token)match(input,30,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getMessageTraitAccess().getLeftSquareBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:4482:9: ( (lv_tags_22_0= ruleTag ) )
            	    // InternalAsyncApi.g:4483:10: (lv_tags_22_0= ruleTag )
            	    {
            	    // InternalAsyncApi.g:4483:10: (lv_tags_22_0= ruleTag )
            	    // InternalAsyncApi.g:4484:11: lv_tags_22_0= ruleTag
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getTagsTagParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_26);
            	    lv_tags_22_0=ruleTag();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											add(
            	    												current,
            	    												"tags",
            	    												lv_tags_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4501:9: (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )*
            	    loop94:
            	    do {
            	        int alt94=2;
            	        int LA94_0 = input.LA(1);

            	        if ( (LA94_0==11) ) {
            	            alt94=1;
            	        }


            	        switch (alt94) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4502:10: otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4506:10: ( (lv_tags_24_0= ruleTag ) )
            	    	    // InternalAsyncApi.g:4507:11: (lv_tags_24_0= ruleTag )
            	    	    {
            	    	    // InternalAsyncApi.g:4507:11: (lv_tags_24_0= ruleTag )
            	    	    // InternalAsyncApi.g:4508:12: lv_tags_24_0= ruleTag
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageTraitAccess().getTagsTagParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_tags_24_0=ruleTag();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMessageTraitRule());
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
            	    	    break loop94;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,31,FOLLOW_46); 

            	    									newLeafNode(otherlv_25, grammarAccess.getMessageTraitAccess().getRightSquareBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:4530:9: (otherlv_26= ',' )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==11) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // InternalAsyncApi.g:4531:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_45); 

            	            										newLeafNode(otherlv_26, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_4_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            				

            }

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getMessageTraitAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMessageTrait"


    // $ANTLR start "entryRuleNamedMessageTrait"
    // InternalAsyncApi.g:4557:1: entryRuleNamedMessageTrait returns [EObject current=null] : iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF ;
    public final EObject entryRuleNamedMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessageTrait = null;


        try {
            // InternalAsyncApi.g:4557:58: (iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF )
            // InternalAsyncApi.g:4558:2: iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF
            {
             newCompositeNode(grammarAccess.getNamedMessageTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedMessageTrait=ruleNamedMessageTrait();

            state._fsp--;

             current =iv_ruleNamedMessageTrait; 
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
    // $ANTLR end "entryRuleNamedMessageTrait"


    // $ANTLR start "ruleNamedMessageTrait"
    // InternalAsyncApi.g:4564:1: ruleNamedMessageTrait returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) ) ;
    public final EObject ruleNamedMessageTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_messageTrait_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4570:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) ) )
            // InternalAsyncApi.g:4571:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) )
            {
            // InternalAsyncApi.g:4571:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) )
            // InternalAsyncApi.g:4572:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) )
            {
            // InternalAsyncApi.g:4572:3: ()
            // InternalAsyncApi.g:4573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageTraitAccess().getNamedMessageTraitAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4579:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4580:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4580:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4581:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedMessageTraitAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageTraitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedMessageTraitAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:4602:3: ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) )
            // InternalAsyncApi.g:4603:4: (lv_messageTrait_3_0= ruleAbstractMessageTrait )
            {
            // InternalAsyncApi.g:4603:4: (lv_messageTrait_3_0= ruleAbstractMessageTrait )
            // InternalAsyncApi.g:4604:5: lv_messageTrait_3_0= ruleAbstractMessageTrait
            {

            					newCompositeNode(grammarAccess.getNamedMessageTraitAccess().getMessageTraitAbstractMessageTraitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_messageTrait_3_0=ruleAbstractMessageTrait();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageTraitRule());
            					}
            					set(
            						current,
            						"messageTrait",
            						lv_messageTrait_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessageTrait");
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
    // $ANTLR end "ruleNamedMessageTrait"


    // $ANTLR start "entryRuleComponents"
    // InternalAsyncApi.g:4625:1: entryRuleComponents returns [EObject current=null] : iv_ruleComponents= ruleComponents EOF ;
    public final EObject entryRuleComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponents = null;


        try {
            // InternalAsyncApi.g:4625:51: (iv_ruleComponents= ruleComponents EOF )
            // InternalAsyncApi.g:4626:2: iv_ruleComponents= ruleComponents EOF
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
    // InternalAsyncApi.g:4632:1: ruleComponents returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' ) ;
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
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        EObject lv_schemas_6_0 = null;

        EObject lv_schemas_8_0 = null;

        EObject lv_messages_14_0 = null;

        EObject lv_messages_16_0 = null;

        EObject lv_parameters_22_0 = null;

        EObject lv_parameters_24_0 = null;

        EObject lv_operationTraits_30_0 = null;

        EObject lv_operationTraits_32_0 = null;

        EObject lv_messageTraits_38_0 = null;

        EObject lv_messageTraits_40_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4638:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' ) )
            // InternalAsyncApi.g:4639:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' )
            {
            // InternalAsyncApi.g:4639:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' )
            // InternalAsyncApi.g:4640:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}'
            {
            // InternalAsyncApi.g:4640:3: ()
            // InternalAsyncApi.g:4641:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentsAccess().getComponentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4651:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4652:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4652:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4653:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4656:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4657:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4657:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )*
            loop107:
            do {
                int alt107=6;
                int LA107_0 = input.LA(1);

                if ( LA107_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
                    alt107=1;
                }
                else if ( LA107_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
                    alt107=2;
                }
                else if ( LA107_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2) ) {
                    alt107=3;
                }
                else if ( LA107_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3) ) {
                    alt107=4;
                }
                else if ( LA107_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4) ) {
                    alt107=5;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalAsyncApi.g:4658:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4658:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4659:5: {...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4659:107: ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4660:6: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4663:9: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4663:10: {...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4663:19: (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4663:20: otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,53,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentsAccess().getSchemasKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentsAccess().getColonKeyword_2_0_1());
            	    								
            	    otherlv_5=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_5, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_0_2());
            	    								
            	    // InternalAsyncApi.g:4675:9: ( (lv_schemas_6_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:4676:10: (lv_schemas_6_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:4676:10: (lv_schemas_6_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:4677:11: lv_schemas_6_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getSchemasNamedSchemaParserRuleCall_2_0_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    // InternalAsyncApi.g:4694:9: (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )*
            	    loop97:
            	    do {
            	        int alt97=2;
            	        int LA97_0 = input.LA(1);

            	        if ( (LA97_0==11) ) {
            	            alt97=1;
            	        }


            	        switch (alt97) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4695:10: otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getComponentsAccess().getCommaKeyword_2_0_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4699:10: ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:4700:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:4700:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:4701:12: lv_schemas_8_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getSchemasNamedSchemaParserRuleCall_2_0_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
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
            	    	    break loop97;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,14,FOLLOW_48); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_0_5());
            	    								
            	    // InternalAsyncApi.g:4723:9: (otherlv_10= ',' )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==11) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // InternalAsyncApi.g:4724:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_47); 

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
            	    // InternalAsyncApi.g:4735:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4735:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4736:5: {...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4736:107: ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:4737:6: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4740:9: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:4740:10: {...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4740:19: (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:4740:20: otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,54,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentsAccess().getMessagesKeyword_2_1_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentsAccess().getColonKeyword_2_1_1());
            	    								
            	    otherlv_13=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_1_2());
            	    								
            	    // InternalAsyncApi.g:4752:9: ( (lv_messages_14_0= ruleNamedMessage ) )
            	    // InternalAsyncApi.g:4753:10: (lv_messages_14_0= ruleNamedMessage )
            	    {
            	    // InternalAsyncApi.g:4753:10: (lv_messages_14_0= ruleNamedMessage )
            	    // InternalAsyncApi.g:4754:11: lv_messages_14_0= ruleNamedMessage
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getMessagesNamedMessageParserRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
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

            	    // InternalAsyncApi.g:4771:9: (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )*
            	    loop99:
            	    do {
            	        int alt99=2;
            	        int LA99_0 = input.LA(1);

            	        if ( (LA99_0==11) ) {
            	            alt99=1;
            	        }


            	        switch (alt99) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4772:10: otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getComponentsAccess().getCommaKeyword_2_1_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4776:10: ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    // InternalAsyncApi.g:4777:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    {
            	    	    // InternalAsyncApi.g:4777:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    // InternalAsyncApi.g:4778:12: lv_messages_16_0= ruleNamedMessage
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getMessagesNamedMessageParserRuleCall_2_1_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
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
            	    	    break loop99;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,14,FOLLOW_48); 

            	    									newLeafNode(otherlv_17, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_1_5());
            	    								
            	    // InternalAsyncApi.g:4800:9: (otherlv_18= ',' )?
            	    int alt100=2;
            	    int LA100_0 = input.LA(1);

            	    if ( (LA100_0==11) ) {
            	        alt100=1;
            	    }
            	    switch (alt100) {
            	        case 1 :
            	            // InternalAsyncApi.g:4801:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_47); 

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
            	case 3 :
            	    // InternalAsyncApi.g:4812:4: ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4812:4: ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4813:5: {...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4813:107: ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:4814:6: ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4817:9: ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:4817:10: {...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4817:19: (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:4817:20: otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getComponentsAccess().getParametersKeyword_2_2_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getComponentsAccess().getColonKeyword_2_2_1());
            	    								
            	    otherlv_21=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_21, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_2_2());
            	    								
            	    // InternalAsyncApi.g:4829:9: ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    // InternalAsyncApi.g:4830:10: (lv_parameters_22_0= ruleNamedParameter )
            	    {
            	    // InternalAsyncApi.g:4830:10: (lv_parameters_22_0= ruleNamedParameter )
            	    // InternalAsyncApi.g:4831:11: lv_parameters_22_0= ruleNamedParameter
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getParametersNamedParameterParserRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_22_0=ruleNamedParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameters",
            	    												lv_parameters_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4848:9: (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )*
            	    loop101:
            	    do {
            	        int alt101=2;
            	        int LA101_0 = input.LA(1);

            	        if ( (LA101_0==11) ) {
            	            alt101=1;
            	        }


            	        switch (alt101) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4849:10: otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getComponentsAccess().getCommaKeyword_2_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4853:10: ( (lv_parameters_24_0= ruleNamedParameter ) )
            	    	    // InternalAsyncApi.g:4854:11: (lv_parameters_24_0= ruleNamedParameter )
            	    	    {
            	    	    // InternalAsyncApi.g:4854:11: (lv_parameters_24_0= ruleNamedParameter )
            	    	    // InternalAsyncApi.g:4855:12: lv_parameters_24_0= ruleNamedParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getParametersNamedParameterParserRuleCall_2_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_parameters_24_0=ruleNamedParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameters",
            	    	    													lv_parameters_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop101;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,14,FOLLOW_48); 

            	    									newLeafNode(otherlv_25, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_2_5());
            	    								
            	    // InternalAsyncApi.g:4877:9: (otherlv_26= ',' )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==11) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // InternalAsyncApi.g:4878:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_47); 

            	            										newLeafNode(otherlv_26, grammarAccess.getComponentsAccess().getCommaKeyword_2_2_6());
            	            									

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
            	case 4 :
            	    // InternalAsyncApi.g:4889:4: ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4889:4: ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4890:5: {...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:4890:107: ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:4891:6: ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:4894:9: ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:4894:10: {...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4894:19: (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:4894:20: otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,55,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getComponentsAccess().getOperationTraitsKeyword_2_3_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_28, grammarAccess.getComponentsAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_29=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_29, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:4906:9: ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) )
            	    // InternalAsyncApi.g:4907:10: (lv_operationTraits_30_0= ruleNamedOperationTrait )
            	    {
            	    // InternalAsyncApi.g:4907:10: (lv_operationTraits_30_0= ruleNamedOperationTrait )
            	    // InternalAsyncApi.g:4908:11: lv_operationTraits_30_0= ruleNamedOperationTrait
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getOperationTraitsNamedOperationTraitParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_operationTraits_30_0=ruleNamedOperationTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"operationTraits",
            	    												lv_operationTraits_30_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedOperationTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4925:9: (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )*
            	    loop103:
            	    do {
            	        int alt103=2;
            	        int LA103_0 = input.LA(1);

            	        if ( (LA103_0==11) ) {
            	            alt103=1;
            	        }


            	        switch (alt103) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4926:10: otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getComponentsAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4930:10: ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) )
            	    	    // InternalAsyncApi.g:4931:11: (lv_operationTraits_32_0= ruleNamedOperationTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:4931:11: (lv_operationTraits_32_0= ruleNamedOperationTrait )
            	    	    // InternalAsyncApi.g:4932:12: lv_operationTraits_32_0= ruleNamedOperationTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getOperationTraitsNamedOperationTraitParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_operationTraits_32_0=ruleNamedOperationTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"operationTraits",
            	    	    													lv_operationTraits_32_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedOperationTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop103;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,14,FOLLOW_48); 

            	    									newLeafNode(otherlv_33, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:4954:9: (otherlv_34= ',' )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==11) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // InternalAsyncApi.g:4955:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_47); 

            	            										newLeafNode(otherlv_34, grammarAccess.getComponentsAccess().getCommaKeyword_2_3_6());
            	            									

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
            	case 5 :
            	    // InternalAsyncApi.g:4966:4: ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4966:4: ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4967:5: {...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:4967:107: ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) )
            	    // InternalAsyncApi.g:4968:6: ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:4971:9: ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) )
            	    // InternalAsyncApi.g:4971:10: {...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4971:19: (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? )
            	    // InternalAsyncApi.g:4971:20: otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,56,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getComponentsAccess().getMessageTraitsKeyword_2_4_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_36, grammarAccess.getComponentsAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_37=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_37, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:4983:9: ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) )
            	    // InternalAsyncApi.g:4984:10: (lv_messageTraits_38_0= ruleNamedMessageTrait )
            	    {
            	    // InternalAsyncApi.g:4984:10: (lv_messageTraits_38_0= ruleNamedMessageTrait )
            	    // InternalAsyncApi.g:4985:11: lv_messageTraits_38_0= ruleNamedMessageTrait
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getMessageTraitsNamedMessageTraitParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_messageTraits_38_0=ruleNamedMessageTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"messageTraits",
            	    												lv_messageTraits_38_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedMessageTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:5002:9: (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )*
            	    loop105:
            	    do {
            	        int alt105=2;
            	        int LA105_0 = input.LA(1);

            	        if ( (LA105_0==11) ) {
            	            alt105=1;
            	        }


            	        switch (alt105) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:5003:10: otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_39, grammarAccess.getComponentsAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:5007:10: ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) )
            	    	    // InternalAsyncApi.g:5008:11: (lv_messageTraits_40_0= ruleNamedMessageTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:5008:11: (lv_messageTraits_40_0= ruleNamedMessageTrait )
            	    	    // InternalAsyncApi.g:5009:12: lv_messageTraits_40_0= ruleNamedMessageTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getMessageTraitsNamedMessageTraitParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_messageTraits_40_0=ruleNamedMessageTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"messageTraits",
            	    	    													lv_messageTraits_40_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedMessageTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop105;
            	        }
            	    } while (true);

            	    otherlv_41=(Token)match(input,14,FOLLOW_48); 

            	    									newLeafNode(otherlv_41, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:5031:9: (otherlv_42= ',' )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==11) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // InternalAsyncApi.g:5032:10: otherlv_42= ','
            	            {
            	            otherlv_42=(Token)match(input,11,FOLLOW_47); 

            	            										newLeafNode(otherlv_42, grammarAccess.getComponentsAccess().getCommaKeyword_2_4_6());
            	            									

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
            	    break loop107;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_43=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_43, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalAsyncApi.g:5058:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAsyncApi.g:5058:50: (iv_ruleReference= ruleReference EOF )
            // InternalAsyncApi.g:5059:2: iv_ruleReference= ruleReference EOF
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
    // InternalAsyncApi.g:5065:1: ruleReference returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_uri_4_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5071:2: ( ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) )
            // InternalAsyncApi.g:5072:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            {
            // InternalAsyncApi.g:5072:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            // InternalAsyncApi.g:5073:3: () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}'
            {
            // InternalAsyncApi.g:5073:3: ()
            // InternalAsyncApi.g:5074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getRefKeyword_2());
            		
            otherlv_3=(Token)match(input,10,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_3());
            		
            // InternalAsyncApi.g:5092:3: ( (lv_uri_4_0= ruleAnyString ) )
            // InternalAsyncApi.g:5093:4: (lv_uri_4_0= ruleAnyString )
            {
            // InternalAsyncApi.g:5093:4: (lv_uri_4_0= ruleAnyString )
            // InternalAsyncApi.g:5094:5: lv_uri_4_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getUriAnyStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
            lv_uri_4_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"uri",
            						lv_uri_4_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalAsyncApi.g:5119:1: entryRulePrimitiveValue returns [String current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final String entryRulePrimitiveValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveValue = null;


        try {
            // InternalAsyncApi.g:5119:54: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // InternalAsyncApi.g:5120:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
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
    // InternalAsyncApi.g:5126:1: rulePrimitiveValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_AnyString_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5132:2: ( (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT ) )
            // InternalAsyncApi.g:5133:2: (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT )
            {
            // InternalAsyncApi.g:5133:2: (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT )
            int alt108=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 9:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt108=1;
                }
                break;
            case 58:
                {
                alt108=2;
                }
                break;
            case 59:
                {
                alt108=3;
                }
                break;
            case RULE_INT:
                {
                alt108=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalAsyncApi.g:5134:3: this_AnyString_0= ruleAnyString
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveValueAccess().getAnyStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyString_0=ruleAnyString();

                    state._fsp--;


                    			current.merge(this_AnyString_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5145:3: kw= 'true'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getTrueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5151:3: kw= 'false'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getFalseKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5157:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_3);
                    		

                    			newLeafNode(this_INT_3, grammarAccess.getPrimitiveValueAccess().getINTTerminalRuleCall_3());
                    		

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


    // $ANTLR start "entryRuleAnyString"
    // InternalAsyncApi.g:5168:1: entryRuleAnyString returns [String current=null] : iv_ruleAnyString= ruleAnyString EOF ;
    public final String entryRuleAnyString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyString = null;


        try {
            // InternalAsyncApi.g:5168:49: (iv_ruleAnyString= ruleAnyString EOF )
            // InternalAsyncApi.g:5169:2: iv_ruleAnyString= ruleAnyString EOF
            {
             newCompositeNode(grammarAccess.getAnyStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyString=ruleAnyString();

            state._fsp--;

             current =iv_ruleAnyString.getText(); 
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
    // $ANTLR end "entryRuleAnyString"


    // $ANTLR start "ruleAnyString"
    // InternalAsyncApi.g:5175:1: ruleAnyString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword ) ;
    public final AntlrDatatypeRuleToken ruleAnyString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Keyword_2 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5181:2: ( (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword ) )
            // InternalAsyncApi.g:5182:2: (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword )
            {
            // InternalAsyncApi.g:5182:2: (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword )
            int alt109=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt109=1;
                }
                break;
            case 57:
                {
                alt109=2;
                }
                break;
            case 9:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt109=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalAsyncApi.g:5183:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5191:3: kw= '\"$ref\"'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAnyStringAccess().getRefKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5197:3: this_Keyword_2= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getAnyStringAccess().getKeywordParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Keyword_2=ruleKeyword();

                    state._fsp--;


                    			current.merge(this_Keyword_2);
                    		

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
    // $ANTLR end "ruleAnyString"


    // $ANTLR start "entryRuleKeyword"
    // InternalAsyncApi.g:5211:1: entryRuleKeyword returns [String current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final String entryRuleKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyword = null;


        try {
            // InternalAsyncApi.g:5211:47: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalAsyncApi.g:5212:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword.getText(); 
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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalAsyncApi.g:5218:1: ruleKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' ) ;
    public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:5224:2: ( (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' ) )
            // InternalAsyncApi.g:5225:2: (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' )
            {
            // InternalAsyncApi.g:5225:2: (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' )
            int alt110=60;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt110=1;
                }
                break;
            case 61:
                {
                alt110=2;
                }
                break;
            case 62:
                {
                alt110=3;
                }
                break;
            case 63:
                {
                alt110=4;
                }
                break;
            case 64:
                {
                alt110=5;
                }
                break;
            case 9:
                {
                alt110=6;
                }
                break;
            case 65:
                {
                alt110=7;
                }
                break;
            case 15:
                {
                alt110=8;
                }
                break;
            case 16:
                {
                alt110=9;
                }
                break;
            case 21:
                {
                alt110=10;
                }
                break;
            case 28:
                {
                alt110=11;
                }
                break;
            case 40:
                {
                alt110=12;
                }
                break;
            case 19:
                {
                alt110=13;
                }
                break;
            case 25:
                {
                alt110=14;
                }
                break;
            case 29:
                {
                alt110=15;
                }
                break;
            case 45:
                {
                alt110=16;
                }
                break;
            case 41:
                {
                alt110=17;
                }
                break;
            case 12:
                {
                alt110=18;
                }
                break;
            case 66:
                {
                alt110=19;
                }
                break;
            case 49:
                {
                alt110=20;
                }
                break;
            case 22:
                {
                alt110=21;
                }
                break;
            case 52:
                {
                alt110=22;
                }
                break;
            case 47:
                {
                alt110=23;
                }
                break;
            case 38:
                {
                alt110=24;
                }
                break;
            case 56:
                {
                alt110=25;
                }
                break;
            case 54:
                {
                alt110=26;
                }
                break;
            case 46:
                {
                alt110=27;
                }
                break;
            case 67:
                {
                alt110=28;
                }
                break;
            case 68:
                {
                alt110=29;
                }
                break;
            case 23:
                {
                alt110=30;
                }
                break;
            case 69:
                {
                alt110=31;
                }
                break;
            case 70:
                {
                alt110=32;
                }
                break;
            case 71:
                {
                alt110=33;
                }
                break;
            case 36:
                {
                alt110=34;
                }
                break;
            case 55:
                {
                alt110=35;
                }
                break;
            case 34:
                {
                alt110=36;
                }
                break;
            case 43:
                {
                alt110=37;
                }
                break;
            case 48:
                {
                alt110=38;
                }
                break;
            case 26:
                {
                alt110=39;
                }
                break;
            case 32:
                {
                alt110=40;
                }
                break;
            case 50:
                {
                alt110=41;
                }
                break;
            case 51:
                {
                alt110=42;
                }
                break;
            case 53:
                {
                alt110=43;
                }
                break;
            case 13:
                {
                alt110=44;
                }
                break;
            case 72:
                {
                alt110=45;
                }
                break;
            case 73:
                {
                alt110=46;
                }
                break;
            case 74:
                {
                alt110=47;
                }
                break;
            case 33:
                {
                alt110=48;
                }
                break;
            case 37:
                {
                alt110=49;
                }
                break;
            case 42:
                {
                alt110=50;
                }
                break;
            case 20:
                {
                alt110=51;
                }
                break;
            case 17:
                {
                alt110=52;
                }
                break;
            case 39:
                {
                alt110=53;
                }
                break;
            case 44:
                {
                alt110=54;
                }
                break;
            case 24:
                {
                alt110=55;
                }
                break;
            case 27:
                {
                alt110=56;
                }
                break;
            case 18:
                {
                alt110=57;
                }
                break;
            case 75:
                {
                alt110=58;
                }
                break;
            case 76:
                {
                alt110=59;
                }
                break;
            case 35:
                {
                alt110=60;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalAsyncApi.g:5226:3: kw= '\"2.0.0\"'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkDigitTwoFullStopDigitZeroFullStopDigitZeroQuotationMarkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5232:3: kw= '\"amqp\"'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAmqpKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5238:3: kw= '\"amqps\"'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAmqpsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5244:3: kw= '\"any\"'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAnyKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:5250:3: kw= '\"array\"'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getArrayKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:5256:3: kw= '\"asyncapi\"'
                    {
                    kw=(Token)match(input,9,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAsyncapiKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:5262:3: kw= '\"boolean\"'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getBooleanKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:5268:3: kw= '\"channels\"'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getChannelsKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAsyncApi.g:5274:3: kw= '\"components\"'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getComponentsKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAsyncApi.g:5280:3: kw= '\"contact\"'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getContactKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAsyncApi.g:5286:3: kw= '\"default\"'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDefaultKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAsyncApi.g:5292:3: kw= '\"deprecated\"'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDeprecatedKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAsyncApi.g:5298:3: kw= '\"description\"'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDescriptionKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAsyncApi.g:5304:3: kw= '\"email\"'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getEmailKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalAsyncApi.g:5310:3: kw= '\"enum\"'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getEnumKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalAsyncApi.g:5316:3: kw= '\"format\"'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getFormatKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalAsyncApi.g:5322:3: kw= '\"headers\"'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getHeadersKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalAsyncApi.g:5328:3: kw= '\"info\"'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getInfoKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalAsyncApi.g:5334:3: kw= '\"integer\"'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getIntegerKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalAsyncApi.g:5340:3: kw= '\"items\"'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getItemsKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalAsyncApi.g:5346:3: kw= '\"license\"'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getLicenseKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalAsyncApi.g:5352:3: kw= '\"location\"'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getLocationKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalAsyncApi.g:5358:3: kw= '\"maximum\"'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMaximumKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalAsyncApi.g:5364:3: kw= '\"message\"'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessageKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalAsyncApi.g:5370:3: kw= '\"messageTraits\"'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessageTraitsKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalAsyncApi.g:5376:3: kw= '\"messages\"'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessagesKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalAsyncApi.g:5382:3: kw= '\"minimum\"'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMinimumKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalAsyncApi.g:5388:3: kw= '\"mqtt\"'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMqttKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalAsyncApi.g:5394:3: kw= '\"mqtts\"'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMqttsKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalAsyncApi.g:5400:3: kw= '\"name\"'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNameKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalAsyncApi.g:5406:3: kw= '\"null\"'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNullKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalAsyncApi.g:5412:3: kw= '\"number\"'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNumberKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalAsyncApi.g:5418:3: kw= '\"object\"'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getObjectKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalAsyncApi.g:5424:3: kw= '\"operationId\"'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getOperationIdKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalAsyncApi.g:5430:3: kw= '\"operationTraits\"'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getOperationTraitsKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalAsyncApi.g:5436:3: kw= '\"parameters\"'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getParametersKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalAsyncApi.g:5442:3: kw= '\"payload\"'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPayloadKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalAsyncApi.g:5448:3: kw= '\"properties\"'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPropertiesKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalAsyncApi.g:5454:3: kw= '\"protocol\"'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getProtocolKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalAsyncApi.g:5460:3: kw= '\"publish\"'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPublishKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalAsyncApi.g:5466:3: kw= '\"required\"'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getRequiredKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalAsyncApi.g:5472:3: kw= '\"schema\"'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSchemaKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalAsyncApi.g:5478:3: kw= '\"schemas\"'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSchemasKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalAsyncApi.g:5484:3: kw= '\"servers\"'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getServersKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalAsyncApi.g:5490:3: kw= '\"stomp\"'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStompKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalAsyncApi.g:5496:3: kw= '\"stomps\"'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStompsKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalAsyncApi.g:5502:3: kw= '\"string\"'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStringKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalAsyncApi.g:5508:3: kw= '\"subscribe\"'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSubscribeKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalAsyncApi.g:5514:3: kw= '\"summary\"'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSummaryKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalAsyncApi.g:5520:3: kw= '\"tags\"'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTagsKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalAsyncApi.g:5526:3: kw= '\"termsOfService\"'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTermsOfServiceKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalAsyncApi.g:5532:3: kw= '\"title\"'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTitleKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalAsyncApi.g:5538:3: kw= '\"traits\"'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTraitsKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalAsyncApi.g:5544:3: kw= '\"type\"'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTypeKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalAsyncApi.g:5550:3: kw= '\"url\"'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getUrlKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalAsyncApi.g:5556:3: kw= '\"variables\"'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getVariablesKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalAsyncApi.g:5562:3: kw= '\"version\"'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getVersionKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalAsyncApi.g:5568:3: kw= '\"ws\"'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWsKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalAsyncApi.g:5574:3: kw= '\"wss\"'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWssKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalAsyncApi.g:5580:3: kw= '\"x-title\"'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getXTitleKeyword_59());
                    		

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "ruleJsonType"
    // InternalAsyncApi.g:5589:1: ruleJsonType returns [Enumerator current=null] : ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) ) ;
    public final Enumerator ruleJsonType() throws RecognitionException {
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
            // InternalAsyncApi.g:5595:2: ( ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) ) )
            // InternalAsyncApi.g:5596:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) )
            {
            // InternalAsyncApi.g:5596:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) )
            int alt111=8;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt111=1;
                }
                break;
            case 70:
                {
                alt111=2;
                }
                break;
            case 66:
                {
                alt111=3;
                }
                break;
            case 65:
                {
                alt111=4;
                }
                break;
            case 71:
                {
                alt111=5;
                }
                break;
            case 64:
                {
                alt111=6;
                }
                break;
            case 63:
                {
                alt111=7;
                }
                break;
            case 69:
                {
                alt111=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalAsyncApi.g:5597:3: (enumLiteral_0= '\"string\"' )
                    {
                    // InternalAsyncApi.g:5597:3: (enumLiteral_0= '\"string\"' )
                    // InternalAsyncApi.g:5598:4: enumLiteral_0= '\"string\"'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJsonTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5605:3: (enumLiteral_1= '\"number\"' )
                    {
                    // InternalAsyncApi.g:5605:3: (enumLiteral_1= '\"number\"' )
                    // InternalAsyncApi.g:5606:4: enumLiteral_1= '\"number\"'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJsonTypeAccess().getNumberEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5613:3: (enumLiteral_2= '\"integer\"' )
                    {
                    // InternalAsyncApi.g:5613:3: (enumLiteral_2= '\"integer\"' )
                    // InternalAsyncApi.g:5614:4: enumLiteral_2= '\"integer\"'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJsonTypeAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5621:3: (enumLiteral_3= '\"boolean\"' )
                    {
                    // InternalAsyncApi.g:5621:3: (enumLiteral_3= '\"boolean\"' )
                    // InternalAsyncApi.g:5622:4: enumLiteral_3= '\"boolean\"'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJsonTypeAccess().getBooleanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:5629:3: (enumLiteral_4= '\"object\"' )
                    {
                    // InternalAsyncApi.g:5629:3: (enumLiteral_4= '\"object\"' )
                    // InternalAsyncApi.g:5630:4: enumLiteral_4= '\"object\"'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getObjectEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getJsonTypeAccess().getObjectEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:5637:3: (enumLiteral_5= '\"array\"' )
                    {
                    // InternalAsyncApi.g:5637:3: (enumLiteral_5= '\"array\"' )
                    // InternalAsyncApi.g:5638:4: enumLiteral_5= '\"array\"'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getArrayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getJsonTypeAccess().getArrayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:5645:3: (enumLiteral_6= '\"any\"' )
                    {
                    // InternalAsyncApi.g:5645:3: (enumLiteral_6= '\"any\"' )
                    // InternalAsyncApi.g:5646:4: enumLiteral_6= '\"any\"'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getAnyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getJsonTypeAccess().getAnyEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:5653:3: (enumLiteral_7= '\"null\"' )
                    {
                    // InternalAsyncApi.g:5653:3: (enumLiteral_7= '\"null\"' )
                    // InternalAsyncApi.g:5654:4: enumLiteral_7= '\"null\"'
                    {
                    enumLiteral_7=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getNullEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getJsonTypeAccess().getNullEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "ruleBoolean"
    // InternalAsyncApi.g:5664:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:5670:2: ( ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) )
            // InternalAsyncApi.g:5671:2: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            {
            // InternalAsyncApi.g:5671:2: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==59) ) {
                alt112=1;
            }
            else if ( (LA112_0==58) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalAsyncApi.g:5672:3: (enumLiteral_0= 'false' )
                    {
                    // InternalAsyncApi.g:5672:3: (enumLiteral_0= 'false' )
                    // InternalAsyncApi.g:5673:4: enumLiteral_0= 'false'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5680:3: (enumLiteral_1= 'true' )
                    {
                    // InternalAsyncApi.g:5680:3: (enumLiteral_1= 'true' )
                    // InternalAsyncApi.g:5681:4: enumLiteral_1= 'true'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().get_trueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().get_trueEnumLiteralDeclaration_1());
                    			

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
    // InternalAsyncApi.g:5691:1: ruleVersionNumber returns [Enumerator current=null] : (enumLiteral_0= '\"2.0.0\"' ) ;
    public final Enumerator ruleVersionNumber() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:5697:2: ( (enumLiteral_0= '\"2.0.0\"' ) )
            // InternalAsyncApi.g:5698:2: (enumLiteral_0= '\"2.0.0\"' )
            {
            // InternalAsyncApi.g:5698:2: (enumLiteral_0= '\"2.0.0\"' )
            // InternalAsyncApi.g:5699:3: enumLiteral_0= '\"2.0.0\"'
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

            			current = grammarAccess.getVersionNumberAccess().get_200EnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getVersionNumberAccess().get_200EnumLiteralDeclaration());
            		

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


    // $ANTLR start "ruleProtocol"
    // InternalAsyncApi.g:5708:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
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
            // InternalAsyncApi.g:5714:2: ( ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) )
            // InternalAsyncApi.g:5715:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            {
            // InternalAsyncApi.g:5715:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            int alt113=8;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt113=1;
                }
                break;
            case 62:
                {
                alt113=2;
                }
                break;
            case 67:
                {
                alt113=3;
                }
                break;
            case 68:
                {
                alt113=4;
                }
                break;
            case 75:
                {
                alt113=5;
                }
                break;
            case 76:
                {
                alt113=6;
                }
                break;
            case 72:
                {
                alt113=7;
                }
                break;
            case 73:
                {
                alt113=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalAsyncApi.g:5716:3: (enumLiteral_0= '\"amqp\"' )
                    {
                    // InternalAsyncApi.g:5716:3: (enumLiteral_0= '\"amqp\"' )
                    // InternalAsyncApi.g:5717:4: enumLiteral_0= '\"amqp\"'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getAmqpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getAmqpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5724:3: (enumLiteral_1= '\"amqps\"' )
                    {
                    // InternalAsyncApi.g:5724:3: (enumLiteral_1= '\"amqps\"' )
                    // InternalAsyncApi.g:5725:4: enumLiteral_1= '\"amqps\"'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getAmqpsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getAmqpsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5732:3: (enumLiteral_2= '\"mqtt\"' )
                    {
                    // InternalAsyncApi.g:5732:3: (enumLiteral_2= '\"mqtt\"' )
                    // InternalAsyncApi.g:5733:4: enumLiteral_2= '\"mqtt\"'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getMqttEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProtocolAccess().getMqttEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5740:3: (enumLiteral_3= '\"mqtts\"' )
                    {
                    // InternalAsyncApi.g:5740:3: (enumLiteral_3= '\"mqtts\"' )
                    // InternalAsyncApi.g:5741:4: enumLiteral_3= '\"mqtts\"'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getMqttsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getProtocolAccess().getMqttsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:5748:3: (enumLiteral_4= '\"ws\"' )
                    {
                    // InternalAsyncApi.g:5748:3: (enumLiteral_4= '\"ws\"' )
                    // InternalAsyncApi.g:5749:4: enumLiteral_4= '\"ws\"'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getWsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getProtocolAccess().getWsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:5756:3: (enumLiteral_5= '\"wss\"' )
                    {
                    // InternalAsyncApi.g:5756:3: (enumLiteral_5= '\"wss\"' )
                    // InternalAsyncApi.g:5757:4: enumLiteral_5= '\"wss\"'
                    {
                    enumLiteral_5=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getWssEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getProtocolAccess().getWssEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:5764:3: (enumLiteral_6= '\"stomp\"' )
                    {
                    // InternalAsyncApi.g:5764:3: (enumLiteral_6= '\"stomp\"' )
                    // InternalAsyncApi.g:5765:4: enumLiteral_6= '\"stomp\"'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getStompEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getProtocolAccess().getStompEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:5772:3: (enumLiteral_7= '\"stomps\"' )
                    {
                    // InternalAsyncApi.g:5772:3: (enumLiteral_7= '\"stomps\"' )
                    // InternalAsyncApi.g:5773:4: enumLiteral_7= '\"stomps\"'
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getStompsEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getProtocolAccess().getStompsEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleProtocol"

    // Delegated rules


    protected DFA59 dfa59 = new DFA59(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\16\12\uffff";
    static final String dfa_3s = "\1\53\12\uffff";
    static final String dfa_4s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\3\1\uffff\1\5\3\uffff\1\2\15\uffff\1\4\1\uffff\1\12\1\6\1\7\1\10\1\11",
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

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2237:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==14) ) {s = 1;}

                        else if ( LA59_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA59_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA59_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA59_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA59_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA59_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA59_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA59_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA59_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\16\14\uffff";
    static final String dfa_9s = "\1\62\14\uffff";
    static final String dfa_10s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_11s = "\1\0\14\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\uffff\1\2\1\uffff\1\4\10\uffff\1\10\1\12\16\uffff\1\3\1\5\1\6\1\7\1\11\1\13\1\14",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 2987:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"default\"' otherlv_28= ':' ( (lv_default_29_0= rulePrimitiveValue ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"properties\"' otherlv_32= ':' otherlv_33= '{' ( (lv_properties_34_0= ruleNamedSchema ) ) (otherlv_35= ',' ( (lv_properties_36_0= ruleNamedSchema ) ) )* otherlv_37= '}' (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"enum\"' otherlv_40= ':' otherlv_41= '[' ( (lv_enum_42_0= rulePrimitiveValue ) ) (otherlv_43= ',' ( (lv_enum_44_0= rulePrimitiveValue ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"items\"' otherlv_48= ':' ( (lv_items_49_0= ruleAbstractSchema ) ) (otherlv_50= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= '\"required\"' otherlv_52= ':' otherlv_53= '[' ( (lv_required_54_0= ruleAnyString ) ) (otherlv_55= ',' ( (lv_required_56_0= ruleAnyString ) ) )* otherlv_57= ']' (otherlv_58= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_0 = input.LA(1);

                         
                        int index78_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA78_0==14) ) {s = 1;}

                        else if ( LA78_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA78_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA78_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA78_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA78_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA78_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA78_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA78_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA78_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA78_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA78_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                         
                        input.seek(index78_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001B200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001FA00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001F200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xF3FFFFFF3FFFB220L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007E4800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000007E4000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003804000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003804800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001804800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000D080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000D084800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000D084000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x6000000000000000L,0x0000000000001B18L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000030084000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030084800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000F00084000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000F00084800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000F000084000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000F000084800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000FA0008A4000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000FA0008A4800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000884000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000884800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0007F000300A4000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0007F000300A4800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000000000000000L,0x00000000000004E7L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFFFFFFFF3FFFB230L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0018000000084000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0018000000084800L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000003000084000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000003000084800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000072000084000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000072000084800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x01E0000400004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x01E0000400004800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000004000L});

}
