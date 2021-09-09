<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:1e36f8ff-275f-459e-89f2-780756c89675(ADSL.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="tcgq" ref="r:f31c5c66-7689-442d-abb8-ca332c02cb22(ADSL.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1233759184865" name="jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem" flags="ln" index="11LMrY" />
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="4VnFrbFl7hV">
    <ref role="1XX52x" to="tcgq:4VnFrbFl7hL" resolve="System" />
    <node concept="3EZMnI" id="4VnFrbFlie6" role="2wV5jI">
      <node concept="l2Vlx" id="4VnFrbFlie7" role="2iSdaV" />
      <node concept="3F0ifn" id="4VnFrbFlie8" role="3EZMnx">
        <property role="3F0ifm" value="system" />
      </node>
      <node concept="3F0A7n" id="4VnFrbFlie9" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFliea" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="4VnFrbFlieb" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4VnFrbFliec" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4VnFrbFlied" role="3EZMnx">
        <node concept="l2Vlx" id="4VnFrbFliee" role="2iSdaV" />
        <node concept="lj46D" id="4VnFrbFlief" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlieg" role="3EZMnx">
          <property role="3F0ifm" value="author" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlieh" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFliei" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFliej" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFl7hQ" resolve="author" />
          <node concept="ljvvj" id="4VnFrbFliek" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFliel" role="3EZMnx">
          <property role="3F0ifm" value="version" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFliem" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlien" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlieo" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFl7hS" resolve="version" />
          <node concept="ljvvj" id="4VnFrbFliep" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlieq" role="3EZMnx">
          <node concept="ljvvj" id="4VnFrbFlier" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlies" role="3EZMnx">
          <property role="3F0ifm" value="users" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFliet" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlieu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFliev" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="4VnFrbFliew" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlie4" resolve="routes" />
          <node concept="l2Vlx" id="4VnFrbFliex" role="2czzBx" />
          <node concept="pj6Ft" id="4VnFrbFliey" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="4VnFrbFliez" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFlie$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFlie_" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="4VnFrbFlieA" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4VnFrbFlid2">
    <ref role="1XX52x" to="tcgq:4VnFrbFlice" resolve="User" />
    <node concept="3EZMnI" id="4VnFrbFlnn3" role="2wV5jI">
      <node concept="l2Vlx" id="4VnFrbFlnn4" role="2iSdaV" />
      <node concept="3F0ifn" id="4VnFrbFlnn5" role="3EZMnx">
        <property role="3F0ifm" value="user" />
      </node>
      <node concept="3F0A7n" id="4VnFrbFlnn6" role="3EZMnx">
        <ref role="1NtTu8" to="tcgq:4VnFrbFlich" resolve="id" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlnn7" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="4VnFrbFlnn8" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4VnFrbFlnn9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4VnFrbFlnna" role="3EZMnx">
        <node concept="l2Vlx" id="4VnFrbFlnnb" role="2iSdaV" />
        <node concept="lj46D" id="4VnFrbFlnnc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnnd" role="3EZMnx">
          <property role="3F0ifm" value="name" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnne" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlnnf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlnng" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicD" resolve="name" />
          <node concept="ljvvj" id="4VnFrbFlnnh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnni" role="3EZMnx">
          <property role="3F0ifm" value="surname" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnnj" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlnnk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlnnl" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicm" resolve="surname" />
          <node concept="ljvvj" id="4VnFrbFlnnm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnnn" role="3EZMnx">
          <property role="3F0ifm" value="email" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnno" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlnnp" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlnnq" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicv" resolve="email" />
          <node concept="ljvvj" id="4VnFrbFlnnr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnns" role="3EZMnx">
          <property role="3F0ifm" value="password" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnnt" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlnnu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlnnv" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicq" resolve="password" />
          <node concept="ljvvj" id="4VnFrbFlnnw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnnx" role="3EZMnx">
          <property role="3F0ifm" value="phone" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlnny" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlnnz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlnn$" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlmYk" resolve="phone" />
          <node concept="ljvvj" id="4VnFrbFlnn_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFlnnA" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="4VnFrbFlnnB" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4VnFrbFlxvl">
    <ref role="1XX52x" to="tcgq:4VnFrbFlxuT" resolve="Rider" />
    <node concept="3EZMnI" id="4VnFrbFlxHf" role="2wV5jI">
      <node concept="l2Vlx" id="4VnFrbFlxHg" role="2iSdaV" />
      <node concept="3F0ifn" id="4VnFrbFlxHh" role="3EZMnx">
        <property role="3F0ifm" value="rider" />
      </node>
      <node concept="3F0A7n" id="4VnFrbFlxHi" role="3EZMnx">
        <ref role="1NtTu8" to="tcgq:4VnFrbFlich" resolve="id" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxHj" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="4VnFrbFlxHk" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4VnFrbFlxHl" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4VnFrbFlxHm" role="3EZMnx">
        <node concept="l2Vlx" id="4VnFrbFlxHn" role="2iSdaV" />
        <node concept="lj46D" id="4VnFrbFlxHo" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHp" role="3EZMnx">
          <property role="3F0ifm" value="status" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHq" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxHr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxHs" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxv5" resolve="status" />
          <node concept="ljvvj" id="4VnFrbFlxHt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHu" role="3EZMnx">
          <property role="3F0ifm" value="name" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHv" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxHw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxHx" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicD" resolve="name" />
          <node concept="ljvvj" id="4VnFrbFlxHy" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHz" role="3EZMnx">
          <property role="3F0ifm" value="surname" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxH$" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxH_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxHA" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicm" resolve="surname" />
          <node concept="ljvvj" id="4VnFrbFlxHB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHC" role="3EZMnx">
          <property role="3F0ifm" value="email" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHD" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxHE" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxHF" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicv" resolve="email" />
          <node concept="ljvvj" id="4VnFrbFlxHG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHH" role="3EZMnx">
          <property role="3F0ifm" value="password" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHI" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxHJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxHK" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicq" resolve="password" />
          <node concept="ljvvj" id="4VnFrbFlxHL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHM" role="3EZMnx">
          <property role="3F0ifm" value="phone" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHN" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxHO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxHP" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlmYk" resolve="phone" />
          <node concept="ljvvj" id="4VnFrbFlxHQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHR" role="3EZMnx">
          <node concept="ljvvj" id="4VnFrbFlxHS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHT" role="3EZMnx">
          <property role="3F0ifm" value="live position" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxHU" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxHV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFlxHW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="4VnFrbFlxHX" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxC$" resolve="livePosition" />
          <node concept="lj46D" id="4VnFrbFlxHY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFlxHZ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxI0" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="4VnFrbFlxI1" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4VnFrbFlxwF">
    <ref role="1XX52x" to="tcgq:4VnFrbFlxuH" resolve="Customer" />
    <node concept="3EZMnI" id="4VnFrbFlxAS" role="2wV5jI">
      <node concept="l2Vlx" id="4VnFrbFlxAT" role="2iSdaV" />
      <node concept="3F0ifn" id="4VnFrbFlxAU" role="3EZMnx">
        <property role="3F0ifm" value="customer" />
      </node>
      <node concept="3F0A7n" id="4VnFrbFlxAV" role="3EZMnx">
        <ref role="1NtTu8" to="tcgq:4VnFrbFlicD" resolve="name" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxAW" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="4VnFrbFlxAX" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4VnFrbFlxAY" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4VnFrbFlxAZ" role="3EZMnx">
        <node concept="l2Vlx" id="4VnFrbFlxB0" role="2iSdaV" />
        <node concept="lj46D" id="4VnFrbFlxB1" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxB2" role="3EZMnx">
          <property role="3F0ifm" value="status" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxB3" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxB4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxB5" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxuR" resolve="status" />
          <node concept="ljvvj" id="4VnFrbFlxB6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxB7" role="3EZMnx">
          <property role="3F0ifm" value="id" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxB8" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxB9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxBa" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlich" resolve="id" />
          <node concept="ljvvj" id="4VnFrbFlxBb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBc" role="3EZMnx">
          <property role="3F0ifm" value="surname" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBd" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxBe" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxBf" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicm" resolve="surname" />
          <node concept="ljvvj" id="4VnFrbFlxBg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBh" role="3EZMnx">
          <property role="3F0ifm" value="email" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBi" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxBj" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxBk" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicv" resolve="email" />
          <node concept="ljvvj" id="4VnFrbFlxBl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBm" role="3EZMnx">
          <property role="3F0ifm" value="password" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBn" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxBo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxBp" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlicq" resolve="password" />
          <node concept="ljvvj" id="4VnFrbFlxBq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBr" role="3EZMnx">
          <property role="3F0ifm" value="phone" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBs" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxBt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxBu" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlmYk" resolve="phone" />
          <node concept="ljvvj" id="4VnFrbFlxBv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBw" role="3EZMnx">
          <node concept="ljvvj" id="4VnFrbFlxBx" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBy" role="3EZMnx">
          <property role="3F0ifm" value="card id" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxBz" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxB$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFlxB_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="4VnFrbFlxBA" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlx$g" resolve="cardId" />
          <node concept="lj46D" id="4VnFrbFlxBB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFlxBC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxBD" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="4VnFrbFlxBE" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4VnFrbFlx_S">
    <ref role="1XX52x" to="tcgq:4VnFrbFlxzp" resolve="CardId" />
    <node concept="3EZMnI" id="4VnFrbFlx_U" role="2wV5jI">
      <node concept="l2Vlx" id="4VnFrbFlx_V" role="2iSdaV" />
      <node concept="3F0ifn" id="4VnFrbFlx_W" role="3EZMnx">
        <property role="3F0ifm" value="card id" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlx_X" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="4VnFrbFlx_Y" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4VnFrbFlx_Z" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4VnFrbFlxA0" role="3EZMnx">
        <node concept="l2Vlx" id="4VnFrbFlxA1" role="2iSdaV" />
        <node concept="lj46D" id="4VnFrbFlxA2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxA3" role="3EZMnx">
          <property role="3F0ifm" value="id" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxA4" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxA5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxA6" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxzq" resolve="id" />
          <node concept="ljvvj" id="4VnFrbFlxA7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxA8" role="3EZMnx">
          <property role="3F0ifm" value="path" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxA9" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxAa" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxAb" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxzw" resolve="path" />
          <node concept="ljvvj" id="4VnFrbFlxAc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxAd" role="3EZMnx">
          <property role="3F0ifm" value="birthdate" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxAe" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxAf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxAg" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxzJ" resolve="birthdate" />
          <node concept="ljvvj" id="4VnFrbFlxAh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxAi" role="3EZMnx">
          <property role="3F0ifm" value="expiration date" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFlxAj" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFlxAk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFlxAl" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlx$1" resolve="expirationDate" />
          <node concept="ljvvj" id="4VnFrbFlxAm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxAn" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="4VnFrbFlxAo" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4VnFrbFlxEc">
    <ref role="1XX52x" to="tcgq:4VnFrbFlxCu" resolve="Geolocation" />
    <node concept="3EZMnI" id="4VnFrbFlxEe" role="2wV5jI">
      <node concept="l2Vlx" id="4VnFrbFlxEf" role="2iSdaV" />
      <node concept="3F0ifn" id="4VnFrbFlxEg" role="3EZMnx">
        <property role="3F0ifm" value="geolocation" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxEh" role="3EZMnx">
        <property role="3F0ifm" value="(" />
        <node concept="11L4FC" id="4VnFrbFlxEi" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="4VnFrbFlxEj" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
        <node concept="11LMrY" id="4VnFrbFlxEk" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxEl" role="3EZMnx">
        <property role="3F0ifm" value="lat" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxEm" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="4VnFrbFlxEn" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="4VnFrbFlxEo" role="3EZMnx">
        <ref role="1NtTu8" to="tcgq:4VnFrbFlxCv" resolve="lat" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxEp" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="4VnFrbFlxEq" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxEr" role="3EZMnx">
        <property role="3F0ifm" value="lng" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxEs" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="11L4FC" id="4VnFrbFlxEt" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="4VnFrbFlxEu" role="3EZMnx">
        <ref role="1NtTu8" to="tcgq:4VnFrbFlxCx" resolve="lng" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFlxEv" role="3EZMnx">
        <property role="3F0ifm" value=")" />
        <node concept="11L4FC" id="4VnFrbFlxEw" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3mYdg7" id="4VnFrbFlxEx" role="3F10Kt">
          <property role="1413C4" value="body-paren" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4VnFrbFlxIP">
    <ref role="1XX52x" to="tcgq:4VnFrbFlxy1" resolve="Route" />
    <node concept="3EZMnI" id="4VnFrbFm05t" role="2wV5jI">
      <node concept="l2Vlx" id="4VnFrbFm05u" role="2iSdaV" />
      <node concept="3F0ifn" id="4VnFrbFm05v" role="3EZMnx">
        <property role="3F0ifm" value="route" />
      </node>
      <node concept="3F0ifn" id="4VnFrbFm05w" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="4VnFrbFm05x" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4VnFrbFm05y" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4VnFrbFm05z" role="3EZMnx">
        <node concept="l2Vlx" id="4VnFrbFm05$" role="2iSdaV" />
        <node concept="lj46D" id="4VnFrbFm05_" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05A" role="3EZMnx">
          <property role="3F0ifm" value="id" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05B" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm05C" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFm05D" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxy2" resolve="id" />
          <node concept="ljvvj" id="4VnFrbFm05E" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05F" role="3EZMnx">
          <property role="3F0ifm" value="status" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05G" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm05H" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFm05I" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxy4" resolve="status" />
          <node concept="ljvvj" id="4VnFrbFm05J" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05K" role="3EZMnx">
          <property role="3F0ifm" value="price" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05L" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm05M" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFm05N" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxyg" resolve="price" />
          <node concept="ljvvj" id="4VnFrbFm05O" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05P" role="3EZMnx">
          <property role="3F0ifm" value="date" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05Q" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm05R" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFm05S" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxyk" resolve="date" />
          <node concept="ljvvj" id="4VnFrbFm05T" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05U" role="3EZMnx">
          <property role="3F0ifm" value="km" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05V" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm05W" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFm05X" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxyp" resolve="km" />
          <node concept="ljvvj" id="4VnFrbFm05Y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm05Z" role="3EZMnx">
          <property role="3F0ifm" value="start address" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm060" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm061" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFm062" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxza" resolve="startAddress" />
          <node concept="ljvvj" id="4VnFrbFm063" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm064" role="3EZMnx">
          <property role="3F0ifm" value="end address" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm065" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm066" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4VnFrbFm067" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxzh" resolve="endAddress" />
          <node concept="ljvvj" id="4VnFrbFm068" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm069" role="3EZMnx">
          <node concept="ljvvj" id="4VnFrbFm06a" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm06b" role="3EZMnx">
          <property role="3F0ifm" value="customer" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm06c" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm06d" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFm06e" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="4VnFrbFm06f" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxz1" resolve="customer" />
          <node concept="lj46D" id="4VnFrbFm06g" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFm06h" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm06i" role="3EZMnx">
          <node concept="ljvvj" id="4VnFrbFm06j" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4VnFrbFm06k" role="3EZMnx">
          <property role="3F0ifm" value="rider" />
        </node>
        <node concept="3F0ifn" id="4VnFrbFm06l" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4VnFrbFm06m" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFm06n" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="4VnFrbFm06o" role="3EZMnx">
          <ref role="1NtTu8" to="tcgq:4VnFrbFlxz7" resolve="rider" />
          <node concept="lj46D" id="4VnFrbFm06p" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="4VnFrbFm06q" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4VnFrbFm06r" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="4VnFrbFm06s" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
</model>

