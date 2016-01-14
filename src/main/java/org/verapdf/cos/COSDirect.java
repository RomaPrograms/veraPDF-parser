package org.verapdf.cos;

import org.verapdf.as.ASAtom;

import java.io.IOException;

/**
 * Created by Timur on 12/17/2015.
 */
public class COSDirect extends COSBase {

    // OBJECT TYPE
    public COSObjType getType() {
        return COSObjType.COSUndefinedT;
    }

    // BOOLEAN VALUES
    public boolean getBoolean() {
        return false;
    }

    public boolean setBoolean(final boolean value) {
        return false;
    }

    // INTEGER NUMBERS
    public long getInteger() {
        return 0;
    }

    public boolean setInteger(final long value) {
        return false;
    }

    // REAL NUMBERS
    public double getReal() {
        return 0;
    }

    public boolean setReal(final double value) {
        return false;
    }

    // STRINGS
    public String getString() {
        return "";
    }

    public boolean setString(final String value) {
        return setString(value, false);
    }

    public boolean setString(final String value, final boolean isHex) {
        return false;
    }

    // NAMES
    public ASAtom getName() {
        final ASAtom empty = new ASAtom();
        return empty;
    }

    public boolean setName(final ASAtom value) {
        return false;
    }

    // NUMBERS OF ELEMENTS FOR ARRAY AND DICTIONARY
    public int size() {
        return 1;
    }

    // ARRAYS
    public COSObject at(final int i) {
        return COSObject.getEmpty();
    }

    public boolean add(final COSObject value) {
        return false;
    }

    public boolean set(final int i, final COSObject value) {
        return false;
    }

    public boolean insert(final int i, final COSObject value) {
        return false;
    }

    public void remove(final int i) {
    }

    public boolean setArray() {
        return false;
    }

    public boolean setArray(final int size, final COSObject[] value) {
        return false;
    }

    public boolean setArray(final int size, final double[] value) {
        return false;
    }

    public void clearArray() {
    }

    // DICTIONARIES
    public boolean knownKey(final ASAtom key) {
        return false;
    }

    public COSObject getKey(final ASAtom key) {
        return COSObject.getEmpty();
    }

    public boolean setKey(final ASAtom key, final COSObject value) {
        return false;
    }

    public boolean getBooleanKey(final ASAtom key) throws IOException {
        return false;
    }

    public boolean setBooleanKey(final ASAtom key, final boolean value) throws IOException {
        return false;
    }

    public long getIntegerKey(final ASAtom key) throws IOException {
        return 0;
    }

    public boolean setIntegerKey(final ASAtom key, final long value) throws IOException {
        return false;
    }

    public double getRealKey(final ASAtom key) throws IOException {
        return 0;
    }

    public boolean setRealKey(final ASAtom key, final double value) throws IOException {
        return false;
    }

    public String getStringKey(final ASAtom key) throws IOException {
        return "";
    }

    public boolean setStringKey(final ASAtom key, final String value) throws IOException {
        return false;
    }

    public ASAtom getNameKey(final ASAtom key) throws IOException {
        final ASAtom empty = new ASAtom();
        return empty;
    }
    public boolean setNameKey(final ASAtom key, final ASAtom value) throws IOException {
        return false;
    }

    public boolean setArrayKey(final ASAtom key) throws IOException {
        return false;
    }

    public boolean setArrayKey(final ASAtom key, final int size, final COSObject[] value) throws IOException {
        return false;
    }

    public boolean setArrayKey(final ASAtom key, final int size, final double[] value) throws IOException {
        return false;
    }

    public void removeKey(final ASAtom key) {
    }

    // INDIRECT OBJECT
    public boolean isIndirect() {
        return false;
    }

    public COSKey getKey() {
        final COSKey empty = new COSKey();
        return empty;
    }

    public COSDocument getDocument() {
        return null;
    }

    public boolean setKey(final COSKey key, final COSDocument document) {
        return false;
    }

    public COSObject getDirect() {
        return new COSObject(this);
    }

    public boolean setDirect(final COSObject value) {
        return false;
    }

    //! Marks object for incremental update.
    //! (If object is indirect and its document is known.)
    public void mark() {
    }

}