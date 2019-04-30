const fragmentShaderSource =
  `
  precision mediump float;

  // our texture
  uniform sampler2D u_image;
  uniform vec2 u_textureSize;
  
  // the texCoords passed in from the vertex shader.
  varying vec2 v_texCoord;
  
  void main() {
     vec2 onePixel = vec2(1.0, 1.0) / u_textureSize;
     gl_FragColor = (
         texture2D(u_image, v_texCoord) +
         texture2D(u_image, v_texCoord + vec2(onePixel.x, 0.0)) +
         texture2D(u_image, v_texCoord + vec2(-onePixel.x, 0.0)) + 
         texture2D(u_image, v_texCoord + vec2(0.0, onePixel.y)) +
         texture2D(u_image, v_texCoord + vec2(0.0, -onePixel.y))) 
         / 5.0;
  }
`;