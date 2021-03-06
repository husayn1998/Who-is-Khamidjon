package com.hamidjonhamidov.whoiskhamidjon.ui

data class DataState<T>(
    var error: Event<StateError>? =  null,
    var loading: Loading = Loading(false),
    var data: Data<T>? = null
)

{
    companion object{
        fun <T> error(response: MyResponse): DataState<T> =
            DataState(
                error = Event(StateError(response)),
                loading = Loading(false),
                data = null
            )

        fun <T> loading(isLoading: Boolean = false, cachedData: T? = null):
                DataState<T> =
            DataState(
                error = null,
                loading = Loading(isLoading),
                data = Data(
                    dataReceived = Event.dataEvent(cachedData),
                    responseReceived = null
                )
            )

        fun <T> data(data: T?=null, response: MyResponse?=null)
            :DataState<T> =
                DataState(
                    error = null,
                    loading = Loading(false),
                    data = Data(
                        dataReceived = Event.dataEvent(data),
                        responseReceived = Event.responseEvent(response)
                    )
                )
    }
}


















