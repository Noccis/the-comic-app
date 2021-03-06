package com.example.the_comic_app

object DataManager {
    // The magical list of comic strips!
    val comics = mutableListOf<ComicStrip>()

    // create some comics when we create our DataManager object
    init {
        createData()
    }

    // function adding 10 ComicStip objects.
    fun createData() {
        comics.add(ComicStrip(
            "Outlet Denier",
            "https://imgs.xkcd.com/comics/outlet_denier.png",
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

        comics.add(ComicStrip(
            "I Shouldn't Complain",
            "https://imgs.xkcd.com/comics/i_shouldnt_complain.png",
            2590,
            "Bald-faced hornets are only a 2 on the Schmidt pain index, so I shouldn't complain. The tennis ball ejected from the dryer exhaust vent could have ricocheted off the nest of a much higher-scoring insect before knocking me off the ladder. Really, I'm lucky.",
            "Megan has had a very unfortunate experience of falling into a garbage can and being repeatedly stung by wasps. Cueball expresses an appropriate amount of horror about it. However, Megan seeks to downplay this experience by saying \"I shouldn't complain\" and that she's \"lucky\" it wasn't worse. This has become a habit in Western culture, like comparing minor issues to \"kids starving in Africa\" or war-torn countries, notably Ukraine (this comic was published during the Russian invasion of Ukraine starting in February 2022 and was ongoing when this comic came out on March 7).\n" +
                "Humans have a tendency to re-calibrate their mental scales to place their actual experience in the center. Cueball, who has never experienced being trapped for hours with stinging insects, rates this in comparison to not being trapped at all. Megan, however, rates it in comparison to other uncomfortable places a person could be stuck.\n" +
                "\n" +
                "The title text explains how Megan came into such a mess. A tennis ball used in a clothes dryer got stuck in the exhaust vent, and was shot out of the house through the exhaust vents hole in the wall. Then it hit the wasp nest and ricocheted over on Megan knocking her off the ladder she was standing on. Since she was close to the nest, she may actually have been up on the ladder in order to see if she could remove the nest. The fall from the ladder made her end up in the trash can where she could not get out. The angry wasps began stinging her legs. This continued for two hours.\n" +
                "\n" +
                "In the title text, Megan continues to downplay her experience even though it was very painful. She says that the wasp nest was of the type bald-faced hornets.\n" +
                "\n" +
                "The Schmidt sting pain index is a scale developed by entomologist Justin O. Schmidt to rank the relative pain caused by different stinging insects. This scale ranges from 0 (for stings that are completely ineffective) to 4, which denotes torturous and nearly incapacitating pain (originally, Schmidt only classed one species as a 4, but two additional species have since been added at this level). Megan says her stings were a 2 on the scale, which denotes \"familiar\" pain, comparable to that of the common Western Honey Bee. Most people would find that experience incredibly painful, particularly since she endured multiple stings over a long period of time, but Megan points out that there exist insects with more painful stings.\n" +
                "\n" +
                "Megan concludes that she'd been lucky, based on the argument that she theoretically could have endured something worse than she did. The joke, of course, is that by almost any subjective standard, her experience was deeply unluckly.\n" +
                "\n" +
                "She also further downplays the situation by focusing attention on the sting pain index instead of the sting lethal capacity, described by the author of the pain index. The two are not necessarily equivalent. Let's assume that all insects in the colony affected stung Megan at least once over her two hour ordeal. A colony capable of sustaining an attack over two hours would probably be at least as large as the typical maximum size for a bald-faced hornet nest. Such an attack might (depending on number of attackers and the species of wasp) deliver enough venom to kill 84 kg (185 pounds) worth of mice (or human?). Given such an attack, Megan would probably not be standing around in routine conversation, casually discussing the incident. She would far more likely be in a hospital bed, and in a gruesome fight for her life"))

        comics.add(ComicStrip(
            "Qua",
            "https://imgs.xkcd.com/comics/qua.png",
            2591,
            "Qua qua qua is the sine qua non of sine qua non qua sine qua non",
            "Qua is a relatively rare, formal word, from Latin, roughly meaning \"in the capacity of\". For instance \"In essence, military regimes are autocracies in which the military qua organization performs many of the functions performed by the ruling party in single-party regimes\".\n" +
                    "Saying something is \"X qua X\" (e.g. \"entertainment qua entertainment\") means when X is being viewed in its most typical capacity (eg, entertainment as something that entertains, rather than as a business, a form of propaganda, or whatever).\n" +
                    "\n" +
                    "For example, \"A copy, qua copy, can never be the equal of the exemplar, and it may be much its inferior.\" [1]\n" +
                    "\n" +
                    "Cueball claims that people only use qua to \"sound pretentious\" without properly understanding its meaning. Thus, people do not use \"qua qua qua\", or \"qua for the sake of qua\". However, Megan one-ups this with a series of seven quas: she compliments Cueball's successful use of \"qua qua qua qua qua qua qua\", or \"the phrase 'qua qua qua' for its correct meaning\".\n" +
                    "\n" +
                    "The joke is that, for the reader, the conversation has likely dissolved into gibberish because of unfamiliar terminology and semantic satiation. This is similar to other complex sentences such as \"Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo\", \"That that is is that that is not is not is that it it is\", and \"James while John had had had had had had had had had had had a better effect on the teacher\". Following this trend, you can create a grammatically correct sentence that includes 'qua' a consecutive number of times equal to (2n-1), where n is a natural number.\n" +
                    "\n" +
                    "The title text goes further with this, using a Latin phrase sine qua non (meaning literally \"without which not\"), commonly rendered as \"that which is absolutely necessary\" or \"essential\". Thus, the title text says that \"the word 'qua' in its real meaning is essential to the phrase 'sine qua non' used correctly\".\n" +
                    "\n" +
                    "However, the **qua** in title text phrase is a demonstrative pronoun (\"which\"), unlike the other **qua** which is an adverb, so the similarity is only coincidental."))

        comics.add(ComicStrip(
            "False Dichotomy",
            "https://imgs.xkcd.com/comics/false_dichotomy.png",
            2592,
            "There are two types of dichotomy: False dichotomies, true dichotomies, and surprise trichotomies.",
            "A dichotomy is two alternatives which are normally mutually exclusive (such as the dichotomy between a flat Earth and non-flat Earth). A false dichotomy is a logical fallacy based on an incorrect perception of limited options (for example: if the page background isn't white, it is black).\n" +
                    "\n" +
                    "Cueball has apparently made one such error and is being called out by White Hat for it. Upon having this pointed out to him, Cueball says that we must embrace false dichotomies, because the only other option is cannibalism. This statement is another false dichotomy, as presenting false dichotomies is not the only alternative to cannibalism[citation needed]. The reverse (that cannibalism is incompatible with expressing false dichotomies) is also not potentially true, as eating people may eventually result in having nobody you need to present false dichotomies to.\n" +
                    "\n" +
                    "Cueball has thus created another false dichotomy to excuse his first.\n" +
                    "\n" +
                    "The false dichotomy Cueball appears to be referring to is the notion that those identified as human must not be eaten, but even closely related animals are not human and can be eaten, i.e. species can be divided clearly between \"human\" and \"food\". If this dichotomy is not accepted, then consuming any species that shares, for instance, any significant percentage of DNA with humans could be considered a measure of cannibalism.\n" +
                    "\n" +
                    "The title text states that there are two kinds of dichotomies, making a dichotomy in itself. Due to three types of dichotomy being mentioned, and only two being foreshadowed, this statement is itself a surprise trichotomy, or three-parted choice. The title text is a variation of the \"Two kinds of People\" joke. The classic math nerd variant is \"There are three kinds of people in the world, those who can count, and those who can't.\" Alternatively, it may refer to a variation about binary. The original joke usually goes something like this: \"There are 10 types of people: those who know binary, and those who don't.\" The variation is usually something like the following: \"There are 10 types of people: those who know binary, and those who don't, and those who weren't expecting a ternary joke.\" Another version of this kind of joke is \"there are two kinds of people: those who can extrapolate from an incomplete data set,\"\n" +
                    "\n" +
                    "The word trichotomy is a relative neologism, to be understood as to mean \"divided into (or amongst) three parts\", having replaced the original prefix \"di-\" (a factor of two, either doubled or, by context, halved) with that of \"tri-\" (similarly tripled/thirded). Strictly, though, dichotomy more directly stems from Greek elements that say \"apart, I cut\", with \"apart\" being represented by the \"dicho-\" (itself being roughly \"into two\", or to separate) which does not have a direct \"tricho-\" equivalent, although it does ultimately derive from \"duo\", Greek for \"two\". This is the kind of linguistic nuance that Randall clearly enjoys, yet may also happily or carelessly (mis)use without compunction."))

        comics.add(ComicStrip(
            "Deviled Eggs",
            "https://imgs.xkcd.com/comics/deviled_eggs.png",
            2593,
            "The foil on the toothpick represents the blue flash.",
            "A deviled egg is a dish created by cutting a hard-boiled egg into halves and replacing the yolk with a paste frequently made using the yolk itself, additional ingredients such as mustard and mayonaise, and topped with a red spice (usually paprika). Importantly, the paste has a larger volume than the original yolk because of the added ingredients (and probably some air) into the originally homogonous yolk substances. Randall Munroe parodies the dish by creating several alternative versions of the dish for other professions using word plays on the name of the dish."))

        comics.add(ComicStrip(
            "Consensus Time",
            "https://imgs.xkcd.com/comics/consensus_time.png",
            2594,
            "Now, you may argue that the varying hour lengths and feedback effects would cause chaos. To which I say, yeah, and I'm also curious to see how the weekday cycle interacts with it! So, you in?",
            "Daylight Saving Time, a recurring theme on xkcd, has recently started (in the US, as of this comic's publication). At the time of transition, clocks in (most of) North America are turned an hour forward. People frequently complain about the switch into (and out of) DST, due to it having been invented for the no-longer-relevant cause of saving coal during wartime. One of many complaints is that it will still \"feel\" like 5 am at 6, or whatever other case. A few days before this comic went up, the United States Senate unanimously passed the Sunshine Protection Act, which would permanently abolish the biannual daylight savings adjustment, setting (what was) the local daylight savings time offset as the year-round time zone for all but a handful of states and territories rather than eliminating DST completely.\n" +
                    "Randall, jumping on this topic, proposes a system that allows everybody to say when it \"feels\" like 9 am, and then the median 9 am will become the real 9 am. This happens every day. As the title text points out, this would be chaotic and, to put it bluntly, awful.[citation needed]\n" +
                    "\n" +
                    "Presumably the times indicated on this diagram are as the clocks in this time zone would indicate, as opposed to an \"ordinary\" reference time.\n" +
                    "\n" +
                    "The graph of points seems to follow a normal distribution, with a large number of votes being clustered around a given time, and giving a median of soon after 11AM. There are some extreme outliers, some before 6AM and some after 6PM, indicating some users being outside the normal range but no information on whether it's a malicious attempt.\n" +
                    "\n" +
                    "Although the hours between midnight and 9 am are labelled as \"longer\" (which we can assume means each would take longer than an hour of ordinary time to pass) the effect on the remaining hours is left unstated. If we assume that the remaining hours pass at the usual rate then this would suggest that midnight would come sooner or later than normal and hence the next vote would occur sooner or later respectively. This implies the time in this time zone could drift further than a day (or even multiple days) from existing time-zones which could be what is meant by \"feedback\", \"chaos\" and the effect on weekdays mentioned in the title text."))

        comics.add(ComicStrip(
            "Advanced Techniques",
            "https://imgs.xkcd.com/comics/advanced_techniques.png",
            2595,
            "A blow from Emmy's Cutlass of Variations will transport the dragon to a corresponding symmetric position in the Noetherworld.",
            "In typical Miss Lenhart fashion, she is teaching a mathematics class where she outlines a process by which a mathematical result is achieved through steps which sound suspiciously like magical RPG logic. She includes both a dragon and arrows to slay it.\n" +
                    "\n" +
                    "One of her students asks if this is a metaphor for the technique, but her rather tetchy reply \"Does this look like English class?!\" seems to imply that she literally means that dragons and arrows will be employed in the resolution of the problem. It is also clear from the slide she is pointing at that she has drawn a dragon and a man with a bow that is aiming an arrow at the dragon. Whilst metaphor is an important part of many languages, and so is definitely taught in language classes, it is not usually used in math classes.\n" +
                    "\n" +
                    "The caption beneath the comic states that this approach describes \"All advanced math techniques.\" This could be a reference to the now-common approach in higher mathematics in which a problem is transformed into another domain where it is easier to solve, then transformed back. For instance, in Fourier analysis, commonly used for analyzing the behavior of signals or dynamical systems, a problem can be transformed from the time domain to the frequency domain, solved, and then transformed back again. A (much) more complex example is Andrew Wiles's proof of Fermat's Last Theorem, which uses modularity lifting to transform the problem. Here Miss Lenhart says she will transform a math problem into an actual dragon, slay it, and transform the corpse back into mathematics.\n" +
                    "\n" +
                    "An alternative view is that Randall is referring to Arthur C. Clarke's third law that Any sufficiently advanced technology is indistinguishable from magic, as re-framed for mathematics. What Randall would be implying is that all advanced math techniques look like magic to non-mathematicians. (Another advanced and somewhat magical math technique is deployed by Miss Lenhart in 1724: Proofs.)\n" +
                    "\n" +
                    "Invocations are a common classification for spoken or vocalized types of spell. In the logic Miss Lenhart used, 'invoking' Gauss's operator may refer to casting a magical spell with verbal components (such as True Polymorph). The operator is presumably named after the famous German mathematician Carl Friedrich Gauss. There is nothing on Wikipedia called Gauss's operator, but there is both Gauss's law and the Gauss???Kuzmin???Wirsing operator. As neither can transform an equation into a dragon,[citation needed] it's clear Randall is making a joke.\n" +
                    "\n" +
                    "Slaying the dragon with Hilbert's arrow indicates that the arrow has some magical properties. The arrow is presumably named after David Hilbert, known for many mathematical developments including Hilbert's problems and Hilbert spaces. A Hilbert space converts subsets of an infinite vector space into a complete metric space, allowing the use of linear algebra and calculus methods which might otherwise be applicable only to finite Euclidean spaces. Vectors could be compared with an arrow. Magical arrows are frequently used to slay dragons in myth and role-playing games. Magical items in RPGs such as Dungeons & Dragons are often named after a creator or famous user; hence, a magical \"Arrow of Hilbert\" might traverse infinite spaces or affect targets for which one or more stats are effectively infinite.\n" +
                    "\n" +
                    "There is in fact a class of Dragon curves, which do have the sort of S-shape shown on the whiteboard, but they have no connection to Gauss's operator, and are not actual dragons that need slaying.\n" +
                    "\n" +
                    "The title text contains two puns and a reference. The phrase \"Cutlass of Variations\" is a pun on the mathematical technique called \"Calculus of variations\". The word \"Noetherworld\" is a pun on \"netherworld\". The reference is to the mathematician Emmy Noether, a giant in the field of abstract algebra. Furthermore, Noether's Theorem is used in the Calculus of Variations. She was previously referenced as one of many important women in science back in 896: Marie Curie."))

        comics.add(ComicStrip(
            "Galaxies",
            "https://imgs.xkcd.com/comics/galaxies.png",
            2596,
            "I know it seems overwhelming, but don't worry; I'm sure most of them have only a few stars, and probably no planets.",
            "Space is big. Really big. You just won't believe how vastly, hugely, mind-bogglingly big it is.\n" +
                    "???Douglas Adams, The Hitchhiker's Guide to the Galaxy\n" +
                    "This is another comic with a Fact, the second in a row of these fact comics to use an Astronomy fact.\n" +
                    "\n" +
                    "Our best approximation of the number of galaxies in the observable universe is about 200 billion (2 ?? 1011). That's a lot of galaxies,[citation needed] and here Randall exemplifies this by showing a small circle and estimating that when the comic's picture is viewed at a typical arm's length, expanded to full screen on your typical smartphone, the circle contains roughly 50,000 galaxies (that means of course not the small circle itself, but the volume defined by the viewer's eye, that circle, and an onward conical extension into deep space ??? and simultaneously back in time ??? to the respective limits of the observable universe). Most of those far-away galaxies are undetectable by even our most powerful astronomical instruments today, and comparatively few could be seen (let alone positively identified as such) by the naked eye. For example, in the Hubble Deep Field, an image of a small region in the constellation Ursa Major, about 3,000 visible galaxies can be identified.\n" +
                    "\n" +
                    "Measuring in the mid-point of the lines, the circle is about one fortieth of the width of the frame of the comic. The absolute circle size depends on the display resolution, size and mode, but it can reasonably be taken to be 1mm diameter, or 0.5mm radius, giving a total area ?? r2 or about ??/4 square millimeters. You're probably holding the phone about a half a meter away from your eye. The surface area of a sphere is 4 ?? r2. With a radius of one-half meter, that comes out to be ?? square meters. Thus, the area of the circle is about 1/4000000 of the area of the sphere, 200 billion galaxies divided by 4 million is the 50,000 average mentioned in the cartoon. A similar mathematics was used for the comic 1276: Angular Size, in which the projective sphere was at the Earth's own radius and cross-sectional areas of objects were compared, rather than an approximate count of objects within a given angular spread.\n" +
                    "\n" +
                    "While galaxies usually are between 3,000 to 300,000 light-years across and contain between 10^8 (100 million) and 10^14 (100 trillion) stars, most are so far away from the Earth (upwards of billions of light-years) that they are invisible to the naked eye, or even through most telescopes. When magnified across such vast distances, even something as small as a pinhole expands to huge sizes, easily able to fit tens of thousands of galaxies.\n" +
                    "\n" +
                    "The premise of this comic is that although galaxies are giant, space is unimaginably big and contains a vast number of things. Randall is apparently overwhelmed by this, as shown in the caption: Astronomy Fact: There are too many galaxies.\n" +
                    "\n" +
                    "The title text is Randall reassuring his readers why not to worry of this overwhelming fact. He states that most galaxies only have few stars and probably no planets. However, as mentioned above each galaxy contains a huge amount of stars, and as evident from all his own comics about exoplanets, it is now clear that many of the stars in a galaxy also have planets orbiting them. Thus the number of stars and planets in that small circle is much more mind-bogglingly large, than the number of galaxies, and thus the reassurance is sarcasm.\n" +
                    "\n" +
                    "In 975: Occulting Telescope Cueball expresses a similar sentiment about the number of stars."))

        comics.add(ComicStrip(
            "Salary Negotiation",
            "https://imgs.xkcd.com/comics/salary_negotiation.png",
            2597,
            "We can do 0.33 or 0.34, but our payroll software doesn't allow us to",
            "Ponytail's company would like to hire Cueball for a job, and she is telling him that their offer for his starting salary is \$55,000.\n" +
                    "When offered a new job, it is common to negotiate on aspects of the offer such as salary, and employers may offer below the market rate initially in the expectation that the final negotiated amount will be higher. Given that the bedrock of one's future income depends on the outcome of a one-time process requiring skills unrelated to the job one is hired for, it is advisable to take one's time and do as much research as possible.\n" +
                    "\n" +
                    "Cueball has clearly done some research, but perhaps too much as he is flummoxed by this high-stakes situation and starts to ramble with decreasing coherence. First he gets completely confused about the numbers. He says he won't have a penny over \$50,000, thus cutting \$5000 of the initial offer, and saying he will not have more than that. He realizes this was completely wrong, and corrects to \"under\", but is still 5000 lower.\n" +
                    "\n" +
                    "Realizing that he is completely off, he asks for a \"15% cut of the salary\". Here, Cueball seems to confuse salary and commission. \"X% cut of the salary\" seems like what a recruiter/headhunter may get from their employer as a commission if they successfully make their person hired.\n" +
                    "\n" +
                    "The next word he says is \"Raise\". This could make sense if he already had a job, and wished to negotiate for a pay raise. After this, he begins to think of raise as in a card game and starts rambling off mainly poker related terms, like \"raise\", \"fold\" and \"pass\". He throws in \"double down\" in between. This can also be a card game term, as in blackjack where double down means to double a bet after seeing one's initial cards, with the requirement that one additional card be drawn.\n" +
                    "\n" +
                    "Ponytail tries to ask him something, but Cueball interrupts her, saying he is sorry and that he would like to start over. At this time he takes out several sheets of paper and looks at some charts. He asks if he can borrow a calculator and then asks what's 20% of \$55,000. He eventually settles on a number, \$61,333.3 He even states that the decimals of 3 should be repeating, as in forever. This is exactly \$61,333???. He clearly states he will not take the job for less than that. A 2016 Harvard Business School study found that avoiding round numbers is a remarkably effective negotiation tactic.\n" +
                    "\n" +
                    "Since this is not that much more than the starting offer Ponytail is ready to accept this and says \"Sure, \$61,333 is fine.\" But Cueball interrupts her because what she just offered him was 33??? cents less than he asked for.\n" +
                    "\n" +
                    "In the title text it shows that this is not good enough. Cueball has now confused himself to the point he will only accept exactly what he asked for, the bizarre amount \$61,333???. Ponytail tries to explain to him that the point 3 repeating cannot be paid in whole cents, and tries to let him know that their payroll software only can handle whole cents, and he thus can get either 0.33 or 0.34 (the latter actually being more than he asks for). Alas, Cueball, either out of panic or a love of mathematics, shouts \"No deal!\" and lets the job slip out of his hands, because he has completely misunderstood the concept of negotiation.\n" +
                    "\n" +
                    "For more interview-related xkcd comics, see for instance Category:Job interviews.\n" +
                    "\n" +
                    "This could also be taken in series with Cueball (possibly as a stand in for Randall) misunderstanding classically \"adult\" ideas, see for instance 616: Lease, 905: Homeownership, 1674: Adult and 1894: Real Estate."))

        comics.add(ComicStrip(
            "Graphic Designers",
            "https://imgs.xkcd.com/comics/graphic_designers.png",
            2598,
            "They might make it past that first line of defense. For the second, you'll need some picture frames, a level, and a protractor that can do increments of less than a degree.",
            "Cueball is inviting Knit Cap into his newly repainted residence. Knit Cap is a graphic designer and he simply can't enter because of the color scheme used. The caption explains that if you paint each wall a slightly different shade of off-white, a graphic designer will be so repulsed that they are physically unable to enter the room. This is analogous with a specific bit of vampire lore: Vampires cannot enter a dwelling uninvited.\n" +
                    "Being presented with visual information that is just not quite right is known to cause feelings of unease and revulsion, particularly when presented with CGI human faces, a concept known as the uncanny valley.\n" +
                    "\n" +
                    "In the title text, it mentions a contingency against the designer managing to actually overcome this disgust. In this case, Cueball sets up a second way to troll his graphic designer friend using some picture frames, a level, and a protractor that can measure increments of less than a degree. Cueball can then skew his picture frames by an extremely small amount, noticeable only to the designer friend, to disgust him even further ??? similar to the effect of bad kerning. This could thus be applied like the use of crosses or garlic, which vampires are famously repulsed by.\n" +
                    "\n" +
                    "Also note that the window ledges are slightly inclined, falling subtly from left to right - which might be a variant of this defense"))
    }
}