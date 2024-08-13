package com.koufatzis.fleetissues

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.asCoroutineDispatcher
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.Executors

@RestController
class FleetIssuesController{
    private val dispatcher: CoroutineDispatcher

    init {
            val processors = Runtime.getRuntime().availableProcessors()
    
            val usingProcessors = 64.coerceAtMost(processors)
    
            dispatcher = Executors.newFixedThreadPool(usingProcessors).asCoroutineDispatcher()
    
    }
    
}