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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_WS", "'{'", "'\"asyncapi\"'", "':'", "','", "'\"info\"'", "'\"servers\"'", "'}'", "'\"channels\"'", "'\"components\"'", "'\"title\"'", "'\"version\"'", "'\"description\"'", "'\"termsOfService\"'", "'\"contact\"'", "'\"license\"'", "'\"x-basePackage\"'", "'\"name\"'", "'\"url\"'", "'\"email\"'", "'\"protocol\"'", "'\"variables\"'", "'\"default\"'", "'\"enum\"'", "'['", "']'", "'\"publish\"'", "'\"subscribe\"'", "'\"parameters\"'", "'\"x-title\"'", "'\"operationId\"'", "'\"summary\"'", "'\"message\"'", "'\"traits\"'", "'\"deprecated\"'", "'\"headers\"'", "'\"tags\"'", "'\"payload\"'", "'\"type\"'", "'\"format\"'", "'\"minimum\"'", "'\"maximum\"'", "'\"minItems\"'", "'\"maxItems\"'", "'\"properties\"'", "'\"items\"'", "'\"required\"'", "'\"schema\"'", "'\"location\"'", "'\"schemas\"'", "'\"messages\"'", "'\"operationTraits\"'", "'\"messageTraits\"'", "'\"$ref\"'", "'true'", "'false'", "'\"2.0.0\"'", "'\"amqp\"'", "'\"amqps\"'", "'\"any\"'", "'\"array\"'", "'\"boolean\"'", "'\"integer\"'", "'\"mqtt\"'", "'\"mqtts\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"stomp\"'", "'\"stomps\"'", "'\"string\"'", "'\"ws\"'", "'\"wss\"'"
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
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
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
    // InternalAsyncApi.g:407:1: ruleInfo returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) ;
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
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_version_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        AntlrDatatypeRuleToken lv_termsOfService_17_0 = null;

        EObject lv_contact_21_0 = null;

        EObject lv_license_25_0 = null;

        AntlrDatatypeRuleToken lv_basePackage_29_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:413:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) )
            // InternalAsyncApi.g:414:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            {
            // InternalAsyncApi.g:414:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            // InternalAsyncApi.g:415:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}'
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
            		
            // InternalAsyncApi.g:426:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:427:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:427:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:428:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:431:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:432:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:432:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=8;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
                    alt16=4;
                }
                else if ( LA16_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
                    alt16=5;
                }
                else if ( LA16_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
                    alt16=6;
                }
                else if ( LA16_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6) ) {
                    alt16=7;
                }


                switch (alt16) {
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
            	case 7 :
            	    // InternalAsyncApi.g:697:4: ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:697:4: ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:698:5: {...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:698:101: ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:699:6: ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:702:9: ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:702:10: {...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:702:19: (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:702:20: otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getInfoAccess().getXBasePackageKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_28, grammarAccess.getInfoAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalAsyncApi.g:710:9: ( (lv_basePackage_29_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:711:10: (lv_basePackage_29_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:711:10: (lv_basePackage_29_0= ruleAnyString )
            	    // InternalAsyncApi.g:712:11: lv_basePackage_29_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getBasePackageAnyStringParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_basePackage_29_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"basePackage",
            	    												lv_basePackage_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:729:9: (otherlv_30= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==11) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalAsyncApi.g:730:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_30, grammarAccess.getInfoAccess().getCommaKeyword_2_6_3());
            	            									

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

            otherlv_31=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getInfoAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalAsyncApi.g:757:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalAsyncApi.g:757:48: (iv_ruleContact= ruleContact EOF )
            // InternalAsyncApi.g:758:2: iv_ruleContact= ruleContact EOF
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
    // InternalAsyncApi.g:764:1: ruleContact returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
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
            // InternalAsyncApi.g:770:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:771:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:771:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:772:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:772:3: ()
            // InternalAsyncApi.g:773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContactAccess().getContactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:783:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:784:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:784:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:785:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:788:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:789:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:789:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop20:
            do {
                int alt20=4;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
                    alt20=3;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAsyncApi.g:790:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:790:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:791:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:791:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:792:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:795:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:795:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:795:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:795:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getContactAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:803:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:804:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:804:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:805:11: lv_name_5_0= ruleAnyString
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

            	    // InternalAsyncApi.g:822:9: (otherlv_6= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==11) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAsyncApi.g:823:10: otherlv_6= ','
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
            	    // InternalAsyncApi.g:834:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:834:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:835:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:835:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:836:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:839:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:839:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:839:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:839:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getContactAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getContactAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:847:9: ( (lv_url_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:848:10: (lv_url_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:848:10: (lv_url_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:849:11: lv_url_9_0= ruleAnyString
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

            	    // InternalAsyncApi.g:866:9: (otherlv_10= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==11) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalAsyncApi.g:867:10: otherlv_10= ','
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
            	    // InternalAsyncApi.g:878:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:878:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:879:5: {...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:879:104: ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:880:6: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:883:9: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:883:10: {...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:883:19: (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:883:20: otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getContactAccess().getEmailKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getContactAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:891:9: ( (lv_email_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:892:10: (lv_email_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:892:10: (lv_email_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:893:11: lv_email_13_0= ruleAnyString
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

            	    // InternalAsyncApi.g:910:9: (otherlv_14= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==11) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalAsyncApi.g:911:10: otherlv_14= ','
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
            	    break loop20;
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
    // InternalAsyncApi.g:937:1: entryRuleLicense returns [EObject current=null] : iv_ruleLicense= ruleLicense EOF ;
    public final EObject entryRuleLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicense = null;


        try {
            // InternalAsyncApi.g:937:48: (iv_ruleLicense= ruleLicense EOF )
            // InternalAsyncApi.g:938:2: iv_ruleLicense= ruleLicense EOF
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
    // InternalAsyncApi.g:944:1: ruleLicense returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // InternalAsyncApi.g:950:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:951:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:951:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:952:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:952:3: ()
            // InternalAsyncApi.g:953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLicenseAccess().getLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:963:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:964:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:964:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:965:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:968:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:969:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:969:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAsyncApi.g:970:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:970:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:971:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:971:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:972:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:975:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:975:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:975:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:975:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getLicenseAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:983:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:984:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:984:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:985:11: lv_name_5_0= ruleAnyString
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

            	    // InternalAsyncApi.g:1002:9: (otherlv_6= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==11) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAsyncApi.g:1003:10: otherlv_6= ','
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
            	    // InternalAsyncApi.g:1014:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1014:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1015:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1015:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1016:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1019:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1019:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:1019:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1019:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getLicenseAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1027:9: ( (lv_url_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1028:10: (lv_url_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1028:10: (lv_url_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:1029:11: lv_url_9_0= ruleAnyString
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

            	    // InternalAsyncApi.g:1046:9: (otherlv_10= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==11) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalAsyncApi.g:1047:10: otherlv_10= ','
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
            	    break loop23;
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
    // InternalAsyncApi.g:1073:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalAsyncApi.g:1073:47: (iv_ruleServer= ruleServer EOF )
            // InternalAsyncApi.g:1074:2: iv_ruleServer= ruleServer EOF
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
    // InternalAsyncApi.g:1080:1: ruleServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' ) ;
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
            // InternalAsyncApi.g:1086:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' ) )
            // InternalAsyncApi.g:1087:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' )
            {
            // InternalAsyncApi.g:1087:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' )
            // InternalAsyncApi.g:1088:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}'
            {
            // InternalAsyncApi.g:1088:3: ()
            // InternalAsyncApi.g:1089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerAccess().getServerAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1095:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1096:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1096:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1097:5: lv_name_1_0= ruleAnyString
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
            		
            // InternalAsyncApi.g:1122:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:1123:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:1123:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:1124:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServerAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1127:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:1128:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:1128:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=5;
                int LA29_0 = input.LA(1);

                if ( LA29_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1) ) {
                    alt29=2;
                }
                else if ( LA29_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2) ) {
                    alt29=3;
                }
                else if ( LA29_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3) ) {
                    alt29=4;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAsyncApi.g:1129:4: ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1129:4: ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1130:5: {...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1130:103: ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1131:6: ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1134:9: ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1134:10: {...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1134:19: (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1134:20: otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getServerAccess().getUrlKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getServerAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1142:9: ( (lv_url_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1143:10: (lv_url_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1143:10: (lv_url_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1144:11: lv_url_7_0= ruleAnyString
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

            	    // InternalAsyncApi.g:1161:9: (otherlv_8= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==11) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalAsyncApi.g:1162:10: otherlv_8= ','
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
            	    // InternalAsyncApi.g:1173:4: ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1173:4: ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1174:5: {...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1174:103: ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1175:6: ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1178:9: ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1178:10: {...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1178:19: (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1178:20: otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,27,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getServerAccess().getProtocolKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_21); 

            	    									newLeafNode(otherlv_10, grammarAccess.getServerAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1186:9: ( (lv_protocol_11_0= ruleProtocol ) )
            	    // InternalAsyncApi.g:1187:10: (lv_protocol_11_0= ruleProtocol )
            	    {
            	    // InternalAsyncApi.g:1187:10: (lv_protocol_11_0= ruleProtocol )
            	    // InternalAsyncApi.g:1188:11: lv_protocol_11_0= ruleProtocol
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

            	    // InternalAsyncApi.g:1205:9: (otherlv_12= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==11) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalAsyncApi.g:1206:10: otherlv_12= ','
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
            	    // InternalAsyncApi.g:1217:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1217:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1218:5: {...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1218:103: ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:1219:6: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1222:9: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:1222:10: {...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1222:19: (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:1222:20: otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getServerAccess().getDescriptionKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServerAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalAsyncApi.g:1230:9: ( (lv_description_15_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1231:10: (lv_description_15_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1231:10: (lv_description_15_0= ruleAnyString )
            	    // InternalAsyncApi.g:1232:11: lv_description_15_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getDescriptionAnyStringParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
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

            	    // InternalAsyncApi.g:1249:9: (otherlv_16= ',' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==11) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalAsyncApi.g:1250:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_16, grammarAccess.getServerAccess().getCommaKeyword_4_2_3());
            	            									

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
            	case 4 :
            	    // InternalAsyncApi.g:1261:4: ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1261:4: ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1262:5: {...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalAsyncApi.g:1262:103: ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    // InternalAsyncApi.g:1263:6: ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalAsyncApi.g:1266:9: ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    // InternalAsyncApi.g:1266:10: {...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1266:19: (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    // InternalAsyncApi.g:1266:20: otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getServerAccess().getVariablesKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_18, grammarAccess.getServerAccess().getColonKeyword_4_3_1());
            	    								
            	    otherlv_19=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4_3_2());
            	    								
            	    // InternalAsyncApi.g:1278:9: ( (lv_variables_20_0= ruleVariable ) )
            	    // InternalAsyncApi.g:1279:10: (lv_variables_20_0= ruleVariable )
            	    {
            	    // InternalAsyncApi.g:1279:10: (lv_variables_20_0= ruleVariable )
            	    // InternalAsyncApi.g:1280:11: lv_variables_20_0= ruleVariable
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

            	    // InternalAsyncApi.g:1297:9: (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==11) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1298:10: otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServerAccess().getCommaKeyword_4_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1302:10: ( (lv_variables_22_0= ruleVariable ) )
            	    	    // InternalAsyncApi.g:1303:11: (lv_variables_22_0= ruleVariable )
            	    	    {
            	    	    // InternalAsyncApi.g:1303:11: (lv_variables_22_0= ruleVariable )
            	    	    // InternalAsyncApi.g:1304:12: lv_variables_22_0= ruleVariable
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
            	    	    break loop27;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,14,FOLLOW_19); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_4_3_5());
            	    								
            	    // InternalAsyncApi.g:1326:9: (otherlv_24= ',' )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==11) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalAsyncApi.g:1327:10: otherlv_24= ','
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
    // InternalAsyncApi.g:1354:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAsyncApi.g:1354:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAsyncApi.g:1355:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalAsyncApi.g:1361:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // InternalAsyncApi.g:1367:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalAsyncApi.g:1368:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalAsyncApi.g:1368:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalAsyncApi.g:1369:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalAsyncApi.g:1369:3: ()
            // InternalAsyncApi.g:1370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1376:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1377:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1377:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1378:5: lv_name_1_0= ruleAnyString
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
            		
            otherlv_3=(Token)match(input,8,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1403:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1404:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1404:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1405:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1408:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1409:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1409:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            loop34:
            do {
                int alt34=4;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
                    alt34=3;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAsyncApi.g:1410:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1410:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1411:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1411:105: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1412:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1415:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1415:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1415:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1415:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1423:9: ( (lv_description_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1424:10: (lv_description_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1424:10: (lv_description_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1425:11: lv_description_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getDescriptionAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
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

            	    // InternalAsyncApi.g:1442:9: (otherlv_8= ',' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==11) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalAsyncApi.g:1443:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_22); 

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
            	    // InternalAsyncApi.g:1454:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1454:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1455:5: {...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1455:105: ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1456:6: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1459:9: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1459:10: {...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1459:19: (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1459:20: otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getDefaultKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1467:9: ( (lv_default_11_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1468:10: (lv_default_11_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1468:10: (lv_default_11_0= ruleAnyString )
            	    // InternalAsyncApi.g:1469:11: lv_default_11_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getDefaultAnyStringParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
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

            	    // InternalAsyncApi.g:1486:9: (otherlv_12= ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==11) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalAsyncApi.g:1487:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_22); 

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
            	    // InternalAsyncApi.g:1498:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1498:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1499:5: {...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1499:105: ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:1500:6: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1503:9: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:1503:10: {...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1503:19: (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:1503:20: otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getEnumKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getColonKeyword_4_2_1());
            	    								
            	    otherlv_15=(Token)match(input,31,FOLLOW_9); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_4_2_2());
            	    								
            	    // InternalAsyncApi.g:1515:9: ( (lv_enum_16_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1516:10: (lv_enum_16_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1516:10: (lv_enum_16_0= ruleAnyString )
            	    // InternalAsyncApi.g:1517:11: lv_enum_16_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getEnumAnyStringParserRuleCall_4_2_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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

            	    // InternalAsyncApi.g:1534:9: (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==11) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1535:10: otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getCommaKeyword_4_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1539:10: ( (lv_enum_18_0= ruleAnyString ) )
            	    	    // InternalAsyncApi.g:1540:11: (lv_enum_18_0= ruleAnyString )
            	    	    {
            	    	    // InternalAsyncApi.g:1540:11: (lv_enum_18_0= ruleAnyString )
            	    	    // InternalAsyncApi.g:1541:12: lv_enum_18_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getVariableAccess().getEnumAnyStringParserRuleCall_4_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
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
            	    	    break loop32;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,32,FOLLOW_23); 

            	    									newLeafNode(otherlv_19, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_4_2_5());
            	    								
            	    // InternalAsyncApi.g:1563:9: (otherlv_20= ',' )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==11) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalAsyncApi.g:1564:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,11,FOLLOW_22); 

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
            	    break loop34;
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
    // InternalAsyncApi.g:1590:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalAsyncApi.g:1590:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalAsyncApi.g:1591:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalAsyncApi.g:1597:1: ruleChannel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' ) ;
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
            // InternalAsyncApi.g:1603:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' ) )
            // InternalAsyncApi.g:1604:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' )
            {
            // InternalAsyncApi.g:1604:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' )
            // InternalAsyncApi.g:1605:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}'
            {
            // InternalAsyncApi.g:1605:3: ()
            // InternalAsyncApi.g:1606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChannelAccess().getChannelAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1612:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1613:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1613:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1614:5: lv_name_1_0= ruleAnyString
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
            		
            otherlv_3=(Token)match(input,8,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1639:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1640:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1640:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1641:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1644:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1645:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1645:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )*
            loop41:
            do {
                int alt41=6;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2) ) {
                    alt41=3;
                }
                else if ( LA41_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3) ) {
                    alt41=4;
                }
                else if ( LA41_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4) ) {
                    alt41=5;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAsyncApi.g:1646:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1646:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1647:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1647:104: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1648:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1651:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1651:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1651:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1651:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getChannelAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1659:9: ( (lv_description_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1660:10: (lv_description_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1660:10: (lv_description_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1661:11: lv_description_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getDescriptionAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
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

            	    // InternalAsyncApi.g:1678:9: (otherlv_8= ',' )?
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==11) ) {
            	        alt35=1;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalAsyncApi.g:1679:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_26); 

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
            	    // InternalAsyncApi.g:1690:4: ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1690:4: ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1691:5: {...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1691:104: ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1692:6: ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1695:9: ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1695:10: {...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1695:19: (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1695:20: otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,33,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getChannelAccess().getPublishKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getChannelAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1703:9: ( (lv_publish_11_0= ruleOperation ) )
            	    // InternalAsyncApi.g:1704:10: (lv_publish_11_0= ruleOperation )
            	    {
            	    // InternalAsyncApi.g:1704:10: (lv_publish_11_0= ruleOperation )
            	    // InternalAsyncApi.g:1705:11: lv_publish_11_0= ruleOperation
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getPublishOperationParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
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

            	    // InternalAsyncApi.g:1722:9: (otherlv_12= ',' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==11) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalAsyncApi.g:1723:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_26); 

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
            	    // InternalAsyncApi.g:1734:4: ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1734:4: ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1735:5: {...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1735:104: ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:1736:6: ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1739:9: ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:1739:10: {...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1739:19: (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:1739:20: otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getChannelAccess().getSubscribeKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getChannelAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalAsyncApi.g:1747:9: ( (lv_subscribe_15_0= ruleOperation ) )
            	    // InternalAsyncApi.g:1748:10: (lv_subscribe_15_0= ruleOperation )
            	    {
            	    // InternalAsyncApi.g:1748:10: (lv_subscribe_15_0= ruleOperation )
            	    // InternalAsyncApi.g:1749:11: lv_subscribe_15_0= ruleOperation
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getSubscribeOperationParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
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

            	    // InternalAsyncApi.g:1766:9: (otherlv_16= ',' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==11) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalAsyncApi.g:1767:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,11,FOLLOW_26); 

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
            	    // InternalAsyncApi.g:1778:4: ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1778:4: ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1779:5: {...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalAsyncApi.g:1779:104: ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    // InternalAsyncApi.g:1780:6: ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalAsyncApi.g:1783:9: ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    // InternalAsyncApi.g:1783:10: {...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1783:19: (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    // InternalAsyncApi.g:1783:20: otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getChannelAccess().getParametersKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_18, grammarAccess.getChannelAccess().getColonKeyword_4_3_1());
            	    								
            	    otherlv_19=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_4_3_2());
            	    								
            	    // InternalAsyncApi.g:1795:9: ( (lv_parameters_20_0= ruleNamedParameter ) )
            	    // InternalAsyncApi.g:1796:10: (lv_parameters_20_0= ruleNamedParameter )
            	    {
            	    // InternalAsyncApi.g:1796:10: (lv_parameters_20_0= ruleNamedParameter )
            	    // InternalAsyncApi.g:1797:11: lv_parameters_20_0= ruleNamedParameter
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

            	    // InternalAsyncApi.g:1814:9: (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==11) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1815:10: otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getChannelAccess().getCommaKeyword_4_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1819:10: ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    	    // InternalAsyncApi.g:1820:11: (lv_parameters_22_0= ruleNamedParameter )
            	    	    {
            	    	    // InternalAsyncApi.g:1820:11: (lv_parameters_22_0= ruleNamedParameter )
            	    	    // InternalAsyncApi.g:1821:12: lv_parameters_22_0= ruleNamedParameter
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
            	    	    break loop38;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,14,FOLLOW_27); 

            	    									newLeafNode(otherlv_23, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_4_3_5());
            	    								
            	    // InternalAsyncApi.g:1843:9: (otherlv_24= ',' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==11) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalAsyncApi.g:1844:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,11,FOLLOW_26); 

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
            	    // InternalAsyncApi.g:1855:4: ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1855:4: ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1856:5: {...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalAsyncApi.g:1856:104: ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalAsyncApi.g:1857:6: ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalAsyncApi.g:1860:9: ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) )
            	    // InternalAsyncApi.g:1860:10: {...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1860:19: (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? )
            	    // InternalAsyncApi.g:1860:20: otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getChannelAccess().getXTitleKeyword_4_4_0());
            	    								
            	    otherlv_26=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_26, grammarAccess.getChannelAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalAsyncApi.g:1868:9: ( (lv_title_27_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1869:10: (lv_title_27_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1869:10: (lv_title_27_0= ruleAnyString )
            	    // InternalAsyncApi.g:1870:11: lv_title_27_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getTitleAnyStringParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
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

            	    // InternalAsyncApi.g:1887:9: (otherlv_28= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==11) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAsyncApi.g:1888:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,11,FOLLOW_26); 

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
            	    break loop41;
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
    // InternalAsyncApi.g:1914:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalAsyncApi.g:1914:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalAsyncApi.g:1915:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalAsyncApi.g:1921:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) ;
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
            // InternalAsyncApi.g:1927:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:1928:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:1928:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:1929:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:1929:3: ()
            // InternalAsyncApi.g:1930:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1940:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1941:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1941:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1942:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1945:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1946:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1946:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            loop48:
            do {
                int alt48=6;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1) ) {
                    alt48=2;
                }
                else if ( LA48_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2) ) {
                    alt48=3;
                }
                else if ( LA48_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3) ) {
                    alt48=4;
                }
                else if ( LA48_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4) ) {
                    alt48=5;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAsyncApi.g:1947:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1947:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1948:5: {...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1948:106: ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1949:6: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1952:9: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1952:10: {...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:1952:19: (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1952:20: otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getOperationIdKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1960:9: ( (lv_operationId_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1961:10: (lv_operationId_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1961:10: (lv_operationId_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:1962:11: lv_operationId_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getOperationIdAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
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

            	    // InternalAsyncApi.g:1979:9: (otherlv_6= ',' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==11) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalAsyncApi.g:1980:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_28); 

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
            	    // InternalAsyncApi.g:1991:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1991:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1992:5: {...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1992:106: ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1993:6: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1996:9: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1996:10: {...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:1996:19: (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1996:20: otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getSummaryKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2004:9: ( (lv_summary_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2005:10: (lv_summary_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2005:10: (lv_summary_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2006:11: lv_summary_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getSummaryAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
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

            	    // InternalAsyncApi.g:2023:9: (otherlv_10= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==11) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalAsyncApi.g:2024:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_28); 

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
            	    // InternalAsyncApi.g:2035:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2035:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2036:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:2036:106: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:2037:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:2040:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:2040:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2040:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:2040:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2048:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2049:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2049:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:2050:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
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

            	    // InternalAsyncApi.g:2067:9: (otherlv_14= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==11) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalAsyncApi.g:2068:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_28); 

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
            	    // InternalAsyncApi.g:2079:4: ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2079:4: ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2080:5: {...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2080:106: ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2081:6: ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2084:9: ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2084:10: {...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2084:19: (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2084:20: otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getMessageKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2092:9: ( (lv_message_17_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:2093:10: (lv_message_17_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:2093:10: (lv_message_17_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:2094:11: lv_message_17_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getMessageAbstractMessageParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
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

            	    // InternalAsyncApi.g:2111:9: (otherlv_18= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==11) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalAsyncApi.g:2112:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_28); 

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
            	    // InternalAsyncApi.g:2123:4: ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2123:4: ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2124:5: {...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2124:106: ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2125:6: ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2128:9: ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2128:10: {...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2128:19: (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2128:20: otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getOperationAccess().getTraitsKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_20, grammarAccess.getOperationAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_21=(Token)match(input,31,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getOperationAccess().getLeftSquareBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:2140:9: ( (lv_traits_22_0= ruleAbstractOperationTrait ) )
            	    // InternalAsyncApi.g:2141:10: (lv_traits_22_0= ruleAbstractOperationTrait )
            	    {
            	    // InternalAsyncApi.g:2141:10: (lv_traits_22_0= ruleAbstractOperationTrait )
            	    // InternalAsyncApi.g:2142:11: lv_traits_22_0= ruleAbstractOperationTrait
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getTraitsAbstractOperationTraitParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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

            	    // InternalAsyncApi.g:2159:9: (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==11) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2160:10: otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getOperationAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2164:10: ( (lv_traits_24_0= ruleAbstractOperationTrait ) )
            	    	    // InternalAsyncApi.g:2165:11: (lv_traits_24_0= ruleAbstractOperationTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:2165:11: (lv_traits_24_0= ruleAbstractOperationTrait )
            	    	    // InternalAsyncApi.g:2166:12: lv_traits_24_0= ruleAbstractOperationTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getOperationAccess().getTraitsAbstractOperationTraitParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
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
            	    	    break loop46;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,32,FOLLOW_29); 

            	    									newLeafNode(otherlv_25, grammarAccess.getOperationAccess().getRightSquareBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:2188:9: (otherlv_26= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==11) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalAsyncApi.g:2189:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_28); 

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
            	    break loop48;
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
    // InternalAsyncApi.g:2215:1: entryRuleAbstractMessage returns [EObject current=null] : iv_ruleAbstractMessage= ruleAbstractMessage EOF ;
    public final EObject entryRuleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessage = null;


        try {
            // InternalAsyncApi.g:2215:56: (iv_ruleAbstractMessage= ruleAbstractMessage EOF )
            // InternalAsyncApi.g:2216:2: iv_ruleAbstractMessage= ruleAbstractMessage EOF
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
    // InternalAsyncApi.g:2222:1: ruleAbstractMessage returns [EObject current=null] : (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) ;
    public final EObject ruleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2228:2: ( (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) )
            // InternalAsyncApi.g:2229:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            {
            // InternalAsyncApi.g:2229:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==8) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==60) ) {
                    alt49=1;
                }
                else if ( (LA49_1==14||LA49_1==17||LA49_1==19||LA49_1==24||LA49_1==38||(LA49_1>=40 && LA49_1<=44)) ) {
                    alt49=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

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
                    // InternalAsyncApi.g:2230:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:2239:3: this_Message_1= ruleMessage
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
    // InternalAsyncApi.g:2251:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalAsyncApi.g:2251:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalAsyncApi.g:2252:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalAsyncApi.g:2258:1: ruleMessage returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' ) ;
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
            // InternalAsyncApi.g:2264:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' ) )
            // InternalAsyncApi.g:2265:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' )
            {
            // InternalAsyncApi.g:2265:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' )
            // InternalAsyncApi.g:2266:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}'
            {
            // InternalAsyncApi.g:2266:3: ()
            // InternalAsyncApi.g:2267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageAccess().getMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2277:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2278:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2278:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2279:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2282:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2283:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2283:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*
            loop61:
            do {
                int alt61=10;
                alt61 = dfa61.predict(input);
                switch (alt61) {
            	case 1 :
            	    // InternalAsyncApi.g:2284:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2284:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2285:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2285:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2286:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2289:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2289:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2289:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2289:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2297:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2298:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2298:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:2299:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalAsyncApi.g:2316:9: (otherlv_6= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==11) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalAsyncApi.g:2317:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2328:4: ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2328:4: ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2329:5: {...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2329:104: ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2330:6: ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2333:9: ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2333:10: {...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2333:19: (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2333:20: otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getTitleKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2341:9: ( (lv_title_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2342:10: (lv_title_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2342:10: (lv_title_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2343:11: lv_title_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTitleAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalAsyncApi.g:2360:9: (otherlv_10= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==11) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalAsyncApi.g:2361:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2372:4: ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2372:4: ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2373:5: {...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:2373:104: ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:2374:6: ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:2377:9: ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:2377:10: {...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2377:19: (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:2377:20: otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getSummaryKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2385:9: ( (lv_summary_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2386:10: (lv_summary_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2386:10: (lv_summary_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:2387:11: lv_summary_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getSummaryAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalAsyncApi.g:2404:9: (otherlv_14= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==11) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalAsyncApi.g:2405:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2416:4: ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2416:4: ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2417:5: {...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2417:104: ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2418:6: ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2421:9: ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2421:10: {...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2421:19: (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2421:20: otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getDescriptionKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2429:9: ( (lv_description_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2430:10: (lv_description_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2430:10: (lv_description_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:2431:11: lv_description_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getDescriptionAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalAsyncApi.g:2448:9: (otherlv_18= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==11) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalAsyncApi.g:2449:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2460:4: ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2460:4: ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2461:5: {...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2461:104: ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:2462:6: ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2465:9: ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:2465:10: {...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2465:19: (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:2465:20: otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getDeprecatedKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_32); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:2473:9: ( (lv_deprecated_21_0= ruleBoolean ) )
            	    // InternalAsyncApi.g:2474:10: (lv_deprecated_21_0= ruleBoolean )
            	    {
            	    // InternalAsyncApi.g:2474:10: (lv_deprecated_21_0= ruleBoolean )
            	    // InternalAsyncApi.g:2475:11: lv_deprecated_21_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getDeprecatedBooleanEnumRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalAsyncApi.g:2492:9: (otherlv_22= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==11) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalAsyncApi.g:2493:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2504:4: ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2504:4: ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2505:5: {...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:2505:104: ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2506:6: ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:2509:9: ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2509:10: {...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2509:19: (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2509:20: otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getHeadersKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getMessageAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:2517:9: ( (lv_headers_25_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2518:10: (lv_headers_25_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2518:10: (lv_headers_25_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2519:11: lv_headers_25_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getHeadersAbstractSchemaParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalAsyncApi.g:2536:9: (otherlv_26= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==11) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalAsyncApi.g:2537:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2548:4: ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2548:4: ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2549:5: {...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:2549:104: ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:2550:6: ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:2553:9: ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:2553:10: {...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2553:19: (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:2553:20: otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getMessageAccess().getTagsKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_28, grammarAccess.getMessageAccess().getColonKeyword_2_6_1());
            	    								
            	    otherlv_29=(Token)match(input,31,FOLLOW_8); 

            	    									newLeafNode(otherlv_29, grammarAccess.getMessageAccess().getLeftSquareBracketKeyword_2_6_2());
            	    								
            	    // InternalAsyncApi.g:2565:9: ( (lv_tags_30_0= ruleTag ) )
            	    // InternalAsyncApi.g:2566:10: (lv_tags_30_0= ruleTag )
            	    {
            	    // InternalAsyncApi.g:2566:10: (lv_tags_30_0= ruleTag )
            	    // InternalAsyncApi.g:2567:11: lv_tags_30_0= ruleTag
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_6_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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

            	    // InternalAsyncApi.g:2584:9: (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==11) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2585:10: otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getMessageAccess().getCommaKeyword_2_6_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2589:10: ( (lv_tags_32_0= ruleTag ) )
            	    	    // InternalAsyncApi.g:2590:11: (lv_tags_32_0= ruleTag )
            	    	    {
            	    	    // InternalAsyncApi.g:2590:11: (lv_tags_32_0= ruleTag )
            	    	    // InternalAsyncApi.g:2591:12: lv_tags_32_0= ruleTag
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_6_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
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
            	    	    break loop56;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,32,FOLLOW_31); 

            	    									newLeafNode(otherlv_33, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_2_6_5());
            	    								
            	    // InternalAsyncApi.g:2613:9: (otherlv_34= ',' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==11) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalAsyncApi.g:2614:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2625:4: ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2625:4: ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2626:5: {...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:2626:104: ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) )
            	    // InternalAsyncApi.g:2627:6: ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:2630:9: ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) )
            	    // InternalAsyncApi.g:2630:10: {...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2630:19: (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? )
            	    // InternalAsyncApi.g:2630:20: otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getMessageAccess().getPayloadKeyword_2_7_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_36, grammarAccess.getMessageAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalAsyncApi.g:2638:9: ( (lv_payload_37_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2639:10: (lv_payload_37_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2639:10: (lv_payload_37_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2640:11: lv_payload_37_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getPayloadAbstractSchemaParserRuleCall_2_7_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalAsyncApi.g:2657:9: (otherlv_38= ',' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==11) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalAsyncApi.g:2658:10: otherlv_38= ','
            	            {
            	            otherlv_38=(Token)match(input,11,FOLLOW_30); 

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
            	    // InternalAsyncApi.g:2669:4: ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2669:4: ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2670:5: {...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalAsyncApi.g:2670:104: ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    // InternalAsyncApi.g:2671:6: ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalAsyncApi.g:2674:9: ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    // InternalAsyncApi.g:2674:10: {...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2674:19: (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    // InternalAsyncApi.g:2674:20: otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )?
            	    {
            	    otherlv_39=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_39, grammarAccess.getMessageAccess().getTraitsKeyword_2_8_0());
            	    								
            	    otherlv_40=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_40, grammarAccess.getMessageAccess().getColonKeyword_2_8_1());
            	    								
            	    otherlv_41=(Token)match(input,31,FOLLOW_8); 

            	    									newLeafNode(otherlv_41, grammarAccess.getMessageAccess().getLeftSquareBracketKeyword_2_8_2());
            	    								
            	    // InternalAsyncApi.g:2686:9: ( (lv_traits_42_0= ruleAbstractMessageTrait ) )
            	    // InternalAsyncApi.g:2687:10: (lv_traits_42_0= ruleAbstractMessageTrait )
            	    {
            	    // InternalAsyncApi.g:2687:10: (lv_traits_42_0= ruleAbstractMessageTrait )
            	    // InternalAsyncApi.g:2688:11: lv_traits_42_0= ruleAbstractMessageTrait
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTraitsAbstractMessageTraitParserRuleCall_2_8_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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

            	    // InternalAsyncApi.g:2705:9: (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==11) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2706:10: otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getMessageAccess().getCommaKeyword_2_8_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2710:10: ( (lv_traits_44_0= ruleAbstractMessageTrait ) )
            	    	    // InternalAsyncApi.g:2711:11: (lv_traits_44_0= ruleAbstractMessageTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:2711:11: (lv_traits_44_0= ruleAbstractMessageTrait )
            	    	    // InternalAsyncApi.g:2712:12: lv_traits_44_0= ruleAbstractMessageTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageAccess().getTraitsAbstractMessageTraitParserRuleCall_2_8_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
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
            	    	    break loop59;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,32,FOLLOW_31); 

            	    									newLeafNode(otherlv_45, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_2_8_5());
            	    								
            	    // InternalAsyncApi.g:2734:9: (otherlv_46= ',' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==11) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalAsyncApi.g:2735:10: otherlv_46= ','
            	            {
            	            otherlv_46=(Token)match(input,11,FOLLOW_30); 

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
            	    break loop61;
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
    // InternalAsyncApi.g:2761:1: entryRuleNamedMessage returns [EObject current=null] : iv_ruleNamedMessage= ruleNamedMessage EOF ;
    public final EObject entryRuleNamedMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessage = null;


        try {
            // InternalAsyncApi.g:2761:53: (iv_ruleNamedMessage= ruleNamedMessage EOF )
            // InternalAsyncApi.g:2762:2: iv_ruleNamedMessage= ruleNamedMessage EOF
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
    // InternalAsyncApi.g:2768:1: ruleNamedMessage returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) ;
    public final EObject ruleNamedMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2774:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) )
            // InternalAsyncApi.g:2775:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            {
            // InternalAsyncApi.g:2775:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            // InternalAsyncApi.g:2776:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) )
            {
            // InternalAsyncApi.g:2776:3: ()
            // InternalAsyncApi.g:2777:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageAccess().getNamedMessageAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2783:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:2784:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:2784:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:2785:5: lv_name_1_0= ruleAnyString
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
            		
            // InternalAsyncApi.g:2806:3: ( (lv_message_3_0= ruleAbstractMessage ) )
            // InternalAsyncApi.g:2807:4: (lv_message_3_0= ruleAbstractMessage )
            {
            // InternalAsyncApi.g:2807:4: (lv_message_3_0= ruleAbstractMessage )
            // InternalAsyncApi.g:2808:5: lv_message_3_0= ruleAbstractMessage
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
    // InternalAsyncApi.g:2829:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalAsyncApi.g:2829:44: (iv_ruleTag= ruleTag EOF )
            // InternalAsyncApi.g:2830:2: iv_ruleTag= ruleTag EOF
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
    // InternalAsyncApi.g:2836:1: ruleTag returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // InternalAsyncApi.g:2842:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:2843:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:2843:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:2844:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:2844:3: ()
            // InternalAsyncApi.g:2845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2855:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2856:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2856:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2857:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTagAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2860:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2861:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2861:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( LA64_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
                    alt64=1;
                }
                else if ( LA64_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
                    alt64=2;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalAsyncApi.g:2862:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2862:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2863:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2863:100: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2864:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2867:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2867:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2867:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2867:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTagAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTagAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2875:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2876:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2876:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:2877:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getTagAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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

            	    // InternalAsyncApi.g:2894:9: (otherlv_6= ',' )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==11) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalAsyncApi.g:2895:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_33); 

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
            	    // InternalAsyncApi.g:2906:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2906:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2907:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2907:100: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2908:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2911:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2911:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2911:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2911:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTagAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTagAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2919:9: ( (lv_description_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2920:10: (lv_description_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2920:10: (lv_description_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2921:11: lv_description_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getTagAccess().getDescriptionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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

            	    // InternalAsyncApi.g:2938:9: (otherlv_10= ',' )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==11) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalAsyncApi.g:2939:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_33); 

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
            	    break loop64;
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
    // InternalAsyncApi.g:2965:1: entryRuleAbstractSchema returns [EObject current=null] : iv_ruleAbstractSchema= ruleAbstractSchema EOF ;
    public final EObject entryRuleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSchema = null;


        try {
            // InternalAsyncApi.g:2965:55: (iv_ruleAbstractSchema= ruleAbstractSchema EOF )
            // InternalAsyncApi.g:2966:2: iv_ruleAbstractSchema= ruleAbstractSchema EOF
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
    // InternalAsyncApi.g:2972:1: ruleAbstractSchema returns [EObject current=null] : (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) ;
    public final EObject ruleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Schema_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2978:2: ( (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) )
            // InternalAsyncApi.g:2979:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            {
            // InternalAsyncApi.g:2979:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==8) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==60) ) {
                    alt65=1;
                }
                else if ( (LA65_1==14||LA65_1==17||LA65_1==19||(LA65_1>=29 && LA65_1<=30)||(LA65_1>=45 && LA65_1<=53)) ) {
                    alt65=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAsyncApi.g:2980:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:2989:3: this_Schema_1= ruleSchema
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
    // InternalAsyncApi.g:3001:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalAsyncApi.g:3001:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalAsyncApi.g:3002:2: iv_ruleSchema= ruleSchema EOF
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
    // InternalAsyncApi.g:3008:1: ruleSchema returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' ) ;
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
        Token lv_minItems_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_maxItems_33_0=null;
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
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        AntlrDatatypeRuleToken lv_format_17_0 = null;

        AntlrDatatypeRuleToken lv_default_37_0 = null;

        EObject lv_properties_42_0 = null;

        EObject lv_properties_44_0 = null;

        AntlrDatatypeRuleToken lv_enum_50_0 = null;

        AntlrDatatypeRuleToken lv_enum_52_0 = null;

        EObject lv_items_57_0 = null;

        AntlrDatatypeRuleToken lv_required_62_0 = null;

        AntlrDatatypeRuleToken lv_required_64_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3014:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' ) )
            // InternalAsyncApi.g:3015:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' )
            {
            // InternalAsyncApi.g:3015:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' )
            // InternalAsyncApi.g:3016:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}'
            {
            // InternalAsyncApi.g:3016:3: ()
            // InternalAsyncApi.g:3017:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:3027:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:3028:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:3028:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:3029:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:3032:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:3033:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:3033:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )*
            loop82:
            do {
                int alt82=14;
                alt82 = dfa82.predict(input);
                switch (alt82) {
            	case 1 :
            	    // InternalAsyncApi.g:3034:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3034:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3035:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:3035:103: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:3036:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:3039:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:3039:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3039:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:3039:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:3047:9: ( (lv_title_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3048:10: (lv_title_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3048:10: (lv_title_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:3049:11: lv_title_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getTitleAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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

            	    // InternalAsyncApi.g:3066:9: (otherlv_6= ',' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==11) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalAsyncApi.g:3067:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:3078:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3078:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3079:5: {...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:3079:103: ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:3080:6: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:3083:9: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:3083:10: {...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3083:19: (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:3083:20: otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,45,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getTypeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_37); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:3091:9: ( (lv_type_9_0= ruleJsonType ) )
            	    // InternalAsyncApi.g:3092:10: (lv_type_9_0= ruleJsonType )
            	    {
            	    // InternalAsyncApi.g:3092:10: (lv_type_9_0= ruleJsonType )
            	    // InternalAsyncApi.g:3093:11: lv_type_9_0= ruleJsonType
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getTypeJsonTypeEnumRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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

            	    // InternalAsyncApi.g:3110:9: (otherlv_10= ',' )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==11) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalAsyncApi.g:3111:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:3122:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3122:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3123:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:3123:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:3124:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:3127:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:3127:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3127:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:3127:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getSchemaAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:3135:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3136:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3136:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:3137:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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

            	    // InternalAsyncApi.g:3154:9: (otherlv_14= ',' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==11) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalAsyncApi.g:3155:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:3166:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3166:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3167:5: {...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:3167:103: ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:3168:6: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:3171:9: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:3171:10: {...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3171:19: (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:3171:20: otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,46,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getSchemaAccess().getFormatKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getSchemaAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:3179:9: ( (lv_format_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3180:10: (lv_format_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3180:10: (lv_format_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:3181:11: lv_format_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getFormatAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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

            	    // InternalAsyncApi.g:3198:9: (otherlv_18= ',' )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==11) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalAsyncApi.g:3199:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:3210:4: ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3210:4: ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3211:5: {...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:3211:103: ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:3212:6: ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:3215:9: ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:3215:10: {...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3215:19: (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:3215:20: otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,47,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getSchemaAccess().getMinimumKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_20, grammarAccess.getSchemaAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:3223:9: ( (lv_minimum_21_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3224:10: (lv_minimum_21_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3224:10: (lv_minimum_21_0= RULE_INT )
            	    // InternalAsyncApi.g:3225:11: lv_minimum_21_0= RULE_INT
            	    {
            	    lv_minimum_21_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            	    // InternalAsyncApi.g:3241:9: (otherlv_22= ',' )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==11) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalAsyncApi.g:3242:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:3253:4: ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3253:4: ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3254:5: {...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:3254:103: ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:3255:6: ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:3258:9: ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:3258:10: {...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3258:19: (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:3258:20: otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,48,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getSchemaAccess().getMaximumKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_24, grammarAccess.getSchemaAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:3266:9: ( (lv_maximum_25_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3267:10: (lv_maximum_25_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3267:10: (lv_maximum_25_0= RULE_INT )
            	    // InternalAsyncApi.g:3268:11: lv_maximum_25_0= RULE_INT
            	    {
            	    lv_maximum_25_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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

            	    // InternalAsyncApi.g:3284:9: (otherlv_26= ',' )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==11) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalAsyncApi.g:3285:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:3296:4: ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3296:4: ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3297:5: {...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:3297:103: ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:3298:6: ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:3301:9: ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:3301:10: {...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3301:19: (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:3301:20: otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSchemaAccess().getMinItemsKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_28, grammarAccess.getSchemaAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalAsyncApi.g:3309:9: ( (lv_minItems_29_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3310:10: (lv_minItems_29_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3310:10: (lv_minItems_29_0= RULE_INT )
            	    // InternalAsyncApi.g:3311:11: lv_minItems_29_0= RULE_INT
            	    {
            	    lv_minItems_29_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    											newLeafNode(lv_minItems_29_0, grammarAccess.getSchemaAccess().getMinItemsINTTerminalRuleCall_2_6_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"minItems",
            	    												lv_minItems_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3327:9: (otherlv_30= ',' )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==11) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalAsyncApi.g:3328:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,11,FOLLOW_35); 

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
            	    // InternalAsyncApi.g:3339:4: ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3339:4: ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3340:5: {...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:3340:103: ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:3341:6: ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:3344:9: ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:3344:10: {...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3344:19: (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:3344:20: otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )?
            	    {
            	    otherlv_31=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_31, grammarAccess.getSchemaAccess().getMaxItemsKeyword_2_7_0());
            	    								
            	    otherlv_32=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_32, grammarAccess.getSchemaAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalAsyncApi.g:3352:9: ( (lv_maxItems_33_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3353:10: (lv_maxItems_33_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3353:10: (lv_maxItems_33_0= RULE_INT )
            	    // InternalAsyncApi.g:3354:11: lv_maxItems_33_0= RULE_INT
            	    {
            	    lv_maxItems_33_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    											newLeafNode(lv_maxItems_33_0, grammarAccess.getSchemaAccess().getMaxItemsINTTerminalRuleCall_2_7_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maxItems",
            	    												lv_maxItems_33_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3370:9: (otherlv_34= ',' )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==11) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalAsyncApi.g:3371:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_34, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_3());
            	            									

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
            	    // InternalAsyncApi.g:3382:4: ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3382:4: ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3383:5: {...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalAsyncApi.g:3383:103: ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) )
            	    // InternalAsyncApi.g:3384:6: ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalAsyncApi.g:3387:9: ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) )
            	    // InternalAsyncApi.g:3387:10: {...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3387:19: (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? )
            	    // InternalAsyncApi.g:3387:20: otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getSchemaAccess().getDefaultKeyword_2_8_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_39); 

            	    									newLeafNode(otherlv_36, grammarAccess.getSchemaAccess().getColonKeyword_2_8_1());
            	    								
            	    // InternalAsyncApi.g:3395:9: ( (lv_default_37_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:3396:10: (lv_default_37_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:3396:10: (lv_default_37_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:3397:11: lv_default_37_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDefaultPrimitiveValueParserRuleCall_2_8_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_default_37_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_37_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3414:9: (otherlv_38= ',' )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==11) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // InternalAsyncApi.g:3415:10: otherlv_38= ','
            	            {
            	            otherlv_38=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_38, grammarAccess.getSchemaAccess().getCommaKeyword_2_8_3());
            	            									

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
            	    // InternalAsyncApi.g:3426:4: ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3426:4: ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3427:5: {...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalAsyncApi.g:3427:103: ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) )
            	    // InternalAsyncApi.g:3428:6: ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalAsyncApi.g:3431:9: ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) )
            	    // InternalAsyncApi.g:3431:10: {...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3431:19: (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? )
            	    // InternalAsyncApi.g:3431:20: otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )?
            	    {
            	    otherlv_39=(Token)match(input,51,FOLLOW_4); 

            	    									newLeafNode(otherlv_39, grammarAccess.getSchemaAccess().getPropertiesKeyword_2_9_0());
            	    								
            	    otherlv_40=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_40, grammarAccess.getSchemaAccess().getColonKeyword_2_9_1());
            	    								
            	    otherlv_41=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_41, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_9_2());
            	    								
            	    // InternalAsyncApi.g:3443:9: ( (lv_properties_42_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:3444:10: (lv_properties_42_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:3444:10: (lv_properties_42_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:3445:11: lv_properties_42_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_9_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_properties_42_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"properties",
            	    												lv_properties_42_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3462:9: (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )*
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==11) ) {
            	            alt75=1;
            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3463:10: otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3467:10: ( (lv_properties_44_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:3468:11: (lv_properties_44_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:3468:11: (lv_properties_44_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:3469:12: lv_properties_44_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_9_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_properties_44_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"properties",
            	    	    													lv_properties_44_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop75;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,14,FOLLOW_36); 

            	    									newLeafNode(otherlv_45, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_9_5());
            	    								
            	    // InternalAsyncApi.g:3491:9: (otherlv_46= ',' )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==11) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // InternalAsyncApi.g:3492:10: otherlv_46= ','
            	            {
            	            otherlv_46=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_46, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_6());
            	            									

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
            	    // InternalAsyncApi.g:3503:4: ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3503:4: ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3504:5: {...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalAsyncApi.g:3504:104: ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) )
            	    // InternalAsyncApi.g:3505:6: ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalAsyncApi.g:3508:9: ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) )
            	    // InternalAsyncApi.g:3508:10: {...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3508:19: (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? )
            	    // InternalAsyncApi.g:3508:20: otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )?
            	    {
            	    otherlv_47=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_47, grammarAccess.getSchemaAccess().getEnumKeyword_2_10_0());
            	    								
            	    otherlv_48=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_48, grammarAccess.getSchemaAccess().getColonKeyword_2_10_1());
            	    								
            	    otherlv_49=(Token)match(input,31,FOLLOW_39); 

            	    									newLeafNode(otherlv_49, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_10_2());
            	    								
            	    // InternalAsyncApi.g:3520:9: ( (lv_enum_50_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:3521:10: (lv_enum_50_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:3521:10: (lv_enum_50_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:3522:11: lv_enum_50_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_10_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_enum_50_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enum",
            	    												lv_enum_50_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3539:9: (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==11) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3540:10: otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,11,FOLLOW_39); 

            	    	    										newLeafNode(otherlv_51, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3544:10: ( (lv_enum_52_0= rulePrimitiveValue ) )
            	    	    // InternalAsyncApi.g:3545:11: (lv_enum_52_0= rulePrimitiveValue )
            	    	    {
            	    	    // InternalAsyncApi.g:3545:11: (lv_enum_52_0= rulePrimitiveValue )
            	    	    // InternalAsyncApi.g:3546:12: lv_enum_52_0= rulePrimitiveValue
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_10_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_enum_52_0=rulePrimitiveValue();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_52_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    otherlv_53=(Token)match(input,32,FOLLOW_36); 

            	    									newLeafNode(otherlv_53, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_10_5());
            	    								
            	    // InternalAsyncApi.g:3568:9: (otherlv_54= ',' )?
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==11) ) {
            	        alt78=1;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalAsyncApi.g:3569:10: otherlv_54= ','
            	            {
            	            otherlv_54=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_54, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_6());
            	            									

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
            	case 12 :
            	    // InternalAsyncApi.g:3580:4: ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3580:4: ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3581:5: {...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalAsyncApi.g:3581:104: ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) )
            	    // InternalAsyncApi.g:3582:6: ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalAsyncApi.g:3585:9: ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) )
            	    // InternalAsyncApi.g:3585:10: {...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3585:19: (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? )
            	    // InternalAsyncApi.g:3585:20: otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )?
            	    {
            	    otherlv_55=(Token)match(input,52,FOLLOW_4); 

            	    									newLeafNode(otherlv_55, grammarAccess.getSchemaAccess().getItemsKeyword_2_11_0());
            	    								
            	    otherlv_56=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_56, grammarAccess.getSchemaAccess().getColonKeyword_2_11_1());
            	    								
            	    // InternalAsyncApi.g:3593:9: ( (lv_items_57_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:3594:10: (lv_items_57_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:3594:10: (lv_items_57_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:3595:11: lv_items_57_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getItemsAbstractSchemaParserRuleCall_2_11_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_items_57_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"items",
            	    												lv_items_57_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3612:9: (otherlv_58= ',' )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==11) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalAsyncApi.g:3613:10: otherlv_58= ','
            	            {
            	            otherlv_58=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_58, grammarAccess.getSchemaAccess().getCommaKeyword_2_11_3());
            	            									

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
            	case 13 :
            	    // InternalAsyncApi.g:3624:4: ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3624:4: ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3625:5: {...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalAsyncApi.g:3625:104: ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) )
            	    // InternalAsyncApi.g:3626:6: ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalAsyncApi.g:3629:9: ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) )
            	    // InternalAsyncApi.g:3629:10: {...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3629:19: (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? )
            	    // InternalAsyncApi.g:3629:20: otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )?
            	    {
            	    otherlv_59=(Token)match(input,53,FOLLOW_4); 

            	    									newLeafNode(otherlv_59, grammarAccess.getSchemaAccess().getRequiredKeyword_2_12_0());
            	    								
            	    otherlv_60=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_60, grammarAccess.getSchemaAccess().getColonKeyword_2_12_1());
            	    								
            	    otherlv_61=(Token)match(input,31,FOLLOW_9); 

            	    									newLeafNode(otherlv_61, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_12_2());
            	    								
            	    // InternalAsyncApi.g:3641:9: ( (lv_required_62_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3642:10: (lv_required_62_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3642:10: (lv_required_62_0= ruleAnyString )
            	    // InternalAsyncApi.g:3643:11: lv_required_62_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getRequiredAnyStringParserRuleCall_2_12_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_required_62_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"required",
            	    												lv_required_62_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3660:9: (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )*
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==11) ) {
            	            alt80=1;
            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3661:10: otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_63=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_63, grammarAccess.getSchemaAccess().getCommaKeyword_2_12_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3665:10: ( (lv_required_64_0= ruleAnyString ) )
            	    	    // InternalAsyncApi.g:3666:11: (lv_required_64_0= ruleAnyString )
            	    	    {
            	    	    // InternalAsyncApi.g:3666:11: (lv_required_64_0= ruleAnyString )
            	    	    // InternalAsyncApi.g:3667:12: lv_required_64_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getRequiredAnyStringParserRuleCall_2_12_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_required_64_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"required",
            	    	    													lv_required_64_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop80;
            	        }
            	    } while (true);

            	    otherlv_65=(Token)match(input,32,FOLLOW_36); 

            	    									newLeafNode(otherlv_65, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_12_5());
            	    								
            	    // InternalAsyncApi.g:3689:9: (otherlv_66= ',' )?
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==11) ) {
            	        alt81=1;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // InternalAsyncApi.g:3690:10: otherlv_66= ','
            	            {
            	            otherlv_66=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_66, grammarAccess.getSchemaAccess().getCommaKeyword_2_12_6());
            	            									

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
            	    break loop82;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				

            }

            otherlv_67=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_67, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalAsyncApi.g:3716:1: entryRuleNamedSchema returns [EObject current=null] : iv_ruleNamedSchema= ruleNamedSchema EOF ;
    public final EObject entryRuleNamedSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedSchema = null;


        try {
            // InternalAsyncApi.g:3716:52: (iv_ruleNamedSchema= ruleNamedSchema EOF )
            // InternalAsyncApi.g:3717:2: iv_ruleNamedSchema= ruleNamedSchema EOF
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
    // InternalAsyncApi.g:3723:1: ruleNamedSchema returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleNamedSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_schema_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3729:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) )
            // InternalAsyncApi.g:3730:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            {
            // InternalAsyncApi.g:3730:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            // InternalAsyncApi.g:3731:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) )
            {
            // InternalAsyncApi.g:3731:3: ()
            // InternalAsyncApi.g:3732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedSchemaAccess().getNamedSchemaAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:3738:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:3739:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:3739:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:3740:5: lv_name_1_0= ruleAnyString
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
            		
            // InternalAsyncApi.g:3761:3: ( (lv_schema_3_0= ruleAbstractSchema ) )
            // InternalAsyncApi.g:3762:4: (lv_schema_3_0= ruleAbstractSchema )
            {
            // InternalAsyncApi.g:3762:4: (lv_schema_3_0= ruleAbstractSchema )
            // InternalAsyncApi.g:3763:5: lv_schema_3_0= ruleAbstractSchema
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
    // InternalAsyncApi.g:3784:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalAsyncApi.g:3784:58: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalAsyncApi.g:3785:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
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
    // InternalAsyncApi.g:3791:1: ruleAbstractParameter returns [EObject current=null] : (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Parameter_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3797:2: ( (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter ) )
            // InternalAsyncApi.g:3798:2: (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter )
            {
            // InternalAsyncApi.g:3798:2: (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==8) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==14||LA83_1==19||(LA83_1>=54 && LA83_1<=55)) ) {
                    alt83=2;
                }
                else if ( (LA83_1==60) ) {
                    alt83=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalAsyncApi.g:3799:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:3808:3: this_Parameter_1= ruleParameter
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
    // InternalAsyncApi.g:3820:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAsyncApi.g:3820:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAsyncApi.g:3821:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAsyncApi.g:3827:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
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
            // InternalAsyncApi.g:3833:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:3834:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:3834:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:3835:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:3835:3: ()
            // InternalAsyncApi.g:3836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:3846:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:3847:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:3847:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:3848:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:3851:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:3852:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:3852:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop87:
            do {
                int alt87=4;
                int LA87_0 = input.LA(1);

                if ( LA87_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0) ) {
                    alt87=1;
                }
                else if ( LA87_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1) ) {
                    alt87=2;
                }
                else if ( LA87_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2) ) {
                    alt87=3;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalAsyncApi.g:3853:4: ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3853:4: ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3854:5: {...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:3854:106: ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:3855:6: ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:3858:9: ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:3858:10: {...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3858:19: (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:3858:20: otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getDescriptionKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:3866:9: ( (lv_description_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3867:10: (lv_description_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3867:10: (lv_description_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:3868:11: lv_description_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getDescriptionAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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

            	    // InternalAsyncApi.g:3885:9: (otherlv_6= ',' )?
            	    int alt84=2;
            	    int LA84_0 = input.LA(1);

            	    if ( (LA84_0==11) ) {
            	        alt84=1;
            	    }
            	    switch (alt84) {
            	        case 1 :
            	            // InternalAsyncApi.g:3886:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_40); 

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
            	    // InternalAsyncApi.g:3897:4: ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3897:4: ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3898:5: {...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:3898:106: ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:3899:6: ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:3902:9: ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:3902:10: {...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3902:19: (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:3902:20: otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,54,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getSchemaKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:3910:9: ( (lv_schema_9_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:3911:10: (lv_schema_9_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:3911:10: (lv_schema_9_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:3912:11: lv_schema_9_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getSchemaAbstractSchemaParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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

            	    // InternalAsyncApi.g:3929:9: (otherlv_10= ',' )?
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==11) ) {
            	        alt85=1;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // InternalAsyncApi.g:3930:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_40); 

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
            	    // InternalAsyncApi.g:3941:4: ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3941:4: ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3942:5: {...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:3942:106: ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:3943:6: ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:3946:9: ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:3946:10: {...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3946:19: (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:3946:20: otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,55,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getLocationKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:3954:9: ( (lv_location_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3955:10: (lv_location_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3955:10: (lv_location_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:3956:11: lv_location_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getLocationAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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

            	    // InternalAsyncApi.g:3973:9: (otherlv_14= ',' )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==11) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // InternalAsyncApi.g:3974:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_40); 

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
            	    break loop87;
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
    // InternalAsyncApi.g:4000:1: entryRuleNamedParameter returns [EObject current=null] : iv_ruleNamedParameter= ruleNamedParameter EOF ;
    public final EObject entryRuleNamedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedParameter = null;


        try {
            // InternalAsyncApi.g:4000:55: (iv_ruleNamedParameter= ruleNamedParameter EOF )
            // InternalAsyncApi.g:4001:2: iv_ruleNamedParameter= ruleNamedParameter EOF
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
    // InternalAsyncApi.g:4007:1: ruleNamedParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) ) ;
    public final EObject ruleNamedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4013:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) ) )
            // InternalAsyncApi.g:4014:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) )
            {
            // InternalAsyncApi.g:4014:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) )
            // InternalAsyncApi.g:4015:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) )
            {
            // InternalAsyncApi.g:4015:3: ()
            // InternalAsyncApi.g:4016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedParameterAccess().getNamedParameterAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4022:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4023:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4023:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4024:5: lv_name_1_0= ruleAnyString
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
            		
            // InternalAsyncApi.g:4045:3: ( (lv_parameter_3_0= ruleAbstractParameter ) )
            // InternalAsyncApi.g:4046:4: (lv_parameter_3_0= ruleAbstractParameter )
            {
            // InternalAsyncApi.g:4046:4: (lv_parameter_3_0= ruleAbstractParameter )
            // InternalAsyncApi.g:4047:5: lv_parameter_3_0= ruleAbstractParameter
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
    // InternalAsyncApi.g:4068:1: entryRuleAbstractOperationTrait returns [EObject current=null] : iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF ;
    public final EObject entryRuleAbstractOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperationTrait = null;


        try {
            // InternalAsyncApi.g:4068:63: (iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF )
            // InternalAsyncApi.g:4069:2: iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF
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
    // InternalAsyncApi.g:4075:1: ruleAbstractOperationTrait returns [EObject current=null] : (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait ) ;
    public final EObject ruleAbstractOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_OperationTrait_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4081:2: ( (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait ) )
            // InternalAsyncApi.g:4082:2: (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait )
            {
            // InternalAsyncApi.g:4082:2: (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==8) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==14||LA88_1==19||(LA88_1>=37 && LA88_1<=38)) ) {
                    alt88=2;
                }
                else if ( (LA88_1==60) ) {
                    alt88=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalAsyncApi.g:4083:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:4092:3: this_OperationTrait_1= ruleOperationTrait
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
    // InternalAsyncApi.g:4104:1: entryRuleOperationTrait returns [EObject current=null] : iv_ruleOperationTrait= ruleOperationTrait EOF ;
    public final EObject entryRuleOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationTrait = null;


        try {
            // InternalAsyncApi.g:4104:55: (iv_ruleOperationTrait= ruleOperationTrait EOF )
            // InternalAsyncApi.g:4105:2: iv_ruleOperationTrait= ruleOperationTrait EOF
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
    // InternalAsyncApi.g:4111:1: ruleOperationTrait returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
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
            // InternalAsyncApi.g:4117:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:4118:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:4118:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:4119:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:4119:3: ()
            // InternalAsyncApi.g:4120:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationTraitAccess().getOperationTraitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationTraitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4130:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4131:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4131:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4132:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4135:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4136:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4136:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop92:
            do {
                int alt92=4;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1) ) {
                    alt92=2;
                }
                else if ( LA92_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2) ) {
                    alt92=3;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalAsyncApi.g:4137:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4137:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4138:5: {...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4138:111: ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:4139:6: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4142:9: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:4142:10: {...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4142:19: (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:4142:20: otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOperationTraitAccess().getOperationIdKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOperationTraitAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:4150:9: ( (lv_operationId_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4151:10: (lv_operationId_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4151:10: (lv_operationId_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:4152:11: lv_operationId_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getOperationIdAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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

            	    // InternalAsyncApi.g:4169:9: (otherlv_6= ',' )?
            	    int alt89=2;
            	    int LA89_0 = input.LA(1);

            	    if ( (LA89_0==11) ) {
            	        alt89=1;
            	    }
            	    switch (alt89) {
            	        case 1 :
            	            // InternalAsyncApi.g:4170:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_42); 

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
            	    // InternalAsyncApi.g:4181:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4181:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4182:5: {...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4182:111: ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4183:6: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4186:9: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4186:10: {...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4186:19: (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4186:20: otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOperationTraitAccess().getSummaryKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperationTraitAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:4194:9: ( (lv_summary_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4195:10: (lv_summary_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4195:10: (lv_summary_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:4196:11: lv_summary_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getSummaryAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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

            	    // InternalAsyncApi.g:4213:9: (otherlv_10= ',' )?
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==11) ) {
            	        alt90=1;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // InternalAsyncApi.g:4214:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_42); 

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
            	    // InternalAsyncApi.g:4225:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4225:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4226:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4226:111: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:4227:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4230:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:4230:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4230:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:4230:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getOperationTraitAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOperationTraitAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:4238:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4239:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4239:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:4240:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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

            	    // InternalAsyncApi.g:4257:9: (otherlv_14= ',' )?
            	    int alt91=2;
            	    int LA91_0 = input.LA(1);

            	    if ( (LA91_0==11) ) {
            	        alt91=1;
            	    }
            	    switch (alt91) {
            	        case 1 :
            	            // InternalAsyncApi.g:4258:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_42); 

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
            	    break loop92;
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
    // InternalAsyncApi.g:4284:1: entryRuleNamedOperationTrait returns [EObject current=null] : iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF ;
    public final EObject entryRuleNamedOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedOperationTrait = null;


        try {
            // InternalAsyncApi.g:4284:60: (iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF )
            // InternalAsyncApi.g:4285:2: iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF
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
    // InternalAsyncApi.g:4291:1: ruleNamedOperationTrait returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) ) ;
    public final EObject ruleNamedOperationTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operationTrait_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4297:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) ) )
            // InternalAsyncApi.g:4298:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) )
            {
            // InternalAsyncApi.g:4298:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) )
            // InternalAsyncApi.g:4299:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) )
            {
            // InternalAsyncApi.g:4299:3: ()
            // InternalAsyncApi.g:4300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedOperationTraitAccess().getNamedOperationTraitAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4306:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4307:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4307:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4308:5: lv_name_1_0= ruleAnyString
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
            		
            // InternalAsyncApi.g:4329:3: ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) )
            // InternalAsyncApi.g:4330:4: (lv_operationTrait_3_0= ruleAbstractOperationTrait )
            {
            // InternalAsyncApi.g:4330:4: (lv_operationTrait_3_0= ruleAbstractOperationTrait )
            // InternalAsyncApi.g:4331:5: lv_operationTrait_3_0= ruleAbstractOperationTrait
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
    // InternalAsyncApi.g:4352:1: entryRuleAbstractMessageTrait returns [EObject current=null] : iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF ;
    public final EObject entryRuleAbstractMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessageTrait = null;


        try {
            // InternalAsyncApi.g:4352:61: (iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF )
            // InternalAsyncApi.g:4353:2: iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF
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
    // InternalAsyncApi.g:4359:1: ruleAbstractMessageTrait returns [EObject current=null] : (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait ) ;
    public final EObject ruleAbstractMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_MessageTrait_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4365:2: ( (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait ) )
            // InternalAsyncApi.g:4366:2: (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait )
            {
            // InternalAsyncApi.g:4366:2: (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==8) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==14||LA93_1==19||LA93_1==38||(LA93_1>=41 && LA93_1<=43)) ) {
                    alt93=2;
                }
                else if ( (LA93_1==60) ) {
                    alt93=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalAsyncApi.g:4367:3: this_Reference_0= ruleReference
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
                    // InternalAsyncApi.g:4376:3: this_MessageTrait_1= ruleMessageTrait
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
    // InternalAsyncApi.g:4388:1: entryRuleMessageTrait returns [EObject current=null] : iv_ruleMessageTrait= ruleMessageTrait EOF ;
    public final EObject entryRuleMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTrait = null;


        try {
            // InternalAsyncApi.g:4388:53: (iv_ruleMessageTrait= ruleMessageTrait EOF )
            // InternalAsyncApi.g:4389:2: iv_ruleMessageTrait= ruleMessageTrait EOF
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
    // InternalAsyncApi.g:4395:1: ruleMessageTrait returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) ;
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
            // InternalAsyncApi.g:4401:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:4402:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:4402:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:4403:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:4403:3: ()
            // InternalAsyncApi.g:4404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageTraitAccess().getMessageTraitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageTraitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4414:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4415:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4415:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4416:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4419:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4420:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4420:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            loop100:
            do {
                int alt100=6;
                int LA100_0 = input.LA(1);

                if ( LA100_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0) ) {
                    alt100=1;
                }
                else if ( LA100_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1) ) {
                    alt100=2;
                }
                else if ( LA100_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2) ) {
                    alt100=3;
                }
                else if ( LA100_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3) ) {
                    alt100=4;
                }
                else if ( LA100_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4) ) {
                    alt100=5;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalAsyncApi.g:4421:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4421:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4422:5: {...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4422:109: ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:4423:6: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4426:9: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:4426:10: {...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4426:19: (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:4426:20: otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageTraitAccess().getSummaryKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageTraitAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:4434:9: ( (lv_summary_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4435:10: (lv_summary_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4435:10: (lv_summary_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:4436:11: lv_summary_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getSummaryAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
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

            	    // InternalAsyncApi.g:4453:9: (otherlv_6= ',' )?
            	    int alt94=2;
            	    int LA94_0 = input.LA(1);

            	    if ( (LA94_0==11) ) {
            	        alt94=1;
            	    }
            	    switch (alt94) {
            	        case 1 :
            	            // InternalAsyncApi.g:4454:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_44); 

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
            	    // InternalAsyncApi.g:4465:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4465:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4466:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4466:109: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4467:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4470:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4470:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4470:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4470:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageTraitAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageTraitAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:4478:9: ( (lv_description_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4479:10: (lv_description_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4479:10: (lv_description_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:4480:11: lv_description_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getDescriptionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
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

            	    // InternalAsyncApi.g:4497:9: (otherlv_10= ',' )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==11) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // InternalAsyncApi.g:4498:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_44); 

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
            	    // InternalAsyncApi.g:4509:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4509:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4510:5: {...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4510:109: ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:4511:6: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4514:9: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:4514:10: {...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4514:19: (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:4514:20: otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageTraitAccess().getDeprecatedKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_32); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageTraitAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:4522:9: ( (lv_deprecated_13_0= ruleBoolean ) )
            	    // InternalAsyncApi.g:4523:10: (lv_deprecated_13_0= ruleBoolean )
            	    {
            	    // InternalAsyncApi.g:4523:10: (lv_deprecated_13_0= ruleBoolean )
            	    // InternalAsyncApi.g:4524:11: lv_deprecated_13_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getDeprecatedBooleanEnumRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
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

            	    // InternalAsyncApi.g:4541:9: (otherlv_14= ',' )?
            	    int alt96=2;
            	    int LA96_0 = input.LA(1);

            	    if ( (LA96_0==11) ) {
            	        alt96=1;
            	    }
            	    switch (alt96) {
            	        case 1 :
            	            // InternalAsyncApi.g:4542:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_44); 

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
            	    // InternalAsyncApi.g:4553:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4553:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4554:5: {...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:4554:109: ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:4555:6: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:4558:9: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:4558:10: {...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4558:19: (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:4558:20: otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageTraitAccess().getHeadersKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageTraitAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:4566:9: ( (lv_headers_17_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:4567:10: (lv_headers_17_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:4567:10: (lv_headers_17_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:4568:11: lv_headers_17_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getHeadersAbstractSchemaParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
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

            	    // InternalAsyncApi.g:4585:9: (otherlv_18= ',' )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==11) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // InternalAsyncApi.g:4586:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_44); 

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
            	    // InternalAsyncApi.g:4597:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4597:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4598:5: {...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:4598:109: ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:4599:6: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:4602:9: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:4602:10: {...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4602:19: (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:4602:20: otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMessageTraitAccess().getTagsKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMessageTraitAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_21=(Token)match(input,31,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getMessageTraitAccess().getLeftSquareBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:4614:9: ( (lv_tags_22_0= ruleTag ) )
            	    // InternalAsyncApi.g:4615:10: (lv_tags_22_0= ruleTag )
            	    {
            	    // InternalAsyncApi.g:4615:10: (lv_tags_22_0= ruleTag )
            	    // InternalAsyncApi.g:4616:11: lv_tags_22_0= ruleTag
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getTagsTagParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
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

            	    // InternalAsyncApi.g:4633:9: (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )*
            	    loop98:
            	    do {
            	        int alt98=2;
            	        int LA98_0 = input.LA(1);

            	        if ( (LA98_0==11) ) {
            	            alt98=1;
            	        }


            	        switch (alt98) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4634:10: otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4638:10: ( (lv_tags_24_0= ruleTag ) )
            	    	    // InternalAsyncApi.g:4639:11: (lv_tags_24_0= ruleTag )
            	    	    {
            	    	    // InternalAsyncApi.g:4639:11: (lv_tags_24_0= ruleTag )
            	    	    // InternalAsyncApi.g:4640:12: lv_tags_24_0= ruleTag
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageTraitAccess().getTagsTagParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
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
            	    	    break loop98;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,32,FOLLOW_45); 

            	    									newLeafNode(otherlv_25, grammarAccess.getMessageTraitAccess().getRightSquareBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:4662:9: (otherlv_26= ',' )?
            	    int alt99=2;
            	    int LA99_0 = input.LA(1);

            	    if ( (LA99_0==11) ) {
            	        alt99=1;
            	    }
            	    switch (alt99) {
            	        case 1 :
            	            // InternalAsyncApi.g:4663:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_44); 

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
            	    break loop100;
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
    // InternalAsyncApi.g:4689:1: entryRuleNamedMessageTrait returns [EObject current=null] : iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF ;
    public final EObject entryRuleNamedMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessageTrait = null;


        try {
            // InternalAsyncApi.g:4689:58: (iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF )
            // InternalAsyncApi.g:4690:2: iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF
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
    // InternalAsyncApi.g:4696:1: ruleNamedMessageTrait returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) ) ;
    public final EObject ruleNamedMessageTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_messageTrait_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4702:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) ) )
            // InternalAsyncApi.g:4703:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) )
            {
            // InternalAsyncApi.g:4703:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) )
            // InternalAsyncApi.g:4704:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) )
            {
            // InternalAsyncApi.g:4704:3: ()
            // InternalAsyncApi.g:4705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageTraitAccess().getNamedMessageTraitAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4711:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4712:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4712:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4713:5: lv_name_1_0= ruleAnyString
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
            		
            // InternalAsyncApi.g:4734:3: ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) )
            // InternalAsyncApi.g:4735:4: (lv_messageTrait_3_0= ruleAbstractMessageTrait )
            {
            // InternalAsyncApi.g:4735:4: (lv_messageTrait_3_0= ruleAbstractMessageTrait )
            // InternalAsyncApi.g:4736:5: lv_messageTrait_3_0= ruleAbstractMessageTrait
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
    // InternalAsyncApi.g:4757:1: entryRuleComponents returns [EObject current=null] : iv_ruleComponents= ruleComponents EOF ;
    public final EObject entryRuleComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponents = null;


        try {
            // InternalAsyncApi.g:4757:51: (iv_ruleComponents= ruleComponents EOF )
            // InternalAsyncApi.g:4758:2: iv_ruleComponents= ruleComponents EOF
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
    // InternalAsyncApi.g:4764:1: ruleComponents returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' ) ;
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
            // InternalAsyncApi.g:4770:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' ) )
            // InternalAsyncApi.g:4771:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' )
            {
            // InternalAsyncApi.g:4771:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}' )
            // InternalAsyncApi.g:4772:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) ) otherlv_43= '}'
            {
            // InternalAsyncApi.g:4772:3: ()
            // InternalAsyncApi.g:4773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentsAccess().getComponentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4783:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4784:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4784:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4785:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4788:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4789:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4789:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) )*
            loop111:
            do {
                int alt111=6;
                int LA111_0 = input.LA(1);

                if ( LA111_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
                    alt111=1;
                }
                else if ( LA111_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
                    alt111=2;
                }
                else if ( LA111_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2) ) {
                    alt111=3;
                }
                else if ( LA111_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3) ) {
                    alt111=4;
                }
                else if ( LA111_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4) ) {
                    alt111=5;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalAsyncApi.g:4790:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4790:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4791:5: {...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4791:107: ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4792:6: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4795:9: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4795:10: {...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4795:19: (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4795:20: otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,56,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentsAccess().getSchemasKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentsAccess().getColonKeyword_2_0_1());
            	    								
            	    otherlv_5=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_5, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_0_2());
            	    								
            	    // InternalAsyncApi.g:4807:9: ( (lv_schemas_6_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:4808:10: (lv_schemas_6_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:4808:10: (lv_schemas_6_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:4809:11: lv_schemas_6_0= ruleNamedSchema
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

            	    // InternalAsyncApi.g:4826:9: (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )*
            	    loop101:
            	    do {
            	        int alt101=2;
            	        int LA101_0 = input.LA(1);

            	        if ( (LA101_0==11) ) {
            	            alt101=1;
            	        }


            	        switch (alt101) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4827:10: otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getComponentsAccess().getCommaKeyword_2_0_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4831:10: ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:4832:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:4832:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:4833:12: lv_schemas_8_0= ruleNamedSchema
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
            	    	    break loop101;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_0_5());
            	    								
            	    // InternalAsyncApi.g:4855:9: (otherlv_10= ',' )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==11) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // InternalAsyncApi.g:4856:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_46); 

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
            	    // InternalAsyncApi.g:4867:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4867:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4868:5: {...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4868:107: ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:4869:6: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4872:9: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:4872:10: {...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4872:19: (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:4872:20: otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,57,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentsAccess().getMessagesKeyword_2_1_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentsAccess().getColonKeyword_2_1_1());
            	    								
            	    otherlv_13=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_1_2());
            	    								
            	    // InternalAsyncApi.g:4884:9: ( (lv_messages_14_0= ruleNamedMessage ) )
            	    // InternalAsyncApi.g:4885:10: (lv_messages_14_0= ruleNamedMessage )
            	    {
            	    // InternalAsyncApi.g:4885:10: (lv_messages_14_0= ruleNamedMessage )
            	    // InternalAsyncApi.g:4886:11: lv_messages_14_0= ruleNamedMessage
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

            	    // InternalAsyncApi.g:4903:9: (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )*
            	    loop103:
            	    do {
            	        int alt103=2;
            	        int LA103_0 = input.LA(1);

            	        if ( (LA103_0==11) ) {
            	            alt103=1;
            	        }


            	        switch (alt103) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4904:10: otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getComponentsAccess().getCommaKeyword_2_1_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4908:10: ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    // InternalAsyncApi.g:4909:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    {
            	    	    // InternalAsyncApi.g:4909:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    // InternalAsyncApi.g:4910:12: lv_messages_16_0= ruleNamedMessage
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
            	    	    break loop103;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_17, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_1_5());
            	    								
            	    // InternalAsyncApi.g:4932:9: (otherlv_18= ',' )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==11) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // InternalAsyncApi.g:4933:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_46); 

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
            	    // InternalAsyncApi.g:4944:4: ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4944:4: ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4945:5: {...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4945:107: ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:4946:6: ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4949:9: ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:4949:10: {...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4949:19: (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:4949:20: otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getComponentsAccess().getParametersKeyword_2_2_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getComponentsAccess().getColonKeyword_2_2_1());
            	    								
            	    otherlv_21=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_21, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_2_2());
            	    								
            	    // InternalAsyncApi.g:4961:9: ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    // InternalAsyncApi.g:4962:10: (lv_parameters_22_0= ruleNamedParameter )
            	    {
            	    // InternalAsyncApi.g:4962:10: (lv_parameters_22_0= ruleNamedParameter )
            	    // InternalAsyncApi.g:4963:11: lv_parameters_22_0= ruleNamedParameter
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

            	    // InternalAsyncApi.g:4980:9: (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )*
            	    loop105:
            	    do {
            	        int alt105=2;
            	        int LA105_0 = input.LA(1);

            	        if ( (LA105_0==11) ) {
            	            alt105=1;
            	        }


            	        switch (alt105) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4981:10: otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getComponentsAccess().getCommaKeyword_2_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4985:10: ( (lv_parameters_24_0= ruleNamedParameter ) )
            	    	    // InternalAsyncApi.g:4986:11: (lv_parameters_24_0= ruleNamedParameter )
            	    	    {
            	    	    // InternalAsyncApi.g:4986:11: (lv_parameters_24_0= ruleNamedParameter )
            	    	    // InternalAsyncApi.g:4987:12: lv_parameters_24_0= ruleNamedParameter
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
            	    	    break loop105;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_25, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_2_5());
            	    								
            	    // InternalAsyncApi.g:5009:9: (otherlv_26= ',' )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==11) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // InternalAsyncApi.g:5010:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_46); 

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
            	    // InternalAsyncApi.g:5021:4: ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:5021:4: ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:5022:5: {...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:5022:107: ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:5023:6: ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:5026:9: ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:5026:10: {...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:5026:19: (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:5026:20: otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,58,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getComponentsAccess().getOperationTraitsKeyword_2_3_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_28, grammarAccess.getComponentsAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_29=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_29, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:5038:9: ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) )
            	    // InternalAsyncApi.g:5039:10: (lv_operationTraits_30_0= ruleNamedOperationTrait )
            	    {
            	    // InternalAsyncApi.g:5039:10: (lv_operationTraits_30_0= ruleNamedOperationTrait )
            	    // InternalAsyncApi.g:5040:11: lv_operationTraits_30_0= ruleNamedOperationTrait
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

            	    // InternalAsyncApi.g:5057:9: (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )*
            	    loop107:
            	    do {
            	        int alt107=2;
            	        int LA107_0 = input.LA(1);

            	        if ( (LA107_0==11) ) {
            	            alt107=1;
            	        }


            	        switch (alt107) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:5058:10: otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getComponentsAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:5062:10: ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) )
            	    	    // InternalAsyncApi.g:5063:11: (lv_operationTraits_32_0= ruleNamedOperationTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:5063:11: (lv_operationTraits_32_0= ruleNamedOperationTrait )
            	    	    // InternalAsyncApi.g:5064:12: lv_operationTraits_32_0= ruleNamedOperationTrait
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
            	    	    break loop107;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_33, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:5086:9: (otherlv_34= ',' )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==11) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // InternalAsyncApi.g:5087:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_46); 

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
            	    // InternalAsyncApi.g:5098:4: ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:5098:4: ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:5099:5: {...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:5099:107: ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) )
            	    // InternalAsyncApi.g:5100:6: ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:5103:9: ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) )
            	    // InternalAsyncApi.g:5103:10: {...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:5103:19: (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? )
            	    // InternalAsyncApi.g:5103:20: otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,59,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getComponentsAccess().getMessageTraitsKeyword_2_4_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_36, grammarAccess.getComponentsAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_37=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_37, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:5115:9: ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) )
            	    // InternalAsyncApi.g:5116:10: (lv_messageTraits_38_0= ruleNamedMessageTrait )
            	    {
            	    // InternalAsyncApi.g:5116:10: (lv_messageTraits_38_0= ruleNamedMessageTrait )
            	    // InternalAsyncApi.g:5117:11: lv_messageTraits_38_0= ruleNamedMessageTrait
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

            	    // InternalAsyncApi.g:5134:9: (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )*
            	    loop109:
            	    do {
            	        int alt109=2;
            	        int LA109_0 = input.LA(1);

            	        if ( (LA109_0==11) ) {
            	            alt109=1;
            	        }


            	        switch (alt109) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:5135:10: otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_39, grammarAccess.getComponentsAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:5139:10: ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) )
            	    	    // InternalAsyncApi.g:5140:11: (lv_messageTraits_40_0= ruleNamedMessageTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:5140:11: (lv_messageTraits_40_0= ruleNamedMessageTrait )
            	    	    // InternalAsyncApi.g:5141:12: lv_messageTraits_40_0= ruleNamedMessageTrait
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
            	    	    break loop109;
            	        }
            	    } while (true);

            	    otherlv_41=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_41, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:5163:9: (otherlv_42= ',' )?
            	    int alt110=2;
            	    int LA110_0 = input.LA(1);

            	    if ( (LA110_0==11) ) {
            	        alt110=1;
            	    }
            	    switch (alt110) {
            	        case 1 :
            	            // InternalAsyncApi.g:5164:10: otherlv_42= ','
            	            {
            	            otherlv_42=(Token)match(input,11,FOLLOW_46); 

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
            	    break loop111;
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
    // InternalAsyncApi.g:5190:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAsyncApi.g:5190:50: (iv_ruleReference= ruleReference EOF )
            // InternalAsyncApi.g:5191:2: iv_ruleReference= ruleReference EOF
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
    // InternalAsyncApi.g:5197:1: ruleReference returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_uri_4_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5203:2: ( ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) )
            // InternalAsyncApi.g:5204:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            {
            // InternalAsyncApi.g:5204:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            // InternalAsyncApi.g:5205:3: () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}'
            {
            // InternalAsyncApi.g:5205:3: ()
            // InternalAsyncApi.g:5206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getRefKeyword_2());
            		
            otherlv_3=(Token)match(input,10,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_3());
            		
            // InternalAsyncApi.g:5224:3: ( (lv_uri_4_0= ruleAnyString ) )
            // InternalAsyncApi.g:5225:4: (lv_uri_4_0= ruleAnyString )
            {
            // InternalAsyncApi.g:5225:4: (lv_uri_4_0= ruleAnyString )
            // InternalAsyncApi.g:5226:5: lv_uri_4_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getUriAnyStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_49);
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
    // InternalAsyncApi.g:5251:1: entryRulePrimitiveValue returns [String current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final String entryRulePrimitiveValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveValue = null;


        try {
            // InternalAsyncApi.g:5251:54: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // InternalAsyncApi.g:5252:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
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
    // InternalAsyncApi.g:5258:1: rulePrimitiveValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_AnyString_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5264:2: ( (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT ) )
            // InternalAsyncApi.g:5265:2: (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT )
            {
            // InternalAsyncApi.g:5265:2: (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT )
            int alt112=4;
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
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
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
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
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
            case 77:
            case 78:
            case 79:
                {
                alt112=1;
                }
                break;
            case 61:
                {
                alt112=2;
                }
                break;
            case 62:
                {
                alt112=3;
                }
                break;
            case RULE_INT:
                {
                alt112=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalAsyncApi.g:5266:3: this_AnyString_0= ruleAnyString
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
                    // InternalAsyncApi.g:5277:3: kw= 'true'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getTrueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5283:3: kw= 'false'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getFalseKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5289:3: this_INT_3= RULE_INT
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
    // InternalAsyncApi.g:5300:1: entryRuleAnyString returns [String current=null] : iv_ruleAnyString= ruleAnyString EOF ;
    public final String entryRuleAnyString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyString = null;


        try {
            // InternalAsyncApi.g:5300:49: (iv_ruleAnyString= ruleAnyString EOF )
            // InternalAsyncApi.g:5301:2: iv_ruleAnyString= ruleAnyString EOF
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
    // InternalAsyncApi.g:5307:1: ruleAnyString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword ) ;
    public final AntlrDatatypeRuleToken ruleAnyString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Keyword_2 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5313:2: ( (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword ) )
            // InternalAsyncApi.g:5314:2: (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword )
            {
            // InternalAsyncApi.g:5314:2: (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword )
            int alt113=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt113=1;
                }
                break;
            case 60:
                {
                alt113=2;
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
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
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
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
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
            case 77:
            case 78:
            case 79:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalAsyncApi.g:5315:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5323:3: kw= '\"$ref\"'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAnyStringAccess().getRefKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5329:3: this_Keyword_2= ruleKeyword
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
    // InternalAsyncApi.g:5343:1: entryRuleKeyword returns [String current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final String entryRuleKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyword = null;


        try {
            // InternalAsyncApi.g:5343:47: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalAsyncApi.g:5344:2: iv_ruleKeyword= ruleKeyword EOF
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
    // InternalAsyncApi.g:5350:1: ruleKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' ) ;
    public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:5356:2: ( (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' ) )
            // InternalAsyncApi.g:5357:2: (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' )
            {
            // InternalAsyncApi.g:5357:2: (kw= '\"2.0.0\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"headers\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"minimum\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"servers\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"url\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-title\"' )
            int alt114=60;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt114=1;
                }
                break;
            case 64:
                {
                alt114=2;
                }
                break;
            case 65:
                {
                alt114=3;
                }
                break;
            case 66:
                {
                alt114=4;
                }
                break;
            case 67:
                {
                alt114=5;
                }
                break;
            case 9:
                {
                alt114=6;
                }
                break;
            case 68:
                {
                alt114=7;
                }
                break;
            case 15:
                {
                alt114=8;
                }
                break;
            case 16:
                {
                alt114=9;
                }
                break;
            case 21:
                {
                alt114=10;
                }
                break;
            case 29:
                {
                alt114=11;
                }
                break;
            case 41:
                {
                alt114=12;
                }
                break;
            case 19:
                {
                alt114=13;
                }
                break;
            case 26:
                {
                alt114=14;
                }
                break;
            case 30:
                {
                alt114=15;
                }
                break;
            case 46:
                {
                alt114=16;
                }
                break;
            case 42:
                {
                alt114=17;
                }
                break;
            case 12:
                {
                alt114=18;
                }
                break;
            case 69:
                {
                alt114=19;
                }
                break;
            case 52:
                {
                alt114=20;
                }
                break;
            case 22:
                {
                alt114=21;
                }
                break;
            case 55:
                {
                alt114=22;
                }
                break;
            case 48:
                {
                alt114=23;
                }
                break;
            case 39:
                {
                alt114=24;
                }
                break;
            case 59:
                {
                alt114=25;
                }
                break;
            case 57:
                {
                alt114=26;
                }
                break;
            case 47:
                {
                alt114=27;
                }
                break;
            case 70:
                {
                alt114=28;
                }
                break;
            case 71:
                {
                alt114=29;
                }
                break;
            case 24:
                {
                alt114=30;
                }
                break;
            case 72:
                {
                alt114=31;
                }
                break;
            case 73:
                {
                alt114=32;
                }
                break;
            case 74:
                {
                alt114=33;
                }
                break;
            case 37:
                {
                alt114=34;
                }
                break;
            case 58:
                {
                alt114=35;
                }
                break;
            case 35:
                {
                alt114=36;
                }
                break;
            case 44:
                {
                alt114=37;
                }
                break;
            case 51:
                {
                alt114=38;
                }
                break;
            case 27:
                {
                alt114=39;
                }
                break;
            case 33:
                {
                alt114=40;
                }
                break;
            case 53:
                {
                alt114=41;
                }
                break;
            case 54:
                {
                alt114=42;
                }
                break;
            case 56:
                {
                alt114=43;
                }
                break;
            case 13:
                {
                alt114=44;
                }
                break;
            case 75:
                {
                alt114=45;
                }
                break;
            case 76:
                {
                alt114=46;
                }
                break;
            case 77:
                {
                alt114=47;
                }
                break;
            case 34:
                {
                alt114=48;
                }
                break;
            case 38:
                {
                alt114=49;
                }
                break;
            case 43:
                {
                alt114=50;
                }
                break;
            case 20:
                {
                alt114=51;
                }
                break;
            case 17:
                {
                alt114=52;
                }
                break;
            case 40:
                {
                alt114=53;
                }
                break;
            case 45:
                {
                alt114=54;
                }
                break;
            case 25:
                {
                alt114=55;
                }
                break;
            case 28:
                {
                alt114=56;
                }
                break;
            case 18:
                {
                alt114=57;
                }
                break;
            case 78:
                {
                alt114=58;
                }
                break;
            case 79:
                {
                alt114=59;
                }
                break;
            case 36:
                {
                alt114=60;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalAsyncApi.g:5358:3: kw= '\"2.0.0\"'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkDigitTwoFullStopDigitZeroFullStopDigitZeroQuotationMarkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5364:3: kw= '\"amqp\"'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAmqpKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5370:3: kw= '\"amqps\"'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAmqpsKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5376:3: kw= '\"any\"'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAnyKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:5382:3: kw= '\"array\"'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getArrayKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:5388:3: kw= '\"asyncapi\"'
                    {
                    kw=(Token)match(input,9,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAsyncapiKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:5394:3: kw= '\"boolean\"'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getBooleanKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:5400:3: kw= '\"channels\"'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getChannelsKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAsyncApi.g:5406:3: kw= '\"components\"'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getComponentsKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAsyncApi.g:5412:3: kw= '\"contact\"'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getContactKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAsyncApi.g:5418:3: kw= '\"default\"'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDefaultKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAsyncApi.g:5424:3: kw= '\"deprecated\"'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDeprecatedKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAsyncApi.g:5430:3: kw= '\"description\"'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDescriptionKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAsyncApi.g:5436:3: kw= '\"email\"'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getEmailKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalAsyncApi.g:5442:3: kw= '\"enum\"'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getEnumKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalAsyncApi.g:5448:3: kw= '\"format\"'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getFormatKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalAsyncApi.g:5454:3: kw= '\"headers\"'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getHeadersKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalAsyncApi.g:5460:3: kw= '\"info\"'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getInfoKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalAsyncApi.g:5466:3: kw= '\"integer\"'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getIntegerKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalAsyncApi.g:5472:3: kw= '\"items\"'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getItemsKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalAsyncApi.g:5478:3: kw= '\"license\"'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getLicenseKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalAsyncApi.g:5484:3: kw= '\"location\"'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getLocationKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalAsyncApi.g:5490:3: kw= '\"maximum\"'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMaximumKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalAsyncApi.g:5496:3: kw= '\"message\"'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessageKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalAsyncApi.g:5502:3: kw= '\"messageTraits\"'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessageTraitsKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalAsyncApi.g:5508:3: kw= '\"messages\"'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessagesKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalAsyncApi.g:5514:3: kw= '\"minimum\"'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMinimumKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalAsyncApi.g:5520:3: kw= '\"mqtt\"'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMqttKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalAsyncApi.g:5526:3: kw= '\"mqtts\"'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMqttsKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalAsyncApi.g:5532:3: kw= '\"name\"'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNameKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalAsyncApi.g:5538:3: kw= '\"null\"'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNullKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalAsyncApi.g:5544:3: kw= '\"number\"'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNumberKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalAsyncApi.g:5550:3: kw= '\"object\"'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getObjectKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalAsyncApi.g:5556:3: kw= '\"operationId\"'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getOperationIdKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalAsyncApi.g:5562:3: kw= '\"operationTraits\"'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getOperationTraitsKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalAsyncApi.g:5568:3: kw= '\"parameters\"'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getParametersKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalAsyncApi.g:5574:3: kw= '\"payload\"'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPayloadKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalAsyncApi.g:5580:3: kw= '\"properties\"'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPropertiesKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalAsyncApi.g:5586:3: kw= '\"protocol\"'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getProtocolKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalAsyncApi.g:5592:3: kw= '\"publish\"'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPublishKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalAsyncApi.g:5598:3: kw= '\"required\"'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getRequiredKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalAsyncApi.g:5604:3: kw= '\"schema\"'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSchemaKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalAsyncApi.g:5610:3: kw= '\"schemas\"'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSchemasKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalAsyncApi.g:5616:3: kw= '\"servers\"'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getServersKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalAsyncApi.g:5622:3: kw= '\"stomp\"'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStompKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalAsyncApi.g:5628:3: kw= '\"stomps\"'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStompsKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalAsyncApi.g:5634:3: kw= '\"string\"'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStringKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalAsyncApi.g:5640:3: kw= '\"subscribe\"'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSubscribeKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalAsyncApi.g:5646:3: kw= '\"summary\"'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSummaryKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalAsyncApi.g:5652:3: kw= '\"tags\"'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTagsKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalAsyncApi.g:5658:3: kw= '\"termsOfService\"'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTermsOfServiceKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalAsyncApi.g:5664:3: kw= '\"title\"'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTitleKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalAsyncApi.g:5670:3: kw= '\"traits\"'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTraitsKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalAsyncApi.g:5676:3: kw= '\"type\"'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTypeKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalAsyncApi.g:5682:3: kw= '\"url\"'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getUrlKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalAsyncApi.g:5688:3: kw= '\"variables\"'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getVariablesKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalAsyncApi.g:5694:3: kw= '\"version\"'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getVersionKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalAsyncApi.g:5700:3: kw= '\"ws\"'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWsKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalAsyncApi.g:5706:3: kw= '\"wss\"'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWssKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalAsyncApi.g:5712:3: kw= '\"x-title\"'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalAsyncApi.g:5721:1: ruleJsonType returns [Enumerator current=null] : ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) ) ;
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
            // InternalAsyncApi.g:5727:2: ( ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) ) )
            // InternalAsyncApi.g:5728:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) )
            {
            // InternalAsyncApi.g:5728:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) )
            int alt115=8;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt115=1;
                }
                break;
            case 73:
                {
                alt115=2;
                }
                break;
            case 69:
                {
                alt115=3;
                }
                break;
            case 68:
                {
                alt115=4;
                }
                break;
            case 74:
                {
                alt115=5;
                }
                break;
            case 67:
                {
                alt115=6;
                }
                break;
            case 66:
                {
                alt115=7;
                }
                break;
            case 72:
                {
                alt115=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalAsyncApi.g:5729:3: (enumLiteral_0= '\"string\"' )
                    {
                    // InternalAsyncApi.g:5729:3: (enumLiteral_0= '\"string\"' )
                    // InternalAsyncApi.g:5730:4: enumLiteral_0= '\"string\"'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJsonTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5737:3: (enumLiteral_1= '\"number\"' )
                    {
                    // InternalAsyncApi.g:5737:3: (enumLiteral_1= '\"number\"' )
                    // InternalAsyncApi.g:5738:4: enumLiteral_1= '\"number\"'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJsonTypeAccess().getNumberEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5745:3: (enumLiteral_2= '\"integer\"' )
                    {
                    // InternalAsyncApi.g:5745:3: (enumLiteral_2= '\"integer\"' )
                    // InternalAsyncApi.g:5746:4: enumLiteral_2= '\"integer\"'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJsonTypeAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5753:3: (enumLiteral_3= '\"boolean\"' )
                    {
                    // InternalAsyncApi.g:5753:3: (enumLiteral_3= '\"boolean\"' )
                    // InternalAsyncApi.g:5754:4: enumLiteral_3= '\"boolean\"'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJsonTypeAccess().getBooleanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:5761:3: (enumLiteral_4= '\"object\"' )
                    {
                    // InternalAsyncApi.g:5761:3: (enumLiteral_4= '\"object\"' )
                    // InternalAsyncApi.g:5762:4: enumLiteral_4= '\"object\"'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getObjectEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getJsonTypeAccess().getObjectEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:5769:3: (enumLiteral_5= '\"array\"' )
                    {
                    // InternalAsyncApi.g:5769:3: (enumLiteral_5= '\"array\"' )
                    // InternalAsyncApi.g:5770:4: enumLiteral_5= '\"array\"'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getArrayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getJsonTypeAccess().getArrayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:5777:3: (enumLiteral_6= '\"any\"' )
                    {
                    // InternalAsyncApi.g:5777:3: (enumLiteral_6= '\"any\"' )
                    // InternalAsyncApi.g:5778:4: enumLiteral_6= '\"any\"'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getAnyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getJsonTypeAccess().getAnyEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:5785:3: (enumLiteral_7= '\"null\"' )
                    {
                    // InternalAsyncApi.g:5785:3: (enumLiteral_7= '\"null\"' )
                    // InternalAsyncApi.g:5786:4: enumLiteral_7= '\"null\"'
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_2); 

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
    // InternalAsyncApi.g:5796:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:5802:2: ( ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) )
            // InternalAsyncApi.g:5803:2: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            {
            // InternalAsyncApi.g:5803:2: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==62) ) {
                alt116=1;
            }
            else if ( (LA116_0==61) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalAsyncApi.g:5804:3: (enumLiteral_0= 'false' )
                    {
                    // InternalAsyncApi.g:5804:3: (enumLiteral_0= 'false' )
                    // InternalAsyncApi.g:5805:4: enumLiteral_0= 'false'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5812:3: (enumLiteral_1= 'true' )
                    {
                    // InternalAsyncApi.g:5812:3: (enumLiteral_1= 'true' )
                    // InternalAsyncApi.g:5813:4: enumLiteral_1= 'true'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

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
    // InternalAsyncApi.g:5823:1: ruleVersionNumber returns [Enumerator current=null] : (enumLiteral_0= '\"2.0.0\"' ) ;
    public final Enumerator ruleVersionNumber() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:5829:2: ( (enumLiteral_0= '\"2.0.0\"' ) )
            // InternalAsyncApi.g:5830:2: (enumLiteral_0= '\"2.0.0\"' )
            {
            // InternalAsyncApi.g:5830:2: (enumLiteral_0= '\"2.0.0\"' )
            // InternalAsyncApi.g:5831:3: enumLiteral_0= '\"2.0.0\"'
            {
            enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

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
    // InternalAsyncApi.g:5840:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) ;
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
            // InternalAsyncApi.g:5846:2: ( ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) )
            // InternalAsyncApi.g:5847:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            {
            // InternalAsyncApi.g:5847:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            int alt117=8;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt117=1;
                }
                break;
            case 65:
                {
                alt117=2;
                }
                break;
            case 70:
                {
                alt117=3;
                }
                break;
            case 71:
                {
                alt117=4;
                }
                break;
            case 78:
                {
                alt117=5;
                }
                break;
            case 79:
                {
                alt117=6;
                }
                break;
            case 75:
                {
                alt117=7;
                }
                break;
            case 76:
                {
                alt117=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalAsyncApi.g:5848:3: (enumLiteral_0= '\"amqp\"' )
                    {
                    // InternalAsyncApi.g:5848:3: (enumLiteral_0= '\"amqp\"' )
                    // InternalAsyncApi.g:5849:4: enumLiteral_0= '\"amqp\"'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getAmqpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getAmqpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5856:3: (enumLiteral_1= '\"amqps\"' )
                    {
                    // InternalAsyncApi.g:5856:3: (enumLiteral_1= '\"amqps\"' )
                    // InternalAsyncApi.g:5857:4: enumLiteral_1= '\"amqps\"'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getAmqpsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getAmqpsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:5864:3: (enumLiteral_2= '\"mqtt\"' )
                    {
                    // InternalAsyncApi.g:5864:3: (enumLiteral_2= '\"mqtt\"' )
                    // InternalAsyncApi.g:5865:4: enumLiteral_2= '\"mqtt\"'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getMqttEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProtocolAccess().getMqttEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:5872:3: (enumLiteral_3= '\"mqtts\"' )
                    {
                    // InternalAsyncApi.g:5872:3: (enumLiteral_3= '\"mqtts\"' )
                    // InternalAsyncApi.g:5873:4: enumLiteral_3= '\"mqtts\"'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getMqttsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getProtocolAccess().getMqttsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:5880:3: (enumLiteral_4= '\"ws\"' )
                    {
                    // InternalAsyncApi.g:5880:3: (enumLiteral_4= '\"ws\"' )
                    // InternalAsyncApi.g:5881:4: enumLiteral_4= '\"ws\"'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getWsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getProtocolAccess().getWsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:5888:3: (enumLiteral_5= '\"wss\"' )
                    {
                    // InternalAsyncApi.g:5888:3: (enumLiteral_5= '\"wss\"' )
                    // InternalAsyncApi.g:5889:4: enumLiteral_5= '\"wss\"'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getWssEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getProtocolAccess().getWssEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:5896:3: (enumLiteral_6= '\"stomp\"' )
                    {
                    // InternalAsyncApi.g:5896:3: (enumLiteral_6= '\"stomp\"' )
                    // InternalAsyncApi.g:5897:4: enumLiteral_6= '\"stomp\"'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getStompEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getProtocolAccess().getStompEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:5904:3: (enumLiteral_7= '\"stomps\"' )
                    {
                    // InternalAsyncApi.g:5904:3: (enumLiteral_7= '\"stomps\"' )
                    // InternalAsyncApi.g:5905:4: enumLiteral_7= '\"stomps\"'
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_2); 

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


    protected DFA61 dfa61 = new DFA61(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\16\12\uffff";
    static final String dfa_3s = "\1\54\12\uffff";
    static final String dfa_4s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\3\1\uffff\1\5\4\uffff\1\2\15\uffff\1\4\1\uffff\1\12\1\6\1\7\1\10\1\11",
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

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2283:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==14) ) {s = 1;}

                        else if ( LA61_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA61_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA61_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA61_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA61_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA61_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA61_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA61_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA61_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\16\16\uffff";
    static final String dfa_9s = "\1\65\16\uffff";
    static final String dfa_10s = "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_11s = "\1\0\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\uffff\1\2\1\uffff\1\4\11\uffff\1\12\1\14\16\uffff\1\3\1\5\1\6\1\7\1\10\1\11\1\13\1\15\1\16",
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

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 3033:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_0 = input.LA(1);

                         
                        int index82_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_0==14) ) {s = 1;}

                        else if ( LA82_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA82_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA82_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA82_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA82_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA82_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA82_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA82_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA82_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA82_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA82_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA82_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA82_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                         
                        input.seek(index82_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001B200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001FA00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001F200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x9FF9FFFE7F7FB220L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000FE4800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000FE4000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007004800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003004800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001A080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001A084800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001A084000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x000000000000D8C3L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060084000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060084800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001E00084000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001E00084800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001E000084000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001E000084800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001F40010A4000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00001F40010A4800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001084000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001084800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x003FE000600A4000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x003FE000600A4800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000000000000273CL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFFF9FFFE7F7FB230L,0x000000000000FFFFL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00C0000000084000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00C0000000084800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000006000084000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000006000084800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000E4000084000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000E4000084800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0F00000800004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0F00000800004800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000004000L});

}
