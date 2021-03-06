package com.hackerrank.strings;

import org.junit.Assert;
import org.junit.Test;

public class GemstonesTest {

    @Test
    public void testGemstones() {
        Assert.assertEquals(2, Gemstones.gemstones(new String[]{"abcdde", "baccd", "eeabg"}));
        Assert.assertEquals(4, Gemstones.gemstones(new String[]{"basdfj", "asdlkjfdjsa", "bnafvfnsd", "oafhdlasd"}));
        Assert.assertEquals(0, Gemstones.gemstones(new String[]{"vtrjvgbj", "mkmjyaeav", "sibzdmsk"}));
    }

    @Test
    public void testGemstones2() {
        Assert.assertEquals(0, Gemstones.gemstones(new String[]{
                "molbapydxfbsbwqrrsmkebhxnphikeywkxoldawbojksdlfoqwrqjmkcylacxfdyclepprhbndmgocrdzcgr",
                "nlxchmhckrzrykxjxjpckaavztepfbizoqh",
                "kncchsgsraxnotgdgovptowzghodwqideluywpwmqbqbtanqs",
                "umgeeuabkcntumyaumlkwxiujbwe",
                "byzoraskmuugmyiuolhbipceizazlixgfkeuurppyczyt",
                "uiipcvbppdhxqufsubjijxgshnjsaupbydmmxye",
                "isspjpleqsbylekhnzhrskxzkidnbqfcfhtpvre",
                "zlqigedzwiwwplspaqhjwpuexzumvjnrozvsbbulwpfnebuxdndvxquzzbafhdcuuspycvvkfdyyivgbewuyktlfuyjbwgppn",
                "pjgwftnnncxprrbyipcmgelvcqcvstrfqufrdxkmwdfopdoksuujifccnulnsrxggfxuvipuybwebxgvwrntqxqtki",
                "dakrjdsebiuugxpvxyhrtmwhvyqdhvgirhoozuccqv",
                "dapqtivsemkgbkvvzqqfocnnlljjcpexhdotgvcghpkvxvgsbi",
                "uoxhgujpbdx",
                "fadkdvrmphfahixjqhnjfcnjrprcdcrxzehypqdcrululryixvxxcaujmcneokejgzlzhb",
                "ysvdszdswunopr",
                "mqzrjprgxdydstsecaccka",
                "ohfnzlmpnzsgbhnwalpdisjdmdjnyutlhjvkmfxnqpppwmrmeecwobspkcgewwuznazeazgmgfkkz",
                "ghgyohsdoctwssefhmx",
                "tgdssqslwvpaeepbjijwdndblqytfcbrvtmbunwgis",
                "hgwhxuoifqaejvqfylrtskttxecndsklahpcnslzdqlszrblkccpzzeviysjtwdbovkysdemfpdzysfwvwnxhdantaqje",
                "xywoisgainvwkvwcapsqcxmuaq",
                "jdixnjqrzyslmnfqfrghqaxhicdvrxgiwmnyiyrpommpsovaieqfrxbexxqmjqkhsobvwxgiciekqmkbpzhqogixiaylbnvnyt",
                "denwpvpwcmlbehqsubxjuyqcveaittwuprrddtpwwuuajgejqytkzvxvfodtsqfh",
                "eisznwbftcgugqipoaubovknajuxpukmmctiwoqejjx",
                "yzgmnsryucaossnqqvvdllqxelpfirerrhjtufopgekstqfnhuezoqoelijuelxqlsyjdyvevlgwrauyjuykvyyh",
                "xtawtlilznqeifuefpndryoooadegksbqqsstufxrgbompnuurp",
                "tkdd",
                "ozoiyyssyfiionfurrukyijyemqtvtaikuxkjkorc",
                "afquxvbjbufhbfdaa",
                "qpghetpapqkamlflwsfalrnmwveonsmmajfitpyeiuhefey",
                "isqndazqlsflpwksppqlrydmxporfgwuihlzekmoyhqkvdnrhgarftdmxtahgkaoqgankdjtloxw",
                "scegvdydyapvchvtqpbqexsszpvtaooklvzoyjackwsbualovxzpqszjwnaosvggwqdbeimckcphayglqqpiwldihhtwwrcxc",
                "rclqhxyerjqnnldhoydjoqwdjbearqncoyhpfwxlwdqaexwkkqxvnssauidmjpzrverapnt",
                "xdpdfvyrorbxyufiesqjocilsdqbmwuppsndpltoj",
                "xmmwerdaejowqcoyppqxkulnixv",
                "frfuyubib",
                "gbmscibkxcwongfiuxjiodpunvgeacoxwsszcpfwfhaxjqpzrpggfotdmpuzdabdtwucqfiypnxlpvneghiklbhtfys",
                "kjdvelptpvaplankxqhymzuqqzgyhsetuviklvapgvntumwcgmpndmhavdvcmuznibkwvzvhvhmuztvkuxfwpytaahcmnany",
                "whbmaxzhpdjssrizf",
                "bpgdjecunkvwbcqjpmjjjcznzxcjvjafhz",
                "rffbbdlwbsnimcovwtohvzrikz",
                "foqthutowjvmtnisaccicvwpdxbjtaiqghkwyatwfktnsrcddjqcschxkrenynxabtnbzcjjjecitj",
                "cbzittqjnqqzvommsfqguhxaszs",
                "fjkpoosusdmdzatxvtvphrsdqhyshayhsqbferiaghdlxhfztsutmoqqygdnoupmonqytfytgotdtaba",
                "wpfqqvaqluzdhzkpmgswdvxjuzkutvpjsd",
                "rmxdtfsnmhzxarihwhiohawlprlxqgveljodgnritxhkanclchxojcbdoezwbvczmctxamfmzossiuncjvvglcliybzdfhfjmxm",
                "recvh",
                "pzxyjcaskyuspggefjiiefygvsubqgdjddmimqyclhqoicaarnmomzluignzv",
                "ixiginhofthorgfdqxhpwhcipzpyjarayvjrophsy",
                "jrkmxoxkwgmtadcdidwdqltr",
                "fjknnfplfeuqjvaomrpicsanzlqpiagxjqktjacigdyvrrdableynzdjbegpobnmncpel",
                "rfxpdrrxwjgzlnxrlgmaxatuyvwtsigvmsujzkmeeyqxaeszqzmpxzifbjlyehkyxyxazyfs",
                "srytftrlukcsjfauvjblwxady",
                "rjinbceyetioovkl",
                "xizeysjxwijafdajuapjiqqt",
                "exeoazqiaflhdyqrcqzgolzvnlolctovpwxaszdwqbudevfxnrtgqkopnacoktgiyltol",
                "xwduiwucgmejfhqyfzzwfghhawuobqiqsyiwuxcdmjjvubgmpzgskdconpgmlmzuul",
                "zxktqbewcftuxlnjllcyuirbynvjvgrxgmtjmuxurdcbrplgcekxli",
                "jqabapyvxqaxel",
                "zxtnsilxitwfrldfrokyqxtwtqieuafritwbmelqwvsmv",
                "orzlanudieytiyshqwepppjhfttplslvuionxwjkxvovkikbetzxnvxeasd",
                "gdnbibylvehbacqoobmpqqegktdunqisdvnrdkpnovmgtxaslargjetvkvaxilriltbffwetecswbapatfmiajvszwcj",
                "yykcigkuummaajzlshdjrrnhcylglduarmidtcevfefpzvvjapxsnkuvfxcrdikote",
                "vaucjluizqufovibbscbxodvjnltdpueexcnlowvpdpdd",
                "bkyjpzclqdllcjuteoovbkhfpnujmrieswhijgckmzupmi",
                "cgwpfdcczmjoukwgzblwkzeialiaquytddsxykjzuvgcpxarybemgtjcypgplcysygtkobxoahmraanptnoczzqbexqci",
                "veeqplrkdrelaqpkyigfvhptckbhkrfyzmmyklethcrjkpebvfadoohzbmahlrsbyaiemuophctsujnivpuunzixsqjvtjqkzowl",
                "wfaupbyrknrclwxscdkbzucxkkkiaqmrrffxcvduxaeckgnenxpsliqspeirlhzavntrs",
                "xagdvsafjqtalhjkggkholwwkqgpbbiywjkfywkwpsqheuiswwswtqlkttgiebbkqc",
                "hxttlfkksbkeuyecyosbypwxkhntvoahdmtiufsq",
                "qqfpddvvppasrtcfvosopkztmdkuqvvcoazmlmbmurfygtidqotuic",
                "qjutcdcmcunpvog",
                "evhamwhhsnykiljvavygsvnangcigryhlelpjgyjnjlandrzssdgvikvzdohqhlaurofifzvebpujphgvrbokdfebwyq",
                "wfivvvfldimgsjsrcdtycgacdoglvnewgxhhiuwokridoekcuyacvnayfnoknrnkrselctythmydi",
                "pphgchgrijktavtjnmrnupfeluhxjebnxlpoxyjbbgenwciwfhvxgvttobpeqjiukhrjyzcagssgq",
                "tpcmdefgtuubqeaegyiuzvhmascziejzhhwkawpovvsaxdqpihfurautqxpgzidwobgorvggqqavzkyhltfazakcl",
                "wyuwctuvrqmdbfwhuvtucedbnxvuyruvldbfdtvmqdeuvgocnpeainawbsx",
                "slxdpbpfkrikdmorptsqdldevabbqkliuslgjyohegwnapbgtyfkkumactoahrzfwgrpqjjucyd",
                "jldmqsoelsxywgvsfufgxg",
                "ghbnucihsadzkpy",
                "vrwjzikpcpjlrlmavowazfznyngrertieeiqgfzijetpjackkhaqojunyg",
                "znmnauzmgtqevrxpcyjnoxtchokbmeicjarhvmmgjtf",
                "fkbgjxsjugvpxhujlebqtgalzvwdjhozetvbhbcvrstpkdctqxketolumjgsbaowzs",
                "nieqzi",
                "yrtdurupovoyp",
                "mtpomwlfpyrjbwmja",
                "njqapnjfiypiwwjoqalixpabemathenjbbmtkekyvhxyapoysghfbxjvurzztbmaugpasnlxkpoghdojjkwjobzfwnpx",
                "sqtxpsorwjmsmcsaxrtubnzzygoajghxpupqvuqzlcqijqgifxpck",
                "nptxfbqooamgpuwytpzjpyxvodwtmloihqlkntmmxnbxyzjklboxihbpabwipgfgwg",
                "jmsfcdhhnjhtwpydrlfebklt",
                "jsocgwdahcrbyoyeqmhvaflecipghegqipbfxxzwvzeuzvdzmdtqwuhqlivkzvzogwzwonttzzsbdpj",
                "ftsafsaqflaizwxqwicshndvuabcdkqlcywmhgsgktsyzqvndzeuyzknugmiaahemqgdg",
                "worxpvczg",
                "iimsmyieeexewpycleybgjyzazfjorjjqhrqpnvxliugznubtafyzepnjgjvasmszqzgnpy",
                "mthyflhsbtjsglljkzrlr",
                "nsxuyycyhfecp",
                "tahohwbsaxheobchdaqagcalwztpvxgillqyeejjpgkhcpwmiygykkognriupmhorkmrjwkuhhazfalasynnxxelokex",
                "ezstlufuhdzgwt",
                "bcgiuolagphwputkbskhrbteqzrwyueoziifuuwomuaysppfqrixerdsozsvxkgloqv",
                "byhfdbczevofwifgjcmwqyuegmiaojweegluwuhnrdpohtmrnrbbnyuvasvupfxzlyuhgmyjiartvvsuib",
                "zxyfrjrpcjusrhjwmpkrongut",
        }));
    }

