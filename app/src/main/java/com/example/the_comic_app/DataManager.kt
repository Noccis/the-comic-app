package com.example.the_comic_app

object DataManager {
    val comics = mutableListOf<ComicStrip>()

    init {
        createData()
    }
    fun createData() {
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/outlet_denier.png", 2589,  "There are regularly placed bumps on the underside just the right size to press the rocker switch on the power strip."))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/i_shouldnt_complain.png", 2590, "Bald-faced hornets are only a 2 on the Schmidt pain index, so I shouldn't complain. The tennis ball ejected from the dryer exhaust vent could have ricocheted off the nest of a much higher-scoring insect before knocking me off the ladder. Really, I'm lucky."))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/qua.png", 2591, "Qua qua qua is the sine qua non of sine qua non qua sine qua non"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/false_dichotomy.png", 2592, "There are two types of dichotomy: False dichotomies, true dichotomies, and surprise trichotomies."))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/deviled_eggs.png", 2593, "The foil on the toothpick represents the blue flash."))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/consensus_time.png", 2594, "Now, you may argue that the varying hour lengths and feedback effects would cause chaos. To which I say, yeah, and I'm also curious to see how the weekday cycle interacts with it! So, you in?"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/advanced_techniques.png", 2595,  "A blow from Emmy's Cutlass of Variations will transport the dragon to a corresponding symmetric position in the Noetherworld."))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/galaxies.png", 2596,  "I know it seems overwhelming, but don't worry; I'm sure most of them have only a few stars, and probably no planets."))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/salary_negotiation.png", 2597,"We can do 0.33 or 0.34, but our payroll software doesn't allow us to"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/graphic_designers.png", 2598, "They might make it past that first line of defense. For the second, you'll need some picture frames, a level, and a protractor that can do increments of less than a degree."))
    }
}