package com.example.the_comic_app

object DataManager {
    val comics = mutableListOf<ComicStrip>()

    init {
        createData()
    }
    fun createData() {
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/outlet_denier.png",
            2589,
            "There are regularly placed bumps on the underside just the right size to press the rocker switch on the power strip.",
        "This is the fifth installment in the series of Cursed Connectors and presents Cursed Connectors #78: The Outlet Denier.\n" +
                "\n" +
                "The outlet denier connector in this comic is the large connector to the right. It has a plug on the downward side that is supposed to go into a power strip or other type of outlet. It has two long bars extending up and down off the plug, as well as a D shape on one side with another, slightly less long bar on the other side of the D, that has the cord connected to it. The purpose of the outlet denier is to block access to as many other ports on a power strip as possible, hence the name. It is designed to work with many different types of power strips, such as the standard one displayed in the comic, as well as ones with the sockets rotated 90 degrees (the long bar extending to the cord) and other types of outlets like the triple outlet on the end of many extension cords and two dimensional power strips that extend a couple of outlets left and right as well as up and down (the D shape on the side). The extreme bars to each side may also prevent plugging the Denier into an outlet close to the floor, forcing the user to use a power strip or similar item for it.\n" +
                "\n" +
                "There is an example power strip displayed to the left of the outlet denier, used to help explain that the outlet denier is designed to block as many other sockets on a power strip as possible. The power strip is presumably of the type with a rocker switch that can turn the entire power bar off. This power bar has five outlets.\n" +
                "\n" +
                "Many appliances require transformers or other large components on their power cord. Sometimes these \"power bricks\" are built around the plug. The comic is making fun of these types of power bricks, as they often block access to other sockets on a power strip or wall outlet. This can be really annoying when you want to plug in many different appliances into a power strip.\n" +
                "\n" +
                "Other plugs are deliberately designed to block the other half of a duplex outlet, preventing users from plugging anything else in that could overload the circuit. The comic could be depicting an extreme case of a cumbersome connector shape designed to block an entire power strip, as the appliance connected to it uses so much power that a single extra item plugged into the power strip would cause problems.\n" +
                "\n" +
                "The title text says that the outlet denier has bumps on the underside of the long bar that would match up with the location of the rocker switch no matter which outlet of the strip it is plugged into. It's not clear whether this will turn the power switch off or force it always on. But either way, it gets in the way of the user being able to control the power themselves.\n" +
                "\n" +
                "If it forces it off, then the Outlet Denier cannot even be used. So to at least assume someone might actually use it, it must force it on. Since there are nothing else that can go into the power strip, it is not that important it it is possible to switch it off though."))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/i_shouldnt_complain.png",
            2590,
            "Bald-faced hornets are only a 2 on the Schmidt pain index, so I shouldn't complain. The tennis ball ejected from the dryer exhaust vent could have ricocheted off the nest of a much higher-scoring insect before knocking me off the ladder. Really, I'm lucky.",
        "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/qua.png",
            2591,
            "Qua qua qua is the sine qua non of sine qua non qua sine qua non",
            "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/false_dichotomy.png",
            2592,
            "There are two types of dichotomy: False dichotomies, true dichotomies, and surprise trichotomies.",
            "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/deviled_eggs.png",
            2593,
            "The foil on the toothpick represents the blue flash.",
            "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/consensus_time.png",
            2594,
            "Now, you may argue that the varying hour lengths and feedback effects would cause chaos. To which I say, yeah, and I'm also curious to see how the weekday cycle interacts with it! So, you in?",
            "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/advanced_techniques.png",
            2595,
            "A blow from Emmy's Cutlass of Variations will transport the dragon to a corresponding symmetric position in the Noetherworld.",
            "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/galaxies.png",
            2596,
            "I know it seems overwhelming, but don't worry; I'm sure most of them have only a few stars, and probably no planets.",
            "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/salary_negotiation.png",
            2597,
            "We can do 0.33 or 0.34, but our payroll software doesn't allow us to",
            "bla bla bla"))
        comics.add(ComicStrip("https://imgs.xkcd.com/comics/graphic_designers.png",
            2598,
            "They might make it past that first line of defense. For the second, you'll need some picture frames, a level, and a protractor that can do increments of less than a degree.",
            "bla bla bla"))
    }
}