    @Test
    public void testGemstones3() {
        Assert.assertEquals(1, Gemstones.gemstones(new String[]{"xhsbaqwbokcaqbkhrzddydwirmldcr",
                "kwkbkhlwmlpuomfaenahhnnpgqpkcxlspbomrweoqq",
                "rtdckeukfoppbsiccflxqcoxrhwnxpwyjsrvjngqmbgqfwahhkzcbifrvpamffoxcetdochazcqsqhazndwdk",
                "cakdnrducighyuuemxhqmujauwxabextkdamxybkoyexmdmlyvnmlrwwrt",
                "czuzxlzrmuaa",
                "gquymxuabmymtnljadbqxjsipnixbyhwhaoaciinwdhppbpyxswcveddpojlopqsuqsvjhpobpdefuj",
                "abtwcqoib",
                "vqpgcuwvxdlaquaiwydejgpwvpwdjeybgbtienzijzeah",
                "shrcvpgwzdkfcvpmjeuslonwerklxysafwgeurdnshmzunpaxmgfiwsehowfyjboeahpuqlatcmooenlicnrkhcbkl",
                "jcvcatdtubemfmjqfplxgwkqeuyderpznnqhvvpjafnceutugnixltiyrmnptcxpvqadnpowacsuoucwmfgbkzs",
                "ufaqewahvnqsbpqw",
                "jzecprvdbgyxmhslqdxjsqnmdoavvifebqrtklohndgvkemackgmgtpkhqetqybxnpiyvlebovhbwivctrruc",
                "wrhighznjjppsvmsxmtwtnphaxqmyjwtxrrfqxrurbengtrvgmeaxfodwtfucmdeasgzuxkghhjexblancvzd",
                "hluadkczkazvptpjwwempwfpacbnfmhrzghznjln",
                "znizntdoqtqabqvykqvnglbgkmclrzajsqwxnshlzalzfbalkxoxpsmtoon",
                "paws",
                "nwtsbxdtyqlapasbazttbsguceyqjvebxdjnfdw",
                "kxafenseotsysgeswrtpzibyamlhbjknlcoveihukdebfbwsaqmzvdlaytfilpcqkspdwnysdfjvwdtlsqactcrelzzhxqxzv",
                "yqaaayknxwnbmzkictawsgxeq",
                "aaqkpvmiiho",
                "ybnnrikqjybxrawihgyxiegxcimriyqrrgcxsfeidnhwfxjnpzxhloav",
                "pjpdtrolhxvfrftvuweatcisajvqkaqqmblwugegmbpteukwxvoebpemcjquuvlrqkczeabuhmss",
                "epgmbfpdjktvkbiczmumnoirupbasdvxpjhsocxaewcxkquxjolcqwjwnqtnirgsi",
                "hjvkyhlyuqrsoonfqlyxlenoszrlquqsyjwrufuretagpuq",
                "oaqdya",
                "ikqnbkmmaoxqjmrmxupfaycfwxwzeldjynafrjdkulsvqweciuyukxnmzriseziuqxoxif",
                "jgabqaqhwashxvki",
                "xrryvkqfkossukeieayukmycfusyrikiotoiutvykatijjjzrioys",
                "uaepqfgaevkewfmyhdmfeifsheilwfusmlnrpjtaeathypaql",
                "pkzqkqvlgadoatqdwhgwkehalzrfawkxlivimioralfsnwqyhampnhqhdgssoo",
                "lyqmibiheakvntaijqiwviwadksmxewhzejpkhdlbisqxmaqcmxctkfvqo",
                "zgylpetfogykwgypzyoxjcuglfcawxubtqnteyvajnafzznmojnhovohsaowhuqpwhlydmtzwvrirjknynsiijivpqguabg",
                "eftqjvctdzhxqbupfkwppcsrujgrziuelxozbzzcrcfbghqzdftctzfxgvmevyvbdbfigsykevjanvlaoepmqedufn",
                "aotiefuigarhpgsghcptscko",
                "pfrqhzapxgeltxikswnocynfguafqsigbpwehbfywndxbxaupzbdggshjocvowitjvunospmtzudcpl",
                "yqzudnoqenlskxakuummlvkefmljvteacihzapaabuvjyjgodptyavvupptmvypvhnta",
                "solabz",
                "vxlaetxbklmxztfkozbzlolqr",
                "wvcga",
                "wahauykchejjiyikfwxzsbufdegpovkrbpampyuuhsaqzcnybbjzajjjrbszvbvdpyhbccwsjmnoztlejpffnzfytrdppsjrpvxx",
                "cxkhanwweqhcjttjorgjocdfknajxbtbsucabin",
                "oya",
                "bznssnvxqvhhsqtmvluzmafqhftmorixkanbsixebrjqucgatepukzivhyhwxzfhgqztqtizkftvthyqjec",
                "bbrjqukyipcnrhirhvcsmzgftpxtvehmfiizhorionzyhqdxodpaazjducjoqowtwzspfs",
                "cnznakegiobpzqlzgyicllqwgrscxedu",
                "hmofrxma",
                "adh",
                "oxa",
                "bglhbygsyapztwrxjedcvpctvilcazozpralyodujolkixitrxwimazwnxmglwvkem",
                "rgiyigzujasnsovsjjaqizcomxakticqyqdpdughlyuazpnfbmcgnveiemsybfdg",
                "rioajgayihhagpcrj",
                "zqgipdddjqxctpdzqiwzxwvxnwoxstodzcwgergfiiaizebhktlvrizzkomimalfbsxkduavkjxaoairfh",
                "kgjdzysfkxmetkaoylyskcqlqtfzyayyyudxsknzxrcyujmwbnbkbtsfgitrrawfxzjthyfmgckgjqespdifqtpxjbgnvr",
                "hiagaaeynarcvstegt",
                "yadxdlavbxptwglaiayoowuogvvtgcfywluubqtkzrrhfxlovgef",
                "hlypqfdiqlfnkllzouulioezroipxqdlsxwanwykvbcldhoetaeztgrootpjojcceuacwtzqagqamcvgfdednqczyvbtdx",
                "zisguwmsaxhxuwjmhyfzuwiipggmwdouo",
                "lbwzvwermrlvcmklemjkfrbljlnxrtizbyeikrgwjjptnzumttueabagmxizruareaeykxpblhrxcdyncqvpvcunwnfxzmpgys",
                "prttjtiytlyyrultdkkpltjieolromizxwjfesyslnlxawtuxfiykdjobvoaeehfvxanlqzpkznggwkteeevlvsshvptayxvmttl",
                "qgkpbaajagtvqiyiaodlrsikonhfwakpjdcbtalsxcjvbedvcempmvoeenrignubtaslxftwagdiobnevqzvqva",
                "faedrfxkahlcgoilakrcyivijzutjlrdumyufckvt",
                "vau",
                "hbvbxfjzegevcqgaphablnsmlbsoeqmaioprbvtddsupvnqngwmxcpflvuafxpvd",
                "brtfnusycjisbcphougpjdvauguelqkzipcuijeoy",
                "ichepvyzntaev",
                "zenwbsywgmpiutpzcjlaatkzmgobpxbcxmuxarykyoeqdx",
                "lfluwbfavxkugqlwyxasngjzsdsyjpgeydajtolqsx",
                "bhczkeeqzhzbartmeqpaqruysxjzaauoiqktopalvmdktikkldlrjllmcdpoygeiyukptponoihbsrrfvjfhoce",
                "zap",
                "ruiospjscgsufpnqkxkyykawjzwkczikahsyzauktafln",
                "lreuxplanxvcqitroicfi",
                "ohfaufeligmwtcsawktgxwtplivubrwmcjbqwgkcoxjyjwheidyqthgkoakhewhnwkvcatqpbwsqfkiqabjjonykglqwbswfyt",
                "vocqooogtaicbhuaiupuipleufvdccabmfywoykochscytztchknyorlocfdntwwovefaq",
                "xdmyaggpho",
                "nscoqroxhdadpeuycosccvsnmtuugabmctqjeirzc",
                "jhhlrbgojnrllgdewjvleyqdbfqvnjykfdjlxswwqeacczilgonlysaeqjghqpmwulkpupahsbbwihayahdfljjfgedri",
                "mnfhtdoelgcismveynwpedfgqiosyjadntdewxlufoqorroevrcv",
                "tzcetubjznmepihqloxfevhnyxhoytayxpkjvsgtmpkcimescblehhpgtbrngbwaufvjoqprgipwbahzkhjxfjxruqegcjgwgn",
                "pvcuauizaozvhsbtwgxihosfgjazpahwkai",
                "zsgkakcjezqvrqokvtgvecfgykwmvdpnapvjsuglckolshfiawxkogumzwiverjxpoyyuyhmopglvvfyuwa",
                "rfywidpltzdddyrhorkbfanakjjbfyhs",
                "liwgcigsdsyglkbefvbraoaexrprytclpvbwwpppouxbcmhpzswfkuhbkbzhymrceewbsdjsugwznmouri",
                "epaotrdpredwowbjpafkswggzhhzigjcrkvlpbqgucvaprkskwilfmgzyqiijibzvteiujzjqeankernianranftzkoafyzrj",
                "ntvvsjszkygncqfabnbajpmibfykwgyfaloozaoohtvnxclgsxjnlyvhvg",
                "bpsbesgxuufgaxsmcyhbfgfmzcyaxwizbmoyecacp",
                "mjootlmwwumapdrjmbhayptf",
                "kbrna",
                "xgooaibxlpjfotxwfgjtomwpjhmvjliubjavgjizaudpta",
                "cclrtzxwjsybpazszlbhwewuqbathpvrstemsdfqxblzlgblgkdrvpwitgqykmduvyapqw",
                "jsnpkdnmgpxgayihlblrxdpwqrctzvzoaylituwbiojtfuhfkpaggsbmqjaddmfjhaqpscyxpznwhlbxnp",
                "afclnupiwlgqchkdahacm",
                "ghibvbwuorvaubjkwphqghpzzqhgqhagzgsrtoouxefpckwvcndwlxjnpzzliqeeduqlezlayvdvzfstzpyomdyx",
                "cabazene",
                "iccteslmzahdvafdufaiactlgghsqqsayzalvyvfznwwiwgdshqrzgukgdqswm",
                "va",
                "evcmyciioxyggjpyeojrptzrfijszfargbtqjwyyseijzehgzlwhrresgbnpmzmasx",
                "gadtslngjkipbhdzfeypofxqdycmornqzwjucxsslvjhrmewcljekmeqtjaimjmxasyfbpjhkvgugmwkjyylygswjehflhwxv",
                "dpcazx",
                "mqakmgqxwqmj",
                "ombmwzjgntuvvhulglygpoqswngfedmdlywxqwjrpcyokultptfzmxpbflshggoycfaanaezburiqsphbzeqzbhkfykaemgsgu",
        }));
    }
}
