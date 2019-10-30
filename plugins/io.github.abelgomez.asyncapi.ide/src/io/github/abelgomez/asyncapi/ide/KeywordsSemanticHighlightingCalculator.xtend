package io.github.abelgomez.asyncapi.ide

import com.google.inject.Inject
import io.github.abelgomez.asyncapi.services.AsyncApiGrammarAccess
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator

class KeywordsSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
    @Inject package AsyncApiGrammarAccess grammar

    override protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
        CancelIndicator cancelIndicator) {
        	for (f : object.eClass.EAllAttributes.filter[a | object.eIsSet(a)]) {
				highlightFeature(acceptor, object, f, HighlightingStyles.STRING_ID)
        	}
        	return false;
    }
}
