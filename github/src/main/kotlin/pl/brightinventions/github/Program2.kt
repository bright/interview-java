package pl.brightinventions.github

//task is to download data from
// https://api.github.com/search/repositories?q=kotlin
// and for every item (of first page) create
// a)   text file with following content: project name, description and stargazers_count
//      the text file name should allow for easy matching with product id
//
// b)   download the item.owner.avatar_url if available and save it in the file
//      with same name as the one from point a) but different extension (jpg,png,...)
//
// c)   download in parallel - to speed things up
//
// d)   write a message to console at the end and/or every 10 seconds about how many items is left to be downloaded
//
// consider using OkHttpClient and Jackson
// Google is your friend :)


object Program2 {
    @JvmStatic fun main(argv: Array<String>) {


        println("I'm done")
    }
}