package com.example.the_comic_app

object DataManager {
    val comics = mutableListOf<ComicStrip>()

    init {
        createData()
    }
    fun createData() {
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/party_quadrants.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/outlet_denier.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/i_shouldnt_complain.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/qua.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/false_dichotomy.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/deviled_eggs.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/consensus_time.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/advanced_techniques.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/galaxies.png"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/salary_negotiation.png"))
    }
}