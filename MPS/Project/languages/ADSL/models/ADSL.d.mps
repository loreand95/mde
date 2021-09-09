<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:d41bf09a-353c-4583-8f21-fb3650db0362(ADSL.d)">
  <persistence version="9" />
  <languages>
    <use id="5c9a0e65-2f1e-4e9a-adf1-8dcc826f515f" name="ADSL" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports />
  <registry>
    <language id="5c9a0e65-2f1e-4e9a-adf1-8dcc826f515f" name="ADSL">
      <concept id="5681200438915242113" name="ADSL.structure.Route" flags="ng" index="2_wrkN">
        <property id="5681200438915242128" name="price" index="2_wrky" />
        <property id="5681200438915242132" name="date" index="2_wrkA" />
        <property id="5681200438915242137" name="km" index="2_wrkF" />
        <property id="5681200438915242114" name="id" index="2_wrkK" />
        <property id="5681200438915242116" name="status" index="2_wrkQ" />
        <property id="5681200438915242193" name="endAddress" index="2_wrlz" />
        <property id="5681200438915242186" name="startAddress" index="2_wrlS" />
        <child id="5681200438915242177" name="customer" index="2_wrlN" />
        <child id="5681200438915242183" name="rider" index="2_wrlP" />
      </concept>
      <concept id="5681200438915242201" name="ADSL.structure.CardId" flags="ng" index="2_wrlF">
        <property id="5681200438915242241" name="expirationDate" index="2_wriN" />
        <property id="5681200438915242208" name="path" index="2_wrli" />
        <property id="5681200438915242223" name="birthdate" index="2_wrlt" />
        <property id="5681200438915242202" name="id" index="2_wrlC" />
      </concept>
      <concept id="5681200438915242526" name="ADSL.structure.Geolocation" flags="ng" index="2_wruG">
        <property id="5681200438915242529" name="lng" index="2_wruj" />
        <property id="5681200438915242527" name="lat" index="2_wruH" />
      </concept>
      <concept id="5681200438915241913" name="ADSL.structure.Rider" flags="ng" index="2_wrCb">
        <property id="5681200438915241925" name="status" index="2_wrDR" />
        <child id="5681200438915242532" name="livePosition" index="2_wrum" />
      </concept>
      <concept id="5681200438915241901" name="ADSL.structure.Customer" flags="ng" index="2_wrCv">
        <property id="5681200438915241911" name="status" index="2_wrC5" />
        <child id="5681200438915242256" name="cardId" index="2_wriy" />
      </concept>
      <concept id="5681200438915179278" name="ADSL.structure.User" flags="ng" index="2_wCUW">
        <property id="5681200438915179305" name="name" index="2_wCUr" />
        <property id="5681200438915179281" name="id" index="2_wCUz" />
        <property id="5681200438915179286" name="surname" index="2_wCU$" />
        <property id="5681200438915179290" name="password" index="2_wCUC" />
        <property id="5681200438915179295" name="email" index="2_wCUH" />
        <property id="5681200438915198868" name="phone" index="2_wG8A" />
      </concept>
      <concept id="5681200438915134577" name="ADSL.structure.System" flags="ng" index="2_wXB3">
        <property id="5681200438915134582" name="author" index="2_wXB4" />
        <property id="5681200438915134584" name="version" index="2_wXBa" />
        <child id="5681200438915179396" name="routes" index="2_wCSQ" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2_wXB3" id="4VnFrbFmiGW">
    <property role="TrG5h" value="UberRM" />
    <property role="2_wXB4" value="Pino" />
    <property role="2_wXBa" value="001" />
    <node concept="2_wrkN" id="4VnFrbFmiGX" role="2_wCSQ">
      <property role="2_wrkK" value="0" />
      <property role="2_wrkQ" value="4VnFrbFlxy9/DOING" />
      <property role="2_wrky" value="10" />
      <property role="2_wrkA" value="31/12/2020" />
      <property role="2_wrkF" value="2" />
      <property role="2_wrlS" value="&quot;Via Roma 3&quot;" />
      <property role="2_wrlz" value="&quot;Via Euro 40&quot;" />
      <node concept="2_wrCv" id="4VnFrbFmiGY" role="2_wrlN">
        <property role="2_wCUr" value="Lorenzo" />
        <property role="2_wrC5" value="4VnFrbFlxuJ/PENDING" />
        <property role="2_wCUz" value="0002" />
        <property role="2_wCU$" value="Andreoli" />
        <property role="2_wCUH" value="lore.it" />
        <property role="2_wCUC" value="********" />
        <property role="2_wG8A" value="33323929" />
        <node concept="2_wrlF" id="4VnFrbFmiGZ" role="2_wriy">
          <property role="2_wrlC" value="10021" />
          <property role="2_wrli" value="&quot;/src/12321.png&quot;" />
          <property role="2_wrlt" value="21/03/1992" />
          <property role="2_wriN" value="21/02/1992" />
        </node>
      </node>
      <node concept="2_wrCb" id="6qD9x5fsUsP" role="2_wrlP">
        <property role="2_wCUz" value="Niko" />
        <property role="2_wrDR" value="4VnFrbFlxuV/AVAILABLE" />
        <property role="2_wCUr" value="Mario" />
        <property role="2_wCU$" value="Fico" />
        <property role="2_wCUH" value="ficomail.it" />
        <property role="2_wCUC" value="*******" />
        <property role="2_wG8A" value="333542344" />
        <node concept="2_wruG" id="6qD9x5fsUt5" role="2_wrum">
          <property role="2_wruH" value="32" />
          <property role="2_wruj" value="321" />
        </node>
      </node>
    </node>
  </node>
  <node concept="2_wXB3" id="4VnFrbFmj8w">
    <property role="TrG5h" value="UberAQ" />
    <property role="2_wXB4" value="ore" />
    <property role="2_wXBa" value="21" />
    <node concept="2_wrkN" id="4VnFrbFmj8x" role="2_wCSQ">
      <property role="2_wrkA" value="31/2/1992" />
      <property role="2_wrkK" value="1" />
      <property role="2_wrkQ" value="4VnFrbFlxy8/DONE" />
      <property role="2_wrky" value="1" />
      <property role="2_wrkF" value="2" />
      <property role="2_wrlS" value="via" />
      <property role="2_wrlz" value="via" />
      <node concept="2_wrCv" id="4VnFrbFmj8y" role="2_wrlN">
        <property role="2_wCUr" value="..." />
        <property role="2_wrC5" value="4VnFrbFlxuK/ACTIVED" />
        <property role="2_wCUz" value="0" />
        <property role="2_wCU$" value="Luca" />
        <property role="2_wCUH" value="lucamail.it" />
        <property role="2_wCUC" value="******" />
        <property role="2_wG8A" value="38055392" />
        <node concept="2_wrlF" id="4VnFrbFmj8z" role="2_wriy">
          <property role="2_wrlC" value="001" />
          <property role="2_wrli" value="&quot;/src/02000.png&quot;" />
          <property role="2_wrlt" value="&quot;12-01-1999&quot;" />
          <property role="2_wriN" value="&quot;12-01-2021&quot;" />
        </node>
      </node>
      <node concept="2_wrCb" id="6qD9x5fsUs_" role="2_wrlP">
        <property role="2_wCUz" value="001" />
        <property role="2_wrDR" value="4VnFrbFlxuV/AVAILABLE" />
        <property role="2_wCUr" value="Luca" />
        <property role="2_wCU$" value="Rossu" />
        <property role="2_wCUH" value="ross.mail.it" />
        <property role="2_wCUC" value="*********" />
        <property role="2_wG8A" value="3092912333" />
        <node concept="2_wruG" id="6qD9x5fsUsB" role="2_wrum">
          <property role="2_wruH" value="12" />
          <property role="2_wruj" value="33" />
        </node>
      </node>
    </node>
    <node concept="2_wrkN" id="2wKpQZOQfZ9" role="2_wCSQ">
      <property role="2_wrkK" value="0" />
      <property role="2_wrkQ" value="4VnFrbFlxy9/DOING" />
      <property role="2_wrky" value="3" />
      <property role="2_wrkA" value="12/12/2020" />
      <node concept="2_wrCv" id="2wKpQZOQfZa" role="2_wrlN">
        <node concept="2_wrlF" id="2wKpQZOQfZb" role="2_wriy" />
      </node>
    </node>
    <node concept="2_wrkN" id="2wKpQZOQfYV" role="2_wCSQ">
      <node concept="2_wrCv" id="2wKpQZOQfYW" role="2_wrlN">
        <node concept="2_wrlF" id="2wKpQZOQfYX" role="2_wriy" />
      </node>
    </node>
    <node concept="2_wrkN" id="2wKpQZOQfXY" role="2_wCSQ">
      <node concept="2_wrCv" id="2wKpQZOQfXZ" role="2_wrlN">
        <node concept="2_wrlF" id="2wKpQZOQfY0" role="2_wriy" />
      </node>
    </node>
  </node>
</model>

