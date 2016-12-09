(function () {
    'use strict';

    angular
        .module('blog2App')

        /*
         Languages codes are ISO_639-1 codes, see http://en.wikipedia.org/wiki/List_of_ISO_639-1_codes
         They are written in English to avoid character encoding issues (not a perfect solution)
         */
        .constant('LANGUAGES', [
            'en',
            'ca',
            'zh-cn',
            'zh-tw',
            'cs',
            'da',
            'nl',
            'et',
            'fr',
            'gl',
            'de',
            'el',
            'hi',
            'hu',
            'it',
            'ja',
            'ko',
            'mr',
            'pl',
            'pt-br',
            'pt-pt',
            'ro',
            'ru',
            'sk',
            'sr',
            'es',
            'sv',
            'tr',
            'ta',
            'vi'
            // jhipster-needle-i18n-language-constant - JHipster will add/remove languages in this array
        ]
    );
})();
