import com.fasterxml.jackson.annotation.JsonProperty

internal data class DataClass(

        @param:JsonProperty("name")
        @field:JsonProperty("name")
        val name: String,

        // TODO manually split annotation in param and field
        @param:JsonProperty("someId")
        @field:JsonProperty("someId")
        val someId: Long,

        // TODO: use live template cmd + alt + t, a
        @param:JsonProperty("thisIsANumber")
        @field:JsonProperty("thisIsANumber")
        val favouriteNumber: Long,

        @param:JsonProperty("data")
        @field:JsonProperty("data")
        val data: String,

        @param:JsonProperty("otherData")
        @field:JsonProperty("otherData")
        val moreData: String

)

// example data class in kotlin with jackson annotations
// TODO: show live template to duplicate annotation for field and param
// cmd + alt + t, a


// There is probably a better way to do it but this was the fastest way for my usecase
// Spend 1 fun minute making a live template
// ==> Save many boring minutes copying and correcting annotations
