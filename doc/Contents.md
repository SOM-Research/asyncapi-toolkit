## Project Contents

This project contains the following:

* `plugins/io.github.abelgomez.asyncapi`: Base plug-in with the [Xtext Grammar](plugins/io.github.abelgomez.asyncapi/src/io/github/abelgomez/asyncapi/AsyncApi.xtext), generator scripts, and AsyncAPI parser.

* `/plugins/io.github.abelgomez.asyncapi.ide`: Automatically generated plug-in providing the platform-independent IDE integration (e.g., services for content assist).

* `/plugins/io.github.abelgomez.asyncapi.ui`: Automatically generated plug-in providing the Eclipse UI integration (editor, wizards, etc.).

* `/plugins/io.github.abelgomez.asyncapi.i40.profile`: Plug-in containing a UML2 profile to annotate UML class diagrams as Industry 4.0 (I4.0) specifications.  

* `/plugins/io.github.abelgomez.asyncapi.i40`: Base plug-in containing utilities to manage I4.0-annotated UML models, such as a model-to-model transformation from UML to AsyncAPI.

* `/plugins/io.github.abelgomez.asyncapi.i40.ui`: UI plug-in containing interfaces and UI contribution that integrate the I4.0 functionality with the rest of the AsyncAPI Toolkit (such as new Wizards, context menus, and integrations with Eclipse Papyrus).

* `/features/io.github.abelgomez.asyncapi.feature`: Feature for the base AsyncAPI Toolkit plug-ins. 

* `/features/io.github.abelgomez.asyncapi.ui.feature`: Feature for the base AsyncAPI Toolkit UI plug-ins.

* `/features/io.github.abelgomez.asyncapi.i40.profile.feature`: Feature for the I4.0 profile (which can be used independently of the AsyncAPI Toolkit). 

* `/features/io.github.abelgomez.asyncapi.i40.feature`: Feature for the base I4.0 AsyncAPI Toolkit integration.

* `/features/io.github.abelgomez.asyncapi.i40.ui.feature`: Feature for the UI integrations of the I4.0 profile in AsyncAPI Toolkit.

* `/releng/io.github.abelgomez.asyncapi.platform`: Target platform definition.

* `/releng/io.github.abelgomez.asyncapi.update`: Update Site definition to remotely install AsyncAPI Toolkit on top of a standard Eclipse.

* `/releng/io.github.abelgomez.asyncapi.setup`: Setup files, to be used with the [Eclipse installer](https://www.eclipse.org/downloads/packages/installer). 

* `/releng/io.github.abelgomez.asyncapi.products`: Pre-built AsyncAPI Toolkit binaries definitions.
