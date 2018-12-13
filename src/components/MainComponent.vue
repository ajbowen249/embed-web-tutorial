<template>
    <div>
        <div>
            <button v-on:click="nativeStringResult = nativeAdaptor.getString()">Get string from host app</button>
            <div>{{ nativeStringResult }}</div>
        </div>
    </div>
</template>

<script>
import Native from '../logic/Native.js';

export default {
    data() {
        return {
            nativeAdaptor: new Native(),
            nativeStringResult: ''
        };
    }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
