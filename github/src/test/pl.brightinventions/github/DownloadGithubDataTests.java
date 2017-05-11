package pl.brightinventions.github;

import org.junit.Test;

public class DownloadGithubDataTests {

    //task is to download data from
    // https://api.github.com/search/repositories?q=kotlin
    // and for every item (of first page) create
    // a)   simple text file with project name, description and stargazers_count
    //      the text file name should allow for easy matching with product id
    //
    // b)   download the item.owner.avatar_url if available and save it in the file
    //      with same name as the one from point a) but different extension (jpg,png,...)
    @Test
    public void download_data() throws Exception {

    }
}