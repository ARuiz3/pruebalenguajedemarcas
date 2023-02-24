import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void Test_Primos_PrimerosDosciendosNumeros() {
        assertEquals("1 es primo", true, calc.esPrimo(1));
        assertEquals("2 es primo", true, calc.esPrimo(2));
        assertEquals("3 es primo", true, calc.esPrimo(3));
        assertEquals("4 no es primo", false, calc.esPrimo(4));
        assertEquals("5 es primo", true, calc.esPrimo(5));
        assertEquals("6 no es primo", false, calc.esPrimo(6));
        assertEquals("7 es primo", true, calc.esPrimo(7));
        assertEquals("8 no es primo", false, calc.esPrimo(8));
        assertEquals("9 no es primo", false, calc.esPrimo(9));
        assertEquals("10 no es primo", false, calc.esPrimo(10));
        assertEquals("11 es primo", true, calc.esPrimo(11));
        assertEquals("12 no es primo", false, calc.esPrimo(12));
        assertEquals("13 es primo", true, calc.esPrimo(13));
        assertEquals("14 no es primo", false, calc.esPrimo(14));
        assertEquals("15 no es primo", false, calc.esPrimo(15));
        assertEquals("16 no es primo", false, calc.esPrimo(16));
        assertEquals("17 es primo", true, calc.esPrimo(17));
        assertEquals("18 no es primo", false, calc.esPrimo(18));
        assertEquals("19 es primo", true, calc.esPrimo(19));
        assertEquals("20 no es primo", false, calc.esPrimo(20));
        assertEquals("21 no es primo", false, calc.esPrimo(21));
        assertEquals("22 no es primo", false, calc.esPrimo(22));
        assertEquals("23 es primo", true, calc.esPrimo(23));
        assertEquals("24 no es primo", false, calc.esPrimo(24));
        assertEquals("25 no es primo", false, calc.esPrimo(25));
        assertEquals("26 no es primo", false, calc.esPrimo(26));
        assertEquals("27 no es primo", false, calc.esPrimo(27));
        assertEquals("28 no es primo", false, calc.esPrimo(28));
        assertEquals("29 es primo", true, calc.esPrimo(29));
        assertEquals("30 no es primo", false, calc.esPrimo(30));
        assertEquals("31 es primo", true, calc.esPrimo(31));
        assertEquals("32 no es primo", false, calc.esPrimo(32));
        assertEquals("33 no es primo", false, calc.esPrimo(33));
        assertEquals("34 no es primo", false, calc.esPrimo(34));
        assertEquals("35 no es primo", false, calc.esPrimo(35));
        assertEquals("36 no es primo", false, calc.esPrimo(36));
        assertEquals("37 es primo", true, calc.esPrimo(37));
        assertEquals("38 no es primo", false, calc.esPrimo(38));
        assertEquals("39 no es primo", false, calc.esPrimo(39));
        assertEquals("40 no es primo", false, calc.esPrimo(40));
        assertEquals("41 es primo", true, calc.esPrimo(41));
        assertEquals("42 no es primo", false, calc.esPrimo(42));
        assertEquals("43 es primo", true, calc.esPrimo(43));
        assertEquals("44 no es primo", false, calc.esPrimo(44));
        assertEquals("45 no es primo", false, calc.esPrimo(45));
        assertEquals("46 no es primo", false, calc.esPrimo(46));
        assertEquals("47 es primo", true, calc.esPrimo(47));
        assertEquals("48 no es primo", false, calc.esPrimo(48));
        assertEquals("49 no es primo", false, calc.esPrimo(49));
        assertEquals("50 no es primo", false, calc.esPrimo(50));
        assertEquals("51 no es primo", false, calc.esPrimo(51));
        assertEquals("52 no es primo", false, calc.esPrimo(52));
        assertEquals("53 es primo", true, calc.esPrimo(53));
        assertEquals("54 no es primo", false, calc.esPrimo(54));
        assertEquals("55 no es primo", false, calc.esPrimo(55));
        assertEquals("56 no es primo", false, calc.esPrimo(56));
        assertEquals("57 no es primo", false, calc.esPrimo(57));
        assertEquals("58 no es primo", false, calc.esPrimo(58));
        assertEquals("59 es primo", true, calc.esPrimo(59));
        assertEquals("60 no es primo", false, calc.esPrimo(60));
        assertEquals("61 es primo", true, calc.esPrimo(61));
        assertEquals("62 no es primo", false, calc.esPrimo(62));
        assertEquals("63 no es primo", false, calc.esPrimo(63));
        assertEquals("64 no es primo", false, calc.esPrimo(64));
        assertEquals("65 no es primo", false, calc.esPrimo(65));
        assertEquals("66 no es primo", false, calc.esPrimo(66));
        assertEquals("67 es primo", true, calc.esPrimo(67));
        assertEquals("68 no es primo", false, calc.esPrimo(68));
        assertEquals("69 no es primo", false, calc.esPrimo(69));
        assertEquals("70 no es primo", false, calc.esPrimo(70));
        assertEquals("71 es primo", true, calc.esPrimo(71));
        assertEquals("72 no es primo", false, calc.esPrimo(72));
        assertEquals("73 es primo", true, calc.esPrimo(73));
        assertEquals("74 no es primo", false, calc.esPrimo(74));
        assertEquals("75 no es primo", false, calc.esPrimo(75));
        assertEquals("76 no es primo", false, calc.esPrimo(76));
        assertEquals("77 no es primo", false, calc.esPrimo(77));
        assertEquals("78 no es primo", false, calc.esPrimo(78));
        assertEquals("79 es primo", true, calc.esPrimo(79));
        assertEquals("80 no es primo", false, calc.esPrimo(80));
        assertEquals("81 no es primo", false, calc.esPrimo(81));
        assertEquals("82 no es primo", false, calc.esPrimo(82));
        assertEquals("83 es primo", true, calc.esPrimo(83));
        assertEquals("84 no es primo", false, calc.esPrimo(84));
        assertEquals("85 no es primo", false, calc.esPrimo(85));
        assertEquals("86 no es primo", false, calc.esPrimo(86));
        assertEquals("87 no es primo", false, calc.esPrimo(87));
        assertEquals("88 no es primo", false, calc.esPrimo(88));
        assertEquals("89 es primo", true, calc.esPrimo(89));
        assertEquals("90 no es primo", false, calc.esPrimo(90));
        assertEquals("91 no es primo", false, calc.esPrimo(91));
        assertEquals("92 no es primo", false, calc.esPrimo(92));
        assertEquals("93 no es primo", false, calc.esPrimo(93));
        assertEquals("94 no es primo", false, calc.esPrimo(94));
        assertEquals("95 no es primo", false, calc.esPrimo(95));
        assertEquals("96 no es primo", false, calc.esPrimo(96));
        assertEquals("97 es primo", true, calc.esPrimo(97));
        assertEquals("98 no es primo", false, calc.esPrimo(98));
        assertEquals("99 no es primo", false, calc.esPrimo(99));
        assertEquals("100 no es primo", false, calc.esPrimo(100));
        assertEquals("101 es primo", true, calc.esPrimo(101));
        assertEquals("102 no es primo", false, calc.esPrimo(102));
        assertEquals("103 es primo", true, calc.esPrimo(103));
        assertEquals("104 no es primo", false, calc.esPrimo(104));
        assertEquals("105 no es primo", false, calc.esPrimo(105));
        assertEquals("106 no es primo", false, calc.esPrimo(106));
        assertEquals("107 es primo", true, calc.esPrimo(107));
        assertEquals("108 no es primo", false, calc.esPrimo(108));
        assertEquals("109 es primo", true, calc.esPrimo(109));
        assertEquals("110 no es primo", false, calc.esPrimo(110));
        assertEquals("111 no es primo", false, calc.esPrimo(111));
        assertEquals("112 no es primo", false, calc.esPrimo(112));
        assertEquals("113 es primo", true, calc.esPrimo(113));
        assertEquals("114 no es primo", false, calc.esPrimo(114));
        assertEquals("115 no es primo", false, calc.esPrimo(115));
        assertEquals("116 no es primo", false, calc.esPrimo(116));
        assertEquals("117 no es primo", false, calc.esPrimo(117));
        assertEquals("118 no es primo", false, calc.esPrimo(118));
        assertEquals("119 no es primo", false, calc.esPrimo(119));
        assertEquals("120 no es primo", false, calc.esPrimo(120));
        assertEquals("121 no es primo", false, calc.esPrimo(121));
        assertEquals("122 no es primo", false, calc.esPrimo(122));
        assertEquals("123 no es primo", false, calc.esPrimo(123));
        assertEquals("124 no es primo", false, calc.esPrimo(124));
        assertEquals("125 no es primo", false, calc.esPrimo(125));
        assertEquals("126 no es primo", false, calc.esPrimo(126));
        assertEquals("127 es primo", true, calc.esPrimo(127));
        assertEquals("128 no es primo", false, calc.esPrimo(128));
        assertEquals("129 no es primo", false, calc.esPrimo(129));
        assertEquals("130 no es primo", false, calc.esPrimo(130));
        assertEquals("131 es primo", true, calc.esPrimo(131));
        assertEquals("132 no es primo", false, calc.esPrimo(132));
        assertEquals("133 no es primo", false, calc.esPrimo(133));
        assertEquals("134 no es primo", false, calc.esPrimo(134));
        assertEquals("135 no es primo", false, calc.esPrimo(135));
        assertEquals("136 no es primo", false, calc.esPrimo(136));
        assertEquals("137 es primo", true, calc.esPrimo(137));
        assertEquals("138 no es primo", false, calc.esPrimo(138));
        assertEquals("139 es primo", true, calc.esPrimo(139));
        assertEquals("140 no es primo", false, calc.esPrimo(140));
        assertEquals("141 no es primo", false, calc.esPrimo(141));
        assertEquals("142 no es primo", false, calc.esPrimo(142));
        assertEquals("143 no es primo", false, calc.esPrimo(143));
        assertEquals("144 no es primo", false, calc.esPrimo(144));
        assertEquals("145 no es primo", false, calc.esPrimo(145));
        assertEquals("146 no es primo", false, calc.esPrimo(146));
        assertEquals("147 no es primo", false, calc.esPrimo(147));
        assertEquals("148 no es primo", false, calc.esPrimo(148));
        assertEquals("149 es primo", true, calc.esPrimo(149));
        assertEquals("150 no es primo", false, calc.esPrimo(150));
        assertEquals("151 es primo", true, calc.esPrimo(151));
        assertEquals("152 no es primo", false, calc.esPrimo(152));
        assertEquals("153 no es primo", false, calc.esPrimo(153));
        assertEquals("154 no es primo", false, calc.esPrimo(154));
        assertEquals("155 no es primo", false, calc.esPrimo(155));
        assertEquals("156 no es primo", false, calc.esPrimo(156));
        assertEquals("157 es primo", true, calc.esPrimo(157));
        assertEquals("158 no es primo", false, calc.esPrimo(158));
        assertEquals("159 no es primo", false, calc.esPrimo(159));
        assertEquals("160 no es primo", false, calc.esPrimo(160));
        assertEquals("161 no es primo", false, calc.esPrimo(161));
        assertEquals("162 no es primo", false, calc.esPrimo(162));
        assertEquals("163 es primo", true, calc.esPrimo(163));
        assertEquals("164 no es primo", false, calc.esPrimo(164));
        assertEquals("165 no es primo", false, calc.esPrimo(165));
        assertEquals("166 no es primo", false, calc.esPrimo(166));
        assertEquals("167 es primo", true, calc.esPrimo(167));
        assertEquals("168 no es primo", false, calc.esPrimo(168));
        assertEquals("169 no es primo", false, calc.esPrimo(169));
        assertEquals("170 no es primo", false, calc.esPrimo(170));
        assertEquals("171 no es primo", false, calc.esPrimo(171));
        assertEquals("172 no es primo", false, calc.esPrimo(172));
        assertEquals("173 es primo", true, calc.esPrimo(173));
        assertEquals("174 no es primo", false, calc.esPrimo(174));
        assertEquals("175 no es primo", false, calc.esPrimo(175));
        assertEquals("176 no es primo", false, calc.esPrimo(176));
        assertEquals("177 no es primo", false, calc.esPrimo(177));
        assertEquals("178 no es primo", false, calc.esPrimo(178));
        assertEquals("179 es primo", true, calc.esPrimo(179));
        assertEquals("180 no es primo", false, calc.esPrimo(180));
        assertEquals("181 es primo", true, calc.esPrimo(181));
        assertEquals("182 no es primo", false, calc.esPrimo(182));
        assertEquals("183 no es primo", false, calc.esPrimo(183));
        assertEquals("184 no es primo", false, calc.esPrimo(184));
        assertEquals("185 no es primo", false, calc.esPrimo(185));
        assertEquals("186 no es primo", false, calc.esPrimo(186));
        assertEquals("187 no es primo", false, calc.esPrimo(187));
        assertEquals("188 no es primo", false, calc.esPrimo(188));
        assertEquals("189 no es primo", false, calc.esPrimo(189));
        assertEquals("190 no es primo", false, calc.esPrimo(190));
        assertEquals("191 es primo", true, calc.esPrimo(191));
        assertEquals("192 no es primo", false, calc.esPrimo(192));
        assertEquals("193 es primo", true, calc.esPrimo(193));
        assertEquals("194 no es primo", false, calc.esPrimo(194));
        assertEquals("195 no es primo", false, calc.esPrimo(195));
        assertEquals("196 no es primo", false, calc.esPrimo(196));
        assertEquals("197 es primo", true, calc.esPrimo(197));
        assertEquals("198 no es primo", false, calc.esPrimo(198));
        assertEquals("199 es primo", true, calc.esPrimo(199));
        assertEquals("200 no es primo", false, calc.esPrimo(200));
    }
}