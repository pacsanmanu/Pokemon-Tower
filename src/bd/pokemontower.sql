-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-05-2023 a las 14:00:53
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pokemontower`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movement`
--

CREATE TABLE `movement` (
  `name` varchar(50) NOT NULL,
  `power` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `movement`
--

INSERT INTO `movement` (`name`, `power`) VALUES
('a bocajarro', 120),
('aerochorro', 100),
('ascuas', 45),
('ataque ala', 60),
('ataque sombrio', 120),
('avalancha', 90),
('bofeton lodo', 40),
('bola sombra', 80),
('bomba lodo', 90),
('brecha negra', 130),
('brillo magico', 80),
('chispazo', 80),
('colmillo veneno', 65),
('cometa draco', 150),
('confusion', 55),
('cortefuria', 50),
('cuchillada', 70),
('disparo demora', 0),
('dragoaliento', 65),
('enfado', 120),
('envite igneo', 120),
('esfera aural', 80),
('foco resplandor', 80),
('fuegosagrado', 120),
('fuerza lunar', 90),
('garra dragon', 80),
('garra metal', 55),
('golpe cuerpo', 80),
('golpe karate', 75),
('hidrobomba', 120),
('hoja afilada', 55),
('hoja aguda', 90),
('impactrueno', 40),
('lanzallamas', 95),
('latigo cepa', 45),
('lluevehojas', 140),
('mordisco', 60),
('onda mental', 120),
('picotazo veneno', 30),
('pirotecnia', 70),
('pisoton', 65),
('pistola agua', 45),
('placaje', 40),
('psicoataque', 150),
('psiquico', 90),
('pulso dragon', 90),
('pulso umbrio', 80),
('puño hielo', 75),
('puño sombra', 75),
('puya nociva', 80),
('rayo', 90),
('rayo burbuja', 60),
('rayo hielo', 95),
('residuos', 65),
('surf', 95),
('terratemblor', 65),
('terremoto', 100),
('tijera x', 80),
('tornado', 40),
('triturar', 80),
('ultrapuño', 40),
('vendaval', 130),
('ventisca', 120),
('viento plata', 70),
('voltio cruel', 120),
('voz cautivadora', 40),
('vuelo', 90);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pokemon`
--

CREATE TABLE `pokemon` (
  `name` varchar(30) NOT NULL,
  `atack` int(11) NOT NULL,
  `life` int(11) NOT NULL,
  `speed` int(11) NOT NULL,
  `image` varchar(75) NOT NULL,
  `power` int(11) NOT NULL,
  `evolution` varchar(45) DEFAULT NULL,
  `movement1` varchar(45) NOT NULL,
  `movement2` varchar(45) CHARACTER SET armscii8 COLLATE armscii8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pokemon`
--

INSERT INTO `pokemon` (`name`, `atack`, `life`, `speed`, `image`, `power`, `evolution`, `movement1`, `movement2`) VALUES
('aerodactyl', 105, 80, 130, 'images/aerodactyl.png', 8, NULL, 'vuelo', 'avalancha'),
('alakazam', 135, 90, 120, 'images/alakazam.png', 8, NULL, 'psiquico', 'onda mental'),
('bagon', 75, 60, 50, 'images/bagon.png', 4, 'shelgon', 'placaje', 'dragoaliento'),
('bayleef', 63, 80, 60, 'images/bayleef.png', 0, 'meganium', 'pisoton', 'hoja afilada'),
('beedrill', 90, 65, 75, 'images/beedrill.png', 0, NULL, 'puya nociva', 'cortefuria'),
('beldum', 55, 80, 30, 'images/beldum.png', 4, 'metang', 'placaje', 'garra metal'),
('blastoise', 83, 100, 78, 'images/blastoise.png', 0, NULL, 'hidrobomba', 'triturar'),
('blaziken', 120, 80, 80, 'images/blaziken.png', 0, NULL, 'a bocajarro', 'lanzallamas'),
('bulbasaur', 55, 59, 45, 'images/bulbasaur.png', 0, 'ivysaur', 'placaje', 'latigo cepa'),
('butterfree', 45, 50, 70, 'images/butterfree.png', 0, NULL, 'viento plata', 'vendaval'),
('caterpie', 45, 30, 45, 'images/caterpie.png', 1, 'metapod', 'placaje', 'disparo demora'),
('charizard', 109, 85, 100, 'images/charizard.png', 0, NULL, 'lanzallamas', 'vendaval'),
('charmander', 60, 50, 65, 'images/charmander.png', 0, 'charmeleon', 'placaje', 'ascuas'),
('charmeleon', 64, 58, 80, 'images/charmeleon.png', 0, 'charizard', 'mordisco', 'pirotecnia'),
('chikorita', 49, 65, 45, 'images/chikorita.png', 3, 'bayleef', 'placaje', 'latigo cepa'),
('chimchar', 58, 44, 61, 'images/chimchar.png', 3, 'monferno', 'placaje', 'ascuas'),
('combusken', 85, 60, 55, 'images/combusken.png', 0, 'blaziken', 'ultrapuño', 'pirotecnia'),
('crobat', 90, 85, 130, 'images/crobat.png', 0, NULL, 'vuelo', 'bomba lodo'),
('croconaw', 80, 80, 58, 'images/croconaw.png', 0, 'feraligatr', 'mordisco', 'rayo burbuja'),
('cyndaquil', 60, 50, 65, 'images/cyndaquil.png', 3, 'quilava', 'placaje', 'ascuas'),
('darkrai', 135, 90, 125, 'images/darkrai.png', 10, NULL, 'pulso umbrio', 'brecha negra'),
('darmanitan', 140, 105, 95, 'images/darmanitan.png', 7, NULL, 'a bocajarro', 'envite igneo'),
('dewott', 83, 75, 60, 'images/dewott.png', 6, 'samurott', 'golpe karate', 'rayo burbuja'),
('donphan', 120, 120, 50, 'images/donphan.png', 5, NULL, 'terremoto', 'foco resplandor'),
('dragonair', 84, 70, 70, 'images/dragonair.png', 0, 'dragonite', 'rayo burbuja', 'pulso dragon'),
('dragonite', 134, 100, 80, 'images/dragonite.png', 9, NULL, 'vuelo', 'enfado'),
('dratini', 64, 50, 50, 'images/dratini.png', 4, 'dragonair', 'placaje', 'dragoaliento'),
('electabuzz', 95, 85, 105, 'images/electabuzz.png', 0, 'electivire', 'impactrueno', 'chispazo'),
('electivire', 123, 85, 95, 'images/electivire.png', 0, NULL, 'rayo', 'voltio cruel'),
('elekid', 65, 55, 95, 'images/elekid.png', 4, 'electabuzz', 'placaje', 'impactrueno'),
('emboar', 123, 100, 65, 'images/emboar.png', 0, NULL, 'a bocajarro', 'envite igneo'),
('empoleon', 111, 101, 60, 'images/empoleon.png', 0, NULL, 'foco resplandor', 'hidrobomba'),
('falete', 500, 150, 1, 'images/falete.png', 12, 'null', 'golpe cuerpo', 'terremoto'),
('fearow', 90, 65, 100, 'images/fearow.png', 5, NULL, 'vuelo', 'vendaval'),
('feraligatr', 105, 105, 80, 'images/feraligatr.png', 0, NULL, 'triturar', 'hidrobomba'),
('flygon', 100, 80, 100, 'images/flygon.png', 8, NULL, 'terremoto', 'enfado'),
('froslass', 80, 70, 110, 'images/froslass.png', 7, NULL, 'ventisca', 'bola sombra'),
('galvantula', 97, 70, 108, 'images/galvantula.png', 7, NULL, 'tijera x', 'rayo'),
('garchomp', 103, 108, 102, 'images/garchomp.png', 9, NULL, 'terremoto', 'enfado'),
('gardevoir', 125, 115, 80, 'images/gardevoir.png', 0, NULL, 'psiquico', 'fuerza lunar'),
('gengar', 75, 55, 83, 'images/gengar.png', 8, NULL, 'bomba lodo', 'bola sombra'),
('giratina', 100, 150, 90, 'images/giratina.png', 10, NULL, 'enfado', 'ataque sombrio'),
('golbat', 80, 75, 90, 'images/golbat.png', 4, 'crobat', 'ataque ala', 'colmillo veneno'),
('grotle', 89, 85, 36, 'images/grotle.png', 0, 'torterra', 'terratemblor', 'hoja afilada'),
('groudon', 150, 140, 90, 'images/groudon.png', 10, NULL, 'terremoto', 'envite igneo'),
('grovyle', 85, 65, 95, 'images/grovyle.png', 0, 'sceptile', 'cuchillada', 'hoja afilada'),
('hariyama', 120, 144, 50, 'images/hariyama.png', 7, NULL, 'a bocajarro', 'golpe cuerpo'),
('haunter', 95, 65, 115, 'images/haunter.png', 5, 'gengar', 'residuos', 'pu?o sombra'),
('haxorus', 147, 90, 97, 'images/haxorus.png', 8, NULL, 'enfado', 'garra dragon'),
('ho-oh', 130, 154, 90, 'images/ho-oh.png', 10, NULL, 'fuegosagrado', 'vendaval'),
('hydreigon', 135, 92, 105, 'images/hydreigon.png', 9, NULL, 'pulso umbrio', 'enfado'),
('infernape', 104, 76, 108, 'images/infernape.png', 0, NULL, 'a bocajarro', 'lanzallamas'),
('ivysaur', 80, 80, 60, 'images/ivysaur.png', 0, 'venusaur', 'hoja afilada', 'residuos'),
('joaquin', 1, 2, 1, 'images/joaquin.png', 12, 'null', 'placaje', 'retirarse'),
('kadabra', 120, 70, 105, 'images/kadabra.png', 6, 'alakazam', 'psiquico', 'fuerza lunar'),
('kakuna', 25, 50, 35, 'images/kakuna.png', 0, 'beedrill', 'placaje', 'cortefuria'),
('kirlia', 65, 55, 50, 'images/kirlia.png', 0, 'gardevoir', 'brillo magico', 'confusion'),
('krookodile', 117, 95, 92, 'images/krookodile.png', 8, NULL, 'triturar', 'terremoto'),
('kyogre', 150, 140, 90, 'images/kyogre.png', 10, NULL, 'hidrobomba', 'ventisca'),
('lapras', 85, 130, 60, 'images/lapras.png', 8, NULL, 'hidrobomba', 'ventisca'),
('lombre', 60, 70, 50, 'images/lombre.png', 0, 'ludicolo', 'hoja afilada', 'rayo burbuja'),
('lotad', 40, 50, 30, 'images/lotad.png', 2, 'lombre', 'latigo cepa', 'pistola agua'),
('lucario', 115, 70, 90, 'images/lucario.png', 0, NULL, 'esfera aural', 'foco resplandor'),
('ludicolo', 90, 100, 70, 'images/ludicolo.png', 0, NULL, 'lluevehojas', 'hidrobomba'),
('lugia', 90, 154, 110, 'images/lugia.png', 10, NULL, 'aerochorro', 'onda mental'),
('machamp', 130, 90, 55, 'images/machamp.png', 0, NULL, 'terremoto', 'a bocajarro'),
('machoke', 100, 80, 45, 'images/machoke.png', 0, 'machamp', 'golpe karate', 'golpe cuerpo'),
('machop', 80, 70, 35, 'images/machop.png', 4, 'machoke', 'placaje', 'ultrapu?o'),
('magby', 75, 55, 83, 'images/magby.png', 4, 'magmar', 'placaje', 'ascuas'),
('magmar', 100, 85, 93, 'images/magmar.png', 0, 'magmortar', 'residuos', 'pirotecnia'),
('magmortar', 125, 95, 83, 'images/magmortar.png', 0, NULL, 'bomba lodo', 'lanzallamas'),
('marshtomp', 85, 70, 50, 'images/marshtomp.png', 0, 'swampert', 'terratemblor', 'rayo burbuja'),
('Mega Aerodactyl', 180, 160, 100, 'images/mega-aerodactyl.png', 11, NULL, 'vendaval', 'avalancha'),
('Mega Alakazam', 200, 110, 170, 'images/mega-alakazam.png', 11, NULL, 'psicoataque', 'onda mental'),
('Mega Blastoise', 130, 220, 80, 'images/mega-blastoise.png', 11, NULL, 'hidrobomba', 'rayo hielo'),
('Mega Blaziken', 150, 140, 200, 'images/mega-blaziken.png', 11, NULL, 'a bocajarro', 'envite igneo'),
('Mega Charizard X', 200, 140, 120, 'images/mega-charizardx.png', 11, NULL, 'cometa draco', 'fuegosagrado'),
('Mega Charizard Y', 170, 160, 120, 'images/mega-charizardy.png', 11, NULL, 'vendaval', 'fuegosagrado'),
('Mega Garchomp', 180, 180, 140, 'images/mega-garchomp.png', 11, NULL, 'terremoto', 'enfado'),
('Mega Gengar', 180, 130, 130, 'images/mega-gengar.png', 11, NULL, 'ataque sombrio', 'brecha negra'),
('Mega Gyarados', 180, 130, 150, 'images/mega-gyarados.png', 11, NULL, 'enfado', 'hidrobomba'),
('Mega Metagross', 170, 200, 110, 'images/mega-metagross.png', 11, NULL, 'a bocajarro', 'onda mental'),
('Mega Mewtwo', 220, 140, 150, 'images/mega-mewtwo.png', 11, NULL, 'psicoataque', 'onda mental'),
('Mega Salamence', 190, 170, 130, 'images/mega-salamence.png', 11, NULL, 'vendaval', 'cometa draco'),
('Mega Swampert', 150, 200, 120, 'images/mega-swampert.png', 11, NULL, 'hidrobomba', 'terremoto'),
('Mega Tyranitar', 170, 170, 100, 'images/mega-tyranitar.png', 11, NULL, 'enfado', 'terremoto'),
('Mega Venusaur', 180, 180, 100, 'images/mega-venusaur.png', 11, NULL, 'lluevehojas', 'bomba lodo'),
('meganium', 82, 100, 80, 'images/meganium.png', 0, NULL, 'golpe cuerpo', 'lluevehojas'),
('metagross', 135, 130, 70, 'images/metagross.png', 9, NULL, 'psiquico', 'foco resplandor'),
('metang', 75, 100, 50, 'images/metang.png', 0, 'metagross', 'golpe cuerpo', 'garra metal'),
('metapod', 20, 55, 30, 'images/metapod.png', 0, 'butterfree', 'placaje', 'cortefuria'),
('mewtwo', 154, 106, 110, 'images/mewtwo.png', 10, NULL, 'onda mental', 'psicoataque'),
('mightyena', 90, 70, 70, 'images/mightyena.png', 0, NULL, 'pisoton', 'triturar'),
('monferno', 78, 64, 81, 'images/monferno.png', 0, 'infernape', 'ultrapuño', 'pirotecnia'),
('mudkip', 70, 50, 40, 'images/mudkip.png', 3, 'marshtomp', 'bofeton lodo', 'pistola agua'),
('nidoking', 102, 81, 85, 'images/nidoking.png', 0, NULL, 'terremoto', 'puya nociva'),
('nidoqueen', 92, 87, 76, 'images/nidoqueen.png', 0, NULL, 'terremoto', 'puya nociva'),
('nidoran_f', 47, 52, 41, 'images/nidoran_f.png', 1, 'nidorina', 'placaje', 'picotazo veneno'),
('nidoran_m', 57, 40, 50, 'images/nidoran_m.png', 1, 'nidorino', 'placaje', 'picotazo veneno'),
('nidorina', 62, 67, 56, 'images/nidorina.png', 0, 'nidoqueen', 'placaje', 'colmillo veneno'),
('nidorino', 72, 61, 65, 'images/nidorino.png', 4, 'nidoking', 'mordisco', 'colmillo veneno'),
('pidgeot', 80, 75, 101, 'images/pidgeot.png', 0, NULL, 'cuchillada', 'vuelo'),
('pidgeotto', 60, 63, 71, 'images/pidgeotto.png', 5, 'pidgeot', 'ataque ala', 'cuchillada'),
('pidgey', 45, 40, 56, 'images/pidgey.png', 1, 'pidgeotto', 'placaje', 'tornado'),
('pignite', 93, 90, 65, 'images/pignite.png', 6, 'emboar', 'golpe karate', 'pirotecnia'),
('pikachu', 45, 40, 90, 'images/pikachu.png', 1, 'raichu', 'placaje', 'impactrueno'),
('piplup', 61, 56, 40, 'images/piplup.png', 3, 'prinplup', 'placaje', 'pistola agua'),
('poochyena', 55, 35, 35, 'images/poochyena.png', 1, 'mightyena', 'placaje', 'mordisco'),
('prinplup', 81, 76, 50, 'images/prinplup.png', 0, 'empoleon', 'garra metal', 'rayo burbuja'),
('quilava', 80, 65, 80, 'images/quilava.png', 0, 'typhlosion', 'pisoton', 'pirotecnia'),
('raichu', 90, 55, 110, 'images/raichu.png', 0, NULL, 'placaje', 'rayo'),
('ralts', 45, 35, 40, 'images/ralts.png', 2, 'kirlia', 'voz cautivadora', 'confusion'),
('raticate', 81, 60, 97, 'images/raticate.png', 0, NULL, 'cuchillada', 'triturar'),
('rattata', 56, 35, 72, 'images/rattata.png', 1, 'raticate', 'placaje', 'mordisco'),
('rayquaza', 150, 140, 95, 'images/rayquaza.png', 10, NULL, 'vendaval', 'cometa draco'),
('rhyperior', 140, 130, 40, 'images/rhyperior.png', 8, NULL, 'terremoto', 'avalancha'),
('riolu', 70, 40, 60, 'images/riolu.png', 2, 'lucario', 'ultrapuño', 'placaje'),
('roserade', 125, 105, 90, 'images/roserade.png', 5, NULL, 'bomba lodo', 'lluevehojas'),
('salamence', 135, 95, 100, 'images/salamence.png', 9, NULL, 'vuelo', 'enfado'),
('samurott', 108, 95, 70, 'images/samurott.png', 0, NULL, 'hidrobomba', 'a bocajarro'),
('sandshrew', 40, 60, 50, 'images/sandshrew.png', 2, 'sandslash', 'bofeton lodo', 'placaje'),
('sandslash', 100, 110, 65, 'images/sandslash.png', 0, NULL, 'terremoto', 'cuchillada'),
('sceptile', 105, 85, 120, 'images/sceptile.png', 0, NULL, 'tijera x', 'lluevehojas'),
('sealeo', 75, 90, 45, 'images/sealeo.png', 5, 'walrein', 'surf', 'rayo hielo'),
('serperior', 75, 95, 113, 'images/serperior.png', 0, NULL, 'golpe cuerpo', 'lluevehojas'),
('servine', 60, 75, 83, 'images/servine.png', 6, 'serperior', 'hoja afilada', 'pisoton'),
('sharpedo', 120, 70, 95, 'images/sharpedo.png', 7, NULL, 'surf', 'triturar'),
('shelgon', 95, 100, 50, 'images/shelgon.png', 0, 'salamence', 'golpe cuerpo', 'garra dragon'),
('shiftry', 100, 90, 80, 'images/shiftry.png', 7, NULL, 'hoja aguda', 'triturar'),
('spiritomb', 98, 108, 35, 'images/spiritomb.png', 8, NULL, 'bola sombra', 'pulso umbrio'),
('squirtle', 48, 65, 43, 'images/squirtle.png', 0, 'wartortle', 'placaje', 'pistola agua'),
('starmie', 100, 85, 115, 'images/starmie.png', 0, NULL, 'hidrobomba', 'psiquico'),
('staryu', 70, 55, 85, 'images/staryu.png', 2, 'starmie', 'pistola agua', 'confusion'),
('swampert', 110, 90, 60, 'images/swampert.png', 0, NULL, 'terremoto', 'hidrobomba'),
('torchic', 70, 50, 45, 'images/torchic.png', 3, 'combusken', 'placaje', 'ascuas'),
('torterra', 109, 105, 56, 'images/torterra.png', 0, NULL, 'terremoto', 'lluevehojas'),
('totodile', 65, 64, 43, 'images/totodile.png', 3, 'croconaw', 'placaje', 'pistola agua'),
('treecko', 65, 55, 70, 'images/treecko.png', 3, 'grovyle', 'placaje', 'latigo cepa'),
('turtwig', 68, 64, 31, 'images/turtwig.png', 3, 'grotle', 'placaje', 'latigo cepa'),
('typhlosion', 109, 85, 100, 'images/typhlosion.png', 0, NULL, 'golpe cuerpo', 'lanzallamas'),
('tyranitar', 134, 110, 61, 'images/tyranitar.png', 9, NULL, 'avalancha', 'triturar'),
('venusaur', 100, 100, 80, 'images/venusaur.png', 0, NULL, 'bomba lodo', 'lluevehojas'),
('walrein', 110, 110, 60, 'images/walrein.png', 0, NULL, 'hidrobomba', 'ventisca'),
('wartortle', 63, 80, 58, 'images/wartortle.png', 0, 'blastoise', 'mordisco', 'rayo burbuja'),
('weedle', 35, 30, 50, 'images/weedle.png', 1, 'kakuna', 'placaje', 'disparo demora'),
('zubat', 45, 40, 55, 'images/zubat.png', 2, 'golbat', 'picotazo veneno', 'mordisco');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `username` varchar(25) NOT NULL,
  `victoryNum` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`username`, `victoryNum`) VALUES
('mpacheco', NULL),
('null', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `movement`
--
ALTER TABLE `movement`
  ADD PRIMARY KEY (`name`);

--
-- Indices de la tabla `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`name`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
