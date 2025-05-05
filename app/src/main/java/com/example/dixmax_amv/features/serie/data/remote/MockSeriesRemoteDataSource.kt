package com.example.dixmax_amv.features.serie.data.remote

import com.example.dixmax_amv.features.serie.domain.Episode
import com.example.dixmax_amv.features.serie.domain.Season
import com.example.dixmax_amv.features.serie.domain.Serie
import org.koin.core.annotation.Single

@Single
class MockSeriesRemoteDataSource {
    private val episodes = listOf(
        Episode(
            "E1",
            "Los dias transcurridos",
            "Sun Oct 31 2010",
            "Rick busca a su famlia después de salir del coma en un mundo plagado de muertos vivientes. Por el camino conoce a Morgan y Duane quienes enseñan a Rick las nuevas normas para la supervivencia"
        ), Episode(
            "E2",
            "Tripas",
            "Sun Nov 07 2010",
            "Rick es rescatado por Glenn y llevado a un grupo de supervivientes atrapados en una tienda. Para escapar, deben cubrirse con vísceras de caminantes y atravesar la horda. Sin embargo, Merle es dejado atrás esposado en la azotea."
        ), Episode(
            "E3",
            "Díselo a las ranas",
            "Sun Nov 14 2010",
            "Rick regresa al campamento y se reúne con su familia. Decide volver a Atlanta para rescatar a Merle y recuperar una bolsa de armas, acompañado por Glenn, Daryl y T-Dog."
        ), Episode(
            "E4",
            "Chicos",
            "Sun Nov 21 2010",
            "Rick y su grupo enfrentan a una banda que protege a ancianos en Atlanta. Mientras tanto, en el campamento, Jim comienza a cavar fosas sin explicación aparente."
        ), Episode(
            "E5",
            "Fuego salvaje",
            "Sun Nov 28 2010",
            "Tras un ataque al campamento, el grupo decide dirigirse al CDC en busca de respuestas. Allí, el Dr. Jenner les revela información impactante sobre la infección."
        ), Episode(
            "E6",
            "TS-19",
            "Sun Dec 05 2010",
            "El grupo descubre que el CDC está programado para autodestruirse. Deben encontrar una manera de escapar antes de que sea demasiado tarde."
        )
    )
    private val season2Episodes = listOf(
        Episode(
            "E1",
            "What Lies Ahead",
            "Sun Oct 16 2011",
            "El grupo intenta abandonar la granja, pero se encuentran con nuevos desafíos y amenazas mientras buscan un lugar más seguro."
        ), Episode(
            "E2",
            "Bloodletting",
            "Sun Oct 23 2011",
            "Rick debe tomar decisiones difíciles mientras se enfrenta a nuevos peligros. Carl está gravemente herido y el grupo enfrenta el miedo de perderlo."
        ), Episode(
            "E3",
            "Save the Last One",
            "Sun Oct 30 2011",
            "Shane toma una decisión extrema mientras el grupo intenta encontrar una forma de sobrevivir. La relación entre Rick y Shane se pone a prueba."
        ), Episode(
            "E4",
            "Cherokee Rose",
            "Sun Nov 6 2011",
            "El grupo encuentra algo de esperanza mientras lidian con las tensiones internas y la amenaza externa de los caminantes."
        ), Episode(
            "E5",
            "Chupacabra",
            "Sun Nov 13 2011",
            "Mientras el grupo continúa en la granja, se enfrentan a nuevas amenazas y tratan de mantener su unidad, aunque las tensiones crecen."
        ), Episode(
            "E6",
            "Secrets",
            "Sun Nov 20 2011",
            "Las tensiones dentro del grupo crecen cuando se revelan secretos oscuros, y algunos miembros comienzan a cuestionar las decisiones de Rick."
        ), Episode(
            "E7",
            "Pretty Much Dead Already",
            "Sun Nov 27 2011",
            "La situación en la granja se vuelve desesperada, y el grupo se ve obligado a tomar decisiones difíciles que podrían cambiar el curso de sus vidas."
        ), Episode(
            "E8",
            "Nebraska",
            "Sun Feb 12 2012",
            "Mientras el grupo intenta sobrevivir, se encuentran con otros sobrevivientes que podrían no ser lo que parecen. Las tensiones llegan a su punto máximo."
        ), Episode(
            "E9",
            "Triggerfinger",
            "Sun Feb 19 2012",
            "Rick y su grupo se ven atrapados en una peligrosa situación, mientras los demás enfrentan las consecuencias de las decisiones tomadas en el pasado."
        ), Episode(
            "E10",
            "18 Miles Out",
            "Sun Feb 26 2012",
            "Rick y Shane van en una misión peligrosa mientras el resto del grupo se enfrenta a la escasez de suministros y nuevas amenazas."
        ), Episode(
            "E11",
            "Judge, Jury, Executioner",
            "Sun Mar 4 2012",
            "Rick toma decisiones difíciles que afectarán al grupo a largo plazo mientras enfrentan su moralidad en un mundo donde la supervivencia es lo más importante."
        ), Episode(
            "E12",
            "Better Angels",
            "Sun Mar 11 2012",
            "Las tensiones dentro del grupo se disparan mientras los supervivientes enfrentan la amenaza de nuevos enemigos y tienen que hacer sacrificios."
        ), Episode(
            "E13",
            "Beside the Dying Fire",
            "Sun Mar 18 2012",
            "El grupo enfrenta la peor amenaza que hayan conocido hasta ahora, y deben hacer frente a su destino en un mundo devastado por los zombis."
        )
    )
    private val season3Episodes = listOf(
        Episode(
            "E1",
            "Seed",
            "Sun Oct 14 2012",
            "Rick y su grupo encuentran una prisión y se preparan para establecerse allí, pero el peligro siempre está al acecho."
        ), Episode(
            "E2",
            "Sick",
            "Sun Oct 21 2012",
            "El grupo lidia con un brote de infección dentro de la prisión mientras deben enfrentarse a una nueva amenaza en su territorio."
        ), Episode(
            "E3",
            "Walk with Me",
            "Sun Oct 28 2012",
            "La historia se centra en una nueva comunidad, los Gobernadores, que tienen sus propios problemas con la supervivencia en este mundo post-apocalíptico."
        ), Episode(
            "E4",
            "Killer Within",
            "Sun Nov 4 2012",
            "Una tragedia golpea al grupo, lo que obliga a todos a reconsiderar su lucha por la supervivencia en un mundo sin reglas."
        ), Episode(
            "E5",
            "Say the Word",
            "Sun Nov 11 2012",
            "El grupo se enfrenta a nuevas pruebas mientras los conflictos internos amenazan con desmoronar su unidad. La supervivencia es aún más difícil."
        ), Episode(
            "E6",
            "Hounded",
            "Sun Nov 18 2012",
            "La amenaza del Gobernador se acerca, y el grupo de Rick se ve atrapado entre dos mundos. La lucha por sobrevivir se intensifica."
        ), Episode(
            "E7",
            "When the Dead Come Knocking",
            "Sun Nov 25 2012",
            "Rick y su grupo tienen que tomar decisiones difíciles y enfrentarse a nuevas amenazas, lo que cambia para siempre la dinámica del grupo."
        ), Episode(
            "E8",
            "Made to Suffer",
            "Sun Dec 2 2012",
            "El grupo enfrenta una nueva y peligrosa amenaza mientras luchan por mantenerse unidos en un mundo desolado lleno de peligros."
        ), Episode(
            "E9",
            "The Suicide King",
            "Sun Feb 10 2013",
            "Después de un enfrentamiento mortal, Rick y su grupo se enfrentan a nuevas dificultades. El Gobernador sigue siendo una amenaza latente."
        ), Episode(
            "E10",
            "Home",
            "Sun Feb 17 2013",
            "Rick lucha con la pérdida de su humanidad mientras busca una forma de proteger a su grupo de la amenaza que se avecina."
        ), Episode(
            "E11",
            "I Ain't a Judas",
            "Sun Feb 24 2013",
            "Las tensiones internas entre los grupos se intensifican, lo que lleva a confrontaciones directas con el Gobernador."
        ), Episode(
            "E12",
            "Clear",
            "Sun Mar 3 2013",
            "Rick regresa a la ciudad en busca de suministros y se encuentra con viejos amigos, lo que desencadena una serie de eventos impredecibles."
        ), Episode(
            "E13",
            "Arrow on the Doorpost",
            "Sun Mar 10 2013",
            "Rick y el Gobernador negocian, pero la paz parece imposible mientras cada uno de ellos tiene planes secretos que podrían desestabilizar todo."
        ), Episode(
            "E14",
            "Prey",
            "Sun Mar 17 2013",
            "La guerra con el Gobernador se acerca, y el grupo se enfrenta a sus propios conflictos internos mientras se preparan para la batalla final."
        ), Episode(
            "E15",
            "This Sorrowful Life",
            "Sun Mar 24 2013",
            "El grupo se enfrenta a su mayor amenaza hasta ahora mientras luchan por su supervivencia en medio de la guerra con el Gobernador."
        ), Episode(
            "E16",
            "Welcome to the Tombs",
            "Sun Mar 31 2013",
            "La temporada culmina en una batalla épica entre el Gobernador y el grupo de Rick. La lucha por la supervivencia llega a su punto máximo."
        )
    )
    private val season4Episodes = listOf(
        Episode(
            "E1",
            "30 Days Without an Accident",
            "Sun Oct 13 2013",
            "El grupo trata de vivir una vida más estable y encontrar algo de paz después de la guerra con el Gobernador, pero nuevos peligros se acercan."
        ), Episode(
            "E2",
            "Infected",
            "Sun Oct 20 2013",
            "El grupo se enfrenta a una nueva amenaza cuando un brote de infección se propaga rápidamente entre ellos, desestabilizando la seguridad que habían encontrado."
        ), Episode(
            "E3",
            "Isolation",
            "Sun Oct 27 2013",
            "El grupo se divide mientras buscan una solución para la enfermedad que amenaza con destruirlos. La desconfianza crece entre los miembros del grupo."
        ), Episode(
            "E4",
            "The Walking Dead",
            "Sun Nov 3 2013",
            "Rick y los demás deben enfrentarse a las consecuencias de sus decisiones mientras buscan suministros y una forma de sobrevivir."
        ), Episode(
            "E5",
            "Internment",
            "Sun Nov 10 2013",
            "El grupo intenta encontrar una cura para la enfermedad que se está propagando. Mientras tanto, las tensiones internas ponen en riesgo la seguridad del grupo."
        ), Episode(
            "E6",
            "Live Bait",
            "Sun Nov 17 2013",
            "El Gobernador, que ha desaparecido, regresa en busca de redención. Los caminos del Gobernador y de Rick vuelven a cruzarse de manera peligrosa."
        ), Episode(
            "E7",
            "Dead Weight",
            "Sun Nov 24 2013",
            "El Gobernador forma un nuevo grupo mientras planifica su próximo movimiento. La lucha por la supervivencia se intensifica."
        ), Episode(
            "E8",
            "Too Far Gone",
            "Sun Dec 1 2013",
            "El Gobernador se enfrenta a Rick en un enfrentamiento final mientras el grupo lucha por mantenerse unido."
        ), Episode(
            "E9",
            "After",
            "Sun Feb 9 2014",
            "Después de la guerra con el Gobernador, los sobrevivientes se dispersan. Rick y Carl tratan de encontrar un lugar seguro mientras luchan por sobrevivir."
        ), Episode(
            "E10",
            "Inmates",
            "Sun Feb 16 2014",
            "El grupo intenta encontrar a sus compañeros mientras lidian con la pérdida y buscan una forma de sobrevivir en este nuevo mundo."
        ), Episode(
            "E11",
            "Claimed",
            "Sun Feb 23 2014",
            "Rick y su grupo se enfrentan a un peligro que no esperaban mientras intentan encontrar un refugio. Nuevas amenazas surgen en el camino."
        ), Episode(
            "E12",
            "Still",
            "Sun Mar 2 2014",
            "El grupo se encuentra atrapado en un lugar donde la esperanza parece agotarse. Sin embargo, deben encontrar una forma de seguir adelante."
        ), Episode(
            "E13",
            "Alone",
            "Sun Mar 9 2014",
            "La soledad y la desesperación golpean a los sobrevivientes mientras luchan por encontrar la paz en medio del caos."
        ), Episode(
            "E14",
            "The Grove",
            "Sun Mar 16 2014",
            "Un encuentro inesperado lleva a un nuevo capítulo en la vida del grupo. Las relaciones entre los sobrevivientes se ponen a prueba."
        ), Episode(
            "E15",
            "Us",
            "Sun Mar 23 2014",
            "Rick y los demás buscan respuestas mientras se enfrentan a nuevos enemigos y situaciones mortales. La batalla por la supervivencia sigue."
        ), Episode(
            "E16",
            "A",
            "Sun Mar 30 2014",
            "El grupo se enfrenta a su mayor amenaza hasta ahora mientras luchan por encontrar un nuevo refugio y enfrentar lo que queda del apocalipsis."
        )
    )
    private val season5Episodes = listOf(
        Episode(
            "E1",
            "No Sanctuary",
            "Sun Jun 8 2014",
            "Después de escapar de los caníbales de Terminus, Rick y su grupo luchan por encontrar un nuevo lugar seguro. Los enemigos parecen estar más cerca que nunca."
        ), Episode(
            "E2",
            "Strangers",
            "Sun Jun 15 2014",
            "Rick y su grupo conocen a nuevos sobrevivientes y enfrentan nuevas amenazas. Mientras tanto, las tensiones crecen dentro del grupo."
        ), Episode(
            "E3",
            "Four Walls and a Roof",
            "Sun Jun 22 2014",
            "Rick y su grupo enfrentan a nuevos enemigos mientras intentan encontrar refugio. La batalla por la supervivencia llega a su punto álgido."
        ), Episode(
            "E4",
            "The Fault in Our Stars",
            "Sun Jun 29 2014",
            "Las tensiones internas y los enemigos externos amenazan con destruir al grupo. Rick toma decisiones que podrían poner en peligro todo lo que han logrado."
        ), Episode(
            "E5",
            "Self Help",
            "Sun Jul 6 2014",
            "Rick y su grupo se enfrentan a una nueva amenaza mientras luchan por mantener la esperanza y la unidad. La supervivencia nunca ha sido más difícil."
        ), Episode(
            "E6",
            "Consumed",
            "Sun Jul 13 2014",
            "El grupo busca refugio y suministros en un mundo cada vez más peligroso. Las relaciones dentro del grupo comienzan a fracturarse."
        ), Episode(
            "E7",
            "Crossed",
            "Sun Jul 20 2014",
            "Rick y los demás enfrentan la posibilidad de perder a algunos de los suyos mientras continúan su lucha por la supervivencia."
        ), Episode(
            "E8",
            "Coda",
            "Sun Nov 30 2014",
            "La temporada culmina en una confrontación mortal mientras Rick y su grupo luchan por mantenerse unidos y sobrevivir."
        ), Episode(
            "E9",
            "What Happened and What's Going On",
            "Sun Feb 8 2015",
            "El grupo busca refugio mientras enfrentan nuevas amenazas. La lucha por la supervivencia nunca ha sido más difícil."
        ), Episode(
            "E10",
            "Them",
            "Sun Feb 15 2015",
            "Los sobrevivientes enfrentan la soledad y la desesperación mientras intentan encontrar un lugar seguro donde puedan vivir en paz."
        ), Episode(
            "E11",
            "The Distance",
            "Sun Feb 22 2015",
            "Rick y su grupo conocen a otros sobrevivientes que parecen tener un lugar seguro. Sin embargo, la confianza no es fácil de ganarse."
        ), Episode(
            "E12",
            "Remember",
            "Sun Mar 1 2015",
            "El grupo intenta adaptarse a una nueva comunidad, pero las viejas tensiones resurgen mientras luchan por sobrevivir."
        ), Episode(
            "E13",
            "Forget",
            "Sun Mar 8 2015",
            "Las mentiras y los secretos amenazan con destruir la frágil paz que han encontrado. El grupo se enfrenta a nuevas pruebas que desafían su unidad."
        ), Episode(
            "E14",
            "Spend",
            "Sun Mar 15 2015",
            "El grupo se enfrenta a un peligro inminente mientras luchan por proteger a los suyos. Las tensiones internas y los desafíos externos ponen en riesgo su supervivencia."
        ), Episode(
            "E15",
            "Try",
            "Sun Mar 22 2015",
            "El grupo intenta mantener la paz, pero las fuerzas externas y los problemas internos hacen que la situación sea cada vez más peligrosa."
        ), Episode(
            "E16",
            "Conquer",
            "Sun Mar 29 2015",
            "La temporada termina con una batalla épica, mientras Rick y su grupo enfrentan a nuevos enemigos y desafíos que pondrán en peligro sus vidas."
        )
    )
    private val season6Episodes = listOf(
        Episode(
            "E1",
            "First Time Again",
            "Sun Oct 11 2015",
            "Rick y su grupo se enfrentan a una nueva amenaza mientras intentan establecerse en una nueva comunidad. La lucha por la supervivencia continúa."
        ), Episode(
            "E2",
            "JSS",
            "Sun Oct 18 2015",
            "El grupo se enfrenta a un ataque inesperado mientras luchan por proteger a los más vulnerables. La moral dentro de la comunidad es puesta a prueba."
        ), Episode(
            "E3",
            "Thank You",
            "Sun Oct 25 2015",
            "Un intento de rescate se convierte en una emboscada. Rick y sus amigos se ven forzados a tomar decisiones difíciles mientras lidian con las consecuencias de sus acciones."
        ), Episode(
            "E4",
            "Here's Not Here",
            "Sun Nov 1 2015",
            "La historia de un nuevo personaje, Morgan, y su viaje hacia la comprensión de la vida en este nuevo mundo. Un giro inesperado revela su motivación."
        ), Episode(
            "E5",
            "Now",
            "Sun Nov 8 2015",
            "Mientras luchan por adaptarse a una nueva forma de vida, las relaciones dentro del grupo se vuelven más tensas, y nuevas amenazas emergen."
        ), Episode(
            "E6",
            "Always Accountable",
            "Sun Nov 15 2015",
            "Alguien del grupo se pierde mientras otros luchan por sobrevivir. Los recuerdos y las lecciones del pasado se interponen en el camino de su futuro."
        ), Episode(
            "E7",
            "Heads Up",
            "Sun Nov 22 2015",
            "El grupo se enfrenta a la tragedia mientras se preparan para lo que vendrá. La comunidad de Alexandria es puesta a prueba de manera que nunca antes lo había sido."
        ), Episode(
            "E8",
            "Start to Finish",
            "Sun Nov 29 2015",
            "La comunidad se encuentra en una situación desesperada mientras los sobrevivientes intentan encontrar una salida. La lucha por la vida alcanza un nuevo nivel de intensidad."
        ), Episode(
            "E9",
            "No Way Out",
            "Sun Feb 14 2016",
            "La situación se vuelve más crítica mientras el grupo lucha por escapar de una horda de caminantes. Los sacrificios serán inevitables."
        ), Episode(
            "E10",
            "The Next World",
            "Sun Feb 21 2016",
            "Un nuevo capítulo comienza cuando el grupo se enfrenta a nuevos sobrevivientes. La paz parece posible, pero las amenazas siempre están al acecho."
        ), Episode(
            "E11",
            "Knots Untie",
            "Sun Feb 28 2016",
            "El grupo debe decidir si confiar en un grupo de extraños. Mientras tanto, el peligro sigue acechando en las sombras."
        ), Episode(
            "E12",
            "Not Tomorrow Yet",
            "Sun Mar 6 2016",
            "Una misión arriesgada se lleva a cabo para asegurarse de que los sobrevivientes puedan vivir en paz, pero el costo será alto."
        ), Episode(
            "E13",
            "The Same Boat",
            "Sun Mar 13 2016",
            "Rick y un pequeño grupo de sobrevivientes se encuentran con un grupo de salvadores. Las apuestas se elevan y la tensión crece."
        ), Episode(
            "E14",
            "Twice as Far",
            "Sun Mar 20 2016",
            "Las relaciones dentro del grupo se ven amenazadas mientras otros luchan por encontrar algo de esperanza en el mundo actual."
        ), Episode(
            "E15",
            "East",
            "Sun Mar 27 2016",
            "La temporada se intensifica cuando un miembro del grupo se pierde. Las decisiones equivocadas tienen graves consecuencias."
        ), Episode(
            "E16",
            "Last Day on Earth",
            "Sun Apr 3 2016",
            "Un enfrentamiento final con los Salvadores se avecina, y la vida de los sobrevivientes depende de sus decisiones. La guerra está por comenzar."
        )
    )
    private val season7Episodes = listOf(
        Episode(
            "E1",
            "The Day Will Come When You Won't Be",
            "Sun Oct 23 2016",
            "Rick y su grupo deben enfrentarse a Negan y a los Salvadores. La situación se vuelve desesperada cuando Negan toma medidas extremas para imponer su control."
        ), Episode(
            "E2",
            "The Well",
            "Sun Oct 30 2016",
            "Un nuevo grupo de sobrevivientes aparece y les ofrece una alternativa a la vida que llevan Rick y su grupo. La paz parece posible, pero es solo una ilusión."
        ), Episode(
            "E3",
            "The Cell",
            "Sun Nov 6 2016",
            "Mientras Rick y su grupo intentan planear su próximo movimiento, Daryl se enfrenta a su propia lucha en el territorio de los Salvadores."
        ), Episode(
            "E4",
            "Service",
            "Sun Nov 13 2016",
            "Negan y los Salvadores siguen imponiendo su voluntad sobre Alexandria, y Rick se enfrenta a la difícil decisión de cómo responder a las amenazas."
        ), Episode(
            "E5",
            "Go Getters",
            "Sun Nov 20 2016",
            "La lucha por la supervivencia continúa mientras los personajes se enfrentan a nuevas pruebas. La amenaza de los Salvadores se intensifica."
        ), Episode(
            "E6",
            "Swear",
            "Sun Nov 27 2016",
            "Un miembro del grupo se encuentra con una comunidad peligrosa mientras busca respuestas. La vida en este nuevo mundo nunca ha sido más incierta."
        ), Episode(
            "E7",
            "Sing Me a Song",
            "Sun Dec 4 2016",
            "Negan muestra a Carl su forma de gobernar, y la tensión entre ellos aumenta. El grupo de Rick lucha por mantener su humanidad en medio del caos."
        ), Episode(
            "E8",
            "Hearts Still Beating",
            "Sun Dec 11 2016",
            "La guerra con los Salvadores comienza, pero las consecuencias de sus decisiones pesan sobre todos. La lucha por la supervivencia alcanza nuevos niveles de intensidad."
        ), Episode(
            "E9",
            "Rock in the Road",
            "Sun Feb 12 2017",
            "Rick y su grupo buscan aliados en la lucha contra Negan, pero los riesgos son altos y las pérdidas pueden ser inevitables."
        ), Episode(
            "E10",
            "New Best Friends",
            "Sun Feb 19 2017",
            "El grupo de Rick conoce a una nueva comunidad, pero las tensiones crecen cuando descubren que su supervivencia está en juego."
        ), Episode(
            "E11",
            "Hostiles and Calamities",
            "Sun Feb 26 2017",
            "Los Salvadores están en el centro del conflicto mientras los sobrevivientes luchan por encontrar la manera de derrotarlos."
        ), Episode(
            "E12",
            "Say Yes",
            "Sun Mar 5 2017",
            "Rick y Michonne se embarcan en una misión peligrosa mientras intentan encontrar los suministros necesarios para su lucha contra los Salvadores."
        ), Episode(
            "E13",
            "Bury Me Here",
            "Sun Mar 12 2017",
            "La lucha por el control de los territorios continúa, y las decisiones difíciles amenazan con fracturar al grupo."
        ), Episode(
            "E14",
            "The Other Side",
            "Sun Mar 19 2017",
            "Maggie y Sasha luchan por sobrevivir mientras enfrentan los horrores de la guerra. La situación se intensifica a medida que se acercan al enfrentamiento final."
        ), Episode(
            "E15",
            "Something They Need",
            "Sun Mar 26 2017",
            "Rick y su grupo enfrentan nuevas amenazas mientras se acercan a la confrontación final. La guerra está cerca de comenzar."
        ), Episode(
            "E16",
            "The First Day of the Rest of Your Life",
            "Sun Apr 2 2017",
            "La temporada culmina en un enfrentamiento épico cuando Rick y su grupo luchan por su libertad en una guerra total contra los Salvadores."
        )
    )
    private val season8Episodes = listOf(
        Episode(
            "E1",
            "Mercy",
            "Sun Oct 22 2017",
            "Rick y su grupo lanzan su guerra contra Negan, pero las consecuencias son inmediatas. La lucha por la supervivencia se intensifica en un nuevo nivel."
        ), Episode(
            "E2",
            "The Damned",
            "Sun Oct 29 2017",
            "El grupo se enfrenta a nuevos obstáculos mientras intentan derrotar a los Salvadores. Las decisiones difíciles se hacen más frecuentes."
        ), Episode(
            "E3",
            "Monsters",
            "Sun Nov 5 2017",
            "El conflicto con los Salvadores sigue, pero el grupo comienza a sufrir las consecuencias de sus decisiones. La guerra no es tan fácil como pensaban."
        ), Episode(
            "E4",
            "Some Guy",
            "Sun Nov 12 2017",
            "El grupo de Rick avanza en su lucha contra los Salvadores, pero las pérdidas son grandes. La guerra continúa."
        ), Episode(
            "E5",
            "The Big Scary U",
            "Sun Nov 19 2017",
            "La lucha continúa mientras el grupo se enfrenta a nuevos desafíos. La moral del grupo se pone a prueba mientras las pérdidas aumentan."
        ), Episode(
            "E6",
            "The King, the Widow, and Rick",
            "Sun Nov 26 2017",
            "Rick y los demás se preparan para la batalla final. Mientras tanto, las lealtades se ponen en duda."
        ), Episode(
            "E7",
            "Time for After",
            "Sun Dec 3 2017",
            "El grupo da un paso más en su lucha, pero las consecuencias son graves y las tensiones aumentan."
        ), Episode(
            "E8",
            "How It's Gotta Be",
            "Sun Dec 10 2017",
            "La temporada culmina en una batalla épica, donde las decisiones de Rick pondrán en juego la vida de todos."
        ), Episode(
            "E9",
            "Honor",
            "Sun Feb 25 2018",
            "La lucha por la supervivencia continúa mientras el grupo enfrenta nuevas pérdidas y desafíos."
        ), Episode(
            "E10",
            "The Lost and the Plunderers",
            "Sun Mar 4 2018",
            "Rick y el grupo intentan seguir adelante mientras enfrentan traiciones y amenazas."
        ), Episode(
            "E11",
            "Dead or Alive Or",
            "Sun Mar 11 2018",
            "La lucha por la supervivencia nunca fue tan difícil. La guerra alcanza nuevos niveles de intensidad."
        ), Episode(
            "E12",
            "The Key",
            "Sun Mar 18 2018",
            "Rick y su grupo se enfrentan a nuevos enemigos mientras siguen luchando por su supervivencia."
        ), Episode(
            "E13",
            "Do Not Send Us Astray",
            "Sun Mar 25 2018",
            "La tensión crece mientras Rick y su grupo intentan encontrar una manera de ganar la guerra contra los Salvadores."
        ), Episode(
            "E14",
            "Still Gotta Mean Something",
            "Sun Apr 1 2018",
            "La guerra continúa, pero la esperanza parece perdida para algunos miembros del grupo."
        ), Episode(
            "E15",
            "Worth",
            "Sun Apr 8 2018",
            "Rick toma una decisión crucial que afectará el curso de la guerra contra los Salvadores."
        ), Episode(
            "E16",
            "Wrath",
            "Sun Apr 15 2018",
            "La temporada culmina en un enfrentamiento épico en el que Rick y su grupo luchan por la supervivencia."
        )
    )
    private val season9Episodes = listOf(
        Episode(
            "E1",
            "A New Beginning",
            "Sun Oct 7 2018",
            "Rick y su grupo comienzan un nuevo capítulo en sus vidas después de la guerra con los Salvadores. Sin embargo, los nuevos desafíos y amenazas comienzan a surgir."
        ), Episode(
            "E2",
            "The Bridge",
            "Sun Oct 14 2018",
            "El grupo enfrenta dificultades para reconstruir la sociedad, mientras que el peligro acecha a sus puertas."
        ), Episode(
            "E3",
            "Warning Signs",
            "Sun Oct 21 2018",
            "La paz recién encontrada se ve amenazada por un grupo de forasteros y por la violencia que persiste en el mundo."
        ), Episode(
            "E4",
            "The Obliged",
            "Sun Oct 28 2018",
            "Las decisiones difíciles ponen a prueba la moral del grupo mientras continúan enfrentando amenazas."
        ), Episode(
            "E5",
            "What Comes After",
            "Sun Nov 4 2018",
            "La vida en el nuevo mundo se ve marcada por pérdidas y sacrificios, pero la lucha por la supervivencia sigue siendo lo principal."
        ), Episode(
            "E6",
            "Who Are You Now?",
            "Sun Nov 11 2018",
            "La historia de algunos miembros del grupo se desarrolla mientras el mundo sigue cambiando y nuevos retos se presentan."
        ), Episode(
            "E7",
            "Stradivarius",
            "Sun Nov 18 2018",
            "La vida fuera de la comunidad pone a prueba la unidad del grupo. Las tensiones internas se incrementan."
        ), Episode(
            "E8",
            "The Battle",
            "Sun Nov 25 2018",
            "La batalla por la supervivencia llega a un punto crucial, y las decisiones de los personajes definirán su futuro."
        )
    )
    private val season10Episodes = listOf(
        Episode(
            "E1",
            "Lines We Cross",
            "Sun Oct 6 2019",
            "El grupo sigue enfrentando las amenazas del mundo exterior, mientras que las tensiones internas dentro de la comunidad aumentan."
        ), Episode(
            "E2",
            "We Are the End of the World",
            "Sun Oct 13 2019",
            "Un vistazo al pasado de Alpha y Beta, mientras que Rick y el grupo se preparan para las futuras amenazas que se avecinan."
        ), Episode(
            "E3",
            "Ghosts",
            "Sun Oct 20 2019",
            "La situación se intensifica cuando el grupo enfrenta nuevos problemas. La búsqueda de respuestas y de seguridad se convierte en una lucha constante."
        ), Episode(
            "E4",
            "Silence the Whisperers",
            "Sun Oct 27 2019",
            "La batalla con los Susurradores se intensifica, y el grupo se ve obligado a tomar decisiones difíciles para proteger su hogar."
        ), Episode(
            "E5",
            "What It Always Is",
            "Sun Nov 3 2019",
            "Las tensiones dentro del grupo alcanzan un punto crítico, mientras la batalla contra los Susurradores se intensifica."
        ), Episode(
            "E6",
            "Bonds",
            "Sun Nov 10 2019",
            "Las relaciones entre los miembros del grupo se ponen a prueba, mientras nuevas amenazas acechan desde las sombras."
        ), Episode(
            "E7",
            "Open Your Eyes",
            "Sun Nov 17 2019",
            "Un miembro del grupo se enfrenta a un desafío difícil, y el conflicto con los Susurradores llega a nuevas alturas."
        ), Episode(
            "E8",
            "The World Before",
            "Sun Nov 24 2019",
            "El grupo se enfrenta a decisiones que cambiarán sus vidas para siempre, mientras tratan de sobrevivir en un mundo cada vez más peligroso."
        ), Episode(
            "E9",
            "Squeeze",
            "Sun Feb 23 2020",
            "La guerra contra los Susurradores alcanza su punto álgido, mientras los personajes luchan por sus vidas en medio de un enfrentamiento brutal."
        ), Episode(
            "E10",
            "Stalker",
            "Sun Mar 1 2020",
            "La presión de la guerra pone al grupo a prueba, mientras nuevos desafíos surgen con los Susurradores."
        ), Episode(
            "E11",
            "Morning Star",
            "Sun Mar 8 2020",
            "La batalla por el futuro del grupo se intensifica mientras el grupo lucha por tomar el control de su destino."
        ), Episode(
            "E12",
            "Walk with Us",
            "Sun Mar 15 2020",
            "La lucha por la supervivencia llega a un nuevo nivel mientras los Susurradores y el grupo enfrentan el peor de los conflictos."
        ), Episode(
            "E13",
            "What We Become",
            "Sun Mar 22 2020",
            "La guerra continúa mientras los personajes luchan por mantener su humanidad y su moral en un mundo que cada vez es más sombrío."
        ), Episode(
            "E14",
            "Look at the Flowers",
            "Sun Mar 29 2020",
            "El enfrentamiento final con los Susurradores llega a un punto crítico, y las decisiones difíciles deben tomarse para asegurar la supervivencia."
        ), Episode(
            "E15",
            "The Tower",
            "Sun Apr 5 2020",
            "La situación se agrava cuando los personajes enfrentan amenazas externas y desafíos dentro de su propio grupo."
        ), Episode(
            "E16",
            "A Certain Doom",
            "Sun Apr 12 2020",
            "La temporada culmina en una batalla épica en la que los personajes luchan por mantener la esperanza en un mundo que parece haberla perdido."
        )
    )
    private val season11Episodes = listOf(
        Episode(
            "E1",
            "Acheron: Part I",
            "Sun Aug 22 2021",
            "El grupo se embarca en un peligroso viaje para encontrar recursos esenciales, mientras enfrentan viejos fantasmas y nuevas amenazas."
        ),
        Episode(
            "E2",
            "Acheron: Part II",
            "Sun Aug 29 2021",
            "El grupo continúa enfrentando desafíos mientras luchan por sobrevivir en un mundo cada vez más peligroso."
        ),
        Episode(
            "E3",
            "Hunted",
            "Sun Sep 5 2021",
            "La situación empeora cuando el grupo es atacado por nuevas amenazas, y la lucha por la supervivencia alcanza nuevos niveles de desesperación."
        ),
        Episode(
            "E4",
            "Rendition",
            "Sun Sep 12 2021",
            "Los miembros del grupo se enfrentan a nuevas realidades y amenazas mientras luchan por encontrar un lugar seguro."
        ),
        Episode(
            "E5",
            "Out of the Ashes",
            "Sun Sep 19 2021",
            "Las tensiones dentro del grupo crecen mientras enfrentan nuevos desafíos en su lucha por sobrevivir."
        ),
        Episode(
            "E6",
            "On the Inside",
            "Sun Sep 26 2021",
            "La lucha por la supervivencia se vuelve aún más complicada mientras los miembros del grupo luchan por mantenerse unidos frente a las adversidades."
        ),
        Episode(
            "E7",
            "Promises Broken",
            "Sun Oct 3 2021",
            "Las promesas se rompen, y los personajes deben hacer frente a las difíciles decisiones que conlleva la vida en este nuevo mundo."
        ),
        Episode(
            "E8",
            "The World We Knew",
            "Sun Oct 10 2021",
            "El grupo se enfrenta a desafíos que pondrán a prueba su fortaleza mental y emocional mientras luchan por encontrar la paz."
        ),
        Episode(
            "E9",
            "No Way Out",
            "Sun Oct 17 2021",
            "El grupo llega a un punto de no retorno mientras enfrentan una amenaza mortal. Las tensiones dentro del grupo se hacen insostenibles."
        ),
        Episode(
            "E10",
            "The Beginning of the End",
            "Sun Oct 24 2021",
            "Los sobrevivientes se enfrentan a las consecuencias de sus decisiones mientras buscan un nuevo comienzo en un mundo devastado."
        ),
        Episode(
            "E11",
            "We Stand Together",
            "Sun Oct 31 2021",
            "La temporada culmina en una batalla por la supervivencia, donde los personajes luchan para mantener lo que queda de la humanidad."
        ),
        Episode(
            "E12",
            "The Final Stand",
            "Sun Nov 7 2021",
            "La serie llega a su cierre con un enfrentamiento épico, mientras los sobrevivientes se enfrentan a su destino final."
        )
    )

