package com.vanced.manager.core.mvi

import kotlinx.coroutines.flow.MutableSharedFlow

typealias Handler<State, Action, Modification, SideEffect> =
        suspend MutableSharedFlow<Modification>.(
            state: State,
            action: Action,
            sideEffect: MutableSharedFlow<SideEffect>
        ) -> Unit

typealias Reducer<State, Modification> =
        suspend (
            state: State,
            modification: Modification
        ) -> State