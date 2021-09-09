<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f31c5c66-7689-442d-abb8-ca332c02cb22(ADSL.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1082978499127" name="jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration" flags="ng" index="Az7Fb">
        <property id="1083066089218" name="constraint" index="FLfZY" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765907488" name="conceptShortDescription" index="R4oN_" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="4VnFrbFl7hL">
    <property role="EcuMT" value="5681200438915134577" />
    <property role="TrG5h" value="System" />
    <property role="34LRSv" value="Root" />
    <property role="R4oN_" value="Root System" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="4VnFrbFl7hM" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFl7hQ" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915134582" />
      <property role="TrG5h" value="author" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFl7hS" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915134584" />
      <property role="TrG5h" value="version" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="4VnFrbFlie4" role="1TKVEi">
      <property role="IQ2ns" value="5681200438915179396" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="routes" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="4VnFrbFlxy1" resolve="Route" />
    </node>
  </node>
  <node concept="1TIwiD" id="4VnFrbFlice">
    <property role="EcuMT" value="5681200438915179278" />
    <property role="TrG5h" value="User" />
    <property role="R4oN_" value="User " />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="4VnFrbFlich" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915179281" />
      <property role="TrG5h" value="id" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlicD" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915179305" />
      <property role="TrG5h" value="name" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlicm" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915179286" />
      <property role="TrG5h" value="surname" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlicv" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915179295" />
      <property role="TrG5h" value="email" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlicq" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915179290" />
      <property role="TrG5h" value="password" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlmYk" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915198868" />
      <property role="TrG5h" value="phone" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="4VnFrbFlxuH">
    <property role="EcuMT" value="5681200438915241901" />
    <property role="TrG5h" value="Customer" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" node="4VnFrbFlice" resolve="User" />
    <node concept="1TJgyi" id="4VnFrbFlxuR" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915241911" />
      <property role="TrG5h" value="status" />
      <ref role="AX2Wp" node="4VnFrbFlxuI" resolve="CustomerStatus" />
    </node>
    <node concept="1TJgyj" id="4VnFrbFlx$g" role="1TKVEi">
      <property role="IQ2ns" value="5681200438915242256" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="cardId" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="4VnFrbFlxzp" resolve="CardId" />
    </node>
  </node>
  <node concept="25R3W" id="4VnFrbFlxuI">
    <property role="3F6X1D" value="5681200438915241902" />
    <property role="TrG5h" value="CustomerStatus" />
    <node concept="25R33" id="4VnFrbFlxuJ" role="25R1y">
      <property role="3tVfz5" value="5681200438915241903" />
      <property role="TrG5h" value="PENDING" />
    </node>
    <node concept="25R33" id="4VnFrbFlxuK" role="25R1y">
      <property role="3tVfz5" value="5681200438915241904" />
      <property role="TrG5h" value="ACTIVED" />
    </node>
    <node concept="25R33" id="4VnFrbFlxuN" role="25R1y">
      <property role="3tVfz5" value="5681200438915241907" />
      <property role="TrG5h" value="BANNED" />
    </node>
  </node>
  <node concept="1TIwiD" id="4VnFrbFlxuT">
    <property role="EcuMT" value="5681200438915241913" />
    <property role="TrG5h" value="Rider" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" node="4VnFrbFlice" resolve="User" />
    <node concept="1TJgyi" id="4VnFrbFlxv5" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915241925" />
      <property role="TrG5h" value="status" />
      <ref role="AX2Wp" node="4VnFrbFlxuU" resolve="RiderStatus" />
    </node>
    <node concept="1TJgyj" id="4VnFrbFlxC$" role="1TKVEi">
      <property role="IQ2ns" value="5681200438915242532" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="livePosition" />
      <ref role="20lvS9" node="4VnFrbFlxCu" resolve="Geolocation" />
    </node>
  </node>
  <node concept="25R3W" id="4VnFrbFlxuU">
    <property role="3F6X1D" value="5681200438915241914" />
    <property role="TrG5h" value="RiderStatus" />
    <node concept="25R33" id="4VnFrbFlxuV" role="25R1y">
      <property role="3tVfz5" value="5681200438915241915" />
      <property role="TrG5h" value="AVAILABLE" />
    </node>
    <node concept="25R33" id="4VnFrbFlxuW" role="25R1y">
      <property role="3tVfz5" value="5681200438915241916" />
      <property role="TrG5h" value="BUSY" />
    </node>
    <node concept="25R33" id="4VnFrbFlxuZ" role="25R1y">
      <property role="3tVfz5" value="5681200438915241919" />
      <property role="TrG5h" value="UNAVAIBLE" />
    </node>
  </node>
  <node concept="1TIwiD" id="4VnFrbFlxy1">
    <property role="EcuMT" value="5681200438915242113" />
    <property role="TrG5h" value="Route" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="4VnFrbFlxy2" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242114" />
      <property role="TrG5h" value="id" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxy4" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242116" />
      <property role="TrG5h" value="status" />
      <ref role="AX2Wp" node="4VnFrbFlxy7" resolve="RouteStatus" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxyg" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242128" />
      <property role="TrG5h" value="price" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxyk" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242132" />
      <property role="TrG5h" value="date" />
      <ref role="AX2Wp" node="4VnFrbFm05s" resolve="date" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxyp" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242137" />
      <property role="TrG5h" value="km" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxza" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242186" />
      <property role="TrG5h" value="startAddress" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxzh" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242193" />
      <property role="TrG5h" value="endAddress" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="4VnFrbFlxz1" role="1TKVEi">
      <property role="IQ2ns" value="5681200438915242177" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="customer" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="4VnFrbFlxuH" resolve="Customer" />
    </node>
    <node concept="1TJgyj" id="4VnFrbFmj8_" role="1TKVEi">
      <property role="IQ2ns" value="5681200438915445285" />
      <property role="20kJfa" value="rider" />
      <ref role="20lvS9" node="4VnFrbFlxuT" resolve="Rider" />
    </node>
  </node>
  <node concept="25R3W" id="4VnFrbFlxy7">
    <property role="3F6X1D" value="5681200438915242119" />
    <property role="TrG5h" value="RouteStatus" />
    <node concept="25R33" id="4VnFrbFlxy8" role="25R1y">
      <property role="3tVfz5" value="5681200438915242120" />
      <property role="TrG5h" value="DONE" />
    </node>
    <node concept="25R33" id="4VnFrbFlxy9" role="25R1y">
      <property role="3tVfz5" value="5681200438915242121" />
      <property role="TrG5h" value="DOING" />
    </node>
    <node concept="25R33" id="4VnFrbFlxyc" role="25R1y">
      <property role="3tVfz5" value="5681200438915242124" />
      <property role="TrG5h" value="PENDING" />
    </node>
  </node>
  <node concept="1TIwiD" id="4VnFrbFlxzp">
    <property role="EcuMT" value="5681200438915242201" />
    <property role="TrG5h" value="CardId" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="4VnFrbFlxzq" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242202" />
      <property role="TrG5h" value="id" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxzw" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242208" />
      <property role="TrG5h" value="path" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxzJ" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242223" />
      <property role="TrG5h" value="birthdate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlx$1" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242241" />
      <property role="TrG5h" value="expirationDate" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="4VnFrbFlxCu">
    <property role="EcuMT" value="5681200438915242526" />
    <property role="TrG5h" value="Geolocation" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="4VnFrbFlxCv" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242527" />
      <property role="TrG5h" value="lat" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="4VnFrbFlxCx" role="1TKVEl">
      <property role="IQ2nx" value="5681200438915242529" />
      <property role="TrG5h" value="lng" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="Az7Fb" id="4VnFrbFm05s">
    <property role="3F6X1D" value="5681200438915367260" />
    <property role="TrG5h" value="date" />
    <property role="FLfZY" value="(([1-2][0-9])|([1-9])|(3[0-1]))/((1[0-2])|([1-9]))/[0-9]{4}" />
  </node>
</model>