    private val seasonsMock = listOf(
        Season("S1", "Temporada 1", episodes),
        Season("S2", "Temporada 2", season2Episodes),
        Season("S3", "Temporada 3", season3Episodes),
        Season("S4", "Temporada 4", season4Episodes),
        Season("S5", "Temporada 5", season5Episodes),
        Season("S6", "Temporada 6", season6Episodes),
        Season("S7", "Temporada 7", season7Episodes),
        Season("S8", "Temporada 8", season8Episodes),
        Season("S9", "Temporada 9", season9Episodes),
        Season("S10", "Temporada 10", season10Episodes),
        Season("S11", "Temporada 11", season11Episodes),
    )

    private val seasonsMock2 = listOf(
        Season("S1", "Temporada 1", episodes)
    )

    private val seasonsMock3 = listOf(
        Season("S1", "Temporada 1", episodes)
    )

    private val series = listOf(
        Serie(
            "02",
            "The Walking Dead",
            "2010",
            "E.E.U.U.",
            "The Walkind Dead está ambientada en un futuro postapocaliptico con la Tierra devastada por el efecto de un cataclismo, que ha provocado la mutación de zombies de la mayor parte de los habitantes del planeta. La serie, explora las dificultades de los protagonistas para sobrevivir en un mundo poblado por el horror, así com las relacciones personales que se establecen entre ellos, en ocasiones también una amenaza para su supervivencia.",
            seasonsMock,
            "https://th.bing.com/th/id/OIP.Z4ZsYFMdPY7CYsNBRgvk9AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.4",
            false
        ), Serie(
            "03",
            "Stranger Things",

            "2015",
            "E.E.U.U.",
            "+18",
            seasonsMock3,
            "https://th.bing.com/th/id/OIP.3C9NaO9TQ16LKgs0WVUPIgHaK9?w=205&h=304&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
            "8.0",
            false
        ), Serie(
            "04",
            "Arcane",

            "2020",
            "E.E.U.U.",
            "+18",
            seasonsMock2,
            "https://th.bing.com/th/id/OIP.7m43hGDVESVKrMvcokXI3AHaJl?w=186&h=241&c=7&r=0&o=5&pid=1.7",
            "9.6",
            false
        ), Serie(
            "05",
            "Atack on Titan",

            "2020",
            "E.E.U.U.",
            "+18",
            seasonsMock3,
            "https://th.bing.com/th/id/OIP.Vk7QJI4mhETuDF8a6TF08wHaKf?w=203&h=287&c=7&r=0&o=5&pid=1.7",
            "9.0",
            false
        ), Serie(
            "06",
            "The Punisher",

            "2018",
            "E.E.U.U.",
            "+15",
            seasonsMock2,
            "https://th.bing.com/th/id/OIP.G72jUGarVeiY9dMZVten-AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.6",
            false
        ), Serie(
            "07",
            "The Walking Dead",

            "2010",
            "E.E.U.U.",
            "+18",
            seasonsMock3,
            "https://th.bing.com/th/id/OIP.Z4ZsYFMdPY7CYsNBRgvk9AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.4",
            false
        ), Serie(
            "08",
            "Stranger Things",

            "2015",
            "E.E.U.U.",
            "+18",
            seasonsMock2,
            "https://th.bing.com/th/id/OIP.3C9NaO9TQ16LKgs0WVUPIgHaK9?w=205&h=304&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
            "8.0",
            false
        ), Serie(
            "09",
            "Arcane",

            "2020",
            "E.E.U.U.",
            "+18",
            seasonsMock2,
            "https://th.bing.com/th/id/OIP.7m43hGDVESVKrMvcokXI3AHaJl?w=186&h=241&c=7&r=0&o=5&pid=1.7",
            "9.6",
            false
        ), Serie(
            "10",
            "Atack on Titan",

            "2025",
            "E.E.U.U.",
            "+18",
            seasonsMock2,
            "https://th.bing.com/th/id/OIP.Vk7QJI4mhETuDF8a6TF08wHaKf?w=203&h=287&c=7&r=0&o=5&pid=1.7",
            "9.0",
            false
        ), Serie(
            "11",
            "The Punisher",

            "2018",
            "E.E.U.U.",
            "+15",
            seasonsMock3,
            "https://th.bing.com/th/id/OIP.G72jUGarVeiY9dMZVten-AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.6",
            false
        ), Serie(
            "12",
            "The Walking Dead",

            "2010",
            "E.E.U.U.",
            "+18",
            seasonsMock3,
            "https://th.bing.com/th/id/OIP.Z4ZsYFMdPY7CYsNBRgvk9AHaLH?w=203&h=304&c=7&r=0&o=5&pid=1.7",
            "8.4",
            false
        ), Serie(
            "13",
            "Stranger Things",

            "2015",
            "E.E.U.U.",
            "+18",
            seasonsMock2,
            "https://th.bing.com/th/id/OIP.3C9NaO9TQ16LKgs0WVUPIgHaK9?w=205&h=304&c=8&rs=1&qlt=90&o=6&pid=3.1&rm=2",
            "8.0",
            false
        ), Serie(
            "14",
            "Arcane",

            "2025",
            "E.E.U.U.",
            "+18",
            seasonsMock3,
            "https://th.bing.com/th/id/OIP.7m43hGDVESVKrMvcokXI3AHaJl?w=186&h=241&c=7&r=0&o=5&pid=1.7",
            "9.6",
            false
        ), Serie(
            "15",
            "Atack on Titan",

            "2020",
            "E.E.U.U.",
            "+18",
            seasonsMock2,
            "https://th.bing.com/th/id/OIP.Vk7QJI4mhETuDF8a6TF08wHaKf?w=203&h=287&c=7&r=0&o=5&pid=1.7",
            "9.0",
            false
        )
    )


    fun getSeries(): List<Serie> {
        return series
    }

    fun getSerieById(serieId: String): Serie? {
        return series.find { it.id == serieId }
    }

}