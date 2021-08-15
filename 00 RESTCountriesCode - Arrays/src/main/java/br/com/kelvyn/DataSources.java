package br.com.kelvyn;

import br.com.kelvyn.arrayUtil.*;

public class DataSources {
private String[] countryName;
private String[] countryCode;
private String[] isoCode;

public DataSources() {
countryName = new String[236];
isoCode = new String[236];
countryCode = new String[236];

//setting country names
countryName[0] = "Afghanistan";
countryName[1] = "South Africa";
countryName[2] = "Albania";
countryName[3] = "Germany";
countryName[4] = "Andorra";
countryName[5] = "Angola";
countryName[6] = "Anguilla";
countryName[7] = "Antarctica";
countryName[8] = "Antigua and Barbuda";
countryName[9] = "Argentina";
countryName[10] = "Algeria";
countryName[11] = "Armenia";
countryName[12] = "Aruba";
countryName[13] = "Saudi Arabia";
countryName[14] = "Australia";
countryName[15] = "Austria";
countryName[16] = "Azerbaijan";
countryName[17] = "Bahamas";
countryName[18] = "Bahrain";
countryName[19] = "Bangladesh";
countryName[20] = "Barbados";
countryName[21] = "Belgium";
countryName[22] = "Belize";
countryName[23] = "Mine";
countryName[24] = "Bermuda";
countryName[25] = "Bhutan";
countryName[26] = "Belarus";
countryName[27] = "Bolivia";
countryName[28] = "Bosnia and Herzegovina";
countryName[29] = "Botswana";
countryName[30] = "Brazil";
countryName[31] = "British Indian Ocean Territory";
countryName[32] = "Brunei";
countryName[33] = "Bulgaria";
countryName[34] = "Burkina Faso";
countryName[35] = "Myanmar (Burma)";
countryName[36] = "Burundi";
countryName[37] = "Cameroon";
countryName[38] = "Cape Green";
countryName[39] = "Cambodia";
countryName[40] = "Canada";
countryName[41] = "Qatar";
countryName[42] = "Chad";
countryName[43] = "chili";
countryName[44] = "China";
countryName[45] = "Cyprus";
countryName[46] = "Christmas Island";
countryName[47] = "Singapore";
countryName[48] = "Colombia";
countryName[49] = "Comoros";
countryName[50] = "North Korea";
countryName[51] = "South Korea";
countryName[52] = "Costa do Marfim";
countryName[53] = "Costa Rica";
countryName[54] = "Croatia";
countryName[55] = "Cuba";
countryName[56] = "Denmark";
countryName[57] = "Djibouti";
countryName[58] = "Dominica";
countryName[59] = "Egypt";
countryName[60] = "El Salvador";
countryName[61] = "United Arab Emirates";
countryName[62] = "Ecuador";
countryName[63] = "Eritrea";
countryName[64] = "Estonia";
countryName[65] = "Spain";
countryName[66] = "Ethiopia";
countryName[67] = "Fiji";
countryName[68] = "Finland";
countryName[69] = "France";
countryName[70] = "Gabon";
countryName[71] = "Gambia";
countryName[72] = "Gaza Band (Palestine)";
countryName[73] = "Georgia";
countryName[74] = "Win";
countryName[75] = "Gibraltar";
countryName[76] = "Greece";
countryName[77] = "Greenland";
countryName[78] = "grenade";
countryName[79] = "Guam";
countryName[80] = "Guatemala";
countryName[81] = "Guyana";
countryName[82] = "guinea";
countryName[83] = "Equatorial Guinea";
countryName[84] = "Guinea Bissau";
countryName[85] = "Haiti";
countryName[86] = "Honduras";
countryName[87] = "Hong Kong";
countryName[88] = "Hungary";
countryName[89] = "Iceland";
countryName[90] = "Cayman Islands";
countryName[91] = "Cocos Islands (Keeling)";
countryName[92] = "Isle of Man";
countryName[93] = "Cook Islands";
countryName[94] = "Falkland Islands (Malvinas)";
countryName[95] = "Faroe Islands";
countryName[96] = "Northern Mariana Islands";
countryName[97] = "Marshall Islands";
countryName[98] = "Norfolk Islands";
countryName[99] = "Pitcairn Islands";
countryName[100] = "Solomon Islands";
countryName[101] = "Turks and Caicos Islands";
countryName[102] = "US Virgin Islands";
countryName[103] = "British Virgin Islands";
countryName[104] = "India";
countryName[105] = "Indonesia";
countryName[106] = "England (United Kingdom)";
countryName[107] = "Will";
countryName[108] = "Iraq";
countryName[109] = "Ireland";
countryName[110] = "Israel";
countryName[111] = "Italy";
countryName[112] = "Jamaica";
countryName[113] = "Japan";
countryName[114] = "Jersey";
countryName[115] = "Jordan";
countryName[116] = "Kazakhstan";
countryName[117] = "Kenya (Kenya)";
countryName[118] = "Kiribati";
countryName[119] = "Kosovo";
countryName[120] = "Kuwait";
countryName[121] = "Kyrgyzstan";
countryName[122] = "Laos";
countryName[123] = "Latvia";
countryName[124] = "Lebanon";
countryName[125] = "Lesotho";
countryName[126] = "Liberia";
countryName[127] = "Libya";
countryName[128] = "Liechtenstein";
countryName[129] = "Lithuania";
countryName[130] = "Luxembourg";
countryName[131] = "Macao";
countryName[132] = "Macedonia";
countryName[133] = "Madagascar";
countryName[134] = "Malawi";
countryName[135] = "Malaysia";
countryName[136] = "Maldives";
countryName[137] = "Mali";
countryName[138] = "Malta";
countryName[139] = "Mauritania";
countryName[140] = "Mauritius";
countryName[141] = "Mayotte";
countryName[142] = "Mexico";
countryName[143] = "Micronesia";
countryName[144] = "Moldavia";
countryName[145] = "Monaco";
countryName[146] = "Mongolia";
countryName[147] = "Montenegro";
countryName[148] = "Montserrat";
countryName[149] = "Morocco";
countryName[150] = "Mozambique";
countryName[151] = "Namibia";
countryName[152] = "Nauru";
countryName[153] = "Nepal";
countryName[154] = "Netherlands Antilles";
countryName[155] = "New Caledonia";
countryName[156] = "New Zealand";
countryName[157] = "Nicaragua";
countryName[158] = "Niger";
countryName[159] = "Nigeria";
countryName[160] = "Niue";
countryName[161] = "Norway";
countryName[162] = "Oman";
countryName[163] = "Netherlands";
countryName[164] = "Pakistan";
countryName[165] = "Palau";
countryName[166] = "Panama";
countryName[167] = "Papua New Guinea";
countryName[168] = "Paraguay";
countryName[169] = "Peru";
countryName[170] = "Philippines";
countryName[171] = "Poland";
countryName[172] = "French Polynesian";
countryName[173] = "Portugal";
countryName[174] = "Puerto Rico";
countryName[175] = "Congo Republic";
countryName[176] = "Democratic Republic of Congo";
countryName[177] = "Central African Republic";
countryName[178] = "Czech Republic";
countryName[179] = "Dominican Republic";
countryName[180] = "Romania";
countryName[181] = "Rwanda";
countryName[182] = "Russia";
countryName[183] = "Saint Barthelemy";
countryName[184] = "Samoa";
countryName[185] = "American Samoa";
countryName[186] = "San Marino";
countryName[187] = "Sao Tome and Principe";
countryName[188] = "Senegal";
countryName[189] = "Serbia";
countryName[190] = "Sierra Leone";
countryName[191] = "Seychelles";
countryName[192] = "Slovakia";
countryName[193] = "Slovenia";
countryName[194] = "Somalia";
countryName[195] = "Sri Lanka";
countryName[196] = "Saint Helena";
countryName[197] = "Saint Kitts and Nevis";
countryName[198] = "Saint Lucia";
countryName[199] = "Saint-Martin";
countryName[200] = "Saint Pierre and Miquelon";
countryName[201] = "Saint Vincent and the Grenadines";
countryName[202] = "Sudan";
countryName[203] = "Suriname";
countryName[204] = "Svalbard";
countryName[205] = "Swaziland";
countryName[206] = "Sweden";
countryName[207] = "Switzerland";
countryName[208] = "Syria";
countryName[209] = "Taiwan";
countryName[210] = "Tajikistan";
countryName[211] = "Tanzania";
countryName[212] = "East Timor";
countryName[213] = "Thailand";
countryName[214] = "Togo";
countryName[215] = "Tokelau";
countryName[216] = "Tonga";
countryName[217] = "Trinidad and Tobago";
countryName[218] = "Tunisia";
countryName[219] = "Turkmenistan";
countryName[220] = "Turkey";
countryName[221] = "Tuvalu";
countryName[222] = "Uganda";
countryName[223] = "Ukraine";
countryName[224] = "Uruguay";
countryName[225] = "United States (USA)";
countryName[226] = "Uzbekistan";
countryName[227] = "Vanuatu";
countryName[228] = "Vatican";
countryName[229] = "Venezuela";
countryName[230] = "Vietnam (Vietnam)";
countryName[231] = "Wallis and Futuna";
countryName[232] = "West Bank";
countryName[233] = "Western Sahara";
countryName[234] = "Yemen (Yemen, Yemen)";
countryName[235] = "Zimbabwe(Zimbabwe)";
countryName[236] = "Zambia";

//setting country iso codes
isoCode[0] = "AF / AFG ";
isoCode[1] = "ZA / ZAF ";
isoCode[2] = "AL / ALB ";
isoCode[3] = "OF / GOD ";
isoCode[4] = "AD / AND ";
isoCode[5] = "TO / AUG ";
isoCode[6] = "AI / AIA ";
isoCode[7] = "AQ / ATA ";
isoCode[8] = "AG / ATG ";
isoCode[9] = "AR / ARG ";
isoCode[10] = "DZA / DZA ";
isoCode[11] = "ON THE ARM ";
isoCode[12] = "AW / ABW ";
isoCode[13] = "SA / OR ";
isoCode[14] = "AU / OFF ";
isoCode[15] = "AT / AUT ";
isoCode[16] = "AZ / AZE ";
isoCode[17] = "BS / BHS ";
isoCode[18] = "BH / BHR ";
isoCode[19] = "BD / BGD ";
isoCode[20] = "BB / BRB ";
isoCode[21] = "BE / BEL ";
isoCode[22] = "BZ / BLZ ";
isoCode[23] = "BJ / BEN ";
isoCode[24] = "BM / BMU ";
isoCode[25] = "BT / BTN ";
isoCode[26] = "BY / BLR ";
isoCode[27] = "BO / BOL ";
isoCode[28] = "BA / BIH ";
isoCode[29] = "BW / BWA ";
isoCode[30] = "BR / BRA ";
isoCode[31] = "IO / IOT ";
isoCode[32] = "BN / BRN ";
isoCode[33] = "BG / BGR ";
isoCode[34] = "BF / BFA ";
isoCode[35] = "MM / MMR ";
isoCode[36] = "BI / BDI ";
isoCode[37] = "CM / CMR ";
isoCode[38] = "CV / CPV ";
isoCode[39] = "KH / KHM ";
isoCode[40] = "CA / CAN ";
isoCode[41] = "QA / QAT ";
isoCode[42] = "TD / TCD ";
isoCode[43] = "CL / CHL ";
isoCode[44] = "CN / CHN ";
isoCode[45] = "CY / CYP ";
isoCode[46] = "CX / CXR ";
isoCode[47] = "SG / SGP ";
isoCode[48] = "CO / COL ";
isoCode[49] = "KM / COM ";
isoCode[50] = "KP / PRK ";
isoCode[51] = "KR / KOR ";
isoCode[52] = "CI / CIV ";
isoCode[53] = "CR / CRC ";
isoCode[54] = "HR / HRV ";
isoCode[55] = "CU / CUB ";
isoCode[56] = "DK / DNK ";
isoCode[57] = "DJ / DJI ";
isoCode[58] = "DM / DMA ";
isoCode[59] = "EG / EGY ";
isoCode[60] = "SV / SLV ";
isoCode[61] = "AE / ARE ";
isoCode[62] = "EC / ECU ";
isoCode[63] = "ER / ERI ";
isoCode[64] = "EE / EST ";
isoCode[65] = "ES / ESP ";
isoCode[66] = "ET / ETH ";
isoCode[67] = "FJ / FJI ";
isoCode[68] = "FI / FIN ";
isoCode[69] = "FR / FRA ";
isoCode[70] = "GA / GAB ";
isoCode[71] = "GM / GMB ";
isoCode[72] = "/  ";
isoCode[73] = "GE / GEO ";
isoCode[74] = "GH / GHA ";
isoCode[75] = "GI / GIB ";
isoCode[76] = "GR / GRC ";
isoCode[77] = "GL / GRL ";
isoCode[78] = "GD / GRD ";
isoCode[79] = "GU / GUM ";
isoCode[80] = "GT / GTM ";
isoCode[81] = "GY / GUY ";
isoCode[82] = "GN / GIN ";
isoCode[83] = "GQ / GNQ ";
isoCode[84] = "GW / NAM ";
isoCode[85] = "HT / HTI ";
isoCode[86] = "HN / HND ";
isoCode[87] = "HK / HKG ";
isoCode[88] = "HU / HUN ";
isoCode[89] = "IS / IS ";
isoCode[90] = "KY / CYM ";
isoCode[91] = "CC / CCK ";
isoCode[92] = "IM / IMN ";
isoCode[93] = "CK / COK ";
isoCode[94] = "FK / FLK ";
isoCode[95] = "FO / FRO ";
isoCode[96] = "MP / MNP ";
isoCode[97] = "MH / MHL ";
isoCode[98] = "/ NFK ";
isoCode[99] = "PN / PCN ";
isoCode[100] = "SB / SLB ";
isoCode[101] = "TC / TCA ";
isoCode[102] = "VI / VIR ";
isoCode[103] = "VG / VGB ";
isoCode[104] = "IN / IND ";
isoCode[105] = "ID / IDN ";
isoCode[106] = "GB / GBR ";
isoCode[107] = "IR / IRN ";
isoCode[108] = "IQ / IRQ ";
isoCode[109] = "IE / IRL ";
isoCode[110] = "IL / ISR ";
isoCode[111] = "IT / ITA ";
isoCode[112] = "JM / JAM ";
isoCode[113] = "JP / JPN ";
isoCode[114] = "JE / JEY ";
isoCode[115] = "JO / JOR ";
isoCode[116] = "KZ / KAZ ";
isoCode[117] = "KE / KEN ";
isoCode[118] = "KI / KIR ";
isoCode[119] = "/  ";
isoCode[120] = "KW / KWT ";
isoCode[121] = "KG / KGZ ";
isoCode[122] = "LA / LAO ";
isoCode[123] = "LV / LVA ";
isoCode[124] = "LB / LBN ";
isoCode[125] = "LS / LSO ";
isoCode[126] = "LR / LBR ";
isoCode[127] = "LY / LBY ";
isoCode[128] = "LI / LIE ";
isoCode[129] = "LT / LTU ";
isoCode[130] = "LU / LUX ";
isoCode[131] = "MO / MAC ";
isoCode[132] = "MK / MKD ";
isoCode[133] = "MG / MDG ";
isoCode[134] = "MW / MWI ";
isoCode[135] = "MY / MYS ";
isoCode[136] = "MV / MDV ";
isoCode[137] = "ML / MLI ";
isoCode[138] = "MT / MLT ";
isoCode[139] = "MR / MRT ";
isoCode[140] = "MU / MUS ";
isoCode[141] = "YT / MYT ";
isoCode[142] = "MX / MEX ";
isoCode[143] = "FM / FSM ";
isoCode[144] = "MD / MDA ";
isoCode[145] = "1100 / MCO ";
isoCode[146] = "MN / MNG ";
isoCode[147] = "ME / MNE ";
isoCode[148] = "MS/MSR ";
isoCode[149] = "MA / MA ";
isoCode[150] = "MZ / MOZ ";
isoCode[151] = "NA / NAM ";
isoCode[152] = "NR / NRU ";
isoCode[153] = "NP / NPL ";
isoCode[154] = "AN / ANT ";
isoCode[155] = "NC / NCL ";
isoCode[156] = "NZ / NZL ";
isoCode[157] = "NOTHING / NOTHING ";
isoCode[158] = "WHAT / WHAT ";
isoCode[159] = "ENGLISH / RUSSIA ";
isoCode[160] = "NU / NIU ";
isoCode[161] = "NO / NO ";
isoCode[162] = "OM / OMN ";
isoCode[163] = "NL / NLD ";
isoCode[164] = "PK / PAK ";
isoCode[165] = "PW / PLW ";
isoCode[166] = "PA / PAN ";
isoCode[167] = "PG / PNG ";
isoCode[168] = "PY / PRY ";
isoCode[169] = "PE / PER ";
isoCode[170] = "PH / PHL ";
isoCode[171] = "PL / POL ";
isoCode[172] = "PF / PYF ";
isoCode[173] = "PT / PRT ";
isoCode[174] = "PR / PRI ";
isoCode[175] = "CG / COG ";
isoCode[176] = "CD / COD ";
isoCode[177] = "CF / CAF ";
isoCode[178] = "CZ / JUN ";
isoCode[179] = "DO / SUN ";
isoCode[180] = "RO / ROU ";
isoCode[181] = "RW / RWA ";
isoCode[182] = "RU / RUS ";
isoCode[183] = "BL / BLM ";
isoCode[184] = "WS / WSM ";
isoCode[185] = "AS / ASM ";
isoCode[186] = "SM / SMR ";
isoCode[187] = "ST / STP ";
isoCode[188] = "SN / YOU ";
isoCode[189] = "RS / SRB ";
isoCode[190] = "SL / SLE ";
isoCode[191] = "SC / SYC ";
isoCode[192] = "SK / SVK ";
isoCode[193] = "SI / SVN ";
isoCode[194] = "SO / SOM ";
isoCode[195] = "LK / LKA ";
isoCode[196] = "SH / SHN ";
isoCode[197] = "KN / KNA ";
isoCode[198] = "LC / LCA ";
isoCode[199] = "MF / MAF ";
isoCode[200] = "PM / SPM ";
isoCode[201] = "VC / VCT ";
isoCode[202] = "SD / SDN ";
isoCode[203] = "SR / SOUTH ";
isoCode[204] = "SJ / SJM ";
isoCode[205] = "SZ / SWZ ";
isoCode[206] = "SE / SWE ";
isoCode[207] = "CH / CHE ";
isoCode[208] = "SY / SYR ";
isoCode[209] = "TW / TWN ";
isoCode[210] = "TJ / TJK ";
isoCode[211] = "TZ / TZA ";
isoCode[212] = "TL / TLS ";
isoCode[213] = "TH / THA ";
isoCode[214] = "TG / TGO ";
isoCode[215] = "TK / TKL ";
isoCode[216] = "TO / TON ";
isoCode[217] = "TT / TTO ";
isoCode[218] = "TN / TUN ";
isoCode[219] = "TM / TKM ";
isoCode[220] = "EN / ENG ";
isoCode[221] = "TV / TUV ";
isoCode[222] = "UG / UGA ";
isoCode[223] = "UA / UKR ";
isoCode[224] = "UY / URY ";
isoCode[225] = "US / USA ";
isoCode[226] = "UZ / UZB ";
isoCode[227] = "VU / VUT ";
isoCode[228] = "VA / VAT ";
isoCode[229] = "AND / VEN ";
isoCode[230] = "VN / VNM ";
isoCode[231] = "WF / WLF ";
isoCode[232] = "/  ";
isoCode[233] = "EH / ESH ";
isoCode[234] = "YE / YEM ";
isoCode[235] = "ZW / ZWE ";
isoCode[236] = "ZM / ZMB ";

//setting country codes
countryCode[0] = "93 ";
countryCode[1] = "27 ";
countryCode[2] = "355 ";
countryCode[3] = "49 ";
countryCode[4] = "376 ";
countryCode[5] = "244 ";
countryCode[6] = "1 264 ";
countryCode[7] = "672 ";
countryCode[8] = "1,268 ";
countryCode[9] = "54 ";
countryCode[10] = "213 ";
countryCode[11] = "374 ";
countryCode[12] = "297 ";
countryCode[13] = "966 ";
countryCode[14] = "61 ";
countryCode[15] = "43 ";
countryCode[16] = "994 ";
countryCode[17] = "1,242 ";
countryCode[18] = "973 ";
countryCode[19] = "880 ";
countryCode[20] = "1,246 ";
countryCode[21] = "32 ";
countryCode[22] = "501 ";
countryCode[23] = "229 ";
countryCode[24] = "1 441 ";
countryCode[25] = "975 ";
countryCode[26] = "375 ";
countryCode[27] = "591 ";
countryCode[28] = "387 ";
countryCode[29] = "267 ";
countryCode[30] = "55 ";
countryCode[31] = "";
countryCode[32] = "673 ";
countryCode[33] = "359 ";
countryCode[34] = "226 ";
countryCode[35] = "95 ";
countryCode[36] = "257 ";
countryCode[37] = "237 ";
countryCode[38] = "238 ";
countryCode[39] = "855 ";
countryCode[40] = "1 ";
countryCode[41] = "974 ";
countryCode[42] = "235 ";
countryCode[43] = "56 ";
countryCode[44] = "86 ";
countryCode[45] = "357 ";
countryCode[46] = "61 ";
countryCode[47] = "65 ";
countryCode[48] = "57 ";
countryCode[49] = "269 ";
countryCode[50] = "850 ";
countryCode[51] = "82 ";
countryCode[52] = "225 ";
countryCode[53] = "506 ";
countryCode[54] = "385 ";
countryCode[55] = "53 ";
countryCode[56] = "45 ";
countryCode[57] = "253 ";
countryCode[58] = "1 767 ";
countryCode[59] = "20 ";
countryCode[60] = "503 ";
countryCode[61] = "971 ";
countryCode[62] = "593 ";
countryCode[63] = "291 ";
countryCode[64] = "372 ";
countryCode[65] = "34 ";
countryCode[66] = "251 ";
countryCode[67] = "679 ";
countryCode[68] = "358 ";
countryCode[69] = "33 ";
countryCode[70] = "241 ";
countryCode[71] = "220 ";
countryCode[72] = "970 ";
countryCode[73] = "995 ";
countryCode[74] = "233 ";
countryCode[75] = "350 ";
countryCode[76] = "30 ";
countryCode[77] = "299 ";
countryCode[78] = "1 473 ";
countryCode[79] = "1 671 ";
countryCode[80] = "502 ";
countryCode[81] = "592 ";
countryCode[82] = "224 ";
countryCode[83] = "240 ";
countryCode[84] = "245 ";
countryCode[85] = "509 ";
countryCode[86] = "504 ";
countryCode[87] = "852 ";
countryCode[88] = "36 ";
countryCode[89] = "354 ";
countryCode[90] = "1 345 ";
countryCode[91] = "61 ";
countryCode[92] = "44 ";
countryCode[93] = "682 ";
countryCode[94] = "500 ";
countryCode[95] = "298 ";
countryCode[96] = "1 670 ";
countryCode[97] = "692 ";
countryCode[98] = "672 ";
countryCode[99] = "870 ";
countryCode[100] = "677 ";
countryCode[101] = "1 649 ";
countryCode[102] = "1 340 ";
countryCode[103] = "1,284 ";
countryCode[104] = "91 ";
countryCode[105] = "62 ";
countryCode[106] = "44 ";
countryCode[107] = "98 ";
countryCode[108] = "964 ";
countryCode[109] = "353 ";
countryCode[110] = "972 ";
countryCode[111] = "39 ";
countryCode[112] = "1 876 ";
countryCode[113] = "81 ";
countryCode[114] = "";
countryCode[115] = "962 ";
countryCode[116] = "7 ";
countryCode[117] = "254 ";
countryCode[118] = "686 ";
countryCode[119] = "381 ";
countryCode[120] = "965 ";
countryCode[121] = "996 ";
countryCode[122] = "856 ";
countryCode[123] = "371 ";
countryCode[124] = "961 ";
countryCode[125] = "266 ";
countryCode[126] = "231 ";
countryCode[127] = "218 ";
countryCode[128] = "423 ";
countryCode[129] = "370 ";
countryCode[130] = "352 ";
countryCode[131] = "853 ";
countryCode[132] = "389 ";
countryCode[133] = "261 ";
countryCode[134] = "265 ";
countryCode[135] = "60 ";
countryCode[136] = "960 ";
countryCode[137] = "223 ";
countryCode[138] = "356 ";
countryCode[139] = "222 ";
countryCode[140] = "230 ";
countryCode[141] = "262 ";
countryCode[142] = "52 ";
countryCode[143] = "691 ";
countryCode[144] = "373 ";
countryCode[145] = "377 ";
countryCode[146] = "976 ";
countryCode[147] = "382 ";
countryCode[148] = "1 664 ";
countryCode[149] = "212 ";
countryCode[150] = "258 ";
countryCode[151] = "264 ";
countryCode[152] = "674 ";
countryCode[153] = "977 ";
countryCode[154] = "599 ";
countryCode[155] = "687 ";
countryCode[156] = "64 ";
countryCode[157] = "505 ";
countryCode[158] = "227 ";
countryCode[159] = "234 ";
countryCode[160] = "683 ";
countryCode[161] = "47 ";
countryCode[162] = "968 ";
countryCode[163] = "31 ";
countryCode[164] = "92 ";
countryCode[165] = "680 ";
countryCode[166] = "507 ";
countryCode[167] = "675 ";
countryCode[168] = "595 ";
countryCode[169] = "51 ";
countryCode[170] = "63 ";
countryCode[171] = "48 ";
countryCode[172] = "689 ";
countryCode[173] = "351 ";
countryCode[174] = "1 ";
countryCode[175] = "242 ";
countryCode[176] = "243 ";
countryCode[177] = "236 ";
countryCode[178] = "420 ";
countryCode[179] = "1 809 ";
countryCode[180] = "40 ";
countryCode[181] = "250 ";
countryCode[182] = "7 ";
countryCode[183] = "590 ";
countryCode[184] = "685 ";
countryCode[185] = "1 684 ";
countryCode[186] = "378 ";
countryCode[187] = "239 ";
countryCode[188] = "221 ";
countryCode[189] = "381 ";
countryCode[190] = "232 ";
countryCode[191] = "248 ";
countryCode[192] = "421 ";
countryCode[193] = "386 ";
countryCode[194] = "252 ";
countryCode[195] = "94 ";
countryCode[196] = "290 ";
countryCode[197] = "1 869 ";
countryCode[198] = "1 758 ";
countryCode[199] = "1 599 ";
countryCode[200] = "508 ";
countryCode[201] = "1 784 ";
countryCode[202] = "249 ";
countryCode[203] = "597 ";
countryCode[204] = "";
countryCode[205] = "268 ";
countryCode[206] = "46 ";
countryCode[207] = "41 ";
countryCode[208] = "963 ";
countryCode[209] = "886 ";
countryCode[210] = "992 ";
countryCode[211] = "255 ";
countryCode[212] = "670 ";
countryCode[213] = "66 ";
countryCode[214] = "228 ";
countryCode[215] = "690 ";
countryCode[216] = "676 ";
countryCode[217] = "1 868 ";
countryCode[218] = "216 ";
countryCode[219] = "993 ";
countryCode[220] = "90 ";
countryCode[221] = "688 ";
countryCode[222] = "256 ";
countryCode[223] = "380 ";
countryCode[224] = "598 ";
countryCode[225] = "1 ";
countryCode[226] = "998 ";
countryCode[227] = "678 ";
countryCode[228] = "39 ";
countryCode[229] = "58 ";
countryCode[230] = "84 ";
countryCode[231] = "681 ";
countryCode[232] = "970 ";
countryCode[233] = "";
countryCode[234] = "967 ";
countryCode[235] = "263 ";
countryCode[236] = "260 ";

}
//get Country Name by index
private String getCountryName(int index) {
	return countryName[index];
}

//get Country Code by index
private String getCountryCode(int index) {
	return countryCode[index];
}

//get Iso Code by Index
private String getIsoCode(int index) {
	return isoCode[index];
}


//GETTING INFORMATION BY COUNTRY NAME
//get country code using the country name
public String getCodeByCountryName(String name) {
	int index = arrayUtil.indexOf(countryName, name);
	return getCountryCode(index);
}
//get country code using the country name
public String getIsoCodeByCountryName(String name) {
	int index = arrayUtil.indexOf(countryName, name);
	return getIsoCode(index);
}


//GETTING INFORMATION BY ISO CODE
//get country name using the country iso code
public String getCountryByIsoCode(String iso) {
	int index = arrayUtil.indexOf(isoCode, iso);
	return getCountryName(index);
}
//get country code using the country iso code
public String getCountryCodeByIsoCode(String iso) {
	int index = arrayUtil.indexOf(isoCode, iso);
	return getCountryCode(index);
}


//GETTING INFORMATION BY COUNTRY CODE
//get country name using the country code
public String getCountryByCode(String code) {
	int index = arrayUtil.indexOf(countryCode, code);
	return getCountryName(index);
}
//get country iso code using the country code
public String getCountryIsoCodeByCode(String code) {
	int index = arrayUtil.indexOf(countryCode, code);
	return getCountryCode(index);
}
}