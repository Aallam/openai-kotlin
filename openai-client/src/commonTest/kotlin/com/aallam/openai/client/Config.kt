package com.aallam.openai.client

import com.aallam.openai.api.logging.LogLevel
import com.aallam.openai.client.internal.createHttpClient
import com.aallam.openai.client.internal.env

internal val token: String
    get() = requireNotNull(env("OPENAI_API_KEY")) { "OPENAI_API_KEY environment variable must be set." }

internal val httpClient = createHttpClient(
    OpenAIConfig(
        token = token,
        logLevel = LogLevel.All
    )
)